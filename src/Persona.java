import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String email;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento, String email, String telefono) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }

    public int calcularEdad() {
        if (fechaNacimiento == null) {
            return 0;
        }
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}