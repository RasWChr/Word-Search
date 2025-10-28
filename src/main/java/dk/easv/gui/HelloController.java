package dk.easv.gui;

import dk.easv.dal.WordsLogic;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
        //FXML referencer
    @FXML
    private ListView wordsListView;

        private WordsLogic wordsLogic = new WordsLogic();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (String w: wordsLogic.getWords()){
            wordsListView.getItems().add(w);

        }}


}

