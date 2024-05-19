import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de acciones (solo para fines de demostración)
        List<Accion> acciones = List.of(
                new Accion("AAPL", "Apple Inc.", 145.30, 75432100, 2415.67),
                new Accion("MSFT", "Microsoft Corporation", 250.65, 45231200, 1900.21)
        );

        // Crear instancias de los analizadores de datos XML y JSON, y su adaptador
        AnalizadorDatosXML analizadorXML = new AnalizadorDatosXML();
        AnalizadorDatosJSON adaptadorJSON = new AnalizadorDatosJSON();
        AnalizadorDatosJSONAdapter adaptador = new AnalizadorDatosJSONAdapter(adaptadorJSON);

        // Analizar los datos utilizando el adaptador
        analizadorXML.analizarDatos(acciones);
        adaptador.analizarDatos(acciones);
    }
}
