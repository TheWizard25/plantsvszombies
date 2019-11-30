/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantsvszombies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import plantsvszombies.FXMLlevelpageController;
/**
 *
 * @author HD
 */

class User{
    private String username;
    private int currentlevel;
    private ArrayList<Integer> unlockedlevels;

    public User(String user){
        this.username=user;
        unlockedlevels=new ArrayList<Integer>();
        unlockedlevels.add(1);
    }
    
    public String getUsername() {
        return username;
    }

    public int getCurrentlevel() {
        System.out.println(currentlevel);
        return currentlevel;
    }



    public ArrayList<Integer> getUnlockedlevels() {
        return unlockedlevels;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCurrentlevel(int currentlevel) {
        this.currentlevel = currentlevel;
    }


 
    public void setUnlockedlevels(ArrayList<Integer> unlockedlevels) {
        this.unlockedlevels = unlockedlevels;
    }
    public void StartGame(){
        
    }
    
}


class Game
{
    Parent root;
    private static ArrayList<User> userlist =new ArrayList<User>();
    Stage stage;
    Scene scene;
    
    public Game(Stage sta)
    {
       
        this.stage=sta;
        
    }
    
    public static void adduser(User u)
    {
        userlist.add(u);
    }
    public static void printusers(){
        for(int i=0;i<userlist.size();i++){
            System.out.println(userlist.get(i).getUsername());
        }
    }
    
    public void start_game() throws IOException{
        root = FXMLLoader.load(getClass().getResource("FXMLMainMenu.fxml"));        
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
    }
    public void load_game() throws IOException{
        root = FXMLLoader.load(getClass().getResource("FXMLLawn.fxml"));        
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    
    }
    
}

public class Plantsvszombies extends Application 
{
    Game g;
    
    
    
    	public static void serialize(Game g, String filename) throws Exception {
		try
	    {    
	        FileOutputStream file = new FileOutputStream(filename); 
	        ObjectOutputStream out = new ObjectOutputStream(file); 

	        out.writeObject(g); 
	          
	        out.close(); 
	        file.close(); 
	        System.out.println("Object has been serialized"); 
	    } 
	    catch(IOException ex) 
	    { 
	        System.out.println("IOException is caught"); 
	    } 
		
	}
	
	public static Game deserialize(Game g, String filename) {
		 try
	        {    
	            FileInputStream file = new FileInputStream(filename); 
	            ObjectInputStream in = new ObjectInputStream(file); 
	            g = (Game)in.readObject(); 
	              
	            in.close(); 
	            file.close(); 
	              
	            System.out.println("Object has been deserialized "); 
	        } 
	          
	        catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	          
	        catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 
	  
		 return g;
	    } 

        public void resumegame(Game g,String nametoload) throws Exception{
			String filename = nametoload+".txt";
			File f = new File(filename);
			if(f.exists()) {
				System.out.println("Saved Game found. Loading...");
				g=deserialize(g, filename);
				g.load_game();
				serialize(g,filename);
			}				

        }
        
        public void savegame(Game g, String name) throws Exception{
            String temp= name+".txt";
            serialize(g, temp);
        }
        
        
    @Override
    public void start(Stage stage) throws Exception 
    {
        
        
        g=new Game(stage);
        g.start_game();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
