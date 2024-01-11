package com.example.ekz2.repository;

import com.example.ekz2.entity.Groupi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface GroupiRepository extends JpaRepository<Groupi, Integer> {

    Optional<Groupi> findByGroupa(String groupa);

}
