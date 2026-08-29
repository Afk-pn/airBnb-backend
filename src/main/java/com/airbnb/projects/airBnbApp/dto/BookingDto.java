package com.airbnb.projects.airBnbApp.dto;

import com.airbnb.projects.airBnbApp.entity.Hotel;
import com.airbnb.projects.airBnbApp.entity.Room;
import com.airbnb.projects.airBnbApp.entity.User;
import com.airbnb.projects.airBnbApp.entity.enums.BookingStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
    private BigDecimal amount;
}
