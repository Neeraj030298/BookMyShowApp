package com.example.BookMyShowApp.Repository;


import com.example.BookMyShowApp.Model.ShowSeatsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowSeatsRepository extends JpaRepository<ShowSeatsEntity,Integer> {
}