package com.airbnb.projects.airBnbApp.service;

import com.airbnb.projects.airBnbApp.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
