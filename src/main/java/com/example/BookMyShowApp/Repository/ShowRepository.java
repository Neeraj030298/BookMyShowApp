package com.example.BookMyShowApp.Repository;
import com.example.BookMyShowApp.Model.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity, Integer> {
}