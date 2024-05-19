import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatosMercadoAcciones {

    private final XmlMapper xmlMapper;
    private final ObjectMapper jsonMapper; // Usamos ObjectMapper para JSON
    private final List<Accion> acciones;

    public DatosMercadoAcciones() {
        this.xmlMapper = new XmlMapper();
        this.jsonMapper = new ObjectMapper();
        this.acciones = new ArrayList<>();
    }

    public List<Accion> getAcciones() {
        return acciones;
    }

    public void agregarAccion(Accion accion) {
        acciones.add(accion);
    }

    public void agregarDatosXML(String xmlString) {
        try {
            Accion accion = xmlMapper.readValue(xmlString, Accion.class);
            acciones.add(accion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void agregarDatosJSON(String jsonString) {
        try {
            Accion accion = jsonMapper.readValue(jsonString, Accion.class);
            acciones.add(accion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

