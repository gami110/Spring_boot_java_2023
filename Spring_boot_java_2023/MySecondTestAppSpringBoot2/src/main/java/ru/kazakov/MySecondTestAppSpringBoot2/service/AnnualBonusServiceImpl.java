package ru.kazakov.MySecondTestAppSpringBoot2.service;

import org.springframework.stereotype.Service;
import ru.kazakov.MySecondTestAppSpringBoot2.exception.UnsupportedCodeException;
import ru.kazakov.MySecondTestAppSpringBoot2.model.Positions;

import java.time.Year;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService {
    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays) {

//        Year.now() -  возвращает текущий год в виде объекта типа `Year`.
//        .isLeap() - проверяет, является ли текущий год високосным.
//        ? 366 : 365 -  тернарный оператор, который возвращает значение 366, если текущий год високосный, и 365 в противном случае.
//        в зависимости от того, является ли текущий год високосным или нет, переменная `totalDaysInYear` будет содержать значение 366 или 365 соответственно.
        int totalDaysInYear = Year.now().isLeap() ? 366 : 365;
        return salary * bonus * totalDaysInYear * positions.getPositionCoefficient() / workDays;
    }

    @Override
    public double calculateBonusByQuarters(Positions position, double salary, double bonus) throws UnsupportedCodeException {
        if (!position.isManager()) {
            throw new UnsupportedCodeException("Расчет квартарлоного бонуса доступен только для менеджеров");
        }

        int quartersInYear = 4;
        return salary * bonus * position.getPositionCoefficient() / quartersInYear;
    }
}
