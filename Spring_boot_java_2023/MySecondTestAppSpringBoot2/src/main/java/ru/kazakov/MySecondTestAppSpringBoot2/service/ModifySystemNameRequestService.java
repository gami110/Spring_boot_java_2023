package ru.kazakov.MySecondTestAppSpringBoot2.service;

import ru.kazakov.MySecondTestAppSpringBoot2.model.Request;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Qualifier("ModifySystemNameRequestService")

public class ModifySystemNameRequestService
        implements ModifyRequestService {
    @Override
    public void modify(Request request) {

        request.setSystemName("service 1");  // Устанавливает поле 'systemName' объекта Request в значение "service 1".

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);  // Создает HTTP-сущность (обертку) с объектом Request.

        new RestTemplate().exchange("http://localhost:8084/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });  // Используется для получения ответа с параметризованным типом (в данном случае, пустым).
    }
}