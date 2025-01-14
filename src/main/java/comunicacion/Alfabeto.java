package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen); 
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return letras.length * palabrasPagina;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + String.join(", ", letras);
    }

    public int cantidadLetras() {
        return letras.length; 
    }
}
