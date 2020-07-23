package ru.nickzim.task.Repository;

import ru.nickzim.task.Model.Person;

import java.util.LinkedList;
import java.util.List;

public class MemoryRepository {

    private static List<Person> personList = new LinkedList<>();

    static{
        personList.add(new Person("Test", "User", "Test", 22));
        personList.add(new Person("Test", "User", "Test", 23));
        personList.add(new Person("Test", "User", "Test", 24));
    }

    public List<Person> findAll(){
        return personList;
    }

    public void save(Person person){
        personList.add(person);
    }
}
