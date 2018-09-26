package ar.edu.utn.alertaciudadana.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Alerta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String idAlerta;
	private Date fechaHora;
	@Enumerated(EnumType.STRING)
	private TipoAlerta tipoAlerta;
	@ManyToOne
	private Dispositivo dispositivo;
	
	
}
