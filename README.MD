# Airbnb Backend

A hotel booking backend built using **Java, Spring Boot, Spring Data JPA, PostgreSQL, Spring Security, JWT, and Stripe**.

## Features

* User registration and authentication using JWT
* Role-based authorization for guests and hotel managers
* Hotel and room management
* Hotel search based on city, dates, and room availability
* Room inventory and availability management
* Booking lifecycle management
* Guest management for bookings
* Dynamic/surge pricing strategy
* Secure payment integration using Stripe
* Stripe webhook handling for payment confirmation
* Global exception and response handling
* Optimized hotel price searching using `HotelMinPrice`
* Pessimistic locking to prevent concurrent booking conflicts
* API documentation using Swagger/OpenAPI

## Tech Stack

* Java 21
* Spring Boot 3
* Spring Security
* Spring Data JPA / Hibernate
* PostgreSQL
* JWT
* Stripe
* Maven
* Swagger / OpenAPI

## Architecture

The application follows a layered architecture:

**Controller → Service → Repository → Database**

with separate layers for security, configuration, DTOs, exceptions, pricing strategies, and utilities.

## Security

* Stateless authentication using JWT
* BCrypt password hashing
* Access and refresh tokens
* Role-based access control
* Protected booking, user, and admin endpoints

## Note

The application uses environment variables for sensitive configuration such as JWT and Stripe credentials.
