package com.example.cigany;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private Pane pane_alakzat;
    private ImageView imageview_alakzat;
    private ListView Listview;

    @FXML
    public void onPriosSelected(ActionEvent actionEvent) {
        pane_alakzat.setBackground(new Background(new BackgroundFill(Color.RED,null,null)));

    }
}