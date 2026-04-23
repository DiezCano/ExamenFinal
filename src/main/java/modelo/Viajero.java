package modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class Viajero {
    private String dni;
    private String nombre;
    private int edad;
    private String municipio;
    private TipoAbono tipoAbono;
    private int saldoPuntos;       // puntos acumulados por viajes

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Viajero{");
        sb.append(" | ").append(dni).append('\'');
        sb.append(" | ").append(nombre).append('\'');
        sb.append(" | ").append(edad);
        sb.append(" | ").append(municipio).append('\'');
        sb.append(" | ").append(tipoAbono);
        sb.append(" | ").append(saldoPuntos);
        sb.append(" | ");
        return sb.toString();
    }
}
