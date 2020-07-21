package ru.nickzim.task.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nickzim.task.Model.User;
import ru.nickzim.task.Repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository repository;

    @Override
    public User getUser(String username) {
        return repository.findByUsername(username);
    }

}
