package si.inspirited.graduation.domain;

import org.springframework.util.CollectionUtils;
import si.inspirited.graduation.domain.abstrct.NamedEntity;

import java.time.LocalDateTime;
import java.util.*;

public class User extends NamedEntity {

    private String password;

    private LocalDateTime lastVoted;

    private Set<Role> roles;

    public User() {
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getPassword(), u.getLastVoted(), u.getRoles());
    }

    public User(Integer id, String name, String password, Role role, Role... roles) {
        this(id, name, password, null, EnumSet.of(role, roles));      //lastVoted mut be reviewed here
    }

    public User(Integer id, String name, String password, LocalDateTime lastVoted, Collection<Role> roles) {
        super(id, name);
        this.password = password;
        this.lastVoted = lastVoted;
        setRoles(roles);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getLastVoted() {
        return lastVoted;
    }

    public void setLastVoted(LocalDateTime lastVoted) {
        this.lastVoted = lastVoted;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = CollectionUtils.isEmpty(roles) ? Collections.emptySet() : EnumSet.copyOf(roles);
    }
}
