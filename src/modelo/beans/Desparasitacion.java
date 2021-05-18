package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the desparasitacion database table.
 * 
 */
@Entity
@NamedQuery(name="Desparasitacion.findAll", query="SELECT d FROM Desparasitacion d")
public class Desparasitacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_desparasitacion")
	private int idDesparasitacion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String tipo;

	private String validez;

	//uni-directional many-to-one association to Mascota
	@ManyToOne
	@JoinColumn(name="id_mascota")
	private Mascota mascota;

	public Desparasitacion() {
	}

	public int getIdDesparasitacion() {
		return this.idDesparasitacion;
	}

	public void setIdDesparasitacion(int idDesparasitacion) {
		this.idDesparasitacion = idDesparasitacion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getValidez() {
		return this.validez;
	}

	public void setValidez(String validez) {
		this.validez = validez;
	}

	public Mascota getMascota() {
		return this.mascota;
	}

	public int getIdMascota() {
		
		return this.mascota.getIdMascota();		
	}
	
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Desparasitacion(int idDesparasitacion, Date fecha, String tipo, String validez, Mascota mascota) {
		super();
		this.idDesparasitacion = idDesparasitacion;
		this.fecha = fecha;
		this.tipo = tipo;
		this.validez = validez;
		this.mascota = mascota;
	}

	@Override
	public String toString() {
		return "Desparasitacion [idDesparasitacion=" + idDesparasitacion + ", fecha=" + fecha + ", tipo=" + tipo
				+ ", validez=" + validez + ", mascota=" + mascota + "]";
	}
	
	

}