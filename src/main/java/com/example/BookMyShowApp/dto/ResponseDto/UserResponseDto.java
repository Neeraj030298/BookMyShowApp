package com.example.BookMyShowApp.dto.ResponseDto;

import com.example.BookMyShowApp.dto.TicketDto;
import lombok.*;

import java.util.List;

@Data
@Builder
public class UserResponseDto {

    int id;

    String name;

    String mobNo;

    //Optional
    List<TicketDto> tickets;
}