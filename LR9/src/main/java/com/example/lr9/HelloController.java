package com.example.lr9;

import com.example.lr9.Calculation.Calculator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    ComboBox<Integer> NList;
    @FXML
    ComboBox<Integer> KList;
    @FXML
    TextField tField;
    @FXML
    TextField fField;
    @FXML
    Slider xSlider;
    @FXML
    Slider ySlider;
    @FXML
    Label lblRes8;
    @FXML
    Label lblRes10;
    @FXML
    Label lblRes16;
    @FXML
    Label lblResMath;
    @FXML
    Label Error;
    public void Ready(){
        ObservableList<Integer> items = FXCollections.observableArrayList();
        for (Integer i = 1; i <= 10; i ++)
            items.add(i);
        NList.setItems(items);
        KList.setItems(items);
    }

    public void onChange(){
        try{
            double res = Calculator.Calc(
                    NList.getValue(),
                    KList.getValue(),
                    Integer.parseInt(tField.getText()),
                    Integer.parseInt(fField.getText()),
                    xSlider.getValue(),
                    ySlider.getValue()
            );
            lblRes8.setText(String.format("%o", (int)res));
            lblRes10.setText(String.format("%12.3f", res));
            lblRes16.setText(String.format("%x", (int)res));
            lblResMath.setText(String.format("%5.3e", res));
            Error.setText("");
        } catch (Exception e){
            Error.setText("Error: " + e.getMessage());
        }
    }
}