package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        FXMLLoader loader = new FXMLLoader();
        Parent root = loader.load(getClass().getResource("loginFile.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 400, 420));
        primaryStage.show();

        LoginController loginController = loader.getController();
        System.out.println(loginController);
//        loginController.setStageLogin(primaryStage);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
