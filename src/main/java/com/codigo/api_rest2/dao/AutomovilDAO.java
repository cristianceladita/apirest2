package com.codigo.api_rest2.dao;

import com.codigo.api_rest2.entity.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovilDAO extends JpaRepository<Automovil,Long> {
}
