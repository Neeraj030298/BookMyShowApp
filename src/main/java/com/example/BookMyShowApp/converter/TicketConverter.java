package com.example.BookMyShowApp.converter;

import com.example.BookMyShowApp.Model.TicketEntity;
import com.example.BookMyShowApp.dto.ResponseDto.TicketResponseDto;

public class TicketConverter {

    public static TicketResponseDto convertEntityToDto(TicketEntity ticketEntity){

        return TicketResponseDto.builder().id((int) ticketEntity.getId()).amount(ticketEntity.getAmount())
                .alloted_seats(ticketEntity.getAllottedSeats())
                .build();

    }
}