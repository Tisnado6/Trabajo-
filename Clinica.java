public class Clinica {

    public void agendarCita(String paciente, String doctor, String fecha, String tipo) {

        
        if (!validarPaciente(paciente)) return;

        // Lógica de agenda
        System.out.println("Cita agendada para " + paciente + " con el Dr. " + doctor);

        // Log (aún duplicado, NO tocado en este commit)
        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }

    public void cancelarCita(String paciente, String fecha) {

        
        if (!validarPaciente(paciente)) return;

        System.out.println("Cita cancelada para " + paciente);

        // Log (sin refactor todavía)
        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }

    public void emitirReceta(String paciente, String medicamento) {

        
        if (!validarPaciente(paciente)) return;

        System.out.println("Receta de " + medicamento + " para " + paciente);

        // Log (sin refactor todavía)
        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }

    
    // (COMMIT 2)
    
    private boolean validarPaciente(String paciente) {
        if (paciente == null || paciente.isEmpty()) {
            System.out.println("ERROR: Paciente no válido");
            return false;
        }
        return true;
    }
}
