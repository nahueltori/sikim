package sikim;

import org.springframework.data.annotation.Id;

public class Paciente {

	@Id
	private String id;

	private String nombre;
	private String apellido;
	private long dni;
/*    private Date fechaNacimiento;
    
    private String diagnostico;
    private Tratamiento tratamiento;*/
    

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

/*    public Date getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fecha){
        this.fechaNacimiento = fecha;
    }
    
	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}
*/
	@Override
    public String toString() {
        return String.format(
                "Paciente[nombre='%s', apellido='%s', dni='%d']",
                nombre, apellido, dni);
    }

}