package com.example.mariokartrandomcombo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class RandomComboController {
    @FXML
    private Label randomComboText;

    @FXML
    protected void onRandomMK8ButtonClick()
    {
        randomComboText.setText(RandomComboService.RandomComboMK8());
    }

    @FXML
    protected void onRandomMKWButtonClick()
    {
        randomComboText.setText(RandomComboService.RandomComboMKW());
    }
}