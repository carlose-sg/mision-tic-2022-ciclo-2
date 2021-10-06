package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // Ejecutamos el metodo que valida la inversion
        Inversiones inversiones1 = new Inversiones();
        System.out.println(inversiones1.validarInversion(8, 20000000, 0.07));

        Inversiones inversiones2 = new Inversiones();
        System.out.println(inversiones2.validarInversion(6, 0, 0.8));
    }
}
