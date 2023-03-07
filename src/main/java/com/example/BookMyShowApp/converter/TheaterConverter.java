package com.example.BookMyShowApp.converter;


import com.example.BookMyShowApp.Model.TheaterEntity;
import com.example.BookMyShowApp.dto.EntryDto.TheaterEntryDto;
import com.example.BookMyShowApp.dto.ResponseDto.TheaterResponseDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TheaterConverter {

    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().address(theaterEntryDto.getAddress())
                .city(theaterEntryDto.getCity()).name(theaterEntryDto.getName()).build();


    }

    public static TheaterResponseDto convertEntityToDto(TheaterEntity theaterEntity){

        return TheaterResponseDto.builder().id(theaterEntity.getId()).name(theaterEntity.getName())
                .city(theaterEntity.getCity()).address(theaterEntity.getAddress())
                .type(theaterEntity.getType())
                .build();
    }
}
