/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Esta clase permite la creación y visualización del tetramino S junto con sus
 * respectivas funcionalidades
 *
 * @author Julián Gerena
 * @version 0.1.9
 */
public class TetraminoS {

    //Es como se va a visulizar el tetramino
    private Cuadradito tetraS[][];
    //Las dimensiones que va a tener el tetramino
    private Cuadradito cuadro;
    //valores para visualizar el tetramino 
    private int x, y;
    private char letra;

    /**
     * Constructor de la clase TetraminoS inicializa las variables x, y, letra,
     * cuadro
     */
    public TetraminoS() {
        tetraS = new Cuadradito[3][3];
        cuadro = new Cuadradito(x, y, letra);
    }

    /**
     * Método que crea los campos para que el tetramino se pueda visualizar
     */
    public void inicializarFigura() {
        for (int i = 0; i < tetraS.length; i++) {
            for (int j = 0; j < tetraS[i].length; j++) {
                tetraS[i][j] = new Cuadradito(cuadro.getX(), cuadro.getY(), cuadro.getLetra());
            }
        }
    }//Fin del método

    /**
     * Este método es una funcionalidad del tetramino S, su función es lograr
     * que el tetramino pueda rotar en su propio eje en cualquier dirección
     */
    public void rotarFigura() {
        for (int i = 0; i < tetraS.length; i++) {
            for (int j = 0; j < tetraS[i].length; j++) {
                if (cuadro.isPosicion() == true) {
                    //posicion 1 normal
                    if (!(tetraS[0][0].getX() == 0 && tetraS[0][0].getY() == 0 && tetraS[0][0].getLetra() == ' ')
                            && !(tetraS[0][1].getX() == 0 && tetraS[0][1].getY() == 0 && tetraS[0][1].getLetra() == ' ')
                            && !(tetraS[1][1].getX() == 0 && tetraS[1][1].getY() == 0 && tetraS[1][1].getLetra() == ' ')
                            && !(tetraS[1][2].getX() == 0 && tetraS[1][2].getY() == 0 && tetraS[1][2].getLetra() == ' ')) {
                        tetraS[0][1] = new Cuadradito(1, 1, 'S');
                        tetraS[0][2] = new Cuadradito(1, 1, 'S');
                        tetraS[1][0] = new Cuadradito(1, 1, 'S');
                        tetraS[1][1] = new Cuadradito(1, 1, 'S');
                    } else {
                        tetraS[0][1] = new Cuadradito(1, 1, 'S');
                        tetraS[0][2] = new Cuadradito(1, 1, 'S');
                        tetraS[1][0] = new Cuadradito(1, 1, 'S');
                        tetraS[1][1] = new Cuadradito(1, 1, 'S');
                    }
                    //posicion 2 girada
                } else if (cuadro.isPosicion() == false) {
                    if (!(tetraS[0][1].getX() == 0 && tetraS[0][1].getY() == 0 && tetraS[0][1].getLetra() == ' ')
                            && !(tetraS[1][0].getX() == 0 && tetraS[1][0].getY() == 0 && tetraS[1][0].getLetra() == ' ')
                            && !(tetraS[1][1].getX() == 0 && tetraS[1][1].getY() == 0 && tetraS[1][1].getLetra() == ' ')
                            && !(tetraS[2][0].getX() == 0 && tetraS[2][0].getY() == 0 && tetraS[2][0].getLetra() == ' ')) {
                        tetraS[0][0] = new Cuadradito(1, 1, 'S');
                        tetraS[1][0] = new Cuadradito(1, 1, 'S');
                        tetraS[1][1] = new Cuadradito(1, 1, 'S');
                        tetraS[2][1] = new Cuadradito(1, 1, 'S');
                    } else {
                        tetraS[0][0] = new Cuadradito(1, 1, 'S');
                        tetraS[1][0] = new Cuadradito(1, 1, 'S');
                        tetraS[1][1] = new Cuadradito(1, 1, 'S');
                        tetraS[2][1] = new Cuadradito(1, 1, 'S');
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
        if (cuadro.getX() >= 0) {
            cuadro.setX(cuadro.getX() - 1);
        }

    }//fin del método

    /**
     * Este método es una funcionalidad del tetramino Z, su función es lograr
     * que el tetramino pueda moverse a la derecha del tablero
     */
    public void moverDerFigura() {
        if (cuadro.getX() <= 20) {
            cuadro.setX(cuadro.getX() + 1);
        }
    }//fin del método

    /**
     * Este método es una funcionalidad del tetramino Z, su función es lograr
     * que el tetramino pueda bajar hasta el final del tablero
     */
    public void bajarFigura() {
        cuadro.setY(cuadro.getY() - 1);
    }//fin del método

    /**
     * Este método se encarga de visualizar el tetramino que se haya creado
     */
    public void imprimirFigura() {
        for (int i = 0; i < tetraS.length; i++) {
            for (int j = 0; j < tetraS[i].length; j++) {
                System.out.print(tetraS[i][j].getX() + "" + tetraS[i][j].getY() + tetraS[i][j].getLetra() + "   ");
            }
            System.out.println();
        }
    }//Fin del método

    /**
     * Devuelve el tetramino S
     *
     * @return tetraS
     */
    public Cuadradito[][] getTetraS() {
        return tetraS;
    }

    /**
     * Le da nuevos valores al tetramino S
     *
     * @param tetraS
     */
    public void setTetraS(Cuadradito[][] tetraS) {
        this.tetraS = tetraS;
    }

    /**
     * Devuelve el contenedor del tetramino S
     *
     * @return cuadro
     */
    public Cuadradito getCuadro() {
        return cuadro;
    }

    /**
     * Le da nuevos valores al contenedor del tetramino S
     *
     * @param cuadro
     */
    public void setCuadro(Cuadradito cuadro) {
        this.cuadro = cuadro;
    }
}
