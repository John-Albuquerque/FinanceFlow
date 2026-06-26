package com.project.financeflow.controller;

import com.project.financeflow.business.LoginService;
import com.project.financeflow.ui.javafx.FxmlView;
import com.project.financeflow.ui.javafx.StageManager;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {
    @Autowired
    StageManager stageManager;

    @Autowired
    private LoginService loginService;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtSenha;
    
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
        String senha = txtSenha.getText();

        System.out.println("========= Login =========");
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);

        limparCampos();

    }

    private void limparCampos() {

        txtEmail.clear();
        txtSenha.clear();

    }

}
