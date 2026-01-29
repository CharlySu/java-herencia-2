import java.util.ArrayList;
import java.util.List;

public class Desarrollador extends Empleado {
    private String nivel;
    private List<String> tecnologias;
    private double horasExtra;

    public Desarrollador() {
        this.tecnologias = new ArrayList<>();
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<String> getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(List<String> tecnologias) {
        this.tecnologias = tecnologias;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void registrarHoraExtra(double horas) {
        this.horasExtra += horas;
    }

    @Override
    public double calcularSalario() {
        double salario = super.calcularSalario();

        if (nivel != null) {
            if (nivel.equalsIgnoreCase("Mid")) {
                salario = salario * 1.15;
            } else if (nivel.equalsIgnoreCase("Senior")) {
                salario = salario * 1.30;
            }
        }

        salario += (horasExtra * 20);
        return salario;
    }
}