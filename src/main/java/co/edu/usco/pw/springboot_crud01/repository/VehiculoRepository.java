package co.edu.usco.pw.springboot_crud01.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.usco.pw.springboot_crud01.model.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long>{
	List<Vehiculo> findByUserName(String user);
}
