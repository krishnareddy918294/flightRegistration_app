package com.flight_reservation_app_5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_reservation_app_5.entity.user;

public interface UserRepository extends JpaRepository<user, Long> {

	user findByEmail(String emailid);

}
