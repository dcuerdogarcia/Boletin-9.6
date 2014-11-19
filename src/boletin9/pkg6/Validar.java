/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9.pkg6;
import javax.swing.JOptionPane;
/**
 *
 * @author dcuerdogarcia
 */
public class Validar {
    
    public int Valido(int dato){
        if(dato>0){
            return dato;
        }else{
            if(dato==0){
                return dato;
            }
            while(dato<0){
                String valor = JOptionPane.showInputDialog("El dato introducido no es válido, introduce un dato mayor que cero o 0 para finalizar el programa");
                dato = Integer.parseInt(valor);
                }
            return dato;
        }
    }
}
