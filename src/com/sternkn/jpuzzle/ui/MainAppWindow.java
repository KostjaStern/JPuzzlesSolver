package com.sternkn.jpuzzle.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainAppWindow extends Application
{
   private static final String WINDOW_TITLE = "Japanese puzzles solver";
   private static final double WINDOW_WIDTH = 400;
   private static final double WINDOW_HEIGHT = 350;
   
   public static void main(String[] args)
   {
      launch(args);
   }
   
   
   @Override
   public void start(Stage stage)
   {
      stage.setTitle(WINDOW_TITLE);
      Scene scene = new Scene(new VBox(), WINDOW_WIDTH, WINDOW_HEIGHT);
      
      MenuBar menuBar = new MenuBar();
      Menu menuFile = new Menu("File");
      MenuItem open = new MenuItem("Open ...");
      menuFile.getItems().addAll(open);
      
      Menu menuView = new Menu("View");
      
      menuBar.getMenus().addAll(menuFile, menuView);
      
      ((VBox) scene.getRoot()).getChildren().addAll(menuBar);
      stage.setScene(scene);
      stage.show();
   }
}
