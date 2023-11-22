package com.fullstackgabe.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackgabe.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}