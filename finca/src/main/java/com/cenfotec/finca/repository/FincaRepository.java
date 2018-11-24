package com.cenfotec.finca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cenfotec.finca.domain.Finca;

public interface FincaRepository extends JpaRepository<Finca, Long>{
	List<Finca> findByidProductor(long idproductor);
}
