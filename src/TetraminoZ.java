/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase permite la creación y visualización del tetramino Z junto con sus
 * respectivas funcionalidades
 *
 * @author Chrystian Romero
 * @version 0.1.9
 */
public class TetraminoZ {

    //Es como se va a visulizar el tetramino
    private Cuadradito tetraZ[][];
    //Las dimensiones que va a tener el tetramino
    private Cuadradito cuadro;
    //valores para visualizar el tetramino 
    private int x, y;
    private char letra;

    /**
     * Constructor de la clase TetraminoZ inicializa las variables x, y, letra,
     * cuadro
     */
    public TetraminoZ() {
        tetraZ = new Cuadradito[3][3];
        cuadro = new Cuadradito(x, y, letra);
    }//Fin del método

    /**
     * Método que crea los campos para que el tetramino se pueda visualizar
     */
    public void inicializarFigura() {
        for (int i = 0; i < tetraZ.length; i++) {
            for (int j = 0; j < tetraZ[i].length; j++) {
                tetraZ[i][j] = new Cuadradito(cuadro.getX(), cuadro.getY(), cuadro.getLetra());
            }
        }
    }//Fin del método

    /**
     * Método que crea el tetramino Z dentro de un espacio establecido
     */
    public void crearFigura() {
        for (int i = 0; i < tetraZ.length; i++) {
            for (int j = 0; j < tetraZ[i].length; j++) {
                tetraZ[i][j] = new Cuadradito(cuadro.getX(), cuadro.getY(), cuadro.getLetra());
            }
        }
    }//Fin del método

    /**
     * Este método es una funcionalidad del tetramino Z, su función es lograr
     * que el tetramino pueda rotar en su propio eje en cualquier dirección de
     * izq/der
     */
    public void rotarFigura() {
        for (int i = 0; i < tetraZ.length; i++) {
            for (int j = 0; j < tetraZ[i].length; j++) {
                if (cuadro.isPosicion() == true) {
                    //posicion 1 normal
                    if (!(tetraZ[0][0].getX() == 0 && tetraZ[0][0].getY() == 0 && tetraZ[0][0].getLetra() == ' ')
                            && !(tetraZ[0][1].getX() == 0 && tetraZ[0][1].getY() == 0 && tetraZ[0][1].getLetra() == ' ')
                            && !(tetraZ[1][1].getX() == 0 && tetraZ[1][1].getY() == 0 && tetraZ[1][1].getLetra() == ' ')
                            && !(tetraZ[1][2].getX() == 0 && tetraZ[1][2].getY() == 0 && tetraZ[1][2].getLetra() == ' ')) {
                        tetraZ[0][0] = new Cuadradito(1, 1, 'Z');
                        tetraZ[0][1] = new Cuadradito(1, 1, 'Z');
                        tetraZ[1][1] = new Cuadradito(1, 1, 'Z');
                        tetraZ[1][2] = new Cuadradito(1, 1, 'Z');
                    } else {
                        tetraZ[0][0] = new Cuadradito(1, 1, 'Z');
                        tetraZ[0][1] = new Cuadradito(1, 1, 'Z');
                        tetraZ[1][1] = new Cuadradito(1, 1, 'Z');
                        tetraZ[1][2] = new Cuadradito(1, 1, 'Z');
                    }
                    //posicion 2 girada
                } else if (cuadro.isPosicion() == false) {
                    if (!(tetraZ[0][1].getX() == 0 && tetraZ[0][1].getY() == 0 && tetraZ[0][1].getLetra() == ' ')
                            && !(tetraZ[1][0].getX() == 0 && tetraZ[1][0].getY() == 0 && tetraZ[1][0].getLetra() == ' ')
                            && !(tetraZ[1][1].getX() == 0 && tetraZ[1][1].getY() == 0 && tetraZ[1][1].getLetra() == ' ')
                            && !(tetraZ[2][0].getX() == 0 && tetraZ[2][0].getY() == 0 && tetraZ[2][0].getLetra() == ' ')) {
                        tetraZ[0][1] = new Cuadradito(1, 1, 'Z');
                        tetraZ[1][0] = new Cuadradito(1, 1, 'Z');
                        tetraZ[1][1] = new Cuadradito(1, 1, 'Z');
                        tetraZ[2][0] = new Cuadradito(1, 1, 'Z');
                    } else {
                        tetraZ[0][1] = new Cuadradito(01, 1, 'Z');
                        tetraZ[1][0] = new Cuadradito(01, 1, 'Z');
                        tetraZ[1][1] = new Cuadradito(01, 1, 'Z');
                        tetraZ[2][0] = new Cuadradito(01, 1, 'Z');
                    }
                }
            }
        }
    }//Fin del método

    /**
     * Este método es una funcionalidad del tetramino Z, su función es lograr
     * que el tetramino pueda moverse a la izquierda del tablero
     */
    public void moverIzqFigura() {
        if (cuadro.getX() > 0 && cuadro.getY() != 0) {
            cuadro.setX(cuadro.getX() - 1);
        } else if (cuadro.getY() == 0) {
            System.out.println("HA LLEGADO AL FINAL DEL TABLERO");
        }

    }//fin del método

    /**
     * Este método es una funcionalidad del tetramino Z, su función es lograr
     * que el tetramino pueda moverse a la derecha del tablero
     */
    public void moverDerFigura() {
        if (cuadro.getX() < 20 && cuadro.getY() != 0) {
            cuadro.setX(cuadro.getX() + 1);
        } else if (cuadro.getY() == 0) {
            System.out.println("HA LLEGADO AL FINAL DEL TABLERO");
        }
    }//fin del método

    /**
     * Este método es una funcionalidad del tetramino Z, su función es lograr
     * que el tetramino pueda bajar hasta el final del tablero
     */
    public void bajarFigura() {
        if (cuadro.getY() > 0) {
            cuadro.setY(cuadro.getY() - 1);
        } else if (cuadro.getY() == 0) {
            System.out.println("HA LLEGADO AL FINAL DEL TABLERO");
            //System.exit(0);
        }
    }//fin del método

    /**
     * Este método se encarga de visualizar el tetramino que se haya creado
     */
    public void imprimirFigura() {
        for (int i = 0; i < tetraZ.length; i++) {
            for (int j = 0; j < tetraZ[i].length; j++) {
                System.out.print(tetraZ[i][j].getX() + "" + tetraZ[i][j].getY() + tetraZ[i][j].getLetra() + "   ");
            }
            System.out.println();
        }

        for (int i = 0; i < tetraZ.length; i++) {
            for (int j = 0; j < tetraZ[i].length; j++) {
                if (tetraZ[i][j].getX() >= 0 && tetraZ[i][j].getY() >= 0) {
                    System.out.println("Posicion X: " + tetraZ[i][j].getX());
                    System.out.println("Posicion Y: " + tetraZ[i][j].getY());
                    break;
                }
                break;
            }
            System.out.println();
        }
    }//Fin del método

    /**
     * Devuelve el tetramino Z
     *
     * @return tetraZ
     */
    public Cuadradito[][] getTetraZ() {
        return tetraZ;
    }

    /**
     * Le da nuevos valores al tetramino Z
     *
     * @param tetraZ
     */
    public void setTetraZ(Cuadradito[][] tetraZ) {
        this.tetraZ = tetraZ;
    }

    /**
     * Devuelve el contenedor del tetramino Z
     *
     * @return cuadro
     */
    public Cuadradito getCuadro() {
        return cuadro;
    }

    /**
     * Le da nuevos valores al contenedor del tetramino Z
     *
     * @param cuadro
     */
    public void setCuadro(Cuadradito cuadro) {
        this.cuadro = cuadro;
    }
}
