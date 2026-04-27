public class Clinica {
    
    public void agendarCita(String paciente, String doctor, String fecha, String tipo) {
        // VALIDACIÓN REPETIDA 1
        if (paciente == null || paciente.isEmpty()) {
            System.out.println("ERROR: Paciente no válido");
            return;
        }
        
        // Lógica de agenda
        System.out.println("Cita agendada para " + paciente + " con el Dr. " + doctor);
        
        // Formato de log repetido
        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }

    public void cancelarCita(String paciente, String fecha) {
        // VALIDACIÓN REPETIDA 2 (Igual a la anterior)
        if (paciente == null || paciente.isEmpty()) {
            System.out.println("ERROR: Paciente no válido");
            return;
        }

        System.out.println("Cita cancelada para " + paciente);
        
        // Formato de log repetido
        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }

    public void emitirReceta(String paciente, String medicamento) {
        // VALIDACIÓN REPETIDA 3
        if (paciente == null || paciente.isEmpty()) {
            System.out.println("ERROR: Paciente no válido");
            return;
        }

        System.out.println("Receta de " + medicamento + " para " + paciente);
        
        // Formato de log repetido
        System.out.println("[AUDITORIA] Cambio en sistema realizado el: " + java.time.LocalDate.now());
    }
}
