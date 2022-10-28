package com.flight_reservation_app_5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_5.entity.passenger;

public interface passengerRepository extends JpaRepository<passenger, Long> {

}
