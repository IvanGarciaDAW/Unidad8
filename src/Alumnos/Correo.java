package Alumnos;

public class Correo {
	private String nombre;
	private String apellido1;
	private String curso;
	private String correo;
	
	public Correo(String apellido1, String curso, String nombre, String correo) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.curso = curso;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Correo [apellido1=" + apellido1 + ", curso=" + curso + ", nombre=" + nombre + ", correo=" + correo
				+ "]";
	}
	
	
}
