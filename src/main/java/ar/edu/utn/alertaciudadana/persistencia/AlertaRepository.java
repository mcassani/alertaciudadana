package ar.edu.utn.alertaciudadana.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.alertaciudadana.dominio.Alerta;

@Repository
public interface AlertaRepository extends CrudRepository<Alerta, Long> {

	public Iterable<Alerta> findByDispositivo_NombrePersonaContainingIgnoreCaseOrDispositivoApellidoPersonaContainingIgnoreCase(
			String nombre, String apellido);

}
