import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.util.ArrayList;
import java.util.List;

//Base de datos que almacena los datos en formato XML
public class DatosMercadoAcciones {

    private final XmlMapper xmlMapper;
    private final List<Accion> acciones;

    public DatosMercadoAcciones() {
        this.xmlMapper = new XmlMapper();
        this.acciones = new ArrayList<>();
    }

    public List<Accion> getAcciones() {
        return acciones;
    }

    //  Método para agregar las acciones a la lista
    public void agregarAccion(Accion accion) {
        acciones.add(accion);
    }
//  Agrega datos en formato XML como Strings
    public void AgregarDatosXML(String xmlString) {
        try {
            Accion accion = xmlMapper.readValue(xmlString, Accion.class);
            acciones.add(accion);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
