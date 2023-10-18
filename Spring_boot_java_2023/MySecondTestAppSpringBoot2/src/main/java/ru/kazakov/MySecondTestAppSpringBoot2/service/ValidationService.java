package ru.kazakov.MySecondTestAppSpringBoot2.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.kazakov.MySecondTestAppSpringBoot2.exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
