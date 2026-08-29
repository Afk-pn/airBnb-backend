package com.airbnb.projects.airBnbApp.strategy;

import com.airbnb.projects.airBnbApp.entity.Inventory;

import java.math.BigDecimal;
public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
