package org.theswimguide.engine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.theswimguide.engine.models.Street;

@Repository
public interface StreetRepository extends JpaRepository<Street, Integer> {
    
}
