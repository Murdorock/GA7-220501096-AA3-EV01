package sena.proyecto;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: clientes
 *
 */
@Entity

public class clientes implements Serializable {

	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Id
	
	private Integer id;
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private static final long serialVersionUID = 1L;

	
	// Agrega aquí los atributos y métodos necesarios para tu entidad "clientes"
	public clientes(String cedula, String nombre, String apellido, String correo, String telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
	}
	// Constructor vacío (requerido por JPA)
	public clientes() {
		super();
	}   
	// Getters y setters para los atributos (si es necesario)
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	} 
	// Getters y setters para los atributos (si es necesario)
	public String getCedula() {
		return this.cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	} 
	// Getters y setters para los atributos (si es necesario)
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 
	// Getters y setters para los atributos (si es necesario)
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}   
	// Getters y setters para los atributos (si es necesario)
	public String getCorreo() {
		return this.correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}  
	// Getters y setters para los atributos (si es necesario)
	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
   
}
