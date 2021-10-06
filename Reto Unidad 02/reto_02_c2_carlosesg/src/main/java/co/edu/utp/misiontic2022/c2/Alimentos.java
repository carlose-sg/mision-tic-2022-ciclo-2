package co.edu.utp.misiontic2022.c2;

public class Alimentos {

    // Constantes
    protected final static char TIPO_ALIMENTO = 'N';
    protected final static Double PRECIO_BASE = 80.0;
    protected final static Integer PESO_BASE = 5;

    // Atributos
    protected char tipoAlimento;
    protected Double precioBase;
    protected Integer peso;
    
    // Contructores
    public Alimentos() {
        this.precioBase = PRECIO_BASE;
        this.peso = PESO_BASE;
        this.tipoAlimento = TIPO_ALIMENTO;

    	// Otra forma de pasar estos atributos al constructor
    	// this(PRECIO_BASE, PESO_BASE, TIPO_ALIMENTO);
    }

    public Alimentos(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.tipoAlimento = TIPO_ALIMENTO;

    	// Otra forma de pasar estos atributos al constructor
    	// this(precioBase, peso, TIPO_ALIMENTO);
    }

    public Alimentos(Double precioBase, Integer peso, char tipoAlimento) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.tipoAlimento = tipoAlimento;
        
        // Otra forma de pasar estos atributos al constructor
    	// this(precioBase, peso, tipoAlimento);
        
        comprobarTipoAlimento(tipoAlimento);
    }

    public void comprobarTipoAlimento(char tipoAlimento) {
        // Condicion validar tipo de alimento N (ASCII 78), C (ASCII 67)

        if (tipoAlimento == 78 || tipoAlimento == 67) {
            this.tipoAlimento = tipoAlimento;
        } else {
            this.tipoAlimento = TIPO_ALIMENTO;
        }
    }

    public Double calcularPrecio() {
        // Codigo calcular precio final
        double adicion = 0.0;

        switch (tipoAlimento) {
            case 'N':
                // Producto Natural
                adicion += 40;
                break;

            case 'C':
                // Producto con Conservantes
                adicion += 20;
                break;

            default:
                break;
        }

        // El peso tambien afecta el precio final del producto
        if (peso >= 0 && peso <= 9) {
            adicion += 6;
        }
        if (peso > 9 && peso <= 16) {
            adicion += 8;
        }
        if (peso > 16) {
            adicion += 20;
        }

        return precioBase + adicion;
    }

}
