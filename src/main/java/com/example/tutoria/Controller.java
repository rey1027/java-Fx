package com.example.tutoria;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;


public  class Controller  {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtRaza;
    @FXML
    private TextArea lisvPerro;


    public void save (ActionEvent e){
        String nombre = this.txtNombre.getText();
        String raza = this.txtRaza.getText();

        this.lisvPerro.appendText("Nombre: "+ nombre+ " Raza: "+ raza);
        this.lisvPerro.appendText("\n ");
        this.txtNombre.clear();
        this.txtRaza.clear();
        System.out.println("Animal guardado");
    }

    public void clearTxtArea(ActionEvent a){
        this.lisvPerro.clear();
    }


}