/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramide;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int columnas, filas, espacios, asteriscos;
        
        filas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño"));
        for(columnas=0; columnas<=filas; columnas++){
            //espacios
            for(espacios=1; espacios<=filas-columnas; espacios++){
                System.out.print(" ");
            }
            //asteriscos
            for(asteriscos=1; asteriscos<=(columnas*2)-1; asteriscos++){
                System.out.print("*");
            }
            
            
            System.out.println("");   
        }
        
        
    }
    
}
