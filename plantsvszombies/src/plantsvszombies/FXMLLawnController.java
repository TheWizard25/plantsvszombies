/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author HD
 */
public class FXMLLawnController implements Initializable {
    @FXML
    private void InGameMenu(ActionEvent event) throws IOException 
    {
    handleButtonAction(event, "FXMLInGameMenu.fxml");
   }
    private void handleButtonAction(ActionEvent event, String s) throws IOException{
            Parent create_user_parent = FXMLLoader.load(getClass().getResource(s));
            Scene create_user_scene = new Scene(create_user_parent);
            Stage game_stage= new Stage();
            game_stage.setScene(create_user_scene);
            game_stage.show();
 
    }
    @FXML
    private ImageView lawnmover1;
    @FXML
    private ImageView Zombie;
    @FXML
    private ImageView Peamoving;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TranslateTransition tt = new TranslateTransition();
        tt.setDuration(Duration.seconds(5));
        tt.setNode(lawnmover1);
        tt.setToX(+600);
        //tt.setCycleCount(1);
        //tt.setAutoReverse(true);
        
        
       TranslateTransition ll = new TranslateTransition();
        ll.setDuration(Duration.seconds(1.4));
        ll.setNode(Peamoving);
        ll.setToX(+450);
        ll.setCycleCount(100);
        //tt.setAutoReverse(true);
        TranslateTransition zz = new TranslateTransition();
        zz.setDuration(Duration.seconds(20));
        zz.setNode(Zombie);
        zz.setToX(-450);
        zz.setCycleCount(1);
        tt.play();
        ll.play();
        zz.play();
        
        
        
    }      
    
}
