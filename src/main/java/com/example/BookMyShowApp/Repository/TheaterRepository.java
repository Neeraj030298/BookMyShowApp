package com.example.BookMyShowApp.Repository;

import com.example.BookMyShowApp.Model.TheaterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<TheaterEntity,Integer> {
}