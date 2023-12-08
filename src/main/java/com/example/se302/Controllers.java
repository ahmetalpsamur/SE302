package com.example.se302;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controllers implements Initializable {

    @FXML
    private TextField courseNameText;
    @FXML
    private TextField codeTextField;
    @FXML
    private TextField fallTextField;
    @FXML
    private TextField springTextField;
    @FXML
    private TextField theoryTextField;
    @FXML
    private TextField localCreditTextField;
    @FXML
    private TextField ectsTextField;
    @FXML
    private TextField prerequisitesTextField;
    @FXML
    private TextField labTextField;
    @FXML
    private TextField courseLanguageTextField;
    @FXML
    private TextField courseTypeTextField;
    @FXML
    private TextField courseLevelTextField;
    @FXML
    private TextField teachingMethodsTextField;
    @FXML
    private TextField courseCoordinatorTextField;
    @FXML
    private TextField courseCoordinatorTextField2; // maybe change the name
    @FXML
    private TextField assistantTextField;
    @FXML
    private TextField courseObjectivesTextField;
    @FXML
    private TextField learningOutcomesTextField;
    @FXML
    private TextField courseDescriptionTextField;
    @FXML
    private TextField courseNameTextField2; // maybe change the name
    //-----------------------------

    // course names will go here

    //-----------------------------
    @FXML
    private TextField subjectsTextFieldOne;
    @FXML
    private TextField reqiredMaterialsTextFieldOne;
    @FXML
    private TextField subjectsTextFieldTwo;
    @FXML
    private TextField reqiredMaterialsTextFieldTwo;
    @FXML
    private TextField subjectsTextFieldThree;
    @FXML
    private TextField reqiredMaterialsTextFieldThree;
    @FXML
    private TextField subjectsTextFieldFour;
    @FXML
    private TextField reqiredMaterialsTextFieldFour;
    @FXML
    private TextField subjectsTextFieldFive;
    @FXML
    private TextField reqiredMaterialsTextFieldFive;
    @FXML
    private TextField subjectsTextFieldSix;
    @FXML
    private TextField reqiredMaterialsTextFieldSix;
    @FXML
    private TextField subjectsTextFieldSeven;
    @FXML
    private TextField reqiredMaterialsTextFieldSeven;
    @FXML
    private TextField subjectsTextFieldEight;
    @FXML
    private TextField reqiredMaterialsTextFieldEight;
    @FXML
    private TextField subjectsTextFieldNine;
    @FXML
    private TextField reqiredMaterialsTextFieldNine;
    @FXML
    private TextField subjectsTextFieldTen;
    @FXML
    private TextField reqiredMaterialsTextFieldTen;
    @FXML
    private TextField subjectsTextFieldEleven;
    @FXML
    private TextField reqiredMaterialsTextFieldEleven;
    @FXML
    private TextField subjectsTextFieldTwelve;
    @FXML
    private TextField reqiredMaterialsTextFieldTwelve;
    @FXML
    private TextField subjectsTextFieldThirteen;
    @FXML
    private TextField reqiredMaterialsTextFieldThirteen;
    @FXML
    private TextField subjectsTextFieldFourteen;
    @FXML
    private TextField reqiredMaterialsTextFieldFourteen;
    @FXML
    private TextField subjectsTextFieldFifteen;
    @FXML
    private TextField reqiredMaterialsTextFieldFifteen;
    @FXML
    private TextField subjectsTextFieldSixteen;
    @FXML
    private TextField reqiredMaterialsTextFieldSixteen;
    @FXML
    private TextField courseNotesTextBooksTextField;
    @FXML
    private TextField suggestedMaterialsTextField;
    @FXML
    private TextField participationTextFieldOne;

    @FXML
    private TextField participationTextFieldTwo;

    @FXML
    private TextField participationTextFieldThree;

    @FXML
    private TextField participationTextFieldFour;

    @FXML
    private TextField participationTextFieldFive;

    @FXML
    private TextField participationTextFieldSix;

    @FXML
    private TextField participationTextFieldSeven;

    @FXML
    private TextField participationTextFieldEight;

    @FXML
    private TextField participationTextFieldNine;
    @FXML
    private TextField laboratoryTextFieldOne;

    @FXML
    private TextField laboratoryTextFieldTwo;

    @FXML
    private TextField laboratoryTextFieldThree;

    @FXML
    private TextField laboratoryTextFieldFour;

    @FXML
    private TextField laboratoryTextFieldFive;

    @FXML
    private TextField laboratoryTextFieldSix;

    @FXML
    private TextField laboratoryTextFieldSeven;

    @FXML
    private TextField laboratoryTextFieldEight;

    @FXML
    private TextField laboratoryTextFieldNine;
    @FXML
    private TextField fieldWorkTextFieldOne;

    @FXML
    private TextField fieldWorkTextFieldTwo;

    @FXML
    private TextField fieldWorkTextFieldThree;

    @FXML
    private TextField fieldWorkTextFieldFour;

    @FXML
    private TextField fieldWorkTextFieldFive;

    @FXML
    private TextField fieldWorkTextFieldSix;

    @FXML
    private TextField fieldWorkTextFieldSeven;

    @FXML
    private TextField fieldWorkTextFieldEight;

    @FXML
    private TextField fieldWorkTextFieldNine;
    @FXML
    private TextField quizTextFieldOne;

    @FXML
    private TextField quizTextFieldTwo;

    @FXML
    private TextField quizTextFieldThree;

    @FXML
    private TextField quizTextFieldFour;

    @FXML
    private TextField quizTextFieldFive;

    @FXML
    private TextField quizTextFieldSix;

    @FXML
    private TextField quizTextFieldSeven;

    @FXML
    private TextField quizTextFieldEight;

    @FXML
    private TextField quizTextFieldNine;
    @FXML
    private TextField homeworkTextFieldOne;

    @FXML
    private TextField homeworkTextFieldTwo;

    @FXML
    private TextField homeworkTextFieldThree;

    @FXML
    private TextField homeworkTextFieldFour;

    @FXML
    private TextField homeworkTextFieldFive;

    @FXML
    private TextField homeworkTextFieldSix;

    @FXML
    private TextField homeworkTextFieldSeven;

    @FXML
    private TextField homeworkTextFieldEight;

    @FXML
    private TextField homeworkTextFieldNine;


    @FXML
    protected void addSyllabus(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("syllabus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 760, 750);
        stage.setTitle("Syllabus");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void saveSyllabus(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("add-new-syllabus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 760, 750);
        stage.setTitle("Save");
        stage.setScene(scene);
        stage.show();
    }

    public void getHelp(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("help.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 760, 750);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialization code if needed
    }

}
