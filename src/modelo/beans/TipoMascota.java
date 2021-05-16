package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


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

	//bi-directional many-to-one association to Mascota
	@OneToMany(mappedBy="tipoMascotaBean")
	private List<Mascota> mascotas;

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

	public List<Mascota> getMascotas() {
		return this.mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public Mascota addMascota(Mascota mascota) {
		getMascotas().add(mascota);
		mascota.setTipoMascotaBean(this);

		return mascota;
	}

	public Mascota removeMascota(Mascota mascota) {
		getMascotas().remove(mascota);
		mascota.setTipoMascotaBean(null);

		return mascota;
	}

	public TipoMascota(int idTipo, String tipo, List<Mascota> mascotas) {
		super();
		this.idTipo = idTipo;
		this.tipo = tipo;
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "TipoMascota [idTipo=" + idTipo + ", tipo=" + tipo + ", mascotas=" + mascotas + "]";
	}

	
	
}