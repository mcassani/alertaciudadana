package ar.edu.utn.alertaciudadana.logica;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.utn.alertaciudadana.dominio.Dispositivo;
import ar.edu.utn.alertaciudadana.persistencia.DispositivoRepository;

@Service
public class DispositivoService {
	
	@Autowired
	private DispositivoRepository repositorio;
	
	public Iterable<Dispositivo> listarTodos() {
		return repositorio.findAll();
	}
	
	public Dispositivo guardar(Dispositivo d) {
		return repositorio.save(d);
	}
	
	public Dispositivo actualizar(Dispositivo d) {
		return repositorio.save(d);
	}
}
