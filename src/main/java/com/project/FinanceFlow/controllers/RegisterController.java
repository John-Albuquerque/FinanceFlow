package com.project.financeflow.controllers;

import com.project.financeflow.business.RegisterServices;
import com.project.financeflow.dtos.requests.UserCreationRequest;
import com.project.financeflow.ui.javafx.FxmlView;
import com.project.financeflow.ui.javafx.StageManager;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class RegisterController {

    private final StageManager stageManager;
    private final RegisterServices registerServices;


    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    public void initialize() {

        // Executado quando a tela é carregada

    }

    @FXML
    private void onCadastrar() {
        UserCreationRequest userCreationRequest = new UserCreationRequest();

        userCreationRequest.setName(txtNome.getText());
        userCreationRequest.setName(txtEmail.getText());
        userCreationRequest.setName(txtPassword.getText());

        registerServices.registerUser(userCreationRequest);

        limparCampos();

    }

    @FXML
    private void onEntrar() {

        System.out.println("Tela de Login");
        stageManager.changeScreen(FxmlView.Login);
    }

    private void limparCampos() {

        txtNome.clear();
        txtEmail.clear();
        txtPassword.clear();

    }

}