package co.edu.utp.misiontic2022.c2;

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
