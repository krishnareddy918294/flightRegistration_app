package com.flight_reservation_app_5.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight_reservation_app_5.entity.flight;

public interface flightRepository extends JpaRepository<flight, Long> {
@Query("from flight where departurecity=:departurecity and arrivalcity=:arrivalcity and dateOfDeparture=:dateOfDeparture")
	List<flight> findFlights(@Param("departurecity")String from,@Param("arrivalcity") String to,@Param("dateOfDeparture") Date departureDate);

}
