package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vacunas database table.
 * 
 */
@Entity
@Table(name="vacunas")
@NamedQuery(name="Vacuna.findAll", query="SELECT v FROM Vacuna v")
public class Vacuna implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_vacuna")
	private int idVacuna;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String tipo;

	//uni-directional many-to-one association to Mascota
	@ManyToOne
	@JoinColumn(name="id_mascota")
	private Mascota mascota;

	public Vacuna() {
	}

	public int getIdVacuna() {
		return this.idVacuna;
	}

	public void setIdVacuna(int idVacuna) {
		this.idVacuna = idVacuna;
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

	public Mascota getMascota() {
		return this.mascota;
	}
	
	public int getIdMascota() {
		return this.mascota.getIdMascota();
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Vacuna(int idVacuna, Date fecha, String tipo, Mascota mascota) {
		super();
		this.idVacuna = idVacuna;
		this.fecha = fecha;
		this.tipo = tipo;
		this.mascota = mascota;
	}

	@Override
	public String toString() {
		return "Vacuna [idVacuna=" + idVacuna + ", fecha=" + fecha + ", tipo=" + tipo + ", mascota=" + mascota + "]";
	}
	
	

}