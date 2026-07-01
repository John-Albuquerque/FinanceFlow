package com.project.financeflow;

import com.project.financeflow.ui.javafx.FxmlView;
import com.project.financeflow.ui.javafx.StageManager;
import javafx.application.Application;
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

        StageManager stageManager = context.getBean(StageManager.class);

        stageManager.setPrimaryStage(stage);
        stageManager.changeScreen(FxmlView.Login);
    }


    @Override
    public void stop() {
        context.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

