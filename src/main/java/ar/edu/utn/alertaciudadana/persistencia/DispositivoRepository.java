package ar.edu.utn.alertaciudadana.persistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.utn.alertaciudadana.dominio.Dispositivo;

@Repository
public interface DispositivoRepository extends
		CrudRepository<Dispositivo, Long> {

}
