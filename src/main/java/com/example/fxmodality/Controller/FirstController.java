package com.example.fxmodality.Controller;
//1872003 - 1872005 - 1872009
import com.example.fxmodality.HelloApplication;
import com.example.fxmodality.Model.Student;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FirstController implements Initializable {
    public Button btnSubmit;
    public TableView<Student> tvTable1;

    public ObservableList<Student> sList;

    public void btnClicked(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("secondLayout.fxml"));
        Parent root = loader.load();
        SecondController sc = loader.getController();
        Stage secondStage = new Stage();
        secondStage.setTitle("Page 2");
        secondStage.setScene(new Scene(root));
        secondStage.initModality(Modality.APPLICATION_MODAL);
        secondStage.showAndWait();

        sList.add(sc.temp);
        refreshTable();
    }

    public void refreshTable() {
        tvTable1.setItems(sList);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sList = FXCollections.observableArrayList();

        TableColumn<Student, String> col1, col2, col3, col4, col5;
        col1 = new TableColumn<Student, String>();
        col1.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNama()));
        col1.setText("Nama Siswa");
        tvTable1.getColumns().add(col1);

        col2 = new TableColumn<Student, String>();
        col2.setCellValueFactory(data -> new SimpleFloatProperty(data.getValue().getKat()).asString());
        col2.setText("KAT");
        tvTable1.getColumns().add(col2);

        col3 = new TableColumn<Student, String>();
        col3.setCellValueFactory(data -> new SimpleFloatProperty(data.getValue().getUts()).asString());
        col3.setText("UTS");
        tvTable1.getColumns().add(col3);

        col4 = new TableColumn<Student, String>();
        col4.setCellValueFactory(data -> new SimpleFloatProperty(data.getValue().getUas()).asString());
        col4.setText("UAS");
        tvTable1.getColumns().add(col4);

        col5 = new TableColumn<Student, String>();
        col5.setCellValueFactory(data -> new SimpleFloatProperty(data.getValue().getNilai()).asString());
        col5.setText("Nilai Akhir");
        tvTable1.getColumns().add(col5);
    }

}
