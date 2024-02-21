from abc import ABC, abstractmethod

class Usuario(ABC):
    @abstractmethod
    def mostrar_menu(self):
        pass

class Estudiante(Usuario):
    def mostrar_menu(self):
        print("Opciones para Estudiante:")
        print("1. Consultar nota de una clase específica")
        print("2. Realizar Pago")
        print("3. Consultar Pagos")

class Docente(Usuario):
    def mostrar_menu(self):
        print("Opciones para Docente:")
        print("1. Ingresar notas de los estudiantes en una clase en específico")
        print("2. Cobrar Pago")
        print("3. Historial de Pagos")

class PersonalAdministrativo(Usuario):
    def mostrar_menu(self):
        print("Opciones para Personal Administrativo:")
        print("1. Crear Cursos, Docentes y Estudiantes")
        print("2. Asignar estudiante a curso")
        print("3. Asignar catedrático a curso")
        print("4. Asignar pago a catedrático")
        print("5. Resumen de Notas y Resumen de Pagos de Estudiantes")

class AuditorExterno(Usuario):
    def mostrar_menu(self):
        print("Opciones para Auditor Externo:")
        print("1. Revisar notas")
        print("2. Revisar coutas pagadas de estudiantes")
        print("3. Revisar Pagos a docentes")

class UsuarioFactory:
    @staticmethod
    def crear_usuario(tipo):
        if tipo == "Estudiante":
            return Estudiante()
        elif tipo == "Docente":
            return Docente()
        elif tipo == "Personal Administrativo":
            return PersonalAdministrativo()
        elif tipo == "Auditor Externo":
            return AuditorExterno()
        else:
            raise ValueError("Tipo de usuario desconocido")

def login(usuario):
    # Aquí implementarías la lógica de autenticación
    return True  # Simulación de autenticación exitosa

def main():
    tipo_usuario = input("Ingrese su rol (Estudiante/Docente/Personal Administrativo/Auditor Externo): ")
    usuario = UsuarioFactory.crear_usuario(tipo_usuario)

    if login(usuario):
        usuario.mostrar_menu()
    else:
        print("Autenticación fallida")

if __name__ == "__main__":
    main()
