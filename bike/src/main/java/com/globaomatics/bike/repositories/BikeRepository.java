package com.globaomatics.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.globaomatics.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
