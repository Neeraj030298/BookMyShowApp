package com.example.BookMyShowApp.dto;

import com.example.BookMyShowApp.dto.ResponseDto.ShowResponseDto;
import com.example.BookMyShowApp.dto.ResponseDto.UserResponseDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {

    int id;

    String alloted_seats;

    double amount;

    ShowResponseDto showDto;

    @NotNull
    UserResponseDto userDto; //Mandatory for me to fill this userDto Value
}
