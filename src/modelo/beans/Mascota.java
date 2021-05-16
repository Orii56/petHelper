package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


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

	//bi-directional many-to-one association to Desparasitacion
	@OneToMany(mappedBy="mascota")
	private List<Desparasitacion> desparasitacions;

	//bi-directional many-to-one association to Higiene
	@OneToMany(mappedBy="mascota")
	private List<Higiene> higienes;

	//bi-directional many-to-one association to TipoMascota
	@ManyToOne
	@JoinColumn(name="tipo_mascota")
	private TipoMascota tipoMascotaBean;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;

	//bi-directional many-to-one association to Vacuna
	@OneToMany(mappedBy="mascota")
	private List<Vacuna> vacunas;

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

	public List<Desparasitacion> getDesparasitacions() {
		return this.desparasitacions;
	}

	public void setDesparasitacions(List<Desparasitacion> desparasitacions) {
		this.desparasitacions = desparasitacions;
	}

	public Desparasitacion addDesparasitacion(Desparasitacion desparasitacion) {
		getDesparasitacions().add(desparasitacion);
		desparasitacion.setMascota(this);

		return desparasitacion;
	}

	public Desparasitacion removeDesparasitacion(Desparasitacion desparasitacion) {
		getDesparasitacions().remove(desparasitacion);
		desparasitacion.setMascota(null);

		return desparasitacion;
	}

	public List<Higiene> getHigienes() {
		return this.higienes;
	}

	public void setHigienes(List<Higiene> higienes) {
		this.higienes = higienes;
	}

	public Higiene addHigiene(Higiene higiene) {
		getHigienes().add(higiene);
		higiene.setMascota(this);

		return higiene;
	}

	public Higiene removeHigiene(Higiene higiene) {
		getHigienes().remove(higiene);
		higiene.setMascota(null);

		return higiene;
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

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Vacuna> getVacunas() {
		return this.vacunas;
	}

	public void setVacunas(List<Vacuna> vacunas) {
		this.vacunas = vacunas;
	}

	public Vacuna addVacuna(Vacuna vacuna) {
		getVacunas().add(vacuna);
		vacuna.setMascota(this);

		return vacuna;
	}

	public Vacuna removeVacuna(Vacuna vacuna) {
		getVacunas().remove(vacuna);
		vacuna.setMascota(null);

		return vacuna;
	}

	public Mascota(int idMascota, Date fechaNacimiento, String nombre, String raza,
			List<Desparasitacion> desparasitacions, List<Higiene> higienes, TipoMascota tipoMascotaBean,
			Usuario usuario, List<Vacuna> vacunas) {
		super();
		this.idMascota = idMascota;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.raza = raza;
		this.desparasitacions = desparasitacions;
		this.higienes = higienes;
		this.tipoMascotaBean = tipoMascotaBean;
		this.usuario = usuario;
		this.vacunas = vacunas;
	}

	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", fechaNacimiento=" + fechaNacimiento + ", nombre=" + nombre
				+ ", raza=" + raza + ", desparasitacions=" + desparasitacions + ", higienes=" + higienes
				+ ", tipoMascotaBean=" + tipoMascotaBean + ", usuario=" + usuario + ", vacunas=" + vacunas + "]";
	}

	
	
	
}