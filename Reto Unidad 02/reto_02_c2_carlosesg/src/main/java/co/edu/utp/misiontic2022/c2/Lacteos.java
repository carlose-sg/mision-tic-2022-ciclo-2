package co.edu.utp.misiontic2022.c2;

public class Lacteos extends Alimentos {

    // Constantes
    private final static Integer TEMPERATURA = 10;

    // Atributos
    private Integer temperatura;

    // Contructores
    public Lacteos() {
    	// Otra forma de pasar estos atributos al constructor
    	this(PRECIO_BASE, PESO_BASE, TEMPERATURA);
    }

    public Lacteos(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.temperatura = TEMPERATURA;
    }

    public Lacteos(Double precioBase, Integer peso, Integer temperatura) {
        super(precioBase, peso);
        this.temperatura = temperatura;
    }

    public Double calcularPrecio() {
        // Codigo calcular precio final
        Double adicion = super.calcularPrecio();

        // La temperatura tambien afecta el precio final del producto
        if (temperatura >= 5 && temperatura < 10) {
            adicion += 20;
        }
        if (temperatura >= 10 && temperatura <= 15) {
            adicion += 18;
        }
        if (temperatura < 5 || temperatura > 15) {
            adicion += 5;
        }

        return adicion;

    }
    
}
