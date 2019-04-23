package de.dc.javafx.photoshop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;

public abstract class BaseMainController {

    @FXML
    protected ListView<Node> layerListView;
	
    @FXML
    protected Pane contentPane;
	
    @FXML
    protected abstract void onOpenFileButtonClicked(ActionEvent event);

}
