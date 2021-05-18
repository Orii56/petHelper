package modelo.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usuario")
	private int idUsuario;

	private String ciudad;

	private String contrasena;

	private int cp;

	private String direccion;

	private String mail;

	private String nombre;

	private String pais;

	//bi-directional many-to-one association to Mascota
	@OneToMany(mappedBy="usuario")
	private List<Mascota> mascotas;

	//bi-directional many-to-one association to TipoUsuario
	@ManyToOne
	@JoinColumn(name="tipo_user")
	private TipoUsuario tipoUsuario;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getCp() {
		return this.cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Mascota> getMascotas() {
		return this.mascotas;
	}

	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public Mascota addMascota(Mascota mascota) {
		getMascotas().add(mascota);
		mascota.setUsuario(this);

		return mascota;
	}

	public Mascota removeMascota(Mascota mascota) {
		getMascotas().remove(mascota);
		mascota.setUsuario(null);

		return mascota;
	}

	public TipoUsuario getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Usuario(int idUsuario, String ciudad, String contrasena, int cp, String direccion, String mail,
			String nombre, String pais, List<Mascota> mascotas, TipoUsuario tipoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.ciudad = ciudad;
		this.contrasena = contrasena;
		this.cp = cp;
		this.direccion = direccion;
		this.mail = mail;
		this.nombre = nombre;
		this.pais = pais;
		this.mascotas = mascotas;
		this.tipoUsuario = tipoUsuario;
	}

	
	
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", ciudad=" + ciudad + ", contrasena=" + contrasena + ", cp=" + cp
				+ ", direccion=" + direccion + ", mail=" + mail + ", nombre=" + nombre + ", pais=" + pais
				+ ", mascotas=" + mascotas + ", tipoUsuario=" + tipoUsuario + "]";
	}

	
}