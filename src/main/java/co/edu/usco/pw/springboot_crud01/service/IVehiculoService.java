package co.edu.usco.pw.springboot_crud01.service;

import java.util.Date;

import java.util.List;
import java.util.Optional;

import co.edu.usco.pw.springboot_crud01.model.Vehiculo;

public interface IVehiculoService {

	List<Vehiculo> getVehiculosByUser(String user);

	Optional<Vehiculo> getVehiculoById(long id);

	void updateVehiculo(Vehiculo vehiculo);

	void addVehiculo(String placa, int horaEntrada, int horaSalida, String ubicacion, String tipoVehiculo);

	void deleteVehiculo(long id);
	
	void saveVehiculo(Vehiculo vehiculo);

}