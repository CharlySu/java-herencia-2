import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class GestorFichajes {
    private Map<String, List<Fichaje>> fichajes;

    public GestorFichajes() {
        this.fichajes = new HashMap<>();
    }

    public void registrarEntrada(String idEmpleado) {
        Fichaje nuevoFichaje = new Fichaje(UUID.randomUUID().toString(), idEmpleado, "ENTRADA");
        fichajes.putIfAbsent(idEmpleado, new ArrayList<>());
        fichajes.get(idEmpleado).add(nuevoFichaje);
    }

    public void registrarSalida(String idEmpleado) {
        List<Fichaje> lista = fichajes.get(idEmpleado);
        if (lista != null && !lista.isEmpty()) {
            Fichaje ultimo = lista.get(lista.size() - 1);
            if (ultimo.getFechaHoraSalida() == null) {
                ultimo.setFechaHoraSalida(LocalDateTime.now());
                ultimo.setTipo("SALIDA");
            }
        }
    }

    public List<Fichaje> obtenerFichajesDelDia(String idEmpleado, LocalDate fecha) {
        List<Fichaje> resultado = new ArrayList<>();
        List<Fichaje> lista = fichajes.get(idEmpleado);
        if (lista != null) {
            for (Fichaje f : lista) {
                if (f.getFechaHoraEntrada().toLocalDate().equals(fecha)) {
                    resultado.add(f);
                }
            }
        }
        return resultado;
    }

    public double calcularHorasMensuales(String idEmpleado, int mes, int anio) {
        double horasTotales = 0;
        List<Fichaje> lista = fichajes.get(idEmpleado);
        if (lista != null) {
            for (Fichaje f : lista) {
                if (f.getFechaHoraEntrada().getMonthValue() == mes &&
                        f.getFechaHoraEntrada().getYear() == anio &&
                        f.getFechaHoraSalida() != null) {

                    Duration duracion = Duration.between(f.getFechaHoraEntrada(), f.getFechaHoraSalida());
                    horasTotales += duracion.toMinutes() / 60.0;
                }
            }
        }
        return horasTotales;
    }

    public String generarReporteAsistencia(String idEmpleado) {
        List<Fichaje> lista = fichajes.get(idEmpleado);
        if (lista == null || lista.isEmpty()) {
            return "El empleado " + idEmpleado + " no tiene registros.";
        }
        return "El empleado " + idEmpleado + " tiene " + lista.size() + " fichajes registrados.";
    }
}