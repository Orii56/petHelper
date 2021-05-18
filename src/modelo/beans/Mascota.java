package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the mascota database table.
 * 
 */
@Entity
@NamedQuery(name="Mascota.findAll", query="SELECT m FROM Mascota m")
public class Mascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_mascota")
	private int idMascota;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	private String nombre;

	private String raza;

	private String sexo;

	//uni-directional many-to-one association to TipoMascota
	@ManyToOne
	@JoinColumn(name="tipo_mascota")
	private TipoMascota tipoMascotaBean;

	//uni-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	public Mascota() {
	}

	public int getIdMascota() {
		return this.idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public TipoMascota getTipoMascotaBean() {
		return this.tipoMascotaBean;
	}

	public void setTipoMascotaBean(TipoMascota tipoMascotaBean) {
		this.tipoMascotaBean = tipoMascotaBean;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public int getIdUsuario() {
		
		return this.usuario.getIdUsuario();		
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Mascota(int idMascota, Date fechaNacimiento, String nombre, String raza, String sexo,
			TipoMascota tipoMascotaBean, Usuario usuario) {
		super();
		this.idMascota = idMascota;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.raza = raza;
		this.sexo = sexo;
		this.tipoMascotaBean = tipoMascotaBean;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre
				+ ", raza=" + raza + ", sexo=" + sexo + ", tipoMascotaBean=" + tipoMascotaBean + ", usuario=" + usuario
				+ "]";
	}

	
	
}