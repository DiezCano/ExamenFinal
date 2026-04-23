package modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@Data
@Getter
@Setter
public class Viaje {

    private long id;
    private Viajero viajero;          // se resuelve buscando por DNI al cargar
    private String lineaTransporte;   // ej: "L1", "L5", "Metro-A"
    private String origen;
    private String destino;
    private LocalDate fechaViaje;
    private LocalTime horaViaje;
    private int duracionMinutos;
    private double precio;
    private boolean incidencia;       // true si hubo incidencia en el trayecto

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Viaje{");
        sb.append(" | ").append(id);
        sb.append(" | ").append(viajero);
        sb.append(" | ").append(lineaTransporte).append('\'');
        sb.append(" | ").append(origen).append('\'');
        sb.append(" | ").append(destino).append('\'');
        sb.append(" | ").append(fechaViaje);
        sb.append(" | ").append(horaViaje);
        sb.append(" | ").append(duracionMinutos);
        sb.append(" | ").append(precio);
        sb.append(" | ").append(incidencia);
        sb.append(" | ");
        return sb.toString();
    }
}
