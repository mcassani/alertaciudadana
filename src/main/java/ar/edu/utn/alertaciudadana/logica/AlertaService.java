package ar.edu.utn.alertaciudadana.logica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.utn.alertaciudadana.dominio.Alerta;
import ar.edu.utn.alertaciudadana.persistencia.AlertaRepository;

@Service
public class AlertaService {

	@Autowired
	private AlertaRepository repositorio;

	public Iterable<Alerta> listarTodos() {
		return repositorio.findAll();
	}

	public Alerta guardar(Alerta a) {
		return repositorio.save(a);
	}

	public Alerta actualizar(Alerta a) {
		return repositorio.save(a);
	}

	public Iterable<Alerta> listarFiltrado(String nombre) {
		return repositorio
				.findByDispositivo_NombrePersonaContainingIgnoreCaseOrDispositivoApellidoPersonaContainingIgnoreCase(
						nombre, nombre);
	}
}
