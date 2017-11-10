/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabd;
import interfaces.Interfaz;
import javax.swing.JFrame;
/**************************************************************************
 * Alex Olivares Del Valle 
 * @author LAB17
 * Fecha: Noviembre 10 del 2017
 * Programa: Prueba Java 3
 * Responsabilidad: Conexion entre la BD Mysql y Netbeans.
 */
public class PruebaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
          
       Interfaz ventana = new Interfaz();
       ventana.setVisible(true);
       ventana.setBounds(0, 0, 400, 400);
       ventana.setTitle("Tercera Evaluacion");
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
