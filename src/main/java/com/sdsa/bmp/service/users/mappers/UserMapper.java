package com.sdsa.bmp.service.users.mappers;

import com.sdsa.bmp.service.users.dto.CredentialsDto;
import com.sdsa.bmp.service.users.dto.UserCreationDto;
import com.sdsa.bmp.service.users.dto.UserDto;
import com.sdsa.bmp.service.users.entities.BookstoreUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "user.id", target = "id")
    @Mapping(source = "user.login", target = "login")
    @Mapping(source = "token", target = "token")
    UserDto toUserDto(BookstoreUser user, String token);

    @Mapping(source = "encodedPassword", target = "password")
    BookstoreUser toBookstoreUser(UserCreationDto userDto, String encodedPassword);
}
