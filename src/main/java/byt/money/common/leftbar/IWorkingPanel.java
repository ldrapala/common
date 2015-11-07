package byt.money.common.leftbar;

import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 *
 * @author Lukasz
 */
public interface IWorkingPanel {
    
    Scene getScene();
    
    String getName();
    
    Button getButton();
    
    int getOrder();
    
}
