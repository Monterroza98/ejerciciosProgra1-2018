/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropar;

import javax.swing.JOptionPane;

/**
 *
 * @author joker
 */
public class NumeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(numero%2 ==0){
            JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es par");
        }else{
            JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es impar");
        }
        
    }
    
}
