package com.example.BookMyShowApp.Service;


import com.example.BookMyShowApp.dto.EntryDto.UserEntryDto;
import com.example.BookMyShowApp.dto.ResponseDto.UserResponseDto;

public interface UserService { //Designing part

    void addUser(UserEntryDto userEntryDto);

    UserResponseDto getUser(int id);


}