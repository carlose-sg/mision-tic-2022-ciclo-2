/*
**************************************************
CICLO 2 - RETO 1
CARLOS EDUARDO SANCHEZ GUEVARA
GRUPO 69
Ago 06, 2021
**************************************************
*/

package co.edu.utp.misiontic2022.c2;

// Clase Inversiones.java

public class Inversiones {

    // ------------------------------
    // Atributos
    // ------------------------------
    
    // Tiempo de la inversion
    private static int tiempo;

    // Monto de la inversion
    private static double monto;
    
    // Tasa de interes para la inversion
    private static double interes;

    // Valor del interes compuesto para la inversion
    private static double interesCompuesto;

    // Valor del interes simple para la inversion
    private static double interesSimple;


    // ------------------------------
    // Constructores
    // ------------------------------

    public Inversiones() {
        // Inicializamos los atributos de la clase
        tiempo = 0;
        monto = 0;
        interes = 0;
        interesCompuesto = 0;
        interesSimple = 0;
    }


    // ------------------------------
    // Métodos
    // ------------------------------

    // Calculamos y retornamos el valor del interes simple para la inversion
    public static double generarInteresSimple() {
        interesSimple = monto * interes * tiempo;

        return interesSimple;
    }

    // Calculamos y retornamos el valor del interes compuesto para la inversion
    public static double generarInteresCompuesto() {
        interesCompuesto = monto * (Math.pow((1 + interes), tiempo) - 1);

        return interesCompuesto;
    }

    // Validamos el interes generado por la inversion, retornando la respuesta segun el caso
    public static String validarInversion(int vTiempo, double vMonto, double vInteres) {

        tiempo = vTiempo;
        monto = vMonto;
        interes = vInteres;

        // Cálculo la diferencia entre los tipos de tasas
        double respuesta = generarInteresCompuesto() - generarInteresSimple();

        // Retornamos la respuesta correcta segun el caso
        if (respuesta > 0) {
            return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre " +
            "evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende " +
            "a la cifra de: $" + respuesta;
        } else {
            return "Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.";
        }
    }

}

    // public static void main(String[] args) {
        // Ejecutamos el metodo que valida la inversion
        // System.out.println(validarInversion(8, 20000000, 0.07));
        // System.out.println(validarInversion(6, 0, 0.8));
    // }
