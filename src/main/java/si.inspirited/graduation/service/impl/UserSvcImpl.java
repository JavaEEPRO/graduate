package si.inspirited.graduation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import si.inspirited.graduation.domain.User;
import si.inspirited.graduation.repository.UserRepository;
import si.inspirited.graduation.service.UserSvc;

@Service
public class UserSvcImpl implements UserSvc {

    private final UserRepository repository;

    @Autowired
    public UserSvcImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }
}
