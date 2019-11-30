/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HD
 */
public class FXMLResumeGameController implements Initializable {
         @FXML
    private void clickselectgame(ActionEvent event) throws IOException {
    handleButtonAction(event, "FXMLLawn.fxml");
   }
    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;
    
    private void handleButtonAction(ActionEvent event, String s) throws IOException{
            Parent create_user_parent = FXMLLoader.load(getClass().getResource(s));
            Scene create_user_scene = new Scene(create_user_parent);
            Stage game_stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
            game_stage.setScene(create_user_scene);
            game_stage.show();
 
    }

    @FXML
    public void showgames(){
        ArrayList<User> ul= Game.getUserlist();
        int counter=0;
        for(User s : ul){
            counter++;
            if(counter==1){
                button1.setText(s.getUsername());
            }else
                if(counter==2){
                    button2.setText(s.getUsername());
                }else
                    if(counter==3){
                        button3.setText(s.getUsername());
                    }else
                        if(counter==4){
                            button4.setText(s.getUsername());
                        }else
                            if(counter==5){
                                button5.setText(s.getUsername());
                            }else
                                if(counter==6){
                                    button6.setText(s.getUsername());
                                }
            
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        showgames();
    }    
    
}
