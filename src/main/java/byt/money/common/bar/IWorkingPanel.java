package byt.money.common.bar;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Lukasz
 */
public interface IWorkingPanel {
    
    GridPane getScene();
    
    String getName();
    
    Button getButton();
    
    int getOrder();
    
}
