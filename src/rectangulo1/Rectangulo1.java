/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo1;

import javax.swing.JOptionPane;

/**
 *
 * @author bvelosofioretti
 */
public class Rectangulo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //area del rectangulo pidiendo los datos
       float base; 
       
       float altura;
      
       float area;      
       
       base = Float.parseFloat(JOptionPane.showInputDialog("base"));
       
       altura = Float.parseFloat(JOptionPane.showInputDialog("altura"));
       
        area=base*altura;
      
        JOptionPane.showMessageDialog(null,"area =" + base);
        
        
       
       
   
       
        
        
        
    }
    
}
