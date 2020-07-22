package ru.nickzim.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.nickzim.task.Model.Person;

import java.util.List;

public interface PersonsRepository extends JpaRepository<Person, Long> {

    @Override
    List<Person> findAll();

    @Override
    <S extends Person> S save(S s);


}
