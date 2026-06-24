package com.project.financeflow;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


public class Main extends Application {

    private ConfigurableApplicationContext context;

    @Override
    public void init() {
        context = new SpringApplicationBuilder(FinanceFlowApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/view/auth/register.fxml"));

        loader.setControllerFactory(context::getBean);

        Scene scene = new Scene(loader.load());
        stage.setTitle("FinanceFlow");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    @Override
    public void stop() {
        context.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

