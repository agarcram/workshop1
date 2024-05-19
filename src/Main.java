public class Main {
    public static void main(String[] args) {
        DatosMercadoAcciones datosMercadoAcciones = new DatosMercadoAcciones();

//      Se agregan datos en formato XML como String
        String stringXML1 = "<Stock><Symbol>MSFT</Symbol><Name>Microsoft Corporation</Name><Price>250.65</Price><Volume>45231200</Volume><MarketCap>1900.21</MarketCap></Stock>";
        datosMercadoAcciones.AgregarDatosXML(stringXML1);

        String stringXML2 = "<Stock><Symbol>AMZN</Symbol><Name>Amazon.com Inc.</Name><Price>3456.99</Price><Volume>2649500</Volume><MarketCap>1753.21</MarketCap></Stock>";
        datosMercadoAcciones.AgregarDatosXML(stringXML2);

        String stringXML3 = "<Stock><Symbol>AAPL</Symbol><Name>Apple Inc.</Name><Price>145.30</Price><Volume>75432100</Volume><MarketCap>2415.67</MarketCap></Stock>";
        datosMercadoAcciones.AgregarDatosXML(stringXML3);

        String stringXML4 = "<Stock><Symbol>DIS</Symbol><Name>The Walt Disney Company</Name><Price>175.45</Price><Volume>2145800</Volume><MarketCap>315.02</MarketCap></Stock>";
        datosMercadoAcciones.AgregarDatosXML(stringXML4);

        String stringXML5 = "<Stock><Symbol>NVDA</Symbol><Name>NVIDIA Corporation</Name><Price>750.60</Price><Volume>892150</Volume><MarketCap>455.32</MarketCap></Stock>";
        datosMercadoAcciones.AgregarDatosXML(stringXML5);

        for (Accion accion : datosMercadoAcciones.getAcciones()) {
            System.out.println(accion);
        }

    }
}
