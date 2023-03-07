package com.example.BookMyShowApp.converter;


import com.example.BookMyShowApp.Model.ShowEntity;
import com.example.BookMyShowApp.dto.EntryDto.ShowEntryDto;
import com.example.BookMyShowApp.dto.ResponseDto.ShowResponseDto;

public class ShowConverter {


    public static ShowEntity convertDtoToEntity(ShowEntryDto showDto){

        return ShowEntity.builder().showDate(showDto.getShowDate()).showTime(showDto.getShowTime())
                .build();
    }

    public static ShowResponseDto convertEntityToDto(ShowEntity showEntity, ShowEntryDto showEntryDto){

        return ShowResponseDto.builder()
                .id(showEntity.getId())
                .showTime(showEntity.getShowTime())
                .showDate(showEntity.getShowDate())
                .movieResponseDto(showEntryDto.getMovieResponseDto())
                .theaterDto(showEntryDto.getTheaterResponseDto())
                .build();
    }
}