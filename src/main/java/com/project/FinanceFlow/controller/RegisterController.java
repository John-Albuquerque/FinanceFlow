package com.project.financeflow.controller;

import com.project.financeflow.ui.javafx.FxmlView;
import com.project.financeflow.ui.javafx.StageManager;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RegisterController {

    @Autowired
    StageManager stageManager;

    @FXML
    private TextField txtNome;

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

        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String senha = txtSenha.getText();

        System.out.println("========= NOVO CADASTRO =========");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);

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
        txtSenha.clear();

    }

}