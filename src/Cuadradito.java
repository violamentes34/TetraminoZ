/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Esta clase es la encargada de encapsular las variables las clases TetraminoZ
 * y TetraminoS
 *
 * @author Chrystian Romero
 * @version 0.1.9
 */
public class Cuadradito {

    //valores para visualizar el tetramino
    private int x;
    private int y;
    private char letra;
    private boolean posicion;

    /**
     * Constructor de la clase Cuadradito, es el que recibe valores para
     * asignarle a los atributos de la clase
     *
     * @param a
     * @param b
     * @param c
     */
    public Cuadradito(int a, int b, char c) {
        x = a;
        y = b;
        letra = c;
    }//Fin del método

    /**
     * Devuelve el valor para x
     *
     * @return x
     */
    public int getX() {
        return x;
    }//Fin del método

    /**
     * Le da nuevos valores a x
     *
     * @param x
     */
    public void setX(int x) {
        this.x = x;
    }//Fin del método

    /**
     * Devuelve el valor para y
     *
     * @return y
     */
    public int getY() {
        return y;
    }//Fin del método

    /**
     * Le da nuevos valores a y
     *
     * @param y
     */
    public void setY(int y) {
        this.y = y;
    }//Fin del método

    /**
     * Devuelve el valor para letra
     *
     * @return letra
     */
    public char getLetra() {
        return letra;
    }//Fin de método

    /**
     * Le da nuevos valores a letra
     *
     * @param letra
     */
    public void setLetra(char letra) {
        this.letra = letra;
    }//Fin del método

    /**
     * Devuelve la posición para el tetramino,
     *
     * @return posicion
     */
    public boolean isPosicion() {
        return posicion;
    }//Fin del método

    /**
     * Le da nuevos valores a la posicion del tetramino
     *
     * @param posicion
     */
    public void setPosicion(boolean posicion) {
        this.posicion = posicion;
    }//Fin del método
}
