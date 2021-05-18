package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_mascota database table.
 * 
 */
@Entity
@Table(name="tipo_mascota")
@NamedQuery(name="TipoMascota.findAll", query="SELECT t FROM TipoMascota t")
public class TipoMascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo")
	private int idTipo;

	private String tipo;

	public TipoMascota() {
	}

	public int getIdTipo() {
		return this.idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public TipoMascota(int idTipo, String tipo) {
		super();
		this.idTipo = idTipo;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TipoMascota [idTipo=" + idTipo + ", tipo=" + tipo + "]";
	}
	
	
	

}