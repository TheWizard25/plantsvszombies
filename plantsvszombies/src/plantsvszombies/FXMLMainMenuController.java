/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author HD
 */
public class FXMLMainMenuController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private void clickNewGame(ActionEvent event) throws IOException {
    handleButtonAction(event, "FXMLCreateUser.fxml");
   }
    private void clickResume(ActionEvent event) throws IOException {
    handleButtonAction(event, "FXMLCreateUser.fxml");
   }
    private void clickSettings(ActionEvent event) throws IOException {
    handleButtonAction(event, "FXMLCreateUser.fxml");
   }
    private void clickExit(ActionEvent event) throws IOException {
    handleButtonAction(event, "FXMLCreateUser.fxml");
   }

    private void handleButtonAction(ActionEvent event, String s) throws IOException{
            Parent create_user_parent = FXMLLoader.load(getClass().getResource(s));
            Scene create_user_scene = new Scene(create_user_parent);
            Stage game_stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
            game_stage.setScene(create_user_scene);
            game_stage.show();
 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
