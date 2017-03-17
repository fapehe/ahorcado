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

public class Tablero {
    char palabra[] = new char[5];

    public Tablero() {
        int j=97;
          palabra[0]='m';
          palabra[1]='o';
          palabra[2]='s';
          palabra[3]='c';
          palabra[4]='a';
    }
    void imprimir(){
        for (int i=0;i<5;i++)
        {
            System.out.println(palabra[i]);
        }
        
    }
    
    
}
