package com.example.BookMyShowApp.dto.EntryDto;

import com.example.BookMyShowApp.dto.ResponseDto.MovieResponseDto;
import com.example.BookMyShowApp.dto.ResponseDto.TheaterResponseDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Builder
public class ShowEntryDto {

    @NotNull
    LocalDate showDate;

    @NotNull
    LocalTime showTime;

    @NotNull
    MovieResponseDto movieResponseDto;

    @NotNull
    TheaterResponseDto theaterResponseDto;
}