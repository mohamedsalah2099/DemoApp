package com.example.test.repo;

import com.example.test.model.Motable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Motable, Long> {
}
