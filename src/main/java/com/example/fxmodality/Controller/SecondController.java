package com.example.fxmodality.Controller;
//1872003 - 1872005 - 1872009
import com.example.fxmodality.HelloApplication;
import com.example.fxmodality.Model.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SecondController implements Initializable {
    public TextField tfNama;
    public TextField tfKat;
    public TextField tfUts;
    public TextField tfUas;
    public Button btnSubmit;

    public ObservableList<Student> sList;
    public Student temp;

    public void btnClicked2(ActionEvent actionEvent) throws IOException {
        String nama;
        float kat;
        float uts;
        float uas;

        nama = tfNama.getText().trim();
        kat = Float.parseFloat(tfKat.getText().trim());
        uts = Float.parseFloat(tfUts.getText().trim());
        uas = Float.parseFloat(tfUas.getText().trim());

        temp = new Student(nama, kat, uts, uas);


        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sList = FXCollections.observableArrayList();
    }

    public void isiTable(Student student) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("firstLayout.fxml"));
        Parent root = loader.load();
        FirstController fc = loader.getController();
        fc.tvTable1.setItems(sList);
    }
}
