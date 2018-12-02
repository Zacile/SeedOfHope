package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class prin extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        ImageView fondo = new ImageView(new Image("./Imagenes/Escuela.jpg"));
        fondo.setFitWidth(1000);
        fondo.setFitHeight(750);
        Scene prin = new Scene(root, 1000, 640);
        primaryStage.setScene(prin);

        Label Titulo = new Label("Seed of Hope");
        Titulo.setFont( new Font("Comic Sans",50));

        Button Ini =new Button("Iniciar");
        Ini.setFont( new Font("Comic Sans",15));
        Ini.setTextFill(Color.SKYBLUE);

        EscenaSalon next = new EscenaSalon();

        root.getChildren().add(fondo);
        root.getChildren().add(Titulo);
        root.getChildren().add(Ini);


        Titulo.setLayoutX(350);
        Titulo.setLayoutY(50);

        Ini.setLayoutX(470);
        Ini.setLayoutY(570);

        Ini.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                next.loadGraphics();
                primaryStage.setScene(next.getEscena());
            }
        });

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
