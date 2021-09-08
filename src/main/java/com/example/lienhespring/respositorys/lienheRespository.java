package com.example.lienhespring.respositorys;

import com.example.lienhespring.domains.LienHe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface lienheRespository extends JpaRepository<LienHe,Integer> {
}
