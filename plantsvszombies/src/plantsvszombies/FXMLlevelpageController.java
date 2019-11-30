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
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author nitesh
 */
public class FXMLlevelpageController implements Initializable {
    
    private int selectedlevel;
    
    @FXML
    private Pane panelevel1;
    @FXML
    private Pane panelevel2;
    @FXML
    private Pane panelevel3;
    @FXML
    private Pane panelevel4;
    
    ArrayList<Integer> unlockedlevels;    
    public int getSelectedlevel() {
        return selectedlevel;
    }
    
    
    

 
    @FXML
    public void showlevels(){
        for(int i=0;i<unlockedlevels.size();i++){
            if(unlockedlevels.get(i)==1){
                System.out.print("work");                        
                panelevel1.setOpacity(0.99);
                panelevel1.setCursor(Cursor.HAND);
            }
            else 
               if(unlockedlevels.get(i)==2){
                    panelevel1.setOpacity(1);
                }
                else 
                   if(unlockedlevels.get(i)==3){
                        panelevel1.setOpacity(1);
                    }
                else 
                    if(unlockedlevels.get(i)==4){
                            panelevel1.setOpacity(1);
                        }

                
        }
    }
    
    
    
    @FXML
    private void clicklevel1(ActionEvent event) throws IOException {
        handleButtonAction(event, "FXMLLawn.fxml");
   }

    private void clicklevel2(ActionEvent event) throws IOException {
        handleButtonAction(event, "FXMLLawn.fxml");
   }
    private void clicklevel3(ActionEvent event) throws IOException {
        handleButtonAction(event, "FXMLLawn.fxml");
   }
    private void clicklevel4(ActionEvent event) throws IOException {
        handleButtonAction(event, "FXMLLawn.fxml");
   }
    
    private void clicklevel5(ActionEvent event) throws IOException {
        handleButtonAction(event, "FXMLLawn.fxml");
   }

    private void handleButtonAction(ActionEvent event, String s) throws IOException{
            Parent create_user_parent = FXMLLoader.load(getClass().getResource(s));
            Scene create_user_scene = new Scene(create_user_parent);
            Stage game_stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
            game_stage.setScene(create_user_scene);
            game_stage.show();
 
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        this.unlockedlevels = FXMLCreateUserController.newuser.getUnlockedlevels();
        showlevels();
    }    
    
}
