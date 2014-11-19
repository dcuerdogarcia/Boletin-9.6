
package boletin9.pkg6;
import javax.swing.JOptionPane;
/*

 * @author dcuerdogarcia
 */
public class Metodos {
    int soldo, s1, s2, s3, Metodos;
    double m1, m2, m3;
    
    Validar dato = new Validar();
    
    public Metodos(){
        s1=0;
        s2=0;
        s3=0;
        Metodos=0;
       
    }
    
    public void Calcular(){
        int sold = Integer.parseInt(JOptionPane.showInputDialog("Introducir sueldo del trabajador"));
        soldo = dato.Valido(sold);
        
        while(soldo>0){
            int solo = Integer.parseInt(JOptionPane.showInputDialog("Introducir sueldo del trabajador"));
            soldo= dato.Valido(solo);
            
        if(soldo<1000){
            s1++;
            Metodos++;
        }
        if(soldo>=1000 && soldo<=1750){
            s2++;
            Metodos++;
        }
        if(soldo>1750){
            s3++;
            Metodos++;
        }
    }
        JOptionPane.showInputDialog(null, s1 + " trabajadores cobran menos de 1000€ \n" + s2 + " trabajadores que cobran entre 1000 y 1750€ \n" + s3 + "trabajadores que cobran más de 1750€ \n");
        
    }
    
    public void Porcentajes(){
        
        
        m1 = ((s1*100)/Metodos);
        m2 = ((s2*100)/Metodos);
        m3 = ((s3*100)/Metodos);
        
        JOptionPane.showMessageDialog(null, "Por tanto :\n" + m1 + "% de trabajadores que cobran menos de 1000€\n" + m2 + "% de trabajadores que cobran entre 1000 y 1750€\n" + m3 + "% de trabajadores que cobran más de 1750€\n");
        
    }
    
}
