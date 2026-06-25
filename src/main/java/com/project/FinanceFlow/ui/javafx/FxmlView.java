package com.project.financeflow.ui.javafx;

public enum FxmlView {
    Login {
        @Override public String getFxmlFile(){ return "/view/auth/login.fxml"; }
        @Override public String getTitle(){ return "Finance Flow - Tela Login"; }
    },

    Register{
        @Override public String getFxmlFile(){ return "/view/auth/register.fxml"; }
        @Override public String getTitle(){ return "Finance Flow - Tela Cadastro"; }
    };

    public abstract String getFxmlFile();
    public abstract String getTitle();
}
