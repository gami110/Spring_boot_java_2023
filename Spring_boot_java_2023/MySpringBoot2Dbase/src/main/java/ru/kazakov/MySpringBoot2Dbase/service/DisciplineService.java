package ru.kazakov.MySpringBoot2Dbase.service;

import org.springframework.stereotype.Repository;
import ru.kazakov.MySpringBoot2Dbase.entity.Discipline;

import java.util.List;

@Repository
public interface DisciplineService {
    List<Discipline> getAllDisciplines();
    Discipline saveDiscipline(Discipline discipline);

    Discipline getDiscipline(int id);

    void deleteDiscipline(int id);
}
