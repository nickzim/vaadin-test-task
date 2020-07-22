package ru.nickzim.task.Services;

import ru.nickzim.task.Model.Person;

import java.util.List;

public interface PersonsService {

    List<Person> getAll();

    void create(Person person);

}
