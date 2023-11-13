package ru.kazakov.MySecondTestAppSpringBoot2.service;


import org.springframework.stereotype.Service;
import ru.kazakov.MySecondTestAppSpringBoot2.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
