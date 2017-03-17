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
public class Jugador {
    int vidas;

    public Jugador() {
        vidas=5;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
    
    int calculo(int cantidad){
        vidas=vidas-cantidad;
        return vidas;
    }
            
}
