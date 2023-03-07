package com.example.BookMyShowApp.Repository;

import com.example.BookMyShowApp.Model.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
}