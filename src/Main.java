import java.util.Scanner;
public class Main {
    private static Scanner sc = new Scanner(System.in);
   private static GestorFichajes gestorFichajes = new GestorFichajes();

    public static void main(String[] args) {
        int opcionPrincipal;
        do {
            imprimirMenuPrincipal();
            opcionPrincipal = sc.nextInt();
            
            switch (opcionPrincipal) {
                case 1: menuContratacion(); break;
                case 2: menuFichaje(); break;
                case 3: menuNominas(); break;
                case 4: menuProyectos(); break;
                case 5: menuInformes(); break;
                case 6: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcionPrincipal != 6);
    }

    private static void imprimirMenuPrincipal() {
        System.out.println("\n=== SISTEMA DE GESTIÓN Y FICHAJE ===");
        System.out.println("1. CONTRATACIÓN");
        System.out.println("2. FICHAJE");
        System.out.println("3. NÓMINAS");
        System.out.println("4. PROYECTOS (Solo desarrolladores)");
        System.out.println("5. INFORMES");
        System.out.println("6. SALIR");
        System.out.print("Seleccione una opción: ");
    }

    private static void menuContratacion() {
        System.out.println("\n--- CONTRATACIÓN ---");
        System.out.println("1.1. Contratar empleado");
        System.out.println("1.2. Asignar a departamento");
        System.out.println("1.3. Ver contratos activos");
    }

    private static void menuFichaje() {
        System.out.println("\n--- FICHAJE ---");
        System.out.println("2.1. Registrar entrada");
        System.out.println("2.2. Registrar salida");
        System.out.println("2.3. Consultar mis fichajes");
        System.out.println("2.4. Reporte mensual de horas");
    }

    private static void menuNominas() {
        System.out.println("\n--- NÓMINAS ---");
        System.out.println("3.1. Calcular salario empleado");
        System.out.println("3.2. Calcular nómina total");
        System.out.println("3.3. Ver historial de pagos");
    }

    private static void menuProyectos() {
        System.out.println("\n--- PROYECTOS ---");
        System.out.println("4.1. Asignar a proyecto");
        System.out.println("4.2. Registrar horas proyecto");
        System.out.println("4.3. Ver productividad");
    }

    private static void menuInformes() {
        System.out.println("\n--- INFORMES ---");
        System.out.println("5.1. Empleados por departamento");
        System.out.println("5.2. Asistencia mensual");
        System.out.println("5.3. Horas extra aprobadas");
        System.out.println("5.4. Proyectos activos");
    }
