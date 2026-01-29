public class Manager extends Empleado {
    private String titulo; // Team Lead, Department Head, Director
    private double presupuestoGestionado;
    private int reunionesSemanales;
    private int personasACargo;

public Manager(String dni, String nombre, int edad, double salarioBase, 
    int antiguedadAnios, int personasACargo, String titulo, double presupuesto) {
    super(dni, nombre, edad, salarioBase, antiguedadAnios);
    this.personasACargo = personasACargo;
    this.titulo = titulo;
    this.presupuestoGestionado = presupuesto;
    }
public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPresupuestoGestionado() {
        return presupuestoGestionado;
    }

    public void setPresupuestoGestionado(double presupuestoGestionado) {
        this.presupuestoGestionado = presupuestoGestionado;
    }

    public int getReunionesSemanales() {
        return reunionesSemanales;
    }

    public void setReunionesSemanales(int reunionesSemanales) {
        this.reunionesSemanales = reunionesSemanales;
    }

    public int getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(int personasACargo) {
        this.personasACargo = personasACargo;
    }

@Override
public double calcularSalario() {
    double salario = super.calcularSalario(); // Incluye base + antigüedad de Persona 2
    double plusPersonas = this.personasACargo * 250.0;
    double bonusPresupuesto = this.presupuestoGestionado * 0.002;
        
    return salario + plusPersonas + bonusPresupuesto;
    }

public void aprobarHorasExtra(Desarrollador dev, double horas) {
    System.out.println("Manager " + getNombre() + " aprobando " + horas + "h para " + dev.getNombre());
        dev.registrarHoraExtra(horas);
    }

    
}
