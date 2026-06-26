package com.project.financeflow.controller;

import com.project.financeflow.business.RegisterServices;
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
    private StageManager stageManager;
    @Autowired
    private RegisterServices registerServices;



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

        registerServices.registerUser(nome, email, senha);

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