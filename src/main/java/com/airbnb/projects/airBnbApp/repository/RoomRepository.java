package com.airbnb.projects.airBnbApp.repository;

import  com.airbnb.projects.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
