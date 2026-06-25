package com.project.financeflow.ui.javafx;

import com.project.financeflow.FinanceFlowApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class StageManager {

    private final ApplicationContext context;
    @Setter
    private Stage primaryStage;


    public StageManager(ApplicationContext context) {
        this.context = context;
    }

    public void changeScreen(FxmlView view){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(view.getFxmlFile()));
            loader.setControllerFactory(context::getBean);

            Parent root = loader.load();
            Scene scene = new Scene(root);

            primaryStage.setTitle(view.getTitle());
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e){
            e.printStackTrace();
        }
    }


}
