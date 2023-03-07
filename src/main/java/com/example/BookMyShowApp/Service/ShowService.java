package com.example.BookMyShowApp.Service;

import com.example.BookMyShowApp.dto.EntryDto.ShowEntryDto;
import com.example.BookMyShowApp.dto.ResponseDto.ShowResponseDto;

public interface ShowService {

    ShowResponseDto addShow(ShowEntryDto showEntryDto);

    //Get show
    //Complete
}