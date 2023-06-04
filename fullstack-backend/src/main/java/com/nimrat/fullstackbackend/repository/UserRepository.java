package com.nimrat.fullstackbackend.repository;

import com.nimrat.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// <> model,data type of primary key(id)
public interface UserRepository extends JpaRepository<User,Long> {
}
