package com.project.financeflow.controllers;

import com.project.financeflow.business.LoginService;
import com.project.financeflow.ui.javafx.FxmlView;
import com.project.financeflow.ui.javafx.StageManager;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final StageManager stageManager;
    private final LoginService loginService;


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
        stageManager.changeScreen(FxmlView.Register);
    }

    @FXML
    private void onEntrar() {
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        boolean login = loginService.login(email, password);

        if(login){
            System.out.println("Login realizado!");
        }else {
            System.out.println("Email ou senha inválidos");
        }

        limparCampos();
    }

    private void limparCampos() {

        txtEmail.clear();
        txtPassword.clear();

    }

}
