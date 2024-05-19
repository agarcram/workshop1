import java.util.List;

public class AnalizadorDatosXML implements AnalizadorDatos{
    @Override
    public void analizarDatos(List<Accion> acciones) {
        System.out.println("Analizando datos en formato XML:");
        for (Accion accion : acciones) {
            System.out.println(accion);
        }
    }
}
