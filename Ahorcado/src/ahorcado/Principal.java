/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tablero miTab =new Tablero();
        Grafico miGraf =new Grafico();
        miGraf.tabGraf=miTab;
        Jugador miJug=new Jugador();
        miGraf.jugGrag=miJug;
        miGraf.setVisible(true);
    }
    
    
}
