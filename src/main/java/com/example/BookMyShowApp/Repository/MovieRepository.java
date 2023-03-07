package com.example.BookMyShowApp.Repository;

import com.example.BookMyShowApp.Model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {

    boolean existsByName(String name);
}