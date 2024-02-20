import java.util.Scanner;

// Interfaz para representar a los diferentes tipos de usuarios
interface Usuario {
    void mostrarOpciones();
}

// Clases concretas que implementan la interfaz Usuario
class Estudiante implements Usuario {
    public void mostrarOpciones() {
        System.out.println("1. Consultar nota de una clase específica");
        System.out.println("2. Realizar Pago");
        System.out.println("3. Consultar Pagos");
    }
}

class Docente implements Usuario {
    public void mostrarOpciones() {
        System.out.println("1. Ingresar notas de los estudiantes en una clase en específico");
        System.out.println("2. Cobrar Pago");
        System.out.println("3. Historial de Pagos");
    }
}

class PersonalAdministrativo implements Usuario {
    public void mostrarOpciones() {
        System.out.println("1. Crear Cursos, Docentes y Estudiantes");
        System.out.println("2. Asignar estudiante a curso");
        System.out.println("3. Asignar catedrático a curso");
        System.out.println("4. Asignar pago a catedrático");
        System.out.println("5. Resumen de Notas y Resumen de Pagos de Estudiantes");
    }
}

class AuditoriaExterna implements Usuario {
    public void mostrarOpciones() {
        System.out.println("1. Revisar notas");
        System.out.println("2. Revisar cuotas pagadas de estudiantes");
        System.out.println("3. Revisar Pagos a docentes");
    }
}

// Interfaz para representar las opciones de cada usuario
interface Opciones {
    void exportarResumen();
}

// Clases concretas que implementan la interfaz Opciones
class ExportadorPDF implements Opciones {
    public void exportarResumen() {
        System.out.println("Exportando resumen en formato PDF...");
    }
}

class ExportadorExcel implements Opciones {
    public void exportarResumen() {
        System.out.println("Exportando resumen en formato Excel...");
    }
}

// Factory para crear objetos Usuario y Opciones
class UsuarioFactory {
    public Usuario getUsuario(String tipoUsuario) {
        switch (tipoUsuario.toLowerCase()) {
            case "estudiante":
                return new Estudiante();
            case "docente":
                return new Docente();
            case "personal administrativo":
                return new PersonalAdministrativo();
            case "auditoria externa":
                return new AuditoriaExterna();
            default:
                return null;
        }
    }

    public Opciones getOpciones(String formato) {
        switch (formato.toLowerCase()) {
            case "pdf":
                return new ExportadorPDF();
            case "excel":
                return new ExportadorExcel();
            default:
                return null;
        }
    }
}

// Clase principal que simula el login y la interacción con el sistema
public class SistemaUniversitario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsuarioFactory factory = new UsuarioFactory();

        // Simulación de login
        System.out.println("Ingrese su tipo de usuario (Estudiante, Docente, Personal Administrativo, Auditoria Externa):");
        String tipoUsuario = scanner.nextLine();
        Usuario usuario = factory.getUsuario(tipoUsuario);

        if (usuario != null) {
            usuario.mostrarOpciones();

            System.out.println("Seleccione una opción:");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Implementar la lógica para la opción seleccionada
                    break;
                case 2:
                    // Implementar la lógica para la opción seleccionada
                    break;
                case 3:
                    // Implementar la lógica para la opción seleccionada
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            // Simulación de exportar resumen
            System.out.println("Seleccione el formato de exportación (PDF, Excel):");
            String formato = scanner.nextLine();
            Opciones opciones = factory.getOpciones(formato);

            if (opciones != null) {
                opciones.exportarResumen();
            } else {
                System.out.println("Formato de exportación no válido.");
            }
        } else {
            System.out.println("Tipo de usuario no válido.");
        }

        scanner.close();
    }
}
