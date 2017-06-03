
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
        int x = 9, y = 8;
        char letra = ' ';
        boolean posicion = true;

        Cuadradito modelo = new Cuadradito(x, y, letra);

        TetraminoS S = new TetraminoS();

        System.out.println("");

        TetraminoZ Z = new TetraminoZ();

        int aux = 0, a = 0;
        Scanner leer = new Scanner(System.in);

        while (aux <= 5) {
            System.out.println("\n Escoga una opcion \n1. Ver figura \n2. Rotar \n3. Mover izq \n4. Mover der \n5. Bajar");
            aux = leer.nextInt();
            switch (aux) {
                case 1:
                    /*S.inicializarFigura();
                    S.setCuadro(modelo);
                    modelo.setPosicion(posicion);

                    S.inicializarFigura();
                    S.rotarFigura();
                    S.imprimirFigura();

                    System.out.println("");*/
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
                        /*S.setCuadro(modelo);
                        modelo.setPosicion(false);
                        //modelo = new Cuadradito(modelo.getX(), modelo.getY(), modelo.getLetra());
                        S.inicializarFigura();
                        S.rotarFigura();
                        S.imprimirFigura();
                        System.out.println("");*/
                        Z.setCuadro(modelo);
                        modelo.setPosicion(false);

                        Z.inicializarFigura();
                        Z.crearFigura();
                        Z.rotarFigura();
                        Z.imprimirFigura();
                        a++;
                    } else {
                        /*S.setCuadro(modelo);
                        modelo.setPosicion(true);

                        S.inicializarFigura();
                        S.rotarFigura();
                        S.imprimirFigura();

                        System.out.println("");*/

                        Z.setCuadro(modelo);
                        modelo.setPosicion(true);

                        Z.inicializarFigura();
                        Z.crearFigura();
                        Z.rotarFigura();
                        Z.imprimirFigura();
                        a++;
                    }
                    break;
                case 3:
                    /*S.moverIzqFigura();
                    S.imprimirFigura();                    
                    System.out.println("");*/
                    Z.moverIzqFigura();
                    Z.imprimirFigura();
                    break;
                case 4:
                    /*S.moverDerFigura();
                    S.imprimirFigura();
                    System.out.println("");*/
                    Z.moverDerFigura();
                    Z.imprimirFigura();
                    break;
                case 5:
                    /*S.moverDerFigura();
                    S.imprimirFigura();
                    System.out.println("");*/
                    Z.bajarFigura();
                    Z.imprimirFigura();
                    break;
                default:
                    break;
            }
        }
    }
}
