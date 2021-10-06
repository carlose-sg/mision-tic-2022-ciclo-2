/*
**************************************************
CICLO 2 - RETO 2
CARLOS EDUARDO SANCHEZ GUEVARA
GRUPO 69
Ago 07, 2021
**************************************************
*/

package co.edu.utp.misiontic2022.c2;

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
