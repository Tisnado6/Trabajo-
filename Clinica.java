public class Clinica {

    public void agendarCita(String paciente, String doctor, String fecha, String tipo) {

        if (!validarPaciente(paciente)) return;

        System.out.println("Cita agendada para " + paciente + " con el Dr. " + doctor);

        registrarLog();
    }

    public void cancelarCita(String paciente, String fecha) {

        if (!validarPaciente(paciente)) return;

        System.out.println("Cita cancelada para " + paciente);

        registrarLog();
    }

    public void emitirReceta(String paciente, String medicamento) {

        if (!validarPaciente(paciente)) return;

        System.out.println("Receta de " + medicamento + " para " + paciente);

        registrarLog();
    }

    private boolean validarPaciente(String paciente) {
        if (paciente == null || paciente.isEmpty()) {
            System.out.println("ERROR: Paciente no válido");
            return false;
        }
        return true;
    }

    // Commit 3
    private void registrarLog() {
        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }
}