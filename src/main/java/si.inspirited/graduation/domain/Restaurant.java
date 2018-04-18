package si.inspirited.graduation.domain;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import si.inspirited.graduation.domain.abstrct.NamedEntity;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Restaurant extends NamedEntity {

    private AtomicInteger votes;

    private Set<Dish> dishes;

    protected Set<Dish> getDishesInternal() {
        if (this.dishes == null) {
            this.dishes = new HashSet<>();
        }
        return this.dishes;
    }

    protected void setDishesInternal(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    public List<Dish> getDishes() {
        List<Dish> sortedDishes = new ArrayList<>(getDishesInternal());
        PropertyComparator.sort(sortedDishes,
                new MutableSortDefinition("name", true, true));
        return Collections.unmodifiableList(sortedDishes);
    }

    public void addDish(Dish dish) {
        if (dish.isNew()) {
            getDishesInternal().add(dish);
        }
        dish.setRestaurant(this);
    }

    /**
     * Return the Dish with the given name, or null if none found for this Restaurant.
     *
     * @param name to test
     * @return true if dish id is already in use
     */
    public Dish getDish(String name) {
        return getDish(name, false);
    }

    /**
     * Return the Dish with the given name, or null if none found for this Restaurant.
     *
     * @param name to test
     * @return true if dish name is already in use
     */
    public Dish getDish(String name, boolean ignoreNew) {
        name = name.toLowerCase();
        for (Dish dish : getDishesInternal()) {
            if (!dish.isNew()|| !ignoreNew) {
                String compName = dish.getName();
                compName = compName.toLowerCase();
                if (compName.equals(name)) {
                    return dish;
                }
            }
        }
        return null;
    }

    public AtomicInteger getVotes() {
        return votes;
    }

    public int increaseVotes() {
        return votes.incrementAndGet();
    }

    public int decreaseVotes() {
        return votes.decrementAndGet();
    }
}
