package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the higiene database table.
 * 
 */
@Entity
@NamedQuery(name="Higiene.findAll", query="SELECT h FROM Higiene h")
public class Higiene implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_higiene")
	private int idHigiene;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String tipo;

	private String validez;

	//bi-directional many-to-one association to Mascota
	@ManyToOne
	@JoinColumn(name="id_mascota")
	private Mascota mascota;

	public Higiene() {
	}

	public int getIdHigiene() {
		return this.idHigiene;
	}

	public void setIdHigiene(int idHigiene) {
		this.idHigiene = idHigiene;
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

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public Higiene(int idHigiene, Date fecha, String tipo, String validez, Mascota mascota) {
		super();
		this.idHigiene = idHigiene;
		this.fecha = fecha;
		this.tipo = tipo;
		this.validez = validez;
		this.mascota = mascota;
	}

	@Override
	public String toString() {
		return "Higiene [idHigiene=" + idHigiene + ", fecha=" + fecha + ", tipo=" + tipo + ", validez=" + validez
				+ ", mascota=" + mascota + "]";
	}
	
	

}