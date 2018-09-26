package ar.edu.utn.alertaciudadana.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.alertaciudadana.dominio.Alerta;
import ar.edu.utn.alertaciudadana.logica.AlertaService;

@RestController
@RequestMapping("/alertas")
public class AlertaController {

	@Autowired
	private AlertaService servicio;

	@RequestMapping
	public Iterable<Alerta> listarTodos() {
		return servicio.listarTodos();
	}
	
	@GetMapping(params = {"nombre"})
	public Iterable<Alerta> listarFiltrado(@RequestParam(value="nombre", required = true) String nombre) {
		return servicio.listarFiltrado(nombre);
	}

	@PostMapping
	public Alerta guardar(@RequestBody Alerta a) {
		return servicio.guardar(a);
	}

	@PutMapping
	public Alerta actualizar(@RequestBody Alerta a) {
		return servicio.actualizar(a);
	}
}
