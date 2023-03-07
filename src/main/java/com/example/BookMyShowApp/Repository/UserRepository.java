package com.example.BookMyShowApp.Repository;

import com.example.BookMyShowApp.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
