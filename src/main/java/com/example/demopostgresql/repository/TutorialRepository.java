package com.example.demopostgresql.repository;

import com.example.demopostgresql.entity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial,Long > {
}
