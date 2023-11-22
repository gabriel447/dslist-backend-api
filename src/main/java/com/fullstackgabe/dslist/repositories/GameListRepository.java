package com.fullstackgabe.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackgabe.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}