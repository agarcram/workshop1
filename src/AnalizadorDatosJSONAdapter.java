import java.util.List;
import org.json.JSONObject;
import org.json.XML;


public class AnalizadorDatosJSONAdapter implements AnalizadorDatos{

    private final AnalizadorDatosJSON adaptador;

    AnalizadorDatosJSONAdapter(AnalizadorDatosJSON adaptador) {
        this.adaptador = adaptador;
    }


    @Override
    public void analizarDatos(List<Accion> acciones) {
        String datosJSONString = convertirAJSON(acciones);
        adaptador.analizarDatosJSON(datosJSONString);
    }

    private String convertirAJSON(List<Accion> acciones) {
        return "";
    }
}
