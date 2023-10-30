package com.example.lr8;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController{
    @FXML
    private TextField inputN;
    @FXML
    private TextField inputR;
    @FXML
    private RadioButton f1;
    @FXML
    private RadioButton f2;
    @FXML
    private TextField resultTextField;
    @FXML
    private TextField inputX;
    @FXML
    private TextField inputY;
    @FXML
    protected void onCalcBtnClick() {
        Integer n = 0, r = 0, x = 0, y = 0;
        try {
            n = Integer.parseInt(this.inputN.getText());
            r = Integer.parseInt(this.inputR.getText());
            x = Integer.parseInt(this.inputX.getText());
            y = Integer.parseInt(this.inputY.getText());
        } catch (Exception err) {
            resultTextField.setText("Error");
            return;
        }
        if(f1.isSelected()){
            resultTextField.setText(this.f1(n, x, y).toString());
        } else {
            resultTextField.setText(this.f2(n, r).toString());
        }
    }

    private Double f1(Integer n, Integer x, Integer y){
        Double res = 0.0;
        Integer div = 1;
        for(Integer i = 0; i < n; i++){
            div *= 2 + i;
            if(i % 2 == 0){
                res -= Math.pow(y, i) / div;
            } else{
                res += Math.pow(x, i) / div;
            }
        }
        return res;
    }

    private Double f2(Integer n, Integer r){
        Double res = 0.0;
        for(Integer i = 1; i <= n; i++){
            for(Integer j = 1; j <= r; j++){
                res += (Math.pow(i, 2) + j) / Math.pow(i, j);
            }
        }
        return res;
    }

    public void setListeners(){
        inputN.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    inputN.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        inputR.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    inputR.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        inputX.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    inputX.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
        inputY.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    inputY.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }
}