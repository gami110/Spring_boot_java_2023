package ru.kazakov.MySecondTestAppSpringBoot2.service;

import ru.kazakov.MySecondTestAppSpringBoot2.model.Request;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Qualifier("ModifySourceRequestService")
public class ModifySourceRequestService
        implements ModifyRequestService {
    // Класс является сервисом для модификации запросов

    @Override
    public void modify(Request request){
        // Метод modify принимает объект Request. Он выполняет модификацию объекта Request, устанавливая значение
        // поля "source" в "source 1". Затем создает HTTP-запрос для отправки модифицированного объекта Request на
        // удаленный сервер по адресу "http://localhost:8084/feedback" с использованием метода POST.
        request.setSource("source 1");
        // Устанавливаем значение поля "source" в "source 1" в объекте Request.

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);
        // Создаем объект HttpEntity, который будет представлять модифицированный объект Request в HTTP-запросе.

        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
        // Отправляем HTTP-запрос с использованием RestTemplate.exchange. Мы указываем URL "http://localhost:8084/feedback",
        // метод POST, HttpEntity с модифицированным объектом Request и ParameterizedTypeReference для обработки ответа.
    }
}
