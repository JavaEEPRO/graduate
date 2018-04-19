package si.inspirited.graduation.service;

import si.inspirited.graduation.domain.User;

public interface UserSvc {

    User create(User user);

    boolean delete(int id);

    User get(int id);

    boolean update(User user);
}
