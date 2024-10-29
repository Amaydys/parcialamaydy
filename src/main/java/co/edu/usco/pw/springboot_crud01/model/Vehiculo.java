package co.edu.usco.pw.springboot_crud01.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String userName="ADMINISTRADOR";
	

	private String placa;

	private int horaEntrada;
	
	private int horaSalida;
	
	private String ubicacion;
	
	private String tipoVehiculo;

	public Vehiculo() {
		super();
	}

	public Vehiculo(String placa, int horaEntrada, int horaSalida, String ubicacion,
			String tipoVehiculo) {
		super();
		this.placa = placa;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
		this.ubicacion = ubicacion;
		this.tipoVehiculo = tipoVehiculo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(int horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
	
	
}

	