import java.util.Scanner;

// Interfaz para los usuarios
interface Usuario {
    void mostrarMenu();
}

// Clases concretas para los diferentes tipos de usuarios
class Estudiante implements Usuario {
    public void mostrarMenu() {
        System.out.println("Opciones para Estudiante:");
        System.out.println("1. Consultar nota de una clase específica");
        System.out.println("2. Realizar Pago");
        System.out.println("3. Consultar Pagos");
        System.out.println("4. Salir");
    }
}

class Docente implements Usuario {
    public void mostrarMenu() {
        System.out.println("Opciones para Docente:");
        System.out.println("1. Ingresar notas de los estudiantes en una clase en específico");
        System.out.println("2. Cobrar Pago");
        System.out.println("3. Historial de Pagos");
        System.out.println("4. Salir");
    }
}

class PersonalAdministrativo implements Usuario {
    public void mostrarMenu() {
        System.out.println("Opciones para Personal Administrativo:");
        System.out.println("1. Crear Cursos, Docentes y Estudiantes");
        System.out.println("2. Asignar estudiante a curso");
        System.out.println("3. Asignar catedrático a curso");
        System.out.println("4. Asignar pago a catedrático");
        System.out.println("5. Resumen de Notas y Resumen de Pagos de Estudiantes");
        System.out.println("6. Salir");
    }
}

class AuditorExterno implements Usuario {
    public void mostrarMenu() {
        System.out.println("Opciones para Auditor Externo:");
        System.out.println("1. Revisar notas");
        System.out.println("2. Revisar coutas pagadas de estudiantes");
        System.out.println("3. Revisar Pagos a docentes");
        System.out.println("4. Salir");
    }
}

// Factory para crear instancias de usuarios
class UsuarioFactory {
    public static Usuario crearUsuario(String tipo) {
        switch (tipo) {
            case "Estudiante":
                return new Estudiante();
            case "Docente":
                return new Docente();
            case "Personal Administrativo":
                return new PersonalAdministrativo();
            case "Auditor Externo":
                return new AuditorExterno();
            default:
                throw new IllegalArgumentException("Tipo de usuario desconocido");
        }
    }
}

public class Universidad {
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();
        return true; // Simulación de autenticación exitosa
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su rol (Estudiante/Docente/Personal Administrativo/Auditor Externo): ");
        String tipoUsuario = scanner.nextLine();
        Usuario usuario = UsuarioFactory.crearUsuario(tipoUsuario);

        if (login()) {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Bienvenido, " + nombre);

            boolean salir = false;
            while (!salir) {
                usuario.mostrarMenu();
                System.out.print("Seleccione una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                switch (opcion) {
                    case 1:
                        System.out.println("Realizando opción 1...");
                        break;
                    case 2:
                        System.out.println("Realizando opción 2...");
                        break;
                    case 3:
                        System.out.println("Realizando opción 3...");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
            }
        } else {
            System.out.println("Autenticación fallida");
        }
    }
}
