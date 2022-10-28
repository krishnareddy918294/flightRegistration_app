package com.flight_reservation_app_5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_5.entity.reservation;

public interface reservationRepository extends JpaRepository<reservation, Long> {
	

}
