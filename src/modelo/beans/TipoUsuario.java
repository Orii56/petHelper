package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipo_usuario database table.
 * 
 */
@Entity
@Table(name="tipo_usuario")
@NamedQuery(name="TipoUsuario.findAll", query="SELECT t FROM TipoUsuario t")
public class TipoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_tipo")
	private int idTipo;

	private String tipo;

	public TipoUsuario() {
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

	
	public TipoUsuario(int idTipo, String tipo) {
		super();
		this.idTipo = idTipo;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "TipoUsuario [idTipo=" + idTipo + ", tipo=" + tipo + "]";
	}
	
	

}