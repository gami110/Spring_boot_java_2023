package ru.kazakov.MySecondTestAppSpringBoot2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.kazakov.MySecondTestAppSpringBoot2.model.Response;

import java.util.UUID;

@Service
@Qualifier("ModifyOperationUidResponseService")
public class ModifyOperationUidResponseService  implements ModifyResponseService {
    @Override
    public Response modify(Response response) {

        UUID uuid = UUID.randomUUID();

        response.setOperationUid(uuid.toString());

        return response;
    }
}
