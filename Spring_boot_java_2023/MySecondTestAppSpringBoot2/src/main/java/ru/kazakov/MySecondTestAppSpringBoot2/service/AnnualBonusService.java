package ru.kazakov.MySecondTestAppSpringBoot2.service;

import org.springframework.stereotype.Service;
import ru.kazakov.MySecondTestAppSpringBoot2.exception.UnsupportedCodeException;
import ru.kazakov.MySecondTestAppSpringBoot2.model.Positions;

@Service
public interface AnnualBonusService {
    double calculate(Positions positions, double salary, double bonus, int workDays);
    double calculateBonusByQuarters(Positions positions, double salary, double bonus) throws UnsupportedCodeException;
}
