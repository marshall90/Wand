/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wand;

import org.wiigee.event.GestureEvent;
import org.wiigee.event.GestureListener;

/**
 *
 * @author marhan
 */
public class WandGestureListener implements GestureListener {

    @Override
    public void gestureReceived(GestureEvent event) {
        System.out.println("Received a GESTURE");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
