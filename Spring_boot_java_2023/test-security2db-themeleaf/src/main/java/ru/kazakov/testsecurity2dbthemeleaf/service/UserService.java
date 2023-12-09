package ru.kazakov.testsecurity2dbthemeleaf.service;

import ru.kazakov.testsecurity2dbthemeleaf.dto.UserDto;
import ru.kazakov.testsecurity2dbthemeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
