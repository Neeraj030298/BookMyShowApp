package com.example.BookMyShowApp.controller;


import com.example.BookMyShowApp.Service.impl.ShowServiceImpl;
import com.example.BookMyShowApp.dto.EntryDto.ShowEntryDto;
import com.example.BookMyShowApp.dto.ResponseDto.ShowResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("show")
public class ShowController {


    @Autowired
    ShowServiceImpl showService;


    @PostMapping("/add")
    public ShowResponseDto addShow(@RequestBody() ShowEntryDto showEntryDto){

        log.info("Here we are");

        return showService.addShow(showEntryDto);
    }


}