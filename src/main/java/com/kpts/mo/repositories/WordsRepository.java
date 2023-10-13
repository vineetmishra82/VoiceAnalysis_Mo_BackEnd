package com.kpts.mo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpts.mo.models.Words;

public interface WordsRepository extends JpaRepository<Words, Long> {

}
