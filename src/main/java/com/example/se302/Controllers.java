package com.example.se302;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javafx.scene.input.MouseEvent;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controllers implements Initializable,Serializable {


    private Syllabus currentSyllabus;
    private Controllers controller;
    private Syllabus currentSyllabus2;
    private Syllabus tempSyllabus;

    //below lines are for language choicebox

    @FXML
    private ChoiceBox<String> myChoiceBox;


    private String[] languages = {"English","Turkish" };


    //For the Detailed Info while adding and editing
    @FXML
    private TextField editorNameTextField;
    @FXML
    private TextField editDateTextField;
    @FXML
    private TextField editTimeTextField;
    @FXML
    private TextArea editDescriptionTextArea;


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
    private TextField labTextField;
    @FXML
    private TextField localCreditTextField;
    @FXML
    private TextField ectsTextField;

    @FXML
    private TextField prerequisitesTextField;
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
    private TextField courseCoordinatorTextField2;
    @FXML
    private TextField assistantTextField;

    @FXML
    private TextField courseObjectivesTextField;
    @FXML
    private TextField learningOutcomesTextField;
    @FXML
    private TextField courseDescriptionTextField;

    //DONT FORGET COURSE NAME AND CHOICE BOX

    @FXML
    private TextField courseCategory;

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
    private TextField quiz2TextFieldOne;
    @FXML
    private TextField quiz2TextFieldTwo;
    @FXML
    private TextField quiz2TextFieldThree;
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
    private TextField coursehourTextFieldOne;
    @FXML
    private TextField coursehourTextFieldTwo;

    @FXML
    private TextField labhourTextFieldOne;
    @FXML
    private TextField labhourTextFieldTwo;

    @FXML
    private TextField StudyhourTextFieldOne;
    @FXML
    private TextField StudyhourTextFieldTwo;
    @FXML
    private TextField StudyhourTextFieldThree;

    @FXML
    private TextField FieldworkTextFieldOne;
    @FXML
    private TextField FieldworkTextFieldTwo;
    @FXML
    private TextField FieldworkTextFieldThree;

    @FXML
    private TextField quizTextFieldOne;
    @FXML
    private TextField quizTextFieldTwo;
    @FXML
    private TextField quizTextFieldThree;

    @FXML
    private TextField homeworkTextFieldOne;
    @FXML
    private TextField homeworkTextFieldTwo;
    @FXML
    private TextField homeworkTextFieldThree;

    @FXML
    private TextField presentationTextFieldOne;
    @FXML
    private TextField presentationTextFieldTwo;
    @FXML
    private TextField presentationTextFieldThree;

    @FXML
    private TextField projectTextFieldOne;
    @FXML
    private TextField projectTextFieldTwo;
    @FXML
    private TextField projectTextFieldThree;

    @FXML
    private TextField portfolioTextFieldOne;
    @FXML
    private TextField portfolioTextFieldTwo;
    @FXML
    private TextField portfolioTextFieldThree;

    @FXML
    private TextField seminarTextFieldOne;
    @FXML
    private TextField seminarTextFieldTwo;
    @FXML
    private TextField seminarTextFieldThree;

    @FXML
    private TextField oralTextFieldOne;
    @FXML
    private TextField oralTextFieldTwo;
    @FXML
    private TextField oralTextFieldThree;

    @FXML
    private TextField midtermTextFieldOne;
    @FXML
    private TextField midtermTextFieldTwo;
    @FXML
    private TextField midtermTextFieldThree;

    @FXML
    private TextField finalTextFieldOne;
    @FXML
    private TextField finalTextFieldTwo;
    @FXML
    private TextField finalTextFieldThree;
    @FXML
    private TextField oneProgramTextFieldZero;
    @FXML
    private TextField oneProgramTextFieldOne;
    @FXML
    private TextField oneProgramTextFieldTwo;
    @FXML
    private TextField oneProgramTextFieldThree;
    @FXML
    private TextField oneProgramTextFieldFour;
    @FXML
    private TextField oneProgramTextFieldFive;

    @FXML
    private TextField twoProgramTextFieldZero;
    @FXML
    private TextField twoProgramTextFieldOne;
    @FXML
    private TextField twoProgramTextFieldTwo;
    @FXML
    private TextField twoProgramTextFieldThree;
    @FXML
    private TextField twoProgramTextFieldFour;
    @FXML
    private TextField twoProgramTextFieldFive;

    @FXML
    private TextField threeProgramTextFieldZero;
    @FXML
    private TextField threeProgramTextFieldOne;
    @FXML
    private TextField threeProgramTextFieldTwo;
    @FXML
    private TextField threeProgramTextFieldThree;
    @FXML
    private TextField threeProgramTextFieldFour;
    @FXML
    private TextField threeProgramTextFieldFive;

    @FXML
    private TextField fourProgramTextFieldZero;
    @FXML
    private TextField fourProgramTextFieldOne;
    @FXML
    private TextField fourProgramTextFieldTwo;
    @FXML
    private TextField fourProgramTextFieldThree;
    @FXML
    private TextField fourProgramTextFieldFour;
    @FXML
    private TextField fourProgramTextFieldFive;

    @FXML
    private TextField fiveProgramTextFieldZero;
    @FXML
    private TextField fiveProgramTextFieldOne;
    @FXML
    private TextField fiveProgramTextFieldTwo;
    @FXML
    private TextField fiveProgramTextFieldThree;
    @FXML
    private TextField fiveProgramTextFieldFour;
    @FXML
    private TextField fiveProgramTextFieldFive;

    @FXML
    private TextField sixProgramTextFieldZero;
    @FXML
    private TextField sixProgramTextFieldOne;
    @FXML
    private TextField sixProgramTextFieldTwo;
    @FXML
    private TextField sixProgramTextFieldThree;
    @FXML
    private TextField sixProgramTextFieldFour;
    @FXML
    private TextField sixProgramTextFieldFive;

    @FXML
    private TextField sevenProgramTextFieldZero;
    @FXML
    private TextField sevenProgramTextFieldOne;
    @FXML
    private TextField sevenProgramTextFieldTwo;
    @FXML
    private TextField sevenProgramTextFieldThree;
    @FXML
    private TextField sevenProgramTextFieldFour;
    @FXML
    private TextField sevenProgramTextFieldFive;

    @FXML
    private TextField eightProgramTextFieldZero;
    @FXML
    private TextField eightProgramTextFieldOne;
    @FXML
    private TextField eightProgramTextFieldTwo;
    @FXML
    private TextField eightProgramTextFieldThree;
    @FXML
    private TextField eightProgramTextFieldFour;
    @FXML
    private TextField eightProgramTextFieldFive;

    @FXML
    private TextField nineProgramTextFieldZero;
    @FXML
    private TextField nineProgramTextFieldOne;
    @FXML
    private TextField nineProgramTextFieldTwo;
    @FXML
    private TextField nineProgramTextFieldThree;
    @FXML
    private TextField nineProgramTextFieldFour;
    @FXML
    private TextField nineProgramTextFieldFive;
    @FXML
    private TextField tenProgramTextFieldZero;
    @FXML
    private TextField tenProgramTextFieldOne;
    @FXML
    private TextField tenProgramTextFieldTwo;
    @FXML
    private TextField tenProgramTextFieldThree;
    @FXML
    private TextField tenProgramTextFieldFour;
    @FXML
    private TextField tenProgramTextFieldFive;

    @FXML
    private TextField elevenProgramTextFieldZero;
    @FXML
    private TextField elevenProgramTextFieldOne;
    @FXML
    private TextField elevenProgramTextFieldTwo;
    @FXML
    private TextField elevenProgramTextFieldThree;
    @FXML
    private TextField elevenProgramTextFieldFour;
    @FXML
    private TextField elevenProgramTextFieldFive;

    @FXML
    private TextField twelveProgramTextFieldZero;
    @FXML
    private TextField twelveProgramTextFieldOne;
    @FXML
    private TextField twelveProgramTextFieldTwo;
    @FXML
    private TextField twelveProgramTextFieldThree;
    @FXML
    private TextField twelveProgramTextFieldFour;
    @FXML
    private TextField twelveProgramTextFieldFive;

    @FXML
    private TextField thirteenProgramTextFieldZero;
    @FXML
    private TextField thirteenProgramTextFieldOne;
    @FXML
    private TextField thirteenProgramTextFieldTwo;
    @FXML
    private TextField thirteenProgramTextFieldThree;
    @FXML
    private TextField thirteenProgramTextFieldFour;
    @FXML
    private TextField thirteenProgramTextFieldFive;


    public static ArrayList<Syllabus> syllabusList = new ArrayList<>();
    public int currentIndex;
    public static String editorname;
    public static String description;
    public static String date;
    public static String time;


    @FXML
    private ToggleGroup CourseCategory;
    @FXML
    private RadioButton coreCourseCheck;

    @FXML
    private RadioButton majorCourseCheck;

    @FXML
    private RadioButton supportCourseCheck;

    @FXML
    private RadioButton comSkillsCourseCheck;

    @FXML
    private RadioButton transfSkillCourseCheck;


    private String selectedCourseCategory;


    public void handleCourseCategorySelection() {
        if (coreCourseCheck.isSelected()) {
            selectedCourseCategory = "Core Course";
            System.out.println("Selected course category is "+selectedCourseCategory);
        } else if (majorCourseCheck.isSelected()) {
            selectedCourseCategory = "Major Area Course";
            System.out.println("Selected course category is "+selectedCourseCategory);
        } else if (supportCourseCheck.isSelected()) {
            selectedCourseCategory = "Supportive Course";
            System.out.println("Selected course category is "+selectedCourseCategory);
        } else if (comSkillsCourseCheck.isSelected()) {
            selectedCourseCategory = "Communication and Management Skills Course";
            System.out.println("Selected course category is "+selectedCourseCategory);
        } else if (transfSkillCourseCheck.isSelected()) {
            selectedCourseCategory = "Transferable Skills Course";
            System.out.println("Selected course category is "+selectedCourseCategory);
        }
    }



    @FXML
    private ListView<Syllabus> syllabusListView = new ListView<Syllabus>();

    public static ObservableList<Syllabus> syllabusListO = FXCollections.observableArrayList();

    public void setAssistantTextField(Syllabus syllabus) {

        syllabus.setEditorName(editorname);
        syllabus.setEditDescription(description);
        syllabus.setEditDate(date);
        syllabus.setEditTime(time);

        handleCourseCategorySelection();
        syllabus.setCourseCategory(selectedCourseCategory);

        syllabus.setCourseName(courseNameText.getText());
        syllabus.setCode(codeTextField.getText());
        syllabus.setFall(fallTextField.getText());
        syllabus.setSpring(springTextField.getText());
        syllabus.setTheory(theoryTextField.getText());
        syllabus.setLab(labTextField.getText());
        syllabus.setLocalCredit(localCreditTextField.getText());
        syllabus.setEcts(ectsTextField.getText());
        syllabus.setPrerequisites(prerequisitesTextField.getText());
        syllabus.setCourseLanguage(courseLanguageTextField.getText());
        syllabus.setCourseType(courseTypeTextField.getText());
        syllabus.setCourseLevel(courseLevelTextField.getText());
        syllabus.setTeachingMethods(teachingMethodsTextField.getText());
        syllabus.setCourseCoordinator(courseCoordinatorTextField.getText());
        syllabus.setCourseCoordinator2(courseCoordinatorTextField2.getText());
        syllabus.setAssistant(assistantTextField.getText());
        syllabus.setCourseObjectives(courseObjectivesTextField.getText());
        syllabus.setLearningOutcomes(learningOutcomesTextField.getText());
        syllabus.setCourseDescription(courseDescriptionTextField.getText());
        syllabus.setSubjectsTwo(subjectsTextFieldTwo.getText());
        syllabus.setRequiredMaterialsTwo(reqiredMaterialsTextFieldTwo.getText());
        syllabus.setSubjectsThree(subjectsTextFieldThree.getText());
        syllabus.setRequiredMaterialsThree(reqiredMaterialsTextFieldThree.getText());
        syllabus.setSubjectsFour(subjectsTextFieldFour.getText());
        syllabus.setRequiredMaterialsFour(reqiredMaterialsTextFieldFour.getText());
        syllabus.setSubjectsFive(subjectsTextFieldFive.getText());
        syllabus.setRequiredMaterialsFive(reqiredMaterialsTextFieldFive.getText());
        syllabus.setSubjectsSix(subjectsTextFieldSix.getText());
        syllabus.setRequiredMaterialsSix(reqiredMaterialsTextFieldSix.getText());
        syllabus.setSubjectsSeven(subjectsTextFieldSeven.getText());
        syllabus.setRequiredMaterialsSeven(reqiredMaterialsTextFieldSeven.getText());
        syllabus.setSubjectsEight(subjectsTextFieldEight.getText());
        syllabus.setRequiredMaterialsEight(reqiredMaterialsTextFieldEight.getText());
        syllabus.setSubjectsNine(subjectsTextFieldNine.getText());
        syllabus.setRequiredMaterialsNine(reqiredMaterialsTextFieldNine.getText());
        syllabus.setSubjectsTen(subjectsTextFieldTen.getText());
        syllabus.setRequiredMaterialsTen(reqiredMaterialsTextFieldTen.getText());
        syllabus.setSubjectsEleven(subjectsTextFieldEleven.getText());
        syllabus.setRequiredMaterialsEleven(reqiredMaterialsTextFieldEleven.getText());
        syllabus.setSubjectsTwelve(subjectsTextFieldTwelve.getText());
        syllabus.setRequiredMaterialsTwelve(reqiredMaterialsTextFieldTwelve.getText());
        syllabus.setSubjectsThirteen(subjectsTextFieldThirteen.getText());
        syllabus.setRequiredMaterialsThirteen(reqiredMaterialsTextFieldThirteen.getText());
        syllabus.setSubjectsFourteen(subjectsTextFieldFourteen.getText());
        syllabus.setRequiredMaterialsFourteen(reqiredMaterialsTextFieldFourteen.getText());
        syllabus.setSubjectsFifteen(subjectsTextFieldFifteen.getText());
        syllabus.setRequiredMaterialsFifteen(reqiredMaterialsTextFieldFifteen.getText());
        syllabus.setSubjectsSixteen(subjectsTextFieldSixteen.getText());
        syllabus.setRequiredMaterialsSixteen(reqiredMaterialsTextFieldSixteen.getText());
        syllabus.setParticipationOne(participationTextFieldOne.getText());
        syllabus.setParticipationTwo(participationTextFieldTwo.getText());
        syllabus.setParticipationThree(participationTextFieldThree.getText());
        syllabus.setParticipationFour(participationTextFieldFour.getText());
        syllabus.setParticipationFive(participationTextFieldFive.getText());
        syllabus.setParticipationSix(participationTextFieldSix.getText());
        syllabus.setParticipationSeven(participationTextFieldSeven.getText());
        syllabus.setParticipationEight(participationTextFieldEight.getText());
        syllabus.setParticipationNine(participationTextFieldNine.getText());
        syllabus.setLaboratoryOne(laboratoryTextFieldOne.getText());
        syllabus.setLaboratoryTwo(laboratoryTextFieldTwo.getText());
        syllabus.setLaboratoryThree(laboratoryTextFieldThree.getText());
        syllabus.setLaboratoryFour(laboratoryTextFieldFour.getText());
        syllabus.setLaboratoryFive(laboratoryTextFieldFive.getText());
        syllabus.setLaboratorySix(laboratoryTextFieldSix.getText());
        syllabus.setLaboratorySeven(laboratoryTextFieldSeven.getText());
        syllabus.setLaboratoryEight(laboratoryTextFieldEight.getText());
        syllabus.setLaboratoryNine(laboratoryTextFieldNine.getText());
        syllabus.setFieldWorkOne(fieldWorkTextFieldOne.getText());
        syllabus.setFieldWorkTwo(fieldWorkTextFieldTwo.getText());
        syllabus.setFieldWorkThree(fieldWorkTextFieldThree.getText());
        syllabus.setFieldWorkFour(fieldWorkTextFieldFour.getText());
        syllabus.setFieldWorkFive(fieldWorkTextFieldFive.getText());
        syllabus.setFieldWorkSix(fieldWorkTextFieldSix.getText());
        syllabus.setFieldWorkSeven(fieldWorkTextFieldSeven.getText());
        syllabus.setFieldWorkEight(fieldWorkTextFieldEight.getText());
        syllabus.setFieldWorkNine(fieldWorkTextFieldNine.getText());
        syllabus.setQuiz2One(quiz2TextFieldOne.getText());
        syllabus.setQuiz2Two(quiz2TextFieldTwo.getText());
        syllabus.setQuiz2Three(quiz2TextFieldThree.getText());
        syllabus.setQuizFour(quizTextFieldFour.getText());
        syllabus.setQuizFive(quizTextFieldFive.getText());
        syllabus.setQuizSix(quizTextFieldSix.getText());
        syllabus.setQuizSeven(quizTextFieldSeven.getText());
        syllabus.setQuizEight(quizTextFieldEight.getText());
        syllabus.setQuizNine(quizTextFieldNine.getText());
        syllabus.setCourseHourOne(coursehourTextFieldOne.getText());
        syllabus.setCourseHourTwo(coursehourTextFieldTwo.getText());

        // Part 2

        syllabus.setLabhourOne(labhourTextFieldOne.getText());
        syllabus.setLabhourTwo(labhourTextFieldTwo.getText());
        syllabus.setStudyhourOne(StudyhourTextFieldOne.getText());
        syllabus.setStudyhourTwo(StudyhourTextFieldTwo.getText());
        syllabus.setStudyhourThree(StudyhourTextFieldThree.getText());
        syllabus.setFieldworkOne(FieldworkTextFieldOne.getText());
        syllabus.setFieldworkTwo(FieldworkTextFieldTwo.getText());
        syllabus.setFieldworkThree(FieldworkTextFieldThree.getText());
        syllabus.setQuizOne(quizTextFieldOne.getText());
        syllabus.setQuizTwo(quizTextFieldTwo.getText());
        syllabus.setQuizThree(quizTextFieldThree.getText());
        syllabus.setHomeworkOne(homeworkTextFieldOne.getText());
        syllabus.setHomeworkTwo(homeworkTextFieldTwo.getText());
        syllabus.setHomeworkThree(homeworkTextFieldThree.getText());
        syllabus.setPresentationOne(presentationTextFieldOne.getText());
        syllabus.setPresentationTwo(presentationTextFieldTwo.getText());
        syllabus.setPresentationThree(presentationTextFieldThree.getText());
        syllabus.setProjectOne(projectTextFieldOne.getText());
        syllabus.setProjectTwo(projectTextFieldTwo.getText());
        syllabus.setProjectThree(projectTextFieldThree.getText());
        syllabus.setPortfolioOne(portfolioTextFieldOne.getText());
        syllabus.setPortfolioTwo(portfolioTextFieldTwo.getText());
        syllabus.setPortfolioThree(portfolioTextFieldThree.getText());
        syllabus.setSeminarOne(seminarTextFieldOne.getText());
        syllabus.setSeminarTwo(seminarTextFieldTwo.getText());
        syllabus.setSeminarThree(seminarTextFieldThree.getText());
        syllabus.setOralOne(oralTextFieldOne.getText());
        syllabus.setOralTwo(oralTextFieldTwo.getText());
        syllabus.setOralThree(oralTextFieldThree.getText());
        syllabus.setMidtermOne(midtermTextFieldOne.getText());
        syllabus.setMidtermTwo(midtermTextFieldTwo.getText());
        syllabus.setMidtermThree(midtermTextFieldThree.getText());
        syllabus.setFinalOne(finalTextFieldOne.getText());
        syllabus.setFinalTwo(finalTextFieldTwo.getText());
        syllabus.setFinalThree(finalTextFieldThree.getText());
        syllabus.setOneProgramZero(oneProgramTextFieldZero.getText());
        syllabus.setOneProgramOne(oneProgramTextFieldOne.getText());
        syllabus.setOneProgramTwo(oneProgramTextFieldTwo.getText());
        syllabus.setOneProgramThree(oneProgramTextFieldThree.getText());
        syllabus.setOneProgramFour(oneProgramTextFieldFour.getText());
        syllabus.setOneProgramFive(oneProgramTextFieldFive.getText());
        syllabus.setTwoProgramZero(twoProgramTextFieldZero.getText());
        syllabus.setTwoProgramOne(twoProgramTextFieldOne.getText());
        syllabus.setTwoProgramTwo(twoProgramTextFieldTwo.getText());
        syllabus.setTwoProgramThree(twoProgramTextFieldThree.getText());
        syllabus.setTwoProgramFour(twoProgramTextFieldFour.getText());
        syllabus.setTwoProgramFive(twoProgramTextFieldFive.getText());
        syllabus.setThreeProgramZero(threeProgramTextFieldZero.getText());
        syllabus.setThreeProgramOne(threeProgramTextFieldOne.getText());
        syllabus.setThreeProgramTwo(threeProgramTextFieldTwo.getText());
        syllabus.setThreeProgramThree(threeProgramTextFieldThree.getText());
        syllabus.setThreeProgramFour(threeProgramTextFieldFour.getText());
        syllabus.setThreeProgramFive(threeProgramTextFieldFive.getText());
        syllabus.setFourProgramZero(fourProgramTextFieldZero.getText());
        syllabus.setFourProgramOne(fourProgramTextFieldOne.getText());
        syllabus.setFourProgramTwo(fourProgramTextFieldTwo.getText());
        syllabus.setFourProgramThree(fourProgramTextFieldThree.getText());
        syllabus.setFourProgramFour(fourProgramTextFieldFour.getText());
        syllabus.setFourProgramFive(fourProgramTextFieldFive.getText());
        syllabus.setFiveProgramZero(fiveProgramTextFieldZero.getText());
        syllabus.setFiveProgramOne(fiveProgramTextFieldOne.getText());
        syllabus.setFiveProgramTwo(fiveProgramTextFieldTwo.getText());
        syllabus.setFiveProgramThree(fiveProgramTextFieldThree.getText());
        syllabus.setFiveProgramFour(fiveProgramTextFieldFour.getText());
        syllabus.setFiveProgramFive(fiveProgramTextFieldFive.getText());
        syllabus.setSixProgramZero(sixProgramTextFieldZero.getText());
        syllabus.setSixProgramOne(sixProgramTextFieldOne.getText());
        syllabus.setSixProgramTwo(sixProgramTextFieldTwo.getText());
        syllabus.setSixProgramThree(sixProgramTextFieldThree.getText());
        syllabus.setSixProgramFour(sixProgramTextFieldFour.getText());
        syllabus.setSixProgramFive(sixProgramTextFieldFive.getText());
        syllabus.setSevenProgramZero(sevenProgramTextFieldZero.getText());
        syllabus.setSevenProgramOne(sevenProgramTextFieldOne.getText());
        syllabus.setSevenProgramTwo(sevenProgramTextFieldTwo.getText());
        syllabus.setSevenProgramThree(sevenProgramTextFieldThree.getText());
        syllabus.setSevenProgramFour(sevenProgramTextFieldFour.getText());
        syllabus.setSevenProgramFive(sevenProgramTextFieldFive.getText());
        syllabus.setEightProgramZero(eightProgramTextFieldZero.getText());
        syllabus.setEightProgramOne(eightProgramTextFieldOne.getText());
        syllabus.setEightProgramTwo(eightProgramTextFieldTwo.getText());
        syllabus.setEightProgramThree(eightProgramTextFieldThree.getText());
        syllabus.setEightProgramFour(eightProgramTextFieldFour.getText());
        syllabus.setEightProgramFive(eightProgramTextFieldFive.getText());
        syllabus.setNineProgramZero(nineProgramTextFieldZero.getText());
        syllabus.setNineProgramOne(nineProgramTextFieldOne.getText());
        syllabus.setNineProgramTwo(nineProgramTextFieldTwo.getText());
        syllabus.setNineProgramThree(nineProgramTextFieldThree.getText());
        syllabus.setNineProgramFour(nineProgramTextFieldFour.getText());
        syllabus.setNineProgramFive(nineProgramTextFieldFive.getText());
        syllabus.setTenProgramZero(tenProgramTextFieldZero.getText());
        syllabus.setTenProgramOne(tenProgramTextFieldOne.getText());
        syllabus.setTenProgramTwo(tenProgramTextFieldTwo.getText());
        syllabus.setTenProgramThree(tenProgramTextFieldThree.getText());
        syllabus.setTenProgramFour(tenProgramTextFieldFour.getText());
        syllabus.setTenProgramFive(tenProgramTextFieldFive.getText());
        syllabus.setElevenProgramZero(elevenProgramTextFieldZero.getText());
        syllabus.setElevenProgramOne(elevenProgramTextFieldOne.getText());
        syllabus.setElevenProgramTwo(elevenProgramTextFieldTwo.getText());
        syllabus.setElevenProgramThree(elevenProgramTextFieldThree.getText());
        syllabus.setElevenProgramFour(elevenProgramTextFieldFour.getText());
        syllabus.setElevenProgramFive(elevenProgramTextFieldFive.getText());
        syllabus.setTwelveProgramZero(twelveProgramTextFieldZero.getText());
        syllabus.setTwelveProgramOne(twelveProgramTextFieldOne.getText());
        syllabus.setTwelveProgramTwo(twelveProgramTextFieldTwo.getText());
        syllabus.setTwelveProgramThree(twelveProgramTextFieldThree.getText());
        syllabus.setTwelveProgramFour(twelveProgramTextFieldFour.getText());
        syllabus.setTwelveProgramFive(twelveProgramTextFieldFive.getText());
        syllabus.setThirteenProgramZero(thirteenProgramTextFieldZero.getText());
        syllabus.setThirteenProgramOne(thirteenProgramTextFieldOne.getText());
        syllabus.setThirteenProgramTwo(thirteenProgramTextFieldTwo.getText());
        syllabus.setThirteenProgramThree(thirteenProgramTextFieldThree.getText());
        syllabus.setThirteenProgramFour(thirteenProgramTextFieldFour.getText());
        syllabus.setThirteenProgramFive(thirteenProgramTextFieldFive.getText());



    }

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
        Syllabus test = new Syllabus();
        setAssistantTextField(test);
        syllabusList.add(test);
        if (syllabusListView != null) {
            syllabusListO.add(test);
            syllabusListView.setItems(syllabusListO);
            System.out.println("Added");


        }
        else
            System.out.println("Null");
        saveSyllabusToFile();
        System.out.println(test.getCourseName());
    }


    @FXML
    public void saveTurkishSyllabus(ActionEvent event) throws IOException {
        Syllabus test = new Syllabus();
        setAssistantTextField(test);
       syllabusList.add(test);
        if (syllabusListView != null) {
            syllabusListO.add(test);
            syllabusListView.setItems(syllabusListO);
            System.out.println("Added to Turkish Syllabus");
        } else {
            System.out.println("Turkish Syllabus ListView is Null");
        }
        saveTurkishSyllabusToFile(); // New method for saving Turkish syllabus
        System.out.println(test.getCourseName());
    }



    public void getHelp(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("help.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 760, 750);
        stage.setTitle("Help");
        stage.setScene(scene);
        stage.show();
    }

    public void chooseLanguage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("add-new-syllabus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 781, 524);
        stage.setTitle("Language");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void saveSyllabusInfo(ActionEvent event) {
        String selectedLanguage = myChoiceBox.getValue();

        editorname = editorNameTextField.getText();
        description = editDescriptionTextArea.getText();
        date = editDateTextField.getText();
        time = editTimeTextField.getText();
        System.out.println(editorname);



        // Determine the FXML file based on the selected language
        String fxmlFileName = "";
        if ("Turkish".equals(selectedLanguage)) {
            fxmlFileName = "turkish-syllabus.fxml";
        } else if ("English".equals(selectedLanguage)) {
            fxmlFileName = "syllabus.fxml";
        }

        try {
            // Load the corresponding FXML file
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxmlFileName));
            Parent root = fxmlLoader.load();

            // Create a new stage
            Stage stage = new Stage();
            Scene scene = new Scene(root, 760, 750);

            // Set the scene to the stage
            stage.setScene(scene);
            stage.setTitle("Syllabus");
            stage.show();

            // Close the current stage
            Stage currentStage = (Stage) myChoiceBox.getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            // Handle the exception appropriately (e.g., log it, show an error message)
            e.printStackTrace();
        }
    }
    public void exportSyllabus(){
        //Add part
        Syllabus test = new Syllabus();
        setAssistantTextField(test);
        System.out.println(test.getCourseName());


        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter jsonFilter = new FileChooser.ExtensionFilter("JSON Files (*.json)", "*.json");
        fileChooser.getExtensionFilters().add(jsonFilter);
        File file = fileChooser.showSaveDialog(new Stage());
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        if (file != null) {
            ConvertToJSON.generateJsonFile(test,file);
        }
    }
    public void viewSyllabus() throws IOException {
        for (Syllabus syllabus : syllabusList) {
            System.out.println("Course Name: " + syllabus.getCourseName());
            // Add more code here to display or load other information as needed
        }
        if (currentSyllabus != null) {
            Syllabus tempSyllabus;
            tempSyllabus=currentSyllabus;
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("view-syllabus.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 760, 750);
            Controllers controller = fxmlLoader.getController();
            stage.setTitle("View Syllabus");

            {
                controller.courseNameText.setText(tempSyllabus.getCourseName());
                controller.codeTextField.setText(tempSyllabus.getCode());
                controller.fallTextField.setText(tempSyllabus.getFall());
                controller.springTextField.setText(tempSyllabus.getSpring());
                controller.theoryTextField.setText(tempSyllabus.getTheory());
                controller.labTextField.setText(tempSyllabus.getLab());
                controller.localCreditTextField.setText(tempSyllabus.getLocalCredit());
                controller.ectsTextField.setText(tempSyllabus.getEcts());
                controller.prerequisitesTextField.setText(tempSyllabus.getPrerequisites());
                controller.courseLanguageTextField.setText(tempSyllabus.getCourseLanguage());
                controller.courseTypeTextField.setText(tempSyllabus.getCourseType());
                controller.courseLevelTextField.setText(tempSyllabus.getCourseLevel());
                controller.teachingMethodsTextField.setText(tempSyllabus.getTeachingMethods());
                controller.courseCoordinatorTextField.setText(tempSyllabus.getCourseCoordinator());
                controller.courseCoordinatorTextField2.setText(tempSyllabus.getCourseCoordinator2());
                controller.assistantTextField.setText(tempSyllabus.getAssistant());
                controller.courseObjectivesTextField.setText(tempSyllabus.getCourseObjectives());
                controller.learningOutcomesTextField.setText(tempSyllabus.getLearningOutcomes());
                controller.courseDescriptionTextField.setText(tempSyllabus.getCourseDescription());


                //Since it is only for user to view and not to make changes, make the buttons uneditable
                controller.coreCourseCheck.setDisable(true);
                controller.majorCourseCheck.setDisable(true);
                controller.supportCourseCheck.setDisable(true);
                controller.comSkillsCourseCheck.setDisable(true);
                controller.transfSkillCourseCheck.setDisable(true);
                
                // Set the selected radio button based on the saved category
                switch (tempSyllabus.getCourseCategory()) {
                    case "Core Course":
                        controller.coreCourseCheck.setSelected(true);
                        break;
                    case "Major Area Course":
                        controller.majorCourseCheck.setSelected(true);
                        break;
                    case "Supportive Course":
                        controller.supportCourseCheck.setSelected(true);
                        break;
                    case "Communication and Management Skills Course":
                        controller.comSkillsCourseCheck.setSelected(true);
                        break;
                    case "Transferable Skills Course":
                        controller.transfSkillCourseCheck.setSelected(true);
                        break;

                }

                controller.subjectsTextFieldTwo.setText(tempSyllabus.getSubjectsTwo());
                controller.reqiredMaterialsTextFieldTwo.setText(tempSyllabus.getRequiredMaterialsTwo());
                controller.subjectsTextFieldThree.setText(tempSyllabus.getSubjectsThree());
                controller.reqiredMaterialsTextFieldThree.setText(tempSyllabus.getRequiredMaterialsThree());
                controller.subjectsTextFieldFour.setText(tempSyllabus.getSubjectsFour());
                controller.reqiredMaterialsTextFieldFour.setText(tempSyllabus.getRequiredMaterialsFour());
                controller.subjectsTextFieldFive.setText(tempSyllabus.getSubjectsFive());
                controller.reqiredMaterialsTextFieldFive.setText(tempSyllabus.getRequiredMaterialsFive());
                controller.subjectsTextFieldSix.setText(tempSyllabus.getSubjectsSix());
                controller.reqiredMaterialsTextFieldSix.setText(tempSyllabus.getRequiredMaterialsSix());
                controller.subjectsTextFieldSeven.setText(tempSyllabus.getSubjectsSeven());
                controller.reqiredMaterialsTextFieldSeven.setText(tempSyllabus.getRequiredMaterialsSeven());
                controller.subjectsTextFieldEight.setText(tempSyllabus.getSubjectsEight());
                controller.reqiredMaterialsTextFieldEight.setText(tempSyllabus.getRequiredMaterialsEight());
                controller.subjectsTextFieldNine.setText(tempSyllabus.getSubjectsNine());
                controller.reqiredMaterialsTextFieldNine.setText(tempSyllabus.getRequiredMaterialsNine());
                controller.subjectsTextFieldTen.setText(tempSyllabus.getSubjectsTen());
                controller.reqiredMaterialsTextFieldTen.setText(tempSyllabus.getRequiredMaterialsTen());
                controller.subjectsTextFieldEleven.setText(tempSyllabus.getSubjectsEleven());
                controller.reqiredMaterialsTextFieldEleven.setText(tempSyllabus.getRequiredMaterialsEleven());
                controller.subjectsTextFieldTwelve.setText(tempSyllabus.getSubjectsTwelve());
                controller.reqiredMaterialsTextFieldTwelve.setText(tempSyllabus.getRequiredMaterialsTwelve());
                controller.subjectsTextFieldThirteen.setText(tempSyllabus.getSubjectsThirteen());
                controller.reqiredMaterialsTextFieldThirteen.setText(tempSyllabus.getRequiredMaterialsThirteen());
                controller.subjectsTextFieldFourteen.setText(tempSyllabus.getSubjectsFourteen());
                controller.reqiredMaterialsTextFieldFourteen.setText(tempSyllabus.getRequiredMaterialsFourteen());
                controller.subjectsTextFieldFifteen.setText(tempSyllabus.getSubjectsFifteen());
                controller.reqiredMaterialsTextFieldFifteen.setText(tempSyllabus.getRequiredMaterialsFifteen());
                controller.subjectsTextFieldSixteen.setText(tempSyllabus.getSubjectsSixteen());
                controller.reqiredMaterialsTextFieldSixteen.setText(tempSyllabus.getRequiredMaterialsSixteen());
                controller.participationTextFieldOne.setText(tempSyllabus.getParticipationOne());
                controller.participationTextFieldTwo.setText(tempSyllabus.getParticipationTwo());
                controller.participationTextFieldThree.setText(tempSyllabus.getParticipationThree());
                controller.participationTextFieldFour.setText(tempSyllabus.getParticipationFour());
                controller.participationTextFieldFive.setText(tempSyllabus.getParticipationFive());
                controller.participationTextFieldSix.setText(tempSyllabus.getParticipationSix());
                controller.participationTextFieldSeven.setText(tempSyllabus.getParticipationSeven());
                controller.participationTextFieldEight.setText(tempSyllabus.getParticipationEight());
                controller.laboratoryTextFieldOne.setText(tempSyllabus.getLaboratoryOne());
                controller.laboratoryTextFieldTwo.setText(tempSyllabus.getLaboratoryTwo());
                controller.laboratoryTextFieldThree.setText(tempSyllabus.getLaboratoryThree());
                controller.laboratoryTextFieldFour.setText(tempSyllabus.getLaboratoryFour());
                controller.laboratoryTextFieldFive.setText(tempSyllabus.getLaboratoryFive());
                controller.laboratoryTextFieldSix.setText(tempSyllabus.getLaboratorySix());
                controller.laboratoryTextFieldSeven.setText(tempSyllabus.getLaboratorySeven());
                controller.laboratoryTextFieldEight.setText(tempSyllabus.getLaboratoryEight());
                controller.laboratoryTextFieldNine.setText(tempSyllabus.getLaboratoryNine());
                controller.fieldWorkTextFieldOne.setText(tempSyllabus.getFieldWorkOne());
                controller.fieldWorkTextFieldTwo.setText(tempSyllabus.getFieldWorkTwo());
                controller.fieldWorkTextFieldThree.setText(tempSyllabus.getFieldWorkThree());
                controller.fieldWorkTextFieldFour.setText(tempSyllabus.getFieldWorkFour());
                controller.fieldWorkTextFieldFive.setText(tempSyllabus.getFieldWorkFive());
                controller.fieldWorkTextFieldSix.setText(tempSyllabus.getFieldWorkSix());
                controller.fieldWorkTextFieldSeven.setText(tempSyllabus.getFieldWorkSeven());
                controller.fieldWorkTextFieldEight.setText(tempSyllabus.getFieldWorkEight());
                controller.fieldWorkTextFieldNine.setText(tempSyllabus.getFieldWorkNine());
                controller.quiz2TextFieldOne.setText(tempSyllabus.getQuiz2One());
                controller.quiz2TextFieldTwo.setText(tempSyllabus.getQuiz2Two());
                controller.quiz2TextFieldThree.setText(tempSyllabus.getQuiz2Three());
                controller.quizTextFieldFour.setText(tempSyllabus.getQuizFour());
                controller.quizTextFieldFive.setText(tempSyllabus.getQuizFive());
                controller.quizTextFieldSix.setText(tempSyllabus.getQuizSix());
                controller.quizTextFieldSeven.setText(tempSyllabus.getQuizSeven());
                controller.quizTextFieldEight.setText(tempSyllabus.getQuizEight());
                controller.quizTextFieldNine.setText(tempSyllabus.getQuizNine());
                controller.coursehourTextFieldOne.setText(tempSyllabus.getCourseHourOne());
                controller.coursehourTextFieldTwo.setText(tempSyllabus.getCourseHourTwo());
                controller.labhourTextFieldOne.setText(tempSyllabus.getLabhourOne());
                controller.labhourTextFieldTwo.setText(tempSyllabus.getLabhourTwo());
                controller.StudyhourTextFieldOne.setText(tempSyllabus.getStudyhourOne());
                controller.StudyhourTextFieldTwo.setText(tempSyllabus.getStudyhourTwo());
                controller.StudyhourTextFieldThree.setText(tempSyllabus.getStudyhourThree());
                controller.FieldworkTextFieldOne.setText(tempSyllabus.getFieldworkOne());
                controller.FieldworkTextFieldTwo.setText(tempSyllabus.getFieldworkTwo());
                controller.FieldworkTextFieldThree.setText(tempSyllabus.getFieldworkThree());
                controller.quizTextFieldOne.setText(tempSyllabus.getQuizOne());
                controller.quizTextFieldTwo.setText(tempSyllabus.getQuizTwo());
                controller.quizTextFieldThree.setText(tempSyllabus.getQuizThree());
                controller.homeworkTextFieldOne.setText(tempSyllabus.getHomeworkOne());
                controller.homeworkTextFieldTwo.setText(tempSyllabus.getHomeworkTwo());
                controller.homeworkTextFieldThree.setText(tempSyllabus.getHomeworkThree());
                controller.presentationTextFieldOne.setText(tempSyllabus.getPresentationOne());
                controller.presentationTextFieldTwo.setText(tempSyllabus.getPresentationTwo());
                controller.presentationTextFieldThree.setText(tempSyllabus.getPresentationThree());
                controller.projectTextFieldOne.setText(tempSyllabus.getProjectOne());
                controller.projectTextFieldTwo.setText(tempSyllabus.getProjectTwo());
                controller.projectTextFieldThree.setText(tempSyllabus.getProjectThree());
                controller.portfolioTextFieldOne.setText(tempSyllabus.getPortfolioOne());
                controller.portfolioTextFieldTwo.setText(tempSyllabus.getPortfolioTwo());
                controller.portfolioTextFieldThree.setText(tempSyllabus.getPortfolioThree());
                controller.seminarTextFieldOne.setText(tempSyllabus.getSeminarOne());
                controller.seminarTextFieldTwo.setText(tempSyllabus.getSeminarTwo());
                controller.seminarTextFieldThree.setText(tempSyllabus.getSeminarThree());
                controller.oralTextFieldOne.setText(tempSyllabus.getOralOne());
                controller.oralTextFieldTwo.setText(tempSyllabus.getOralTwo());
                controller.oralTextFieldThree.setText(tempSyllabus.getOralThree());
                controller.midtermTextFieldOne.setText(tempSyllabus.getMidtermOne());
                controller.midtermTextFieldTwo.setText(tempSyllabus.getMidtermTwo());
                controller.midtermTextFieldThree.setText(tempSyllabus.getMidtermThree());
                controller.finalTextFieldOne.setText(tempSyllabus.getFinalOne());
                controller.finalTextFieldTwo.setText(tempSyllabus.getFinalTwo());
                controller.finalTextFieldThree.setText(tempSyllabus.getFinalThree());
                controller.oneProgramTextFieldZero.setText(tempSyllabus.getOneProgramZero());
                controller.oneProgramTextFieldOne.setText(tempSyllabus.getOneProgramOne());
                controller.oneProgramTextFieldTwo.setText(tempSyllabus.getOneProgramTwo());
                controller.oneProgramTextFieldThree.setText(tempSyllabus.getOneProgramThree());
                controller.oneProgramTextFieldFour.setText(tempSyllabus.getOneProgramFour());
                controller.oneProgramTextFieldFive.setText(tempSyllabus.getOneProgramFive());
                controller.twoProgramTextFieldZero.setText(tempSyllabus.getTwoProgramZero());
                controller.twoProgramTextFieldOne.setText(tempSyllabus.getTwoProgramOne());
                controller.twoProgramTextFieldTwo.setText(tempSyllabus.getTwoProgramTwo());
                controller.twoProgramTextFieldThree.setText(tempSyllabus.getTwoProgramThree());
                controller.twoProgramTextFieldFour.setText(tempSyllabus.getTwoProgramFour());
                controller.twoProgramTextFieldFive.setText(tempSyllabus.getTwoProgramFive());
                controller.threeProgramTextFieldZero.setText(tempSyllabus.getThreeProgramZero());
                controller.threeProgramTextFieldOne.setText(tempSyllabus.getThreeProgramOne());
                controller.threeProgramTextFieldTwo.setText(tempSyllabus.getThreeProgramTwo());
                controller.threeProgramTextFieldThree.setText(tempSyllabus.getThreeProgramThree());
                controller.threeProgramTextFieldFour.setText(tempSyllabus.getThreeProgramFour());
                controller.threeProgramTextFieldFive.setText(tempSyllabus.getThreeProgramFive());
                controller.fourProgramTextFieldZero.setText(tempSyllabus.getFourProgramZero());
                controller.fourProgramTextFieldOne.setText(tempSyllabus.getFourProgramOne());
                controller.fourProgramTextFieldTwo.setText(tempSyllabus.getFourProgramTwo());
                controller.fourProgramTextFieldThree.setText(tempSyllabus.getFourProgramThree());
                controller.fourProgramTextFieldFour.setText(tempSyllabus.getFourProgramFour());
                controller.fourProgramTextFieldFive.setText(tempSyllabus.getFourProgramFive());
                controller.fiveProgramTextFieldZero.setText(tempSyllabus.getFiveProgramZero());
                controller.fiveProgramTextFieldOne.setText(tempSyllabus.getFiveProgramOne());
                controller.fiveProgramTextFieldTwo.setText(tempSyllabus.getFiveProgramTwo());
                controller.fiveProgramTextFieldThree.setText(tempSyllabus.getFiveProgramThree());
                controller.fiveProgramTextFieldFour.setText(tempSyllabus.getFiveProgramFour());
                controller.fiveProgramTextFieldFive.setText(tempSyllabus.getFiveProgramFive());
                controller.sixProgramTextFieldZero.setText(tempSyllabus.getSixProgramZero());
                controller.sixProgramTextFieldOne.setText(tempSyllabus.getSixProgramOne());
                controller.sixProgramTextFieldTwo.setText(tempSyllabus.getSixProgramTwo());
                controller.sixProgramTextFieldThree.setText(tempSyllabus.getSixProgramThree());
                controller.sixProgramTextFieldFour.setText(tempSyllabus.getSixProgramFour());
                controller.sixProgramTextFieldFive.setText(tempSyllabus.getSixProgramFive());
                controller.sevenProgramTextFieldZero.setText(tempSyllabus.getSevenProgramZero());
                controller.sevenProgramTextFieldOne.setText(tempSyllabus.getSevenProgramOne());
                controller.sevenProgramTextFieldTwo.setText(tempSyllabus.getSevenProgramTwo());
                controller.sevenProgramTextFieldThree.setText(tempSyllabus.getSevenProgramThree());
                controller.sevenProgramTextFieldFour.setText(tempSyllabus.getSevenProgramFour());
                controller.sevenProgramTextFieldFive.setText(tempSyllabus.getSevenProgramFive());
                controller.eightProgramTextFieldZero.setText(tempSyllabus.getEightProgramZero());
                controller.eightProgramTextFieldOne.setText(tempSyllabus.getEightProgramOne());
                controller.eightProgramTextFieldTwo.setText(tempSyllabus.getEightProgramTwo());
                controller.eightProgramTextFieldThree.setText(tempSyllabus.getEightProgramThree());
                controller.eightProgramTextFieldFour.setText(tempSyllabus.getEightProgramFour());
                controller.eightProgramTextFieldFive.setText(tempSyllabus.getEightProgramFive());
                controller.nineProgramTextFieldZero.setText(tempSyllabus.getNineProgramZero());
                controller.nineProgramTextFieldOne.setText(tempSyllabus.getNineProgramOne());
                controller.nineProgramTextFieldTwo.setText(tempSyllabus.getNineProgramTwo());
                controller.nineProgramTextFieldThree.setText(tempSyllabus.getNineProgramThree());
                controller.nineProgramTextFieldFour.setText(tempSyllabus.getNineProgramFour());
                controller.nineProgramTextFieldFive.setText(tempSyllabus.getNineProgramFive());
                controller.tenProgramTextFieldZero.setText(tempSyllabus.getTenProgramZero());
                controller.tenProgramTextFieldOne.setText(tempSyllabus.getTenProgramOne());
                controller.tenProgramTextFieldTwo.setText(tempSyllabus.getTenProgramTwo());
                controller.tenProgramTextFieldThree.setText(tempSyllabus.getTenProgramThree());
                controller.tenProgramTextFieldFour.setText(tempSyllabus.getTenProgramFour());
                controller.tenProgramTextFieldFive.setText(tempSyllabus.getTenProgramFive());
                controller.elevenProgramTextFieldZero.setText(tempSyllabus.getElevenProgramZero());
                controller.elevenProgramTextFieldOne.setText(tempSyllabus.getElevenProgramOne());
                controller.elevenProgramTextFieldTwo.setText(tempSyllabus.getElevenProgramTwo());
                controller.elevenProgramTextFieldThree.setText(tempSyllabus.getElevenProgramThree());
                controller.elevenProgramTextFieldFour.setText(tempSyllabus.getElevenProgramFour());
                controller.elevenProgramTextFieldFive.setText(tempSyllabus.getElevenProgramFive());
                controller.twelveProgramTextFieldZero.setText(tempSyllabus.getTwelveProgramZero());
                controller.twelveProgramTextFieldOne.setText(tempSyllabus.getTwelveProgramOne());
                controller.twelveProgramTextFieldTwo.setText(tempSyllabus.getTwelveProgramTwo());
                controller.twelveProgramTextFieldThree.setText(tempSyllabus.getTwelveProgramThree());
                controller.twelveProgramTextFieldFour.setText(tempSyllabus.getTwelveProgramFour());
                controller.twelveProgramTextFieldFive.setText(tempSyllabus.getTwelveProgramFive());
                controller.thirteenProgramTextFieldZero.setText(tempSyllabus.getThirteenProgramZero());
                controller.thirteenProgramTextFieldOne.setText(tempSyllabus.getThirteenProgramOne());
                controller.thirteenProgramTextFieldTwo.setText(tempSyllabus.getThirteenProgramTwo());
                controller.thirteenProgramTextFieldThree.setText(tempSyllabus.getThirteenProgramThree());
                controller.thirteenProgramTextFieldFour.setText(tempSyllabus.getThirteenProgramFour());
                controller.thirteenProgramTextFieldFive.setText(tempSyllabus.getThirteenProgramFive());
            }

            stage.setScene(scene);
            stage.show();
        } else {
            System.out.println("Please select a syllabus to view.");
        }
    }

    public void editSaveButton() throws IOException {
        System.out.println("Selected index for update: " + currentIndex);

        if (tempSyllabus != null && currentIndex >= 0) {
            tempSyllabus.setCourseName(courseNameText.getText());
            tempSyllabus.setCode(codeTextField.getText());
            tempSyllabus.setFall(fallTextField.getText());

            updateSyllabusList(currentIndex, tempSyllabus);
            saveSyllabusToFile();
        } else {
            System.out.println("No syllabus selected for editing or index is out of range");
        }
    }

    private void updateSyllabusList(int index, Syllabus updatedSyllabus) {
        if (index >= 0 && index < syllabusList.size()) {
            syllabusList.set(index, updatedSyllabus);

            syllabusListO.set(index, updatedSyllabus);

            if (syllabusListView != null) {
                syllabusListView.refresh();
            }
        } else {
            System.out.println("Index out of range: " + index);
        }
    }



    public void editSyllabus() throws IOException {

        tempSyllabus = currentSyllabus;
        System.out.println("In editSyllabus, tempSyllabus is set to: " + tempSyllabus);

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("edit-syllabus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 760, 750);
        this.controller = fxmlLoader.getController();
        Stage stage = new Stage();
        stage.setTitle("Edit Syllabus");


            controller.courseNameText.setText(tempSyllabus.getCourseName());
            controller.codeTextField.setText(tempSyllabus.getCode());
            controller.fallTextField.setText(tempSyllabus.getFall());
            controller.springTextField.setText(tempSyllabus.getSpring());
            controller.theoryTextField.setText(tempSyllabus.getTheory());
            controller.labTextField.setText(tempSyllabus.getLab());
            controller.localCreditTextField.setText(tempSyllabus.getLocalCredit());
            controller.ectsTextField.setText(tempSyllabus.getEcts());
            controller.prerequisitesTextField.setText(tempSyllabus.getPrerequisites());
            controller.courseLanguageTextField.setText(tempSyllabus.getCourseLanguage());
            controller.courseTypeTextField.setText(tempSyllabus.getCourseType());
            controller.courseLevelTextField.setText(tempSyllabus.getCourseLevel());
            controller.teachingMethodsTextField.setText(tempSyllabus.getTeachingMethods());
            controller.courseCoordinatorTextField.setText(tempSyllabus.getCourseCoordinator());
            controller.courseCoordinatorTextField2.setText(tempSyllabus.getCourseCoordinator2());
            controller.assistantTextField.setText(tempSyllabus.getAssistant());
            controller.courseObjectivesTextField.setText(tempSyllabus.getCourseObjectives());
            controller.learningOutcomesTextField.setText(tempSyllabus.getLearningOutcomes());
            controller.courseDescriptionTextField.setText(tempSyllabus.getCourseDescription());

        // Set the selected radio button based on the saved category
        switch (tempSyllabus.getCourseCategory()) {
            case "Core Course":
                controller.coreCourseCheck.setSelected(true);
                break;
            case "Major Area Course":
                controller.majorCourseCheck.setSelected(true);
                break;
            case "Supportive Course":
                controller.supportCourseCheck.setSelected(true);
                break;
            case "Communication and Management Skills Course":
                controller.comSkillsCourseCheck.setSelected(true);
                break;
            case "Transferable Skills Course":
                controller.transfSkillCourseCheck.setSelected(true);
                break;

        }

            controller.subjectsTextFieldTwo.setText(tempSyllabus.getSubjectsTwo());
            controller.reqiredMaterialsTextFieldTwo.setText(tempSyllabus.getRequiredMaterialsTwo());
            controller.subjectsTextFieldThree.setText(tempSyllabus.getSubjectsThree());
            controller.reqiredMaterialsTextFieldThree.setText(tempSyllabus.getRequiredMaterialsThree());
            controller.subjectsTextFieldFour.setText(tempSyllabus.getSubjectsFour());
            controller.reqiredMaterialsTextFieldFour.setText(tempSyllabus.getRequiredMaterialsFour());
            controller.subjectsTextFieldFive.setText(tempSyllabus.getSubjectsFive());
            controller.reqiredMaterialsTextFieldFive.setText(tempSyllabus.getRequiredMaterialsFive());
            controller.subjectsTextFieldSix.setText(tempSyllabus.getSubjectsSix());
            controller.reqiredMaterialsTextFieldSix.setText(tempSyllabus.getRequiredMaterialsSix());
            controller.subjectsTextFieldSeven.setText(tempSyllabus.getSubjectsSeven());
            controller.reqiredMaterialsTextFieldSeven.setText(tempSyllabus.getRequiredMaterialsSeven());
            controller.subjectsTextFieldEight.setText(tempSyllabus.getSubjectsEight());
            controller.reqiredMaterialsTextFieldEight.setText(tempSyllabus.getRequiredMaterialsEight());
            controller.subjectsTextFieldNine.setText(tempSyllabus.getSubjectsNine());
            controller.reqiredMaterialsTextFieldNine.setText(tempSyllabus.getRequiredMaterialsNine());
            controller.subjectsTextFieldTen.setText(tempSyllabus.getSubjectsTen());
            controller.reqiredMaterialsTextFieldTen.setText(tempSyllabus.getRequiredMaterialsTen());
            controller.subjectsTextFieldEleven.setText(tempSyllabus.getSubjectsEleven());
            controller.reqiredMaterialsTextFieldEleven.setText(tempSyllabus.getRequiredMaterialsEleven());
            controller.subjectsTextFieldTwelve.setText(tempSyllabus.getSubjectsTwelve());
            controller.reqiredMaterialsTextFieldTwelve.setText(tempSyllabus.getRequiredMaterialsTwelve());
            controller.subjectsTextFieldThirteen.setText(tempSyllabus.getSubjectsThirteen());
            controller.reqiredMaterialsTextFieldThirteen.setText(tempSyllabus.getRequiredMaterialsThirteen());
            controller.subjectsTextFieldFourteen.setText(tempSyllabus.getSubjectsFourteen());
            controller.reqiredMaterialsTextFieldFourteen.setText(tempSyllabus.getRequiredMaterialsFourteen());
            controller.subjectsTextFieldFifteen.setText(tempSyllabus.getSubjectsFifteen());
            controller.reqiredMaterialsTextFieldFifteen.setText(tempSyllabus.getRequiredMaterialsFifteen());
            controller.subjectsTextFieldSixteen.setText(tempSyllabus.getSubjectsSixteen());
            controller.reqiredMaterialsTextFieldSixteen.setText(tempSyllabus.getRequiredMaterialsSixteen());
            controller.participationTextFieldOne.setText(tempSyllabus.getParticipationOne());
            controller.participationTextFieldTwo.setText(tempSyllabus.getParticipationTwo());
            controller.participationTextFieldThree.setText(tempSyllabus.getParticipationThree());
            controller.participationTextFieldFour.setText(tempSyllabus.getParticipationFour());
            controller.participationTextFieldFive.setText(tempSyllabus.getParticipationFive());
            controller.participationTextFieldSix.setText(tempSyllabus.getParticipationSix());
            controller.participationTextFieldSeven.setText(tempSyllabus.getParticipationSeven());
            controller.participationTextFieldEight.setText(tempSyllabus.getParticipationEight());
            controller.laboratoryTextFieldOne.setText(tempSyllabus.getLaboratoryOne());
            controller.laboratoryTextFieldTwo.setText(tempSyllabus.getLaboratoryTwo());
            controller.laboratoryTextFieldThree.setText(tempSyllabus.getLaboratoryThree());
            controller.laboratoryTextFieldFour.setText(tempSyllabus.getLaboratoryFour());
            controller.laboratoryTextFieldFive.setText(tempSyllabus.getLaboratoryFive());
            controller.laboratoryTextFieldSix.setText(tempSyllabus.getLaboratorySix());
            controller.laboratoryTextFieldSeven.setText(tempSyllabus.getLaboratorySeven());
            controller.laboratoryTextFieldEight.setText(tempSyllabus.getLaboratoryEight());
            controller.laboratoryTextFieldNine.setText(tempSyllabus.getLaboratoryNine());
            controller.fieldWorkTextFieldOne.setText(tempSyllabus.getFieldWorkOne());
            controller.fieldWorkTextFieldTwo.setText(tempSyllabus.getFieldWorkTwo());
            controller.fieldWorkTextFieldThree.setText(tempSyllabus.getFieldWorkThree());
            controller.fieldWorkTextFieldFour.setText(tempSyllabus.getFieldWorkFour());
            controller.fieldWorkTextFieldFive.setText(tempSyllabus.getFieldWorkFive());
            controller.fieldWorkTextFieldSix.setText(tempSyllabus.getFieldWorkSix());
            controller.fieldWorkTextFieldSeven.setText(tempSyllabus.getFieldWorkSeven());
            controller.fieldWorkTextFieldEight.setText(tempSyllabus.getFieldWorkEight());
            controller.fieldWorkTextFieldNine.setText(tempSyllabus.getFieldWorkNine());
            controller.quiz2TextFieldOne.setText(tempSyllabus.getQuiz2One());
            controller.quiz2TextFieldTwo.setText(tempSyllabus.getQuiz2Two());
            controller.quiz2TextFieldThree.setText(tempSyllabus.getQuiz2Three());
            controller.quizTextFieldFour.setText(tempSyllabus.getQuizFour());
            controller.quizTextFieldFive.setText(tempSyllabus.getQuizFive());
            controller.quizTextFieldSix.setText(tempSyllabus.getQuizSix());
            controller.quizTextFieldSeven.setText(tempSyllabus.getQuizSeven());
            controller.quizTextFieldEight.setText(tempSyllabus.getQuizEight());
            controller.quizTextFieldNine.setText(tempSyllabus.getQuizNine());
            controller.coursehourTextFieldOne.setText(tempSyllabus.getCourseHourOne());
            controller.coursehourTextFieldTwo.setText(tempSyllabus.getCourseHourTwo());
            controller.labhourTextFieldOne.setText(tempSyllabus.getLabhourOne());
            controller.labhourTextFieldTwo.setText(tempSyllabus.getLabhourTwo());
            controller.StudyhourTextFieldOne.setText(tempSyllabus.getStudyhourOne());
            controller.StudyhourTextFieldTwo.setText(tempSyllabus.getStudyhourTwo());
            controller.StudyhourTextFieldThree.setText(tempSyllabus.getStudyhourThree());
            controller.FieldworkTextFieldOne.setText(tempSyllabus.getFieldworkOne());
            controller.FieldworkTextFieldTwo.setText(tempSyllabus.getFieldworkTwo());
            controller.FieldworkTextFieldThree.setText(tempSyllabus.getFieldworkThree());
            controller.quizTextFieldOne.setText(tempSyllabus.getQuizOne());
            controller.quizTextFieldTwo.setText(tempSyllabus.getQuizTwo());
            controller.quizTextFieldThree.setText(tempSyllabus.getQuizThree());
            controller.homeworkTextFieldOne.setText(tempSyllabus.getHomeworkOne());
            controller.homeworkTextFieldTwo.setText(tempSyllabus.getHomeworkTwo());
            controller.homeworkTextFieldThree.setText(tempSyllabus.getHomeworkThree());
            controller.presentationTextFieldOne.setText(tempSyllabus.getPresentationOne());
            controller.presentationTextFieldTwo.setText(tempSyllabus.getPresentationTwo());
            controller.presentationTextFieldThree.setText(tempSyllabus.getPresentationThree());
            controller.projectTextFieldOne.setText(tempSyllabus.getProjectOne());
            controller.projectTextFieldTwo.setText(tempSyllabus.getProjectTwo());
            controller.projectTextFieldThree.setText(tempSyllabus.getProjectThree());
            controller.portfolioTextFieldOne.setText(tempSyllabus.getPortfolioOne());
            controller.portfolioTextFieldTwo.setText(tempSyllabus.getPortfolioTwo());
            controller.portfolioTextFieldThree.setText(tempSyllabus.getPortfolioThree());
            controller.seminarTextFieldOne.setText(tempSyllabus.getSeminarOne());
            controller.seminarTextFieldTwo.setText(tempSyllabus.getSeminarTwo());
            controller.seminarTextFieldThree.setText(tempSyllabus.getSeminarThree());
            controller.oralTextFieldOne.setText(tempSyllabus.getOralOne());
            controller.oralTextFieldTwo.setText(tempSyllabus.getOralTwo());
            controller.oralTextFieldThree.setText(tempSyllabus.getOralThree());
            controller.midtermTextFieldOne.setText(tempSyllabus.getMidtermOne());
            controller.midtermTextFieldTwo.setText(tempSyllabus.getMidtermTwo());
            controller.midtermTextFieldThree.setText(tempSyllabus.getMidtermThree());
            controller.finalTextFieldOne.setText(tempSyllabus.getFinalOne());
            controller.finalTextFieldTwo.setText(tempSyllabus.getFinalTwo());
            controller.finalTextFieldThree.setText(tempSyllabus.getFinalThree());
            controller.oneProgramTextFieldZero.setText(tempSyllabus.getOneProgramZero());
            controller.oneProgramTextFieldOne.setText(tempSyllabus.getOneProgramOne());
            controller.oneProgramTextFieldTwo.setText(tempSyllabus.getOneProgramTwo());
            controller.oneProgramTextFieldThree.setText(tempSyllabus.getOneProgramThree());
            controller.oneProgramTextFieldFour.setText(tempSyllabus.getOneProgramFour());
            controller.oneProgramTextFieldFive.setText(tempSyllabus.getOneProgramFive());
            controller.twoProgramTextFieldZero.setText(tempSyllabus.getTwoProgramZero());
            controller.twoProgramTextFieldOne.setText(tempSyllabus.getTwoProgramOne());
            controller.twoProgramTextFieldTwo.setText(tempSyllabus.getTwoProgramTwo());
            controller.twoProgramTextFieldThree.setText(tempSyllabus.getTwoProgramThree());
            controller.twoProgramTextFieldFour.setText(tempSyllabus.getTwoProgramFour());
            controller.twoProgramTextFieldFive.setText(tempSyllabus.getTwoProgramFive());
            controller.threeProgramTextFieldZero.setText(tempSyllabus.getThreeProgramZero());
            controller.threeProgramTextFieldOne.setText(tempSyllabus.getThreeProgramOne());
            controller.threeProgramTextFieldTwo.setText(tempSyllabus.getThreeProgramTwo());
            controller.threeProgramTextFieldThree.setText(tempSyllabus.getThreeProgramThree());
            controller.threeProgramTextFieldFour.setText(tempSyllabus.getThreeProgramFour());
            controller.threeProgramTextFieldFive.setText(tempSyllabus.getThreeProgramFive());
            controller.fourProgramTextFieldZero.setText(tempSyllabus.getFourProgramZero());
            controller.fourProgramTextFieldOne.setText(tempSyllabus.getFourProgramOne());
            controller.fourProgramTextFieldTwo.setText(tempSyllabus.getFourProgramTwo());
            controller.fourProgramTextFieldThree.setText(tempSyllabus.getFourProgramThree());
            controller.fourProgramTextFieldFour.setText(tempSyllabus.getFourProgramFour());
            controller.fourProgramTextFieldFive.setText(tempSyllabus.getFourProgramFive());
            controller.fiveProgramTextFieldZero.setText(tempSyllabus.getFiveProgramZero());
            controller.fiveProgramTextFieldOne.setText(tempSyllabus.getFiveProgramOne());
            controller.fiveProgramTextFieldTwo.setText(tempSyllabus.getFiveProgramTwo());
            controller.fiveProgramTextFieldThree.setText(tempSyllabus.getFiveProgramThree());
            controller.fiveProgramTextFieldFour.setText(tempSyllabus.getFiveProgramFour());
            controller.fiveProgramTextFieldFive.setText(tempSyllabus.getFiveProgramFive());
            controller.sixProgramTextFieldZero.setText(tempSyllabus.getSixProgramZero());
            controller.sixProgramTextFieldOne.setText(tempSyllabus.getSixProgramOne());
            controller.sixProgramTextFieldTwo.setText(tempSyllabus.getSixProgramTwo());
            controller.sixProgramTextFieldThree.setText(tempSyllabus.getSixProgramThree());
            controller.sixProgramTextFieldFour.setText(tempSyllabus.getSixProgramFour());
            controller.sixProgramTextFieldFive.setText(tempSyllabus.getSixProgramFive());
            controller.sevenProgramTextFieldZero.setText(tempSyllabus.getSevenProgramZero());
            controller.sevenProgramTextFieldOne.setText(tempSyllabus.getSevenProgramOne());
            controller.sevenProgramTextFieldTwo.setText(tempSyllabus.getSevenProgramTwo());
            controller.sevenProgramTextFieldThree.setText(tempSyllabus.getSevenProgramThree());
            controller.sevenProgramTextFieldFour.setText(tempSyllabus.getSevenProgramFour());
            controller.sevenProgramTextFieldFive.setText(tempSyllabus.getSevenProgramFive());
            controller.eightProgramTextFieldZero.setText(tempSyllabus.getEightProgramZero());
            controller.eightProgramTextFieldOne.setText(tempSyllabus.getEightProgramOne());
            controller.eightProgramTextFieldTwo.setText(tempSyllabus.getEightProgramTwo());
            controller.eightProgramTextFieldThree.setText(tempSyllabus.getEightProgramThree());
            controller.eightProgramTextFieldFour.setText(tempSyllabus.getEightProgramFour());
            controller.eightProgramTextFieldFive.setText(tempSyllabus.getEightProgramFive());
            controller.nineProgramTextFieldZero.setText(tempSyllabus.getNineProgramZero());
            controller.nineProgramTextFieldOne.setText(tempSyllabus.getNineProgramOne());
            controller.nineProgramTextFieldTwo.setText(tempSyllabus.getNineProgramTwo());
            controller.nineProgramTextFieldThree.setText(tempSyllabus.getNineProgramThree());
            controller.nineProgramTextFieldFour.setText(tempSyllabus.getNineProgramFour());
            controller.nineProgramTextFieldFive.setText(tempSyllabus.getNineProgramFive());
            controller.tenProgramTextFieldZero.setText(tempSyllabus.getTenProgramZero());
            controller.tenProgramTextFieldOne.setText(tempSyllabus.getTenProgramOne());
            controller.tenProgramTextFieldTwo.setText(tempSyllabus.getTenProgramTwo());
            controller.tenProgramTextFieldThree.setText(tempSyllabus.getTenProgramThree());
            controller.tenProgramTextFieldFour.setText(tempSyllabus.getTenProgramFour());
            controller.tenProgramTextFieldFive.setText(tempSyllabus.getTenProgramFive());
            controller.elevenProgramTextFieldZero.setText(tempSyllabus.getElevenProgramZero());
            controller.elevenProgramTextFieldOne.setText(tempSyllabus.getElevenProgramOne());
            controller.elevenProgramTextFieldTwo.setText(tempSyllabus.getElevenProgramTwo());
            controller.elevenProgramTextFieldThree.setText(tempSyllabus.getElevenProgramThree());
            controller.elevenProgramTextFieldFour.setText(tempSyllabus.getElevenProgramFour());
            controller.elevenProgramTextFieldFive.setText(tempSyllabus.getElevenProgramFive());
            controller.twelveProgramTextFieldZero.setText(tempSyllabus.getTwelveProgramZero());
            controller.twelveProgramTextFieldOne.setText(tempSyllabus.getTwelveProgramOne());
            controller.twelveProgramTextFieldTwo.setText(tempSyllabus.getTwelveProgramTwo());
            controller.twelveProgramTextFieldThree.setText(tempSyllabus.getTwelveProgramThree());
            controller.twelveProgramTextFieldFour.setText(tempSyllabus.getTwelveProgramFour());
            controller.twelveProgramTextFieldFive.setText(tempSyllabus.getTwelveProgramFive());
            controller.thirteenProgramTextFieldZero.setText(tempSyllabus.getThirteenProgramZero());
            controller.thirteenProgramTextFieldOne.setText(tempSyllabus.getThirteenProgramOne());
            controller.thirteenProgramTextFieldTwo.setText(tempSyllabus.getThirteenProgramTwo());
            controller.thirteenProgramTextFieldThree.setText(tempSyllabus.getThirteenProgramThree());
            controller.thirteenProgramTextFieldFour.setText(tempSyllabus.getThirteenProgramFour());
            controller.thirteenProgramTextFieldFive.setText(tempSyllabus.getThirteenProgramFive());


        System.out.println(currentIndex);

        stage.setScene(scene);
        stage.show();

    }

    public void compareSyllabus() throws IOException {
        if (currentSyllabus != null && currentSyllabus2 != null) {
            showSyllabusDetails();
        } else {
            System.out.println("Please select two syllabus to compare.");
        }
    }
    private void showSyllabusDetails() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("compare-syllabus.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 760, 750);
        Controllers controller = fxmlLoader.getController();
        stage.setTitle("Compare Syllabuses");
        fillSyllabusDetails(controller);
        stage.setScene(scene);
        stage.show();
    }
    private void fillSyllabusDetails(Controllers controller) {
        compareAndSetTextField(controller.courseNameText, currentSyllabus.getCourseName(), currentSyllabus2.getCourseName());
        compareAndSetTextField(controller.codeTextField, currentSyllabus.getCode(), currentSyllabus2.getCode());
        compareAndSetTextField(controller.fallTextField, currentSyllabus.getFall(), currentSyllabus2.getFall());
        compareAndSetTextField(controller.springTextField, currentSyllabus.getSpring(), currentSyllabus2.getSpring());
        compareAndSetTextField(controller.theoryTextField, currentSyllabus.getTheory(), currentSyllabus2.getTheory());
        compareAndSetTextField(controller.labTextField, currentSyllabus.getLab(), currentSyllabus2.getLab());
        compareAndSetTextField(controller.localCreditTextField, currentSyllabus.getLocalCredit(), currentSyllabus2.getLocalCredit());
        compareAndSetTextField(controller.ectsTextField, currentSyllabus.getEcts(), currentSyllabus2.getEcts());
        compareAndSetTextField(controller.prerequisitesTextField, currentSyllabus.getPrerequisites(), currentSyllabus2.getPrerequisites());
        compareAndSetTextField(controller.courseLanguageTextField, currentSyllabus.getCourseLanguage(), currentSyllabus2.getCourseLanguage());
        compareAndSetTextField(controller.courseTypeTextField, currentSyllabus.getCourseType(), currentSyllabus2.getCourseType());
        compareAndSetTextField(controller.courseLevelTextField, currentSyllabus.getCourseLevel(), currentSyllabus2.getCourseLevel());
        compareAndSetTextField(controller.teachingMethodsTextField, currentSyllabus.getTeachingMethods(), currentSyllabus2.getTeachingMethods());
        compareAndSetTextField(controller.courseCoordinatorTextField, currentSyllabus.getCourseCoordinator(), currentSyllabus2.getCourseCoordinator());
        compareAndSetTextField(controller.courseCoordinatorTextField2, currentSyllabus.getCourseCoordinator2(), currentSyllabus2.getCourseCoordinator2());
        compareAndSetTextField(controller.assistantTextField, currentSyllabus.getAssistant(), currentSyllabus2.getAssistant());
        compareAndSetTextField(controller.courseObjectivesTextField, currentSyllabus.getCourseObjectives(), currentSyllabus2.getCourseObjectives());
        compareAndSetTextField(controller.learningOutcomesTextField, currentSyllabus.getLearningOutcomes(), currentSyllabus2.getLearningOutcomes());
        compareAndSetTextField(controller.courseDescriptionTextField, currentSyllabus.getCourseDescription(), currentSyllabus2.getCourseDescription());
        compareAndSetTextField(controller.subjectsTextFieldTwo, currentSyllabus.getSubjectsTwo(), currentSyllabus2.getSubjectsTwo());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldTwo, currentSyllabus.getRequiredMaterialsTwo(), currentSyllabus2.getRequiredMaterialsTwo());
        compareAndSetTextField(controller.subjectsTextFieldThree, currentSyllabus.getSubjectsThree(), currentSyllabus2.getSubjectsThree());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldThree, currentSyllabus.getRequiredMaterialsThree(), currentSyllabus2.getRequiredMaterialsThree());
        compareAndSetTextField(controller.subjectsTextFieldFour, currentSyllabus.getSubjectsFour(), currentSyllabus2.getSubjectsFour());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldFour, currentSyllabus.getRequiredMaterialsFour(), currentSyllabus2.getRequiredMaterialsFour());
        compareAndSetTextField(controller.subjectsTextFieldFive, currentSyllabus.getSubjectsFive(), currentSyllabus2.getSubjectsFive());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldFive, currentSyllabus.getRequiredMaterialsFive(), currentSyllabus2.getRequiredMaterialsFive());
        compareAndSetTextField(controller.subjectsTextFieldSix, currentSyllabus.getSubjectsSix(), currentSyllabus2.getSubjectsSix());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldSix, currentSyllabus.getRequiredMaterialsSix(), currentSyllabus2.getRequiredMaterialsSix());
        compareAndSetTextField(controller.subjectsTextFieldSeven, currentSyllabus.getSubjectsSeven(), currentSyllabus2.getSubjectsSeven());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldSeven, currentSyllabus.getRequiredMaterialsSeven(), currentSyllabus2.getRequiredMaterialsSeven());
        compareAndSetTextField(controller.subjectsTextFieldEight, currentSyllabus.getSubjectsEight(), currentSyllabus2.getSubjectsEight());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldEight, currentSyllabus.getRequiredMaterialsEight(), currentSyllabus2.getRequiredMaterialsEight());
        compareAndSetTextField(controller.subjectsTextFieldNine, currentSyllabus.getSubjectsNine(), currentSyllabus2.getSubjectsNine());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldNine, currentSyllabus.getRequiredMaterialsNine(), currentSyllabus2.getRequiredMaterialsNine());
        compareAndSetTextField(controller.subjectsTextFieldTen, currentSyllabus.getSubjectsTen(), currentSyllabus2.getSubjectsTen());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldTen, currentSyllabus.getRequiredMaterialsTen(), currentSyllabus2.getRequiredMaterialsTen());
        compareAndSetTextField(controller.subjectsTextFieldEleven, currentSyllabus.getSubjectsEleven(), currentSyllabus2.getSubjectsEleven());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldEleven, currentSyllabus.getRequiredMaterialsEleven(), currentSyllabus2.getRequiredMaterialsEleven());
        compareAndSetTextField(controller.subjectsTextFieldTwelve, currentSyllabus.getSubjectsTwelve(), currentSyllabus2.getSubjectsTwelve());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldTwelve, currentSyllabus.getRequiredMaterialsTwelve(), currentSyllabus2.getRequiredMaterialsTwelve());
        compareAndSetTextField(controller.subjectsTextFieldThirteen, currentSyllabus.getSubjectsThirteen(), currentSyllabus2.getSubjectsThirteen());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldThirteen, currentSyllabus.getRequiredMaterialsThirteen(), currentSyllabus2.getRequiredMaterialsThirteen());
        compareAndSetTextField(controller.subjectsTextFieldFourteen, currentSyllabus.getSubjectsFourteen(), currentSyllabus2.getSubjectsFourteen());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldFourteen, currentSyllabus.getRequiredMaterialsFourteen(), currentSyllabus2.getRequiredMaterialsFourteen());
        compareAndSetTextField(controller.subjectsTextFieldFifteen, currentSyllabus.getSubjectsFifteen(), currentSyllabus2.getSubjectsFifteen());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldFifteen, currentSyllabus.getRequiredMaterialsFifteen(), currentSyllabus2.getRequiredMaterialsFifteen());
        compareAndSetTextField(controller.subjectsTextFieldSixteen, currentSyllabus.getSubjectsSixteen(), currentSyllabus2.getSubjectsSixteen());
        compareAndSetTextField(controller.reqiredMaterialsTextFieldSixteen, currentSyllabus.getRequiredMaterialsSixteen(), currentSyllabus2.getRequiredMaterialsSixteen());
        compareAndSetTextField(controller.participationTextFieldOne, currentSyllabus.getParticipationOne(), currentSyllabus2.getParticipationOne());
        compareAndSetTextField(controller.participationTextFieldTwo, currentSyllabus.getParticipationTwo(), currentSyllabus2.getParticipationTwo());
        compareAndSetTextField(controller.participationTextFieldThree, currentSyllabus.getParticipationThree(), currentSyllabus2.getParticipationThree());
        compareAndSetTextField(controller.participationTextFieldFour, currentSyllabus.getParticipationFour(), currentSyllabus2.getParticipationFour());
        compareAndSetTextField(controller.participationTextFieldFive, currentSyllabus.getParticipationFive(), currentSyllabus2.getParticipationFive());
        compareAndSetTextField(controller.participationTextFieldSix, currentSyllabus.getParticipationSix(), currentSyllabus2.getParticipationSix());
        compareAndSetTextField(controller.participationTextFieldSeven, currentSyllabus.getParticipationSeven(), currentSyllabus2.getParticipationSeven());
        compareAndSetTextField(controller.participationTextFieldEight, currentSyllabus.getParticipationEight(), currentSyllabus2.getParticipationEight());
        compareAndSetTextField(controller.laboratoryTextFieldOne, currentSyllabus.getLaboratoryOne(), currentSyllabus2.getLaboratoryOne());
        compareAndSetTextField(controller.laboratoryTextFieldTwo, currentSyllabus.getLaboratoryTwo(), currentSyllabus2.getLaboratoryTwo());
        compareAndSetTextField(controller.laboratoryTextFieldThree, currentSyllabus.getLaboratoryThree(), currentSyllabus2.getLaboratoryThree());
        compareAndSetTextField(controller.laboratoryTextFieldFour, currentSyllabus.getLaboratoryFour(), currentSyllabus2.getLaboratoryFour());
        compareAndSetTextField(controller.laboratoryTextFieldFive, currentSyllabus.getLaboratoryFive(), currentSyllabus2.getLaboratoryFive());
        compareAndSetTextField(controller.laboratoryTextFieldSix, currentSyllabus.getLaboratorySix(), currentSyllabus2.getLaboratorySix());
        compareAndSetTextField(controller.laboratoryTextFieldSeven, currentSyllabus.getLaboratorySeven(), currentSyllabus2.getLaboratorySeven());
        compareAndSetTextField(controller.laboratoryTextFieldEight, currentSyllabus.getLaboratoryEight(), currentSyllabus2.getLaboratoryEight());
        compareAndSetTextField(controller.laboratoryTextFieldNine, currentSyllabus.getLaboratoryNine(), currentSyllabus2.getLaboratoryNine());
        compareAndSetTextField(controller.fieldWorkTextFieldOne, currentSyllabus.getFieldWorkOne(), currentSyllabus2.getFieldWorkOne());
        compareAndSetTextField(controller.fieldWorkTextFieldTwo, currentSyllabus.getFieldWorkTwo(), currentSyllabus2.getFieldWorkTwo());
        compareAndSetTextField(controller.fieldWorkTextFieldThree, currentSyllabus.getFieldWorkThree(), currentSyllabus2.getFieldWorkThree());
        compareAndSetTextField(controller.fieldWorkTextFieldFour, currentSyllabus.getFieldWorkFour(), currentSyllabus2.getFieldWorkFour());
        compareAndSetTextField(controller.fieldWorkTextFieldFive, currentSyllabus.getFieldWorkFive(), currentSyllabus2.getFieldWorkFive());
        compareAndSetTextField(controller.fieldWorkTextFieldSix, currentSyllabus.getFieldWorkSix(), currentSyllabus2.getFieldWorkSix());
        compareAndSetTextField(controller.fieldWorkTextFieldSeven, currentSyllabus.getFieldWorkSeven(), currentSyllabus2.getFieldWorkSeven());
        compareAndSetTextField(controller.fieldWorkTextFieldEight, currentSyllabus.getFieldWorkEight(), currentSyllabus2.getFieldWorkEight());
        compareAndSetTextField(controller.fieldWorkTextFieldNine, currentSyllabus.getFieldWorkNine(), currentSyllabus2.getFieldWorkNine());
        compareAndSetTextField(controller.quiz2TextFieldOne, currentSyllabus.getQuiz2One(), currentSyllabus2.getQuiz2One());
        compareAndSetTextField(controller.quiz2TextFieldTwo, currentSyllabus.getQuiz2Two(), currentSyllabus2.getQuiz2Two());
        compareAndSetTextField(controller.quiz2TextFieldThree, currentSyllabus.getQuiz2Three(), currentSyllabus2.getQuiz2Three());
        compareAndSetTextField(controller.quizTextFieldFour, currentSyllabus.getQuizFour(), currentSyllabus2.getQuizFour());
        compareAndSetTextField(controller.quizTextFieldFive, currentSyllabus.getQuizFive(), currentSyllabus2.getQuizFive());
        compareAndSetTextField(controller.quizTextFieldSix, currentSyllabus.getQuizSix(), currentSyllabus2.getQuizSix());
        compareAndSetTextField(controller.quizTextFieldSeven, currentSyllabus.getQuizSeven(), currentSyllabus2.getQuizSeven());
        compareAndSetTextField(controller.quizTextFieldEight, currentSyllabus.getQuizEight(), currentSyllabus2.getQuizEight());
        compareAndSetTextField(controller.quizTextFieldNine, currentSyllabus.getQuizNine(), currentSyllabus2.getQuizNine());
        compareAndSetTextField(controller.coursehourTextFieldOne, currentSyllabus.getCourseHourOne(), currentSyllabus2.getCourseHourOne());
        compareAndSetTextField(controller.coursehourTextFieldTwo, currentSyllabus.getCourseHourTwo(), currentSyllabus2.getCourseHourTwo());
        compareAndSetTextField(controller.labhourTextFieldOne, currentSyllabus.getLabhourOne(), currentSyllabus2.getLabhourOne());
        compareAndSetTextField(controller.labhourTextFieldTwo, currentSyllabus.getLabhourTwo(), currentSyllabus2.getLabhourTwo());
        compareAndSetTextField(controller.StudyhourTextFieldOne, currentSyllabus.getStudyhourOne(), currentSyllabus2.getStudyhourOne());
        compareAndSetTextField(controller.StudyhourTextFieldTwo, currentSyllabus.getStudyhourTwo(), currentSyllabus2.getStudyhourTwo());
        compareAndSetTextField(controller.StudyhourTextFieldThree, currentSyllabus.getStudyhourThree(), currentSyllabus2.getStudyhourThree());
        compareAndSetTextField(controller.FieldworkTextFieldOne, currentSyllabus.getFieldworkOne(), currentSyllabus2.getFieldworkOne());
        compareAndSetTextField(controller.FieldworkTextFieldTwo, currentSyllabus.getFieldworkTwo(), currentSyllabus2.getFieldworkTwo());
        compareAndSetTextField(controller.FieldworkTextFieldThree, currentSyllabus.getFieldworkThree(), currentSyllabus2.getFieldworkThree());
        compareAndSetTextField(controller.quizTextFieldOne, currentSyllabus.getQuizOne(), currentSyllabus2.getQuizOne());
        compareAndSetTextField(controller.quizTextFieldTwo, currentSyllabus.getQuizTwo(), currentSyllabus2.getQuizTwo());
        compareAndSetTextField(controller.quizTextFieldThree, currentSyllabus.getQuizThree(), currentSyllabus2.getQuizThree());
        compareAndSetTextField(controller.homeworkTextFieldOne, currentSyllabus.getHomeworkOne(), currentSyllabus2.getHomeworkOne());
        compareAndSetTextField(controller.homeworkTextFieldTwo, currentSyllabus.getHomeworkTwo(), currentSyllabus2.getHomeworkTwo());
        compareAndSetTextField(controller.homeworkTextFieldThree, currentSyllabus.getHomeworkThree(), currentSyllabus2.getHomeworkThree());
        compareAndSetTextField(controller.presentationTextFieldOne, currentSyllabus.getPresentationOne(), currentSyllabus2.getPresentationOne());
        compareAndSetTextField(controller.presentationTextFieldTwo, currentSyllabus.getPresentationTwo(), currentSyllabus2.getPresentationTwo());
        compareAndSetTextField(controller.presentationTextFieldThree, currentSyllabus.getPresentationThree(), currentSyllabus2.getPresentationThree());
        compareAndSetTextField(controller.projectTextFieldOne, currentSyllabus.getProjectOne(), currentSyllabus2.getProjectOne());
        compareAndSetTextField(controller.projectTextFieldTwo, currentSyllabus.getProjectTwo(), currentSyllabus2.getProjectTwo());
        compareAndSetTextField(controller.projectTextFieldThree, currentSyllabus.getProjectThree(), currentSyllabus2.getProjectThree());
        compareAndSetTextField(controller.portfolioTextFieldOne, currentSyllabus.getPortfolioOne(), currentSyllabus2.getPortfolioOne());
        compareAndSetTextField(controller.portfolioTextFieldTwo, currentSyllabus.getPortfolioTwo(), currentSyllabus2.getPortfolioTwo());
        compareAndSetTextField(controller.portfolioTextFieldThree, currentSyllabus.getPortfolioThree(), currentSyllabus2.getPortfolioThree());
        compareAndSetTextField(controller.seminarTextFieldOne, currentSyllabus.getSeminarOne(), currentSyllabus2.getSeminarOne());
        compareAndSetTextField(controller.seminarTextFieldTwo, currentSyllabus.getSeminarTwo(), currentSyllabus2.getSeminarTwo());
        compareAndSetTextField(controller.seminarTextFieldThree, currentSyllabus.getSeminarThree(), currentSyllabus2.getSeminarThree());
        compareAndSetTextField(controller.oralTextFieldOne, currentSyllabus.getOralOne(), currentSyllabus2.getOralOne());
        compareAndSetTextField(controller.oralTextFieldTwo, currentSyllabus.getOralTwo(), currentSyllabus2.getOralTwo());
        compareAndSetTextField(controller.oralTextFieldThree, currentSyllabus.getOralThree(), currentSyllabus2.getOralThree());
        compareAndSetTextField(controller.midtermTextFieldOne, currentSyllabus.getMidtermOne(), currentSyllabus2.getMidtermOne());
        compareAndSetTextField(controller.midtermTextFieldTwo, currentSyllabus.getMidtermTwo(), currentSyllabus2.getMidtermTwo());
        compareAndSetTextField(controller.midtermTextFieldThree, currentSyllabus.getMidtermThree(), currentSyllabus2.getMidtermThree());
        compareAndSetTextField(controller.finalTextFieldOne, currentSyllabus.getFinalOne(), currentSyllabus2.getFinalOne());
        compareAndSetTextField(controller.finalTextFieldTwo, currentSyllabus.getFinalTwo(), currentSyllabus2.getFinalTwo());
        compareAndSetTextField(controller.finalTextFieldThree, currentSyllabus.getFinalThree(), currentSyllabus2.getFinalThree());
        compareAndSetTextField(controller.oneProgramTextFieldZero, currentSyllabus.getOneProgramZero(), currentSyllabus2.getOneProgramZero());
        compareAndSetTextField(controller.oneProgramTextFieldOne, currentSyllabus.getOneProgramOne(), currentSyllabus2.getOneProgramOne());
        compareAndSetTextField(controller.oneProgramTextFieldTwo, currentSyllabus.getOneProgramTwo(), currentSyllabus2.getOneProgramTwo());
        compareAndSetTextField(controller.oneProgramTextFieldThree, currentSyllabus.getOneProgramThree(), currentSyllabus2.getOneProgramThree());
        compareAndSetTextField(controller.oneProgramTextFieldFour, currentSyllabus.getOneProgramFour(), currentSyllabus2.getOneProgramFour());
        compareAndSetTextField(controller.oneProgramTextFieldFive, currentSyllabus.getOneProgramFive(), currentSyllabus2.getOneProgramFive());
        compareAndSetTextField(controller.twoProgramTextFieldZero, currentSyllabus.getTwoProgramZero(), currentSyllabus2.getTwoProgramZero());
        compareAndSetTextField(controller.twoProgramTextFieldOne, currentSyllabus.getTwoProgramOne(), currentSyllabus2.getTwoProgramOne());
        compareAndSetTextField(controller.twoProgramTextFieldTwo, currentSyllabus.getTwoProgramTwo(), currentSyllabus2.getTwoProgramTwo());
        compareAndSetTextField(controller.twoProgramTextFieldThree, currentSyllabus.getTwoProgramThree(), currentSyllabus2.getTwoProgramThree());
        compareAndSetTextField(controller.twoProgramTextFieldFour, currentSyllabus.getTwoProgramFour(), currentSyllabus2.getTwoProgramFour());
        compareAndSetTextField(controller.twoProgramTextFieldFive, currentSyllabus.getTwoProgramFive(), currentSyllabus2.getTwoProgramFive());
        compareAndSetTextField(controller.threeProgramTextFieldZero, currentSyllabus.getThreeProgramZero(), currentSyllabus2.getThreeProgramZero());
        compareAndSetTextField(controller.threeProgramTextFieldOne, currentSyllabus.getThreeProgramOne(), currentSyllabus2.getThreeProgramOne());
        compareAndSetTextField(controller.threeProgramTextFieldTwo, currentSyllabus.getThreeProgramTwo(), currentSyllabus2.getThreeProgramTwo());
        compareAndSetTextField(controller.threeProgramTextFieldThree, currentSyllabus.getThreeProgramThree(), currentSyllabus2.getThreeProgramThree());
        compareAndSetTextField(controller.threeProgramTextFieldFour, currentSyllabus.getThreeProgramFour(), currentSyllabus2.getThreeProgramFour());
        compareAndSetTextField(controller.threeProgramTextFieldFive, currentSyllabus.getThreeProgramFive(), currentSyllabus2.getThreeProgramFive());
        compareAndSetTextField(controller.fourProgramTextFieldZero, currentSyllabus.getFourProgramZero(), currentSyllabus2.getFourProgramZero());
        compareAndSetTextField(controller.fourProgramTextFieldOne, currentSyllabus.getFourProgramOne(), currentSyllabus2.getFourProgramOne());
        compareAndSetTextField(controller.fourProgramTextFieldTwo, currentSyllabus.getFourProgramTwo(), currentSyllabus2.getFourProgramTwo());
        compareAndSetTextField(controller.fourProgramTextFieldThree, currentSyllabus.getFourProgramThree(), currentSyllabus2.getFourProgramThree());
        compareAndSetTextField(controller.fourProgramTextFieldFour, currentSyllabus.getFourProgramFour(), currentSyllabus2.getFourProgramFour());
        compareAndSetTextField(controller.fourProgramTextFieldFive, currentSyllabus.getFourProgramFive(), currentSyllabus2.getFourProgramFive());
        compareAndSetTextField(controller.fiveProgramTextFieldZero, currentSyllabus.getFiveProgramZero(), currentSyllabus2.getFiveProgramZero());
        compareAndSetTextField(controller.fiveProgramTextFieldOne, currentSyllabus.getFiveProgramOne(), currentSyllabus2.getFiveProgramOne());
        compareAndSetTextField(controller.fiveProgramTextFieldTwo, currentSyllabus.getFiveProgramTwo(), currentSyllabus2.getFiveProgramTwo());
        compareAndSetTextField(controller.fiveProgramTextFieldThree, currentSyllabus.getFiveProgramThree(), currentSyllabus2.getFiveProgramThree());
        compareAndSetTextField(controller.fiveProgramTextFieldFour, currentSyllabus.getFiveProgramFour(), currentSyllabus2.getFiveProgramFour());
        compareAndSetTextField(controller.fiveProgramTextFieldFive, currentSyllabus.getFiveProgramFive(), currentSyllabus2.getFiveProgramFive());
        compareAndSetTextField(controller.sixProgramTextFieldZero, currentSyllabus.getSixProgramZero(), currentSyllabus2.getSixProgramZero());
        compareAndSetTextField(controller.sixProgramTextFieldOne, currentSyllabus.getSixProgramOne(), currentSyllabus2.getSixProgramOne());
        compareAndSetTextField(controller.sixProgramTextFieldTwo, currentSyllabus.getSixProgramTwo(), currentSyllabus2.getSixProgramTwo());
        compareAndSetTextField(controller.sixProgramTextFieldThree, currentSyllabus.getSixProgramThree(), currentSyllabus2.getSixProgramThree());
        compareAndSetTextField(controller.sixProgramTextFieldFour, currentSyllabus.getSixProgramFour(), currentSyllabus2.getSixProgramFour());
        compareAndSetTextField(controller.sixProgramTextFieldFive, currentSyllabus.getSixProgramFive(), currentSyllabus2.getSixProgramFive());
        compareAndSetTextField(controller.sevenProgramTextFieldZero, currentSyllabus.getSevenProgramZero(), currentSyllabus2.getSevenProgramZero());
        compareAndSetTextField(controller.sevenProgramTextFieldOne, currentSyllabus.getSevenProgramOne(), currentSyllabus2.getSevenProgramOne());
        compareAndSetTextField(controller.sevenProgramTextFieldTwo, currentSyllabus.getSevenProgramTwo(), currentSyllabus2.getSevenProgramTwo());
        compareAndSetTextField(controller.sevenProgramTextFieldThree, currentSyllabus.getSevenProgramThree(), currentSyllabus2.getSevenProgramThree());
        compareAndSetTextField(controller.sevenProgramTextFieldFour, currentSyllabus.getSevenProgramFour(), currentSyllabus2.getSevenProgramFour());
        compareAndSetTextField(controller.sevenProgramTextFieldFive, currentSyllabus.getSevenProgramFive(), currentSyllabus2.getSevenProgramFive());
        compareAndSetTextField(controller.eightProgramTextFieldZero, currentSyllabus.getEightProgramZero(), currentSyllabus2.getEightProgramZero());
        compareAndSetTextField(controller.eightProgramTextFieldOne, currentSyllabus.getEightProgramOne(), currentSyllabus2.getEightProgramOne());
        compareAndSetTextField(controller.eightProgramTextFieldTwo, currentSyllabus.getEightProgramTwo(), currentSyllabus2.getEightProgramTwo());
        compareAndSetTextField(controller.eightProgramTextFieldThree, currentSyllabus.getEightProgramThree(), currentSyllabus2.getEightProgramThree());
        compareAndSetTextField(controller.eightProgramTextFieldFour, currentSyllabus.getEightProgramFour(), currentSyllabus2.getEightProgramFour());
        compareAndSetTextField(controller.eightProgramTextFieldFive, currentSyllabus.getEightProgramFive(), currentSyllabus2.getEightProgramFive());
        compareAndSetTextField(controller.nineProgramTextFieldZero, currentSyllabus.getNineProgramZero(), currentSyllabus2.getNineProgramZero());
        compareAndSetTextField(controller.nineProgramTextFieldOne, currentSyllabus.getNineProgramOne(), currentSyllabus2.getNineProgramOne());
        compareAndSetTextField(controller.nineProgramTextFieldTwo, currentSyllabus.getNineProgramTwo(), currentSyllabus2.getNineProgramTwo());
        compareAndSetTextField(controller.nineProgramTextFieldThree, currentSyllabus.getNineProgramThree(), currentSyllabus2.getNineProgramThree());
        compareAndSetTextField(controller.nineProgramTextFieldFour, currentSyllabus.getNineProgramFour(), currentSyllabus2.getNineProgramFour());
        compareAndSetTextField(controller.nineProgramTextFieldFive, currentSyllabus.getNineProgramFive(), currentSyllabus2.getNineProgramFive());
        compareAndSetTextField(controller.tenProgramTextFieldZero, currentSyllabus.getTenProgramZero(), currentSyllabus2.getTenProgramZero());
        compareAndSetTextField(controller.tenProgramTextFieldOne, currentSyllabus.getTenProgramOne(), currentSyllabus2.getTenProgramOne());
        compareAndSetTextField(controller.tenProgramTextFieldTwo, currentSyllabus.getTenProgramTwo(), currentSyllabus2.getTenProgramTwo());
        compareAndSetTextField(controller.tenProgramTextFieldThree, currentSyllabus.getTenProgramThree(), currentSyllabus2.getTenProgramThree());
        compareAndSetTextField(controller.tenProgramTextFieldFour, currentSyllabus.getTenProgramFour(), currentSyllabus2.getTenProgramFour());
        compareAndSetTextField(controller.tenProgramTextFieldFive, currentSyllabus.getTenProgramFive(), currentSyllabus2.getTenProgramFive());
        compareAndSetTextField(controller.elevenProgramTextFieldZero, currentSyllabus.getElevenProgramZero(), currentSyllabus2.getElevenProgramZero());
        compareAndSetTextField(controller.elevenProgramTextFieldOne, currentSyllabus.getElevenProgramOne(), currentSyllabus2.getElevenProgramOne());
        compareAndSetTextField(controller.elevenProgramTextFieldTwo, currentSyllabus.getElevenProgramTwo(), currentSyllabus2.getElevenProgramTwo());
        compareAndSetTextField(controller.elevenProgramTextFieldThree, currentSyllabus.getElevenProgramThree(), currentSyllabus2.getElevenProgramThree());
        compareAndSetTextField(controller.elevenProgramTextFieldFour, currentSyllabus.getElevenProgramFour(), currentSyllabus2.getElevenProgramFour());
        compareAndSetTextField(controller.elevenProgramTextFieldFive, currentSyllabus.getElevenProgramFive(), currentSyllabus2.getElevenProgramFive());
        compareAndSetTextField(controller.twelveProgramTextFieldZero, currentSyllabus.getTwelveProgramZero(), currentSyllabus2.getTwelveProgramZero());
        compareAndSetTextField(controller.twelveProgramTextFieldOne, currentSyllabus.getTwelveProgramOne(), currentSyllabus2.getTwelveProgramOne());
        compareAndSetTextField(controller.twelveProgramTextFieldTwo, currentSyllabus.getTwelveProgramTwo(), currentSyllabus2.getTwelveProgramTwo());
        compareAndSetTextField(controller.twelveProgramTextFieldThree, currentSyllabus.getTwelveProgramThree(), currentSyllabus2.getTwelveProgramThree());
        compareAndSetTextField(controller.twelveProgramTextFieldFour, currentSyllabus.getTwelveProgramFour(), currentSyllabus2.getTwelveProgramFour());
        compareAndSetTextField(controller.twelveProgramTextFieldFive, currentSyllabus.getTwelveProgramFive(), currentSyllabus2.getTwelveProgramFive());
        compareAndSetTextField(controller.thirteenProgramTextFieldZero, currentSyllabus.getThirteenProgramZero(), currentSyllabus2.getThirteenProgramZero());
        compareAndSetTextField(controller.thirteenProgramTextFieldOne, currentSyllabus.getThirteenProgramOne(), currentSyllabus2.getThirteenProgramOne());
        compareAndSetTextField(controller.thirteenProgramTextFieldTwo, currentSyllabus.getThirteenProgramTwo(), currentSyllabus2.getThirteenProgramTwo());
        compareAndSetTextField(controller.thirteenProgramTextFieldThree, currentSyllabus.getThirteenProgramThree(), currentSyllabus2.getThirteenProgramThree());
        compareAndSetTextField(controller.thirteenProgramTextFieldFour, currentSyllabus.getThirteenProgramFour(), currentSyllabus2.getThirteenProgramFour());
        compareAndSetTextField(controller.thirteenProgramTextFieldFive, currentSyllabus.getThirteenProgramFive(), currentSyllabus2.getThirteenProgramFive());
    }
    private void compareAndSetTextField(TextField textField, String value, String otherValue) {
        textField.setText(value);
        if (!value.equals(otherValue)) {
            textField.setStyle("-fx-text-fill: black; -fx-font-weight: bold;");
        } else {
            textField.setStyle("-fx-text-fill: grey;");
        }
    }



    public void loadSyllabusInformation() {
        // Load the ArrayList from the file
        loadSyllabusFromFile();

        // Iterate through the ArrayList and process each syllabus
        for (Syllabus syllabus : syllabusList) {
          //  setAssistantTextField(syllabus); //IS THIS TRUE
            System.out.println("Course Name: " + syllabus.getCourseName());
            // Add more code here to display or load other information as needed
        }
    }


    private static void saveSyllabusToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("syllabus.dat"))) {
            oos.writeObject(syllabusList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void saveTurkishSyllabusToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("turkish_syllabus.dat"))) {
            oos.writeObject(syllabusList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void loadSyllabusFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("syllabus.dat"))) {
            // Suppressing unchecked cast warning because we're confident it's an ArrayList<Syllabus>
            @SuppressWarnings("unchecked")
            ArrayList<Syllabus> loadedList = (ArrayList<Syllabus>) ois.readObject();

            // Clear the existing syllabusList and add the loaded entries
            syllabusList.clear();
            syllabusList.addAll(loadedList);
        } catch (FileNotFoundException e) {
            // File not found, create a new file
            saveSyllabusToFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void loadTurkishSyllabusFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("turkish_syllabus.dat"))) {
            // Suppressing unchecked cast warning because we're confident it's an ArrayList<Syllabus>
            @SuppressWarnings("unchecked")
            ArrayList<Syllabus> loadedList = (ArrayList<Syllabus>) ois.readObject();

            // Clear the existing syllabusList and add the loaded entries
            syllabusList.clear();
            syllabusList.addAll(loadedList);
        } catch (FileNotFoundException e) {
            // File not found, create a new file
            saveTurkishSyllabusToFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialization code if needed

        //for choice box of languages


        if(myChoiceBox != null) {
    myChoiceBox.getItems().addAll(languages);
    }

        Controllers.loadSyllabusFromFile();
        syllabusListO.clear();
        if (syllabusListView != null) {
            syllabusListO.addAll(syllabusList);
            syllabusListView.setItems(syllabusListO);

        }

        syllabusListView.setCellFactory(param -> new ListCell<Syllabus>() {
                    private HBox createCell(String label, String value) {
                        Text labelTxt = new Text(label + ": ");
                        labelTxt.setStyle("-fx-font-weight: bold;");
                        Text valueTxt = new Text(value);
                        HBox cell = new HBox(labelTxt, valueTxt);
                        cell.setStyle("-fx-spacing: 5;");
                        return cell;
                    }

            @Override
            protected void updateItem(Syllabus item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    HBox hbox = new HBox(
                            createCell("Course",item.getCourseName()),
                            createCell("Editor",item.getEditorName()),
                            createCell("Description",item.getCourseDescription()),
                            createCell("Date",item.getEditDate()),
                            createCell("Time",item.getEditTime())
                    );
                    setGraphic(hbox);

                }


            }
        }

        );



        if (syllabusListView != null) {
            syllabusListView.getSelectionModel().selectedIndexProperty().addListener(
                    (ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
                        if (newValue.intValue() >= 0) {

                            // currentIndex =
                            // syllabusListView.getItems().indexOf(syllabusListView.getItems().get(newValue.intValue()));
                            currentIndex = newValue.intValue();
                            currentSyllabus = syllabusListView.getItems().get(newValue.intValue());
                            System.out.println(" --> Course Name: " + currentSyllabus.getCourseName()+" --> Editor Name: " + currentSyllabus.getEditorName());
                        } else {
                            currentSyllabus = null;
                        }
                    }
            );
        }

} }
