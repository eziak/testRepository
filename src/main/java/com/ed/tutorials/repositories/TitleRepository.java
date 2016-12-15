package com.ed.tutorials.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ed.tutorials.domain.Title;

@Repository
public interface TitleRepository extends JpaRepository<Title, Long> {

}
