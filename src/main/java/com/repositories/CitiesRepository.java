package com.repositories;

import com.linkDatabase.Cities;
import com.linkDatabase.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitiesRepository extends JpaRepository<Cities, Long> {
}
