class Accion {
    private String simbolo;
    private String nombre;
    private double precio;
    private long volumen;
    private double capitalizacion;

    public Accion(String simbolo, String nombre, double precio, long volumen, double capitalizacion) {
        this.simbolo = simbolo;
        this.nombre = nombre;
        this.precio = precio;
        this.volumen = volumen;
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
