package ar.edu.utn.alertaciudadana.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.utn.alertaciudadana.dominio.Dispositivo;
import ar.edu.utn.alertaciudadana.logica.DispositivoService;

@RestController
@RequestMapping("/dispositivos")
public class DispositivoController {

	@Autowired
	private DispositivoService servicio;

	@RequestMapping
	public Iterable<Dispositivo> listarTodos() {
		return servicio.listarTodos();
	}

	@PostMapping
	public Dispositivo guardar(@RequestBody Dispositivo d) {
		return servicio.guardar(d);
	}

	@PutMapping
	public Dispositivo actualizar(@RequestBody Dispositivo d) {
		return servicio.actualizar(d);
	}
}
