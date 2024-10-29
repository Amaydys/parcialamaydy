package co.edu.usco.pw.springboot_crud01.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.usco.pw.springboot_crud01.model.Vehiculo;

import co.edu.usco.pw.springboot_crud01.repository.VehiculoRepository;

@Service
public class VehiculoService implements IVehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public List<Vehiculo> getVehiculosByUser(String user) {
		return vehiculoRepository.findByUserName(user);
	}

	@Override
	public Optional<Vehiculo> getVehiculoById(long id) {
		return vehiculoRepository.findById(id);
	}

	@Override
	public void updateVehiculo(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);
	}

	@Override
	public void addVehiculo(String placa, int horaEntrada, int horaSalida, String ubicacion, String tipoVehiculo) {
		vehiculoRepository.save(new Vehiculo(placa,horaEntrada,horaSalida,ubicacion,tipoVehiculo));
	}

	@Override
	public void deleteVehiculo(long id) {
		Optional<Vehiculo> vehiculo = vehiculoRepository.findById(id);
		if (vehiculo.isPresent()) {
			vehiculoRepository.delete(vehiculo.get());
		}
	}

	@Override
	public void saveVehiculo(Vehiculo vehiculo) {
		vehiculoRepository.save(vehiculo);
	}
}