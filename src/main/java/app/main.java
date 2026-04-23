package app;

import modelo.Viaje;
import modelo.Viajero;
import servicios.TransporteServicio;
import utilidades.CsvLoader;

import java.io.IOException;
import java.util.List;

public class main {
    static void main() throws IOException {

        List<Viajero> viajeros = CsvLoader.cargarViajeros("src/main/resources/viajeros.csv");
        List<Viaje> viajes = CsvLoader.cargarViajes("src/main/resources/viajes.csv",viajeros);

        TransporteServicio servicio = new TransporteServicio(viajeros, viajes);

        System.out.println(" == 1 == ");
        servicio.getViajesPorLinea("L1").forEach(System.out::println);

        System.out.println(" == 2 == ");
        servicio.getViajesPorLinea("L1").forEach(System.out::println);

        // No te he hecho el menu por que para la verguenza
        // que he hecho no valia la pena malgastar tu tiempo





    }
}
