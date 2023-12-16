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
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controllers implements Initializable,Serializable {


    //below lines are for language choicebox

    @FXML
    private ChoiceBox<String> myChoiceBox;

    private String[] languages = {"English","Turkish" };



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
    @FXML
    private ListView<Syllabus> syllabusListView = new ListView<Syllabus>();

    public static ObservableList<Syllabus> syllabusListO = FXCollections.observableArrayList();
    Syllabus currentSyllabus;

    public void setAssistantTextField(Syllabus syllabus) {
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

// Part 2

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
            @Override
            protected void updateItem(Syllabus item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null) {
                    setText(null);
                } else {
                    setText(item.getCourseName());
                }
            }
        });
        if (syllabusListView != null) {
            syllabusListView.getSelectionModel().selectedIndexProperty().addListener(
                    (ObservableValue<? extends Number> observable, Number oldValue, Number newValue) -> {
                        if (newValue.intValue() >= 0) {
                            currentSyllabus = syllabusListView.getItems().get(newValue.intValue());
                            System.out.println(currentSyllabus.getCourseName());
                        } else {
                            currentSyllabus = null;
                        }
                    }
            );
        }

} }
