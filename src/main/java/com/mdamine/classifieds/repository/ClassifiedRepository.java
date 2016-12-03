package com.mdamine.classifieds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdamine.classifieds.model.Classified;

@Repository
public interface ClassifiedRepository extends JpaRepository<Classified, Long> {

}
