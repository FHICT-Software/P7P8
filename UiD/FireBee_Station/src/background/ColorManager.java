/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package background;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JTabbedPane;

/**
 *
 * @author Jeroen
 */
public class ColorManager implements Observer{

    private JTabbedPane tabbedPane;
    
    @Override
    public void update(Observable o, Object arg) {
        
    }
    
}
