package ru.nickzim.task.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.nickzim.task.Model.Person;
import ru.nickzim.task.Repository.PersonsRepository;

import java.util.List;

@Service
public class PersonsServiceImpl implements PersonsService {

    @Autowired
    private PersonsRepository repository;

    @Override
    public List<Person> getAll() {
        return repository.findAll();
    }

    @Override
    public void create(Person person) {
        repository.save(person);
    }
}
