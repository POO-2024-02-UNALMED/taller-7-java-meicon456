package comunicacion;

import java.util.List;
import java.util.Arrays;

public class Alfabeto extends Pictograma {
    private static List<String> letras = Arrays.asList(
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    );
    private String interpretacion;

    public Alfabeto(String origen, List<String> letras, String interpretacion) {
        super(origen);
        this.letras = letras; 
        this.interpretacion = interpretacion;
    }

    public static List<String> getLetras() {
        return letras;
    }

    public static void setLetras(List<String> letras) {
        Alfabeto.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
        return letras.size();
    }

    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}
