import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String idProyecto;
    private String nombre;
    private List<String> desarrolladoresAsignados;
    private double horasEstimadas;
    private double horasReales;
    private String estado;

    public Proyecto() {
        this.desarrolladoresAsignados = new ArrayList<>();
        this.estado = "PLANIFICADO";
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getDesarrolladoresAsignados() {
        return desarrolladoresAsignados;
    }

    public double getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(double horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public double getHorasReales() {
        return horasReales;
    }

    public void setHorasReales(double horasReales) {
        this.horasReales = horasReales;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void asignarDesarrollador(String idDesarrollador) {
        if (!desarrolladoresAsignados.contains(idDesarrollador)) {
            desarrolladoresAsignados.add(idDesarrollador);
        }
    }

    public void registrarHoras(String idDesarrollador, double horas) {
        if (desarrolladoresAsignados.contains(idDesarrollador)) {
            this.horasReales += horas;
        }
    }

    public double calcularProductividad() {
        if (horasReales == 0) return 0;
        return (horasEstimadas / horasReales) * 100;
    }
}