package si.inspirited.graduation.domain;

import org.springframework.util.CollectionUtils;
import si.inspirited.graduation.domain.abstrct.NamedEntity;

import java.time.LocalDateTime;
import java.util.*;

public class User extends NamedEntity {

    private String password;

    private LocalDateTime lastVotedDateTime;
    private Restaurant lastVotedRestaurant;

    private Set<Role> roles;

    public User() {
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getPassword(), u.getLastVotedDateTime(), u.getLastVotedRestaurant(), u.getRoles());
    }

    public User(Integer id, String name, String password, Role role, Role... roles) {
        this(id, name, password, null, null, EnumSet.of(role, roles));      //lastVoted mut be reviewed here
    }

    public User(Integer id, String name, String password, LocalDateTime lastVotedDateTime, Restaurant lastVotedRestaurant, Collection<Role> roles) {
        super(id, name);
        this.password = password;
        this.lastVotedDateTime = lastVotedDateTime;
        this.lastVotedRestaurant = lastVotedRestaurant;
        setRoles(roles);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLastVotedDateTime() {
        return lastVotedDateTime;
    }

    public void setLastVotedDateTime(LocalDateTime lastVotedDateTime) {
        this.lastVotedDateTime = lastVotedDateTime;
    }

    public Restaurant getLastVotedRestaurant() {
        return lastVotedRestaurant;
    }

    public void setLastVotedRestaurant(Restaurant lastVotedRestaurant) {
        this.lastVotedRestaurant = lastVotedRestaurant;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = CollectionUtils.isEmpty(roles) ? Collections.emptySet() : EnumSet.copyOf(roles);
    }

    //admin functions:

    public Restaurant addRestaurant(String restaurantName) {
        return  new Restaurant();
    }

    public void removeRestaurant(Restaurant restaurant) {}

    public Dish addDish(Restaurant restaurant, String dishName) {
        return new Dish();
    }

    public void removeDish(Dish dish) {}

    //reg. user functions:

    public boolean addVote(Restaurant restaurant) {
        return true;
    }


}
