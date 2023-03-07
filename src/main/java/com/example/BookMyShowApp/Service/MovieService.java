package com.example.BookMyShowApp.Service;

import com.example.BookMyShowApp.dto.EntryDto.MovieEntryDto;
import com.example.BookMyShowApp.dto.ResponseDto.MovieNameAndIdObject;
import com.example.BookMyShowApp.dto.ResponseDto.MovieResponseDto;

public interface MovieService {

    //Add movie
    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);


    //get movie
    MovieResponseDto getMovie(int id);

    MovieNameAndIdObject getNameAndId(int id);


}