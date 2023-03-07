package com.example.BookMyShowApp.Service;


import com.example.BookMyShowApp.dto.BookTicketRequestDto;
import com.example.BookMyShowApp.dto.ResponseDto.TicketResponseDto;
import com.example.BookMyShowApp.dto.TicketDto;

public interface TicketService {


    TicketResponseDto getTicket(int id); //H.W (Hint is same as you do in GetMovie)

    TicketResponseDto bookTicket(BookTicketRequestDto bookTicketRequestDto);

}