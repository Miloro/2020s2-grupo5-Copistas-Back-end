package com.unq.copistas.repository;

import com.unq.copistas.model.Iteracion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IteracionRepository extends JpaRepository<Iteracion, Long> {

}
