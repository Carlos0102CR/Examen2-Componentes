package com.cenfotec.finca.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cenfotec.finca.domain.Cafe;

public interface CafeRepository extends JpaRepository<Cafe,Long>{
	List<Cafe> findByidFinca(Long idFinca);
}
