package servicios;

import modelo.Viaje;
import modelo.Viajero;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class TransporteServicio {

        private final List<Viajero> viajeros;
        private final List<Viaje> viajes;

        public TransporteServicio(List<Viajero> viajeros, List<Viaje> viajes) {
            this.viajeros = viajeros;
            this.viajes = viajes;
        }

        /**
         * Busca un viajero en la lista por su DNI.
         * @throws RuntimeException si no existe ningún viajero con ese DNI.
         */
        public Viajero buscarViajero(String dni) {
            return viajeros.stream()
                    .filter(v -> v.getDni().equals(dni))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Viajero no encontrado: " + dni));
        }

        // ... métodos de consulta de Streams

    // Consulta 1 — Viajes de una línea concreta ordenados por hora
    public List<Viaje> getViajesPorLinea(String Linea) {
        return viajes.stream()
                .filter(viaje -> Boolean.parseBoolean((viaje.getLineaTransporte())))
                .sorted(Comparator.comparing(Viaje::getHoraViaje))
                .toList();
    }

    // Consulta 2 — Viajeros con incidencias

    // Consulta 3 — Primer viaje del día

    // Consulta 4 — Viajes largos

    // Consulta 5 — Top 5 viajes más largos

    // Consulta 6 — Gasto total por viajero

    // Consulta 7 — Duration media por Linea

    // Consulta 8 — Número de viajes por mes

    // Consulta 9 — Municipios con incidences

    // Consulta 10 — Estadísticas de duración de viajes

    // Consulta 11 — Viajes gratuitos o de bajo coste

    // Consulta 12 — Comprobar si todos los viajeros ANUALES superan 100 puntos

    // Consulta 13 — Mostrar el gasto de los viajeros en un mes concreto

    // Consulta 14 — Línea con más incidencias

    // Consulta 15 — Viajeros con abono OCASIONAL y gasto alto


}


