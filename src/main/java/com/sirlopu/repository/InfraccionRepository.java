package com.sirlopu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sirlopu.entity.Infraccion;

import java.util.Date;
import java.util.List;

@Repository
public interface InfraccionRepository extends JpaRepository<Infraccion, Integer> {

	List<Infraccion> findByDniContaining(String dni);

	List<Infraccion> findByPlacaContaining(String placa);

	List<Infraccion> findByFecha(Date fecha);
}
