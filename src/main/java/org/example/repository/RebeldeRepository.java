package org.example.repository;

import org.example.model.RebeldeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RebeldeRepository extends JpaRepository<RebeldeModel, Long> {
    long countByTraidor(boolean b);

    long countByRebeldeAtivo(boolean b);
}
