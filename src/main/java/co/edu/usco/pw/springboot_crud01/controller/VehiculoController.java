package co.edu.usco.pw.springboot_crud01.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.edu.usco.pw.springboot_crud01.model.Vehiculo;

import co.edu.usco.pw.springboot_crud01.service.IVehiculoService;

@Controller
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/list-vehiculos")
	public String showClases(ModelMap model) {
		model.put("vehiculos", vehiculoService.getVehiculosByUser("ADMINISTRADOR"));

		return "list-vehiculos";
	}


	@GetMapping("/add-vehiculo")
	public String showAddTodoPage(ModelMap model) {
		model.addAttribute("vehiculo", new Vehiculo());
		return "vehiculo";
	}

	@PostMapping("/add-vehiculo")
	public String addClase(ModelMap model, @Valid Vehiculo vehiculo, BindingResult result) {

		if (result.hasErrors()) {
			return "vehiculo";
		}

		vehiculoService.saveVehiculo(vehiculo);
		return "redirect:/list-vehiculos";
	}

	@GetMapping("/delete-vehiculo")
	public String deleteVehiculo(@RequestParam long id) {
		vehiculoService.deleteVehiculo(id);
		return "redirect:/list-vehiculos";
	}

	@GetMapping("/update-vehiculo")
	public String showUpdateVehiculoPage(@RequestParam long id, ModelMap model) {
		Vehiculo vehiculo = vehiculoService.getVehiculoById(id).get();
		model.put("vehiculo", vehiculo);
		return "vehiculo";
	}

	@PostMapping("/update-vehiculo")
	public String updateTodo(ModelMap model, @Valid Vehiculo vehiculo, BindingResult result) {

		if (result.hasErrors()) {
			return "Vehiculo";
		}

		vehiculoService.updateVehiculo(vehiculo);
		return "redirect:/list-todos";
	}	

}
