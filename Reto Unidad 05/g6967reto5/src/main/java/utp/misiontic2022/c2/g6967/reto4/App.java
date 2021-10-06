/*
**************************************************
CICLO 2 - RETO 5
CARLOS EDUARDO SANCHEZ GUEVARA
GRUPO 69
Ago 15, 2021
**************************************************
*/

package utp.misiontic2022.c2.g6967.reto4;

import utp.misiontic2022.c2.g6967.reto4.view.FrmMenu;
import utp.misiontic2022.c2.g6967.reto4.view.FrmRequerimientos;
import utp.misiontic2022.c2.g6967.reto4.view.ViewRequerimientos;

public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Inicio ..." );
        
        // Presentacion requerimiento No. 1
        // System.out.println("Requerimiento No. 1");
        // ViewRequerimientos.requerimiento1();

        // Presentacion requerimiento No. 2
        // System.out.println("Requerimiento No. 2");
        // ViewRequerimientos.requerimiento2();

        // Presentacion requerimiento No. 3
        // System.out.println("Requerimiento No. 3");
        // ViewRequerimientos.requerimiento3();

        // Ejecutamos el menu de la interfaz grafica (GUI)
        new FrmMenu().setVisible(true);
    }
}