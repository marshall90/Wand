/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wand;
import org.wiigee.control.WiimoteWiigee;

/**
 *
 * @author marhan
 */
public class Wand  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WiimoteWiigee wiigee;
        wiigee = new WiimoteWiigee();



        WandGestureListener wgl;
        wgl = new WandGestureListener();
        wiigee.addGestureListener( wgl );
       
        
    }

   
    
}
