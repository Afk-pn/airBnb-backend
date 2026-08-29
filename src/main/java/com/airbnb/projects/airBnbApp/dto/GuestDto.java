package com.airbnb.projects.airBnbApp.dto;

import  com.airbnb.projects.airBnbApp.entity.User;
import  com.airbnb.projects.airBnbApp.entity.enums.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class GuestDto {
    private Long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
}
