/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicavectores;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PracticaVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tamanio=Integer.parseInt(JOptionPane.showInputDialog("Cuantos alumnos"));
        
        String alumnos[]= new String[tamanio];
        
        int matriculas[]= new int[tamanio];
        
        double notas1[]= new double[tamanio];
        
        double notas2[]= new double[tamanio];
        
        double notas3[]= new double[tamanio];
        
        int matricula;
        double nota1, nota2, nota3, promedio;
        
        for(int iteracion=0; iteracion<tamanio; iteracion++){
            
            alumnos[iteracion]=JOptionPane.showInputDialog("Ingrese nombre de"
                    + " alumno "+(iteracion+1));
            
            do{
                matricula=Integer.parseInt(JOptionPane.showInputDialog("Ingrese"
                        + " numero de matricula"));
            }while(matricula<1 || matricula>3);
            
            matriculas[iteracion]=matricula;
            
            do{
                nota1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 1"
                        + " de estudiante "+(iteracion+1)));
            }while(nota1<0 || nota1>10);
            
            notas1[iteracion]=nota1;
            
            do{
                nota2=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 2"
                        + " de estudiante "+(iteracion+1)));
            }while(nota2<0 || nota2>10);
            
            notas2[iteracion]=nota2;
            
            do{
                nota3=Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota 3"
                        + " de estudiante "+(iteracion+1)));
            }while(nota3<0 || nota3>10);
            
            notas3[iteracion]=nota3;
            
        }
        
        String salida="Nombre\tMatricula\tNota 1\tNota 2\tNota 3\tPromedio\n";
        
        for(int posicion=0; posicion<tamanio; posicion++){
            salida+=alumnos[posicion]+"\t\t"+matriculas[posicion]+"\t"
                    +notas1[posicion]+"\t"+notas2[posicion]+"\t"
                    +notas3[posicion]+"\t"
                    +((notas1[posicion]+notas2[posicion]+notas3[posicion])/3)+"\n";
        }
        
        System.out.print(salida);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
