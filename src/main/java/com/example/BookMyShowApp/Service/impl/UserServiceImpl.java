package com.example.BookMyShowApp.Service.impl;

import com.example.BookMyShowApp.Model.UserEntity;
import com.example.BookMyShowApp.Repository.UserRepository;
import com.example.BookMyShowApp.Service.UserService;
import com.example.BookMyShowApp.converter.UserConverter;
import com.example.BookMyShowApp.dto.EntryDto.UserEntryDto;
import com.example.BookMyShowApp.dto.ResponseDto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(UserEntryDto userEntryDto) {

        UserEntity userEntity = UserConverter.convertDtoToEntity(userEntryDto); //Cleaner
        userRepository.save(userEntity);
    }

    @Override
    public UserResponseDto getUser(int id) {

        UserEntity user = new UserEntity(); //By default user.

        UserEntity userEntity = userRepository.findById(id).get();

        UserResponseDto userResponseDto = UserConverter.convertEntityToDto(userEntity);

        return userResponseDto;
    }
}
