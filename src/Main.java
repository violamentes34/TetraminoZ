
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * Esta clase es la que almacena el método Main el cual es el que me ejecuta
 * todo el programa
 *
 * @author Julian Gerena
 * @version 0.1.9
 */
public class Main {

    /**
     * El método Main es el encargado de ejecutar toda la funcionalidad del
     * programa,
     *
     * @param args
     */
    public static void main(String[] args) {
        int x = 20, y = 20;
        char letra = ' ';
        boolean posicion = true;

        Cuadradito modelo = new Cuadradito(x, y, letra);
        TetraminoZ Z = new TetraminoZ();

        int opc = 0, a = 0;
        Scanner leer = new Scanner(System.in);

        while (opc != 6) {
            System.out.println("Escoga una opcion \n1. Ver figura \n2. Rotar \n3. Mover izq \n4. Mover der \n5. Bajar \n6. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:                    
                    Z.setCuadro(modelo);
                    modelo.setPosicion(posicion);
                    Z.inicializarFigura();
                    Z.crearFigura();
                    Z.rotarFigura();
                    Z.imprimirFigura();
                    Z.setCuadro(modelo);
                    modelo.setPosicion(posicion);
                    break;
                case 2:
                    if (a % 2 == 0) {                        
                        Z.setCuadro(modelo);
                        posicion = true;
                        modelo.setPosicion(posicion);

                        Z.inicializarFigura();
                        Z.crearFigura();
                        Z.rotarFigura();
                        Z.imprimirFigura();
                        a++;
                    } else {
                        Z.setCuadro(modelo);
                        posicion = false;
                        modelo.setPosicion(posicion);

                        Z.inicializarFigura();
                        Z.crearFigura();
                        Z.rotarFigura();
                        Z.imprimirFigura();
                        a++;
                    }
                    break;
                case 3:
                    Z.moverIzqFigura();
                    Z.inicializarFigura();
                    Z.crearFigura();
                    Z.rotarFigura();
                    Z.imprimirFigura();
                    Z.setCuadro(modelo);                    
                    modelo.setPosicion(posicion);
                    break;
                case 4:
                    Z.moverDerFigura();
                    Z.inicializarFigura();
                    Z.crearFigura();
                    Z.rotarFigura();
                    Z.imprimirFigura();
                    Z.setCuadro(modelo);                    
                    modelo.setPosicion(posicion);
                    break;
                case 5:
                    Z.bajarFigura();
                    Z.inicializarFigura();
                    Z.crearFigura();
                    Z.rotarFigura();
                    Z.imprimirFigura();
                    Z.setCuadro(modelo);                    
                    modelo.setPosicion(posicion);
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite una opción dentro de los parámetro establecidos");
                    break;
            }
        }
    }
}
