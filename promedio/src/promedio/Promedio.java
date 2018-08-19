/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import javax.swing.JOptionPane;

/**
 *
 * @author joker
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double nota1, nota2, nota3, promedio;
        
        do{
           nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota1"));
        }while(nota1<0 || nota1>10);
        
        do{
           nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota2"));
        }while(nota2<0 || nota2>10);
        
        do{
           nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota3"));
        }while(nota3<0 || nota3>10);
     
        // nota1= 35%  nota2=35%  nota3=30%
        
        promedio=nota1*0.35 +nota2*0.35 +nota3*0.30;
        
        if(promedio>=5.95){
            JOptionPane.showMessageDialog(null, "Materia aprobada con "+promedio);
        }else{
            JOptionPane.showMessageDialog(null, "Materia reprobada con "+promedio);
        }
        
        
    }
    
}
