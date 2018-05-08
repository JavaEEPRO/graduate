package si.inspirited.graduation.domain;

import org.springframework.util.CollectionUtils;
import si.inspirited.graduation.domain.abstrct.NamedEntity;
import java.time.LocalDateTime;
import java.util.*;

public class User extends NamedEntity {

    private String password;

    private LocalDateTime lastVotedDateTime;  //TODO lazy init; redundant field; thinking about to make log of votes; maybe remove from constructor??
    private Restaurant lastVotedRestaurant;  //TODO this field must be not initialized as a default, only by SETTER; not mapped to DB;  seems to be redurent; maybe must be only counted
    private Set<Restaurant> votedFor;           // TODO constructor & g/setter

    private Set<Role> roles;

    public User() {
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getPassword(), u.getLastVotedDateTime(), u.getLastVotedRestaurant(), u.getRoles());
    }

    public User(Integer id, String name, String password, Role role, Role... roles) {
        this(id, name, password, null, null, EnumSet.of(role, roles));      //TODO lastVoted mut be reviewed here
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
        if (!getRoles().contains(Role.ROLE_ADMIN)) {return null;}       //TODO let this be common method in util class
        Restaurant restaurant = new Restaurant();
        restaurant.setName(restaurantName);
        return restaurant;
    }

    public void removeRestaurant(Restaurant restaurant) {
        if (!getRoles().contains(Role.ROLE_ADMIN)) {return;}
    }

    public Dish addDish(Restaurant restaurant, String dishName) {
        if (!getRoles().contains(Role.ROLE_ADMIN)) {return null;}       //TODO let this be common method in util class
        return new Dish();
    }

    public void removeDish(Restaurant restaurant, Dish dish) {
        if (!getRoles().contains(Role.ROLE_ADMIN)) {return;}
    }

    //reg. user functions:

    public boolean addVote(Restaurant restaurant) {
        if (!getRoles().contains(Role.ROLE_USER)) {return false;}       //TODO let this be common method in util class OPT
        restaurant.increaseVotes();
        return true;
    }

}
