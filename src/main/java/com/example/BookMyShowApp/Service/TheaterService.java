package com.example.BookMyShowApp.Service;


import com.example.BookMyShowApp.dto.EntryDto.TheaterEntryDto;
import com.example.BookMyShowApp.dto.ResponseDto.TheaterResponseDto;

public interface TheaterService {


    TheaterResponseDto addTheater(TheaterEntryDto theaterEntryDto);

    TheaterResponseDto getTheater(int id);

}
