package com.cenfotec.finca.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cenfotec.finca.domain.Productor;

public interface ProductorRepository extends JpaRepository<Productor, Long> {
	List<Productor> findByNombreContaining(String nombre);
}
