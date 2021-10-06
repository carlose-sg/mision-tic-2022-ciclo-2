/*
**************************************************
CICLO 2 - RETO 2
CARLOS EDUARDO SANCHEZ GUEVARA
GRUPO 69
Ago 07, 2021
**************************************************
*/

// package co.edu.utp.misiontic2022.c2;

public class PrecioTotal {

    // Atributos
    private Double tAlimentos;
    private Double tCereales;
    private Double tLacteos;
    private Alimentos listaAlimentos[];

    // Contructores
    public PrecioTotal() {
        this.tAlimentos = 0.0;
        this.tCereales = 0.0;
        this.tLacteos = 0.0;
    }

    public PrecioTotal(Alimentos listaAlimentos[]) {
        this.tAlimentos = 0.0;
        this.tCereales = 0.0;
        this.tLacteos = 0.0;
        this.listaAlimentos = listaAlimentos;
    }

    // Metodo mostrar Total
    public void mostrarTotal() {

        // Codigo calculo de total
        
        for (Alimentos hijoAlimentos: listaAlimentos) {
            if (hijoAlimentos instanceof Alimentos) {
                tAlimentos += hijoAlimentos.calcularPrecio();
            }
            if (hijoAlimentos instanceof Cereales) {
                tCereales += hijoAlimentos.calcularPrecio();
            }
            if (hijoAlimentos instanceof Lacteos) {
                tLacteos += hijoAlimentos.calcularPrecio();
            }
        }

        // Mostramos los resultados
        System.out.println("El precio total de los Productos Alimentos es de " + tAlimentos);
        System.out.println("La suma del precio de los Cereales es de " + tCereales);
        System.out.println("La suma del precio de los Lácteos es de " + tLacteos);
    }
    
}

// -----

// package co.edu.utp.misiontic2022.c2;

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

// -----

// package co.edu.utp.misiontic2022.c2;

public class Cereales extends Alimentos {

    // Constantes
    private final static char LUGAR_ORIGEN = 'N';

    // Atributos
    private char lugarOrigen;

    // Contructores
    public Cereales() {
    	// Otra forma de pasar estos atributos al constructor
    	this(PRECIO_BASE, PESO_BASE, LUGAR_ORIGEN);
    }

    public Cereales(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.lugarOrigen = LUGAR_ORIGEN;
    }

    public Cereales(Double precioBase, Integer peso, char lugarOrigen) {
        super(precioBase, peso);
        this.lugarOrigen = lugarOrigen;
        comprobarLugarOrigen(lugarOrigen);
    }

    public void comprobarLugarOrigen(char lugarOrigen) {
        // Condicion validar lugar de origen N (ASCII 78), I (ASCII 73)

        if (lugarOrigen == 78 || lugarOrigen == 73) {
            this.lugarOrigen = lugarOrigen;
        } else {
            this.lugarOrigen = LUGAR_ORIGEN;
        }

    }

    public Double calcularPrecio() {
        // Codigo calcular precio final
        Double adicion = super.calcularPrecio();

        switch (lugarOrigen) {
            case 'N':
                // Producto Nacional
                adicion += 5;
                break;

            case 'I':
                // Producto Internacional
                adicion += 15;
                break;

            default:
                break;
        }

        return adicion;
    }
    
}

// -----

// package co.edu.utp.misiontic2022.c2;

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

// -----