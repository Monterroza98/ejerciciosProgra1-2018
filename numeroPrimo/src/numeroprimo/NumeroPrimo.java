/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author joker
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, contador=0;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        for(int i=1; i<=numero; i++){
            if(numero%i == 0){
                contador+=1;
            }
        }
        
        if(contador<=2){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es primo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+" no es primo");
        }
        
    }
    
}
