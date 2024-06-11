package com.example.LogApp2.repository;

import com.example.LogApp2.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LogRepository extends JpaRepository<Log, Long> {
    Log findByUsername(String username);
}
