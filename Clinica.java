public class Clinica {

    // Nuevo metodo (Commit 2)
    private boolean validarPaciente(String paciente) {
        if (paciente == null || paciente.isEmpty()) {
            System.out.println("ERROR: Paciente no válido");
            return false;
        }
        return true;
    }

    public void agendarCita(String paciente, String doctor, String fecha, String tipo) {

        //Validacion sin repeticiones (Commit 2)
        if (!validarPaciente(paciente)) return;

        System.out.println("Cita agendada para " + paciente + " con el Dr. " + doctor);

        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }

    public void cancelarCita(String paciente, String fecha) {

        //Validacion si repeticiones (Commit 2)
        if (!validarPaciente(paciente)) return;

        System.out.println("Cita cancelada para " + paciente);

        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }

    public void emitirReceta(String paciente, String medicamento) {

        //Validacion si repeticiones (Commit 2)
        if (!validarPaciente(paciente)) return;

        System.out.println("Receta de " + medicamento + " para " + paciente);

        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }
}