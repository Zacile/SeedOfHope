package Escenas;

import GameObject.GameObject;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Corredor1 {
    private Scene escena;
    private Image backgroundI;
    private ImageView background;
    private GameObject puerta1;
    private Pane root;

    public Corredor1(){
        root = new Pane();
    }

    public void loadGraphics(){
        backgroundI = new Image("corredor1.jpg", 1000, 640, false, false);
        background = new ImageView(backgroundI);
    }

    public void loadComponent(){
        puerta1 = new GameObject(50, 70, 100, 100);
        root.getChildren().add(puerta1);
    }

    public void onUpdate(){
        puerta1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

            }
        });
    }

    public Scene getEscena(){
        return escena;
    }
}
