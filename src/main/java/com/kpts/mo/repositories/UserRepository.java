package com.kpts.mo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpts.mo.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
