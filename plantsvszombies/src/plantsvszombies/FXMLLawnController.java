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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author HD
 */
public class FXMLLawnController implements Initializable 
{
    @FXML
    AnchorPane ap;
    private double startDragx,startDragy;
    @FXML
    private ImageView z1;
    @FXML
    private ImageView z2;
    @FXML
    private ImageView z3;
    @FXML
    private ImageView z4;
    @FXML
    private ImageView z5;
    @FXML
    private ImageView z6;
    @FXML
    private ImageView z7;
    
    @FXML
    private ImageView lawnmover1;
    @FXML
    private ImageView Sunflower;
    @FXML
    private ImageView peashooter;
    @FXML
    private ImageView wallnut;
    @FXML
    private ImageView iceshooter;
    @FXML
    private ImageView BWallnut;
    @FXML
    private GridPane gp;
    @FXML
    private GridPane apl;
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
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*TranslateTransition tt = new TranslateTransition();
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
        //tt.setAutoReverse(true);*/
        TranslateTransition zz1 = new TranslateTransition();
        TranslateTransition zz2 = new TranslateTransition();
        TranslateTransition zz3 = new TranslateTransition();
        TranslateTransition zz4 = new TranslateTransition();
        TranslateTransition zz5 = new TranslateTransition();
        TranslateTransition zz6 = new TranslateTransition();
        TranslateTransition zz7 = new TranslateTransition();
        
        zz1.setDuration(Duration.seconds(20+10));
        zz2.setDuration(Duration.seconds(30+10));
        zz3.setDuration(Duration.seconds(25+10));
        zz4.setDuration(Duration.seconds(15+10-2));
        zz5.setDuration(Duration.seconds(10+10+5));
        zz6.setDuration(Duration.seconds(35+10));
        zz7.setDuration(Duration.seconds(23+10));
        
        zz1.setNode(z1);
        zz2.setNode(z2);
        zz3.setNode(z3);
        zz4.setNode(z4);
        zz5.setNode(z5);
        zz6.setNode(z6);
        zz7.setNode(z7);
        
        
        zz1.setToX(-450);
        zz2.setToX(-450);
        zz3.setToX(-450);
        zz4.setToX(-450);
        zz5.setToX(-450);
        zz6.setToX(-450);
        zz7.setToX(-450);
        
        zz1.play();
        zz2.play();
        zz3.play();
        zz4.play();
        zz5.play();
        zz6.play();
        zz7.play();
        Sunflower.setOnMousePressed(e->
        {
            startDragx=e.getSceneX();
            startDragy=e.getSceneY();
            System.out.println(startDragx+" "+startDragy);
            
        });
        Sunflower.setOnMouseReleased(e->
        {
            
            Sunflower.setTranslateX(e.getSceneX()-startDragx);
            Sunflower.setTranslateY(e.getSceneY()-startDragy);
            
            Sunflower.setOnMousePressed(null);
            Sunflower.setOnMouseReleased(null);
            
            /*Image sunflower1= new Image("/../Static/images/sunflower2.png");
            ImageView sn1=new ImageView(sunflower1);
            apl.getChildren().add(sn1);
            sn1.setLayoutY(startDragy);
            sn1.setLayoutX(startDragx);
            
            //Image snf=new Image("@../Static/images/sunflower2.png");
            //ImageView sunfl=new ImageView(snf);*/
            
        });
        peashooter.setOnMousePressed(e->
        {
            startDragx=e.getSceneX();
            startDragy=e.getSceneY();
            System.out.println(startDragx+" "+startDragy);
            
        });
        peashooter.setOnMouseReleased(e->
        {
            
            peashooter.setTranslateX(e.getSceneX()-startDragx);
            peashooter.setTranslateY(e.getSceneY()-startDragy);
            
            peashooter.setOnMousePressed(null);
            peashooter.setOnMouseReleased(null);
            
            /*Image sunflower1= new Image("/../Static/images/sunflower2.png");
            ImageView sn1=new ImageView(sunflower1);
            apl.getChildren().add(sn1);
            sn1.setLayoutY(startDragy);
            sn1.setLayoutX(startDragx);
            
            //Image snf=new Image("@../Static/images/sunflower2.png");
            //ImageView sunfl=new ImageView(snf);*/
            
        });
        
        wallnut.setOnMousePressed(e->
        {
            startDragx=e.getSceneX();
            startDragy=e.getSceneY();
            System.out.println(startDragx+" "+startDragy);
            
        });
        wallnut.setOnMouseReleased(e->
        {
            
            wallnut.setTranslateX(e.getSceneX()-startDragx);
            wallnut.setTranslateY(e.getSceneY()-startDragy);
            
            wallnut.setOnMousePressed(null);
            wallnut.setOnMouseReleased(null);
            
            /*Image sunflower1= new Image("/../Static/images/sunflower2.png");
            ImageView sn1=new ImageView(sunflower1);
            apl.getChildren().add(sn1);
            sn1.setLayoutY(startDragy);
            sn1.setLayoutX(startDragx);
            
            //Image snf=new Image("@../Static/images/sunflower2.png");
            //ImageView sunfl=new ImageView(snf);*/
            
        });
        
        iceshooter.setOnMousePressed(e->
        {
            startDragx=e.getSceneX();
            startDragy=e.getSceneY();
            System.out.println(startDragx+" "+startDragy);
            
        });
        iceshooter.setOnMouseReleased(e->
        {
            
            iceshooter.setTranslateX(e.getSceneX()-startDragx);
            iceshooter.setTranslateY(e.getSceneY()-startDragy);
            
            iceshooter.setOnMousePressed(null);
            iceshooter.setOnMouseReleased(null);
            
            /*Image sunflower1= new Image("/../Static/images/sunflower2.png");
            ImageView sn1=new ImageView(sunflower1);
            apl.getChildren().add(sn1);
            sn1.setLayoutY(startDragy);
            sn1.setLayoutX(startDragx);
            
            //Image snf=new Image("@../Static/images/sunflower2.png");
            //ImageView sunfl=new ImageView(snf);*/
            
        });
        BWallnut.setOnMousePressed(e->
        {
            startDragx=e.getSceneX();
            startDragy=e.getSceneY();
            System.out.println(startDragx+" "+startDragy);
            
        });
        BWallnut.setOnMouseReleased(e->
        {
            
            BWallnut.setTranslateX(e.getSceneX()-startDragx);
            BWallnut.setTranslateY(e.getSceneY()-startDragy);
            
            BWallnut.setOnMousePressed(null);
            BWallnut.setOnMouseReleased(null);
            
            /*Image sunflower1= new Image("/../Static/images/sunflower2.png");
            ImageView sn1=new ImageView(sunflower1);
            apl.getChildren().add(sn1);
            sn1.setLayoutY(startDragy);
            sn1.setLayoutX(startDragx);
            
            //Image snf=new Image("@../Static/images/sunflower2.png");
            //ImageView sunfl=new ImageView(snf);*/
            
        });
        
        
        
        
        
        
    }      

}
