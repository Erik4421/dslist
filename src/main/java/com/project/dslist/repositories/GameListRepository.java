package com.project.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
