package ru.kazakov.myuirestdbservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kazakov.myuirestdbservice.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
