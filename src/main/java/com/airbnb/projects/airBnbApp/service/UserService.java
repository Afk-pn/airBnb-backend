package com.airbnb.projects.airBnbApp.service;

import com.airbnb.projects.airBnbApp.dto.ProfileUpdateRequestDto;
import com.airbnb.projects.airBnbApp.dto.UserDto;
import com.airbnb.projects.airBnbApp.entity.User;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
