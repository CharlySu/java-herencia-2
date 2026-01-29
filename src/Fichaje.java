import java.time.LocalDateTime;

public class Fichaje {
    private String idFichaje;
    private String idEmpleado;
    private LocalDateTime fechaHoraEntrada;
    private LocalDateTime fechaHoraSalida;
    private String tipo;

    public Fichaje(String idFichaje, String idEmpleado, String tipo) {
        this.idFichaje = idFichaje;
        this.idEmpleado = idEmpleado;
        this.tipo = tipo;
        this.fechaHoraEntrada = LocalDateTime.now();
    }

    public String getIdFichaje() {
        return idFichaje;
    }

    public void setIdFichaje(String idFichaje) {
        this.idFichaje = idFichaje;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public LocalDateTime getFechaHoraEntrada() {
        return fechaHoraEntrada;
    }

    public void setFechaHoraEntrada(LocalDateTime fechaHoraEntrada) {
        this.fechaHoraEntrada = fechaHoraEntrada;
    }

    public LocalDateTime getFechaHoraSalida() {
        return fechaHoraSalida;
    }

    public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
        this.fechaHoraSalida = fechaHoraSalida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}