package com.example.BookMyShowApp.Repository;

import com.example.BookMyShowApp.Model.TheaterSeatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterSeatsRepository extends JpaRepository<TheaterSeatsEntity, Integer> {
}