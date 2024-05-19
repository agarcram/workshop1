import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Accion {
    @JacksonXmlProperty(localName = "Symbol")
    private String simbolo;

    @JacksonXmlProperty(localName = "Name")
    private String nombre;

    @JacksonXmlProperty(localName = "Price")
    private double precio;

    @JacksonXmlProperty(localName = "Volume")
    private long volumen;

    @JacksonXmlProperty(localName = "MarketCap")
    private double capitalizacion;

    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public long getVolumen() {
        return volumen;
    }
    public void setVolumen(long volumen) {
        this.volumen = volumen;
    }

    public double getCapitalizacion() {
        return capitalizacion;
    }
    public void setCapitalizacion(double capitalizacion) {
        this.capitalizacion = capitalizacion;
    }

    @Override
    public String toString() {
        return "Accion{" +
                "simbolo='" + simbolo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", volumen=" + volumen +
                ", capitalizacion=" + capitalizacion +
                '}';
    }
}
