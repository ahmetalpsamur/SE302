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
import java.util.ArrayList;
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

    String courseName;
    String code;
    String fall;
    String spring;
    String theory;
    String lab;
    String localCredit;
    String ects;

    String prerequisites;
    String courseLanguage;
    String courseType;
    String courseLevel;
    String teachingMethods;

    String courseCoordinator;
    String courseCoordinator2;
    String assistant;

    String courseObjectives;
    String learningOutcomes;
    String courseDescription;

    String subjectsTwo;
    String requiredMaterialsTwo;

    String subjectsThree;
    String requiredMaterialsThree;

    String subjectsFour;
    String requiredMaterialsFour;

    String subjectsFive;
    String requiredMaterialsFive;

    String subjectsSix;
    String requiredMaterialsSix;

    String subjectsSeven;
    String requiredMaterialsSeven;

    String subjectsEight;
    String requiredMaterialsEight;

    String subjectsNine;
    String requiredMaterialsNine;

    String subjectsTen;
    String requiredMaterialsTen;

    String subjectsEleven;
    String requiredMaterialsEleven;

    String subjectsTwelve;
    String requiredMaterialsTwelve;

    String subjectsThirteen;
    String requiredMaterialsThirteen;

    String subjectsFourteen;
    String requiredMaterialsFourteen;

    String subjectsFifteen;
    String requiredMaterialsFifteen;

    String subjectsSixteen;
    String requiredMaterialsSixteen;

    String participationOne;
    String participationTwo;
    String participationThree;
    String participationFour;
    String participationFive;
    String participationSix;
    String participationSeven;
    String participationEight;
    String participationNine;

    String laboratoryOne;
    String laboratoryTwo;
    String laboratoryThree;
    String laboratoryFour;
    String laboratoryFive;
    String laboratorySix;
    String laboratorySeven;
    String laboratoryEight;
    String laboratoryNine;

    String fieldWorkOne;
    String fieldWorkTwo;
    String fieldWorkThree;
    String fieldWorkFour;
    String fieldWorkFive;
    String fieldWorkSix;
    String fieldWorkSeven;
    String fieldWorkEight;
    String fieldWorkNine;

    String quiz2One;
    String quiz2Two;
    String quiz2Three;
    String quizFour;
    String quizFive;
    String quizSix;
    String quizSeven;
    String quizEight;
    String quizNine;

    String courseHourOne;
    String courseHourTwo;

//Part 2

    String labhourOne;
    String labhourTwo;

    String studyhourOne;
    String studyhourTwo;
    String studyhourThree;

    String fieldworkOne;
    String fieldworkTwo;
    String fieldworkThree;

    String quizOne;
    String quizTwo;
    String quizThree;

    String homeworkOne;
    String homeworkTwo;
    String homeworkThree;

    String presentationOne;
    String presentationTwo;
    String presentationThree;

    String projectOne;
    String projectTwo;
    String projectThree;

    String portfolioOne;
    String portfolioTwo;
    String portfolioThree;

    String seminarOne;
    String seminarTwo;
    String seminarThree;

    String oralOne;
    String oralTwo;
    String oralThree;

    String midtermOne;
    String midtermTwo;
    String midtermThree;

    String finalOne;
    String finalTwo;
    String finalThree;

    String oneProgramZero;
    String oneProgramOne;
    String oneProgramTwo;
    String oneProgramThree;
    String oneProgramFour;
    String oneProgramFive;

    String twoProgramZero;
    String twoProgramOne;
    String twoProgramTwo;
    String twoProgramThree;
    String twoProgramFour;
    String twoProgramFive;

    String threeProgramZero;
    String threeProgramOne;
    String threeProgramTwo;
    String threeProgramThree;
    String threeProgramFour;
    String threeProgramFive;

    String fourProgramZero;
    String fourProgramOne;
    String fourProgramTwo;
    String fourProgramThree;
    String fourProgramFour;
    String fourProgramFive;

    String fiveProgramZero;
    String fiveProgramOne;
    String fiveProgramTwo;
    String fiveProgramThree;
    String fiveProgramFour;
    String fiveProgramFive;

    String sixProgramZero;
    String sixProgramOne;
    String sixProgramTwo;
    String sixProgramThree;
    String sixProgramFour;
    String sixProgramFive;

    String sevenProgramZero;
    String sevenProgramOne;
    String sevenProgramTwo;
    String sevenProgramThree;
    String sevenProgramFour;
    String sevenProgramFive;

    String eightProgramZero;
    String eightProgramOne;
    String eightProgramTwo;
    String eightProgramThree;
    String eightProgramFour;
    String eightProgramFive;

    String nineProgramZero;
    String nineProgramOne;
    String nineProgramTwo;
    String nineProgramThree;
    String nineProgramFour;
    String nineProgramFive;

    String tenProgramZero;
    String tenProgramOne;
    String tenProgramTwo;
    String tenProgramThree;
    String tenProgramFour;
    String tenProgramFive;

    String elevenProgramZero;
    String elevenProgramOne;
    String elevenProgramTwo;
    String elevenProgramThree;
    String elevenProgramFour;
    String elevenProgramFive;

    String twelveProgramZero;
    String twelveProgramOne;
    String twelveProgramTwo;
    String twelveProgramThree;
    String twelveProgramFour;
    String twelveProgramFive;

    String thirteenProgramZero;
    String thirteenProgramOne;
    String thirteenProgramTwo;
    String thirteenProgramThree;
    String thirteenProgramFour;
    String thirteenProgramFive;


    public void setAssistantTextField() {
        this.courseName = courseNameText.getText();
        this.code = codeTextField.getText();
        this.fall = fallTextField.getText();
        this.spring = springTextField.getText();
        this.theory = theoryTextField.getText();
        this.lab = labTextField.getText();
        this.localCredit = localCreditTextField.getText();
        this.ects = ectsTextField.getText();

        this.prerequisites = prerequisitesTextField.getText();
        this.courseLanguage = courseLanguageTextField.getText();
        this.courseType = courseTypeTextField.getText();
        this.courseLevel = courseLevelTextField.getText();
        this.teachingMethods = teachingMethodsTextField.getText();

        this.courseCoordinator = courseCoordinatorTextField.getText();
        this.courseCoordinator2 = courseCoordinatorTextField2.getText();
        this.assistant = assistantTextField.getText();

        this.courseObjectives = courseObjectivesTextField.getText();
        this.learningOutcomes = learningOutcomesTextField.getText();
        this.courseDescription = courseDescriptionTextField.getText();

        this.subjectsTwo = subjectsTextFieldTwo.getText();
        this.requiredMaterialsTwo = reqiredMaterialsTextFieldTwo.getText();

        this.subjectsThree = subjectsTextFieldThree.getText();
        this.requiredMaterialsThree = reqiredMaterialsTextFieldThree.getText();

        this.subjectsFour = subjectsTextFieldFour.getText();
        this.requiredMaterialsFour = reqiredMaterialsTextFieldFour.getText();

        this.subjectsFive = subjectsTextFieldFive.getText();
        this.requiredMaterialsFive = reqiredMaterialsTextFieldFive.getText();

        this.subjectsSix = subjectsTextFieldSix.getText();
        this.requiredMaterialsSix = reqiredMaterialsTextFieldSix.getText();

        this.subjectsSeven = subjectsTextFieldSeven.getText();
        this.requiredMaterialsSeven = reqiredMaterialsTextFieldSeven.getText();

        this.subjectsEight = subjectsTextFieldEight.getText();
        this.requiredMaterialsEight = reqiredMaterialsTextFieldEight.getText();

        this.subjectsNine = subjectsTextFieldNine.getText();
        this.requiredMaterialsNine = reqiredMaterialsTextFieldNine.getText();

        this.subjectsTen = subjectsTextFieldTen.getText();
        this.requiredMaterialsTen = reqiredMaterialsTextFieldTen.getText();

        this.subjectsEleven = subjectsTextFieldEleven.getText();
        this.requiredMaterialsEleven = reqiredMaterialsTextFieldEleven.getText();

        this.subjectsTwelve = subjectsTextFieldTwelve.getText();
        this.requiredMaterialsTwelve = reqiredMaterialsTextFieldTwelve.getText();

        this.subjectsThirteen = subjectsTextFieldThirteen.getText();
        this.requiredMaterialsThirteen = reqiredMaterialsTextFieldThirteen.getText();

        this.subjectsFourteen = subjectsTextFieldFourteen.getText();
        this.requiredMaterialsFourteen = reqiredMaterialsTextFieldFourteen.getText();

        this.subjectsFifteen = subjectsTextFieldFifteen.getText();
        this.requiredMaterialsFifteen = reqiredMaterialsTextFieldFifteen.getText();

        this.subjectsSixteen = subjectsTextFieldSixteen.getText();
        this.requiredMaterialsSixteen = reqiredMaterialsTextFieldSixteen.getText();

        this.participationOne = participationTextFieldOne.getText();
        this.participationTwo = participationTextFieldTwo.getText();
        this.participationThree = participationTextFieldThree.getText();
        this.participationFour = participationTextFieldFour.getText();
        this.participationFive = participationTextFieldFive.getText();
        this.participationSix = participationTextFieldSix.getText();
        this.participationSeven = participationTextFieldSeven.getText();
        this.participationEight = participationTextFieldEight.getText();
        this.participationNine = participationTextFieldNine.getText();

        this.laboratoryOne = laboratoryTextFieldOne.getText();
        this.laboratoryTwo = laboratoryTextFieldTwo.getText();
        this.laboratoryThree = laboratoryTextFieldThree.getText();
        this.laboratoryFour = laboratoryTextFieldFour.getText();
        this.laboratoryFive = laboratoryTextFieldFive.getText();
        this.laboratorySix = laboratoryTextFieldSix.getText();
        this.laboratorySeven = laboratoryTextFieldSeven.getText();
        this.laboratoryEight = laboratoryTextFieldEight.getText();
        this.laboratoryNine = laboratoryTextFieldNine.getText();

        this.fieldWorkOne = fieldWorkTextFieldOne.getText();
        this.fieldWorkTwo = fieldWorkTextFieldTwo.getText();
        this.fieldWorkThree = fieldWorkTextFieldThree.getText();
        this.fieldWorkFour = fieldWorkTextFieldFour.getText();
        this.fieldWorkFive = fieldWorkTextFieldFive.getText();
        this.fieldWorkSix = fieldWorkTextFieldSix.getText();
        this.fieldWorkSeven = fieldWorkTextFieldSeven.getText();
        this.fieldWorkEight = fieldWorkTextFieldEight.getText();
        this.fieldWorkNine = fieldWorkTextFieldNine.getText();

        this.quiz2One = quiz2TextFieldOne.getText();
        this.quiz2Two = quiz2TextFieldTwo.getText();
        this.quiz2Three = quiz2TextFieldThree.getText();
        this.quizFour = quizTextFieldFour.getText();
        this.quizFive = quizTextFieldFive.getText();
        this.quizSix = quizTextFieldSix.getText();
        this.quizSeven = quizTextFieldSeven.getText();
        this.quizEight = quizTextFieldEight.getText();
        this.quizNine = quizTextFieldNine.getText();

        this.courseHourOne = coursehourTextFieldOne.getText();
        this.courseHourTwo = coursehourTextFieldTwo.getText();

// Part 2

        this.labhourOne = labhourTextFieldOne.getText();
        this.labhourTwo = labhourTextFieldTwo.getText();

        this.studyhourOne = StudyhourTextFieldOne.getText();
        this.studyhourTwo = StudyhourTextFieldTwo.getText();
        this.studyhourThree = StudyhourTextFieldThree.getText();

        this.fieldworkOne = FieldworkTextFieldOne.getText();
        this.fieldworkTwo = FieldworkTextFieldTwo.getText();
        this.fieldworkThree = FieldworkTextFieldThree.getText();

        this.quizOne = quizTextFieldOne.getText();
        this.quizTwo = quizTextFieldTwo.getText();
        this.quizThree = quizTextFieldThree.getText();

        this.homeworkOne = homeworkTextFieldOne.getText();
        this.homeworkTwo = homeworkTextFieldTwo.getText();
        this.homeworkThree = homeworkTextFieldThree.getText();

        this.presentationOne = presentationTextFieldOne.getText();
        this.presentationTwo = presentationTextFieldTwo.getText();
        this.presentationThree = presentationTextFieldThree.getText();

        this.projectOne = projectTextFieldOne.getText();
        this.projectTwo = projectTextFieldTwo.getText();
        this.projectThree = projectTextFieldThree.getText();

        this.portfolioOne = portfolioTextFieldOne.getText();
        this.portfolioTwo = portfolioTextFieldTwo.getText();
        this.portfolioThree = portfolioTextFieldThree.getText();

        this.seminarOne = seminarTextFieldOne.getText();
        this.seminarTwo = seminarTextFieldTwo.getText();
        this.seminarThree = seminarTextFieldThree.getText();

        this.oralOne = oralTextFieldOne.getText();
        this.oralTwo = oralTextFieldTwo.getText();
        this.oralThree = oralTextFieldThree.getText();

        this.midtermOne = midtermTextFieldOne.getText();
        this.midtermTwo = midtermTextFieldTwo.getText();
        this.midtermThree = midtermTextFieldThree.getText();

        this.finalOne = finalTextFieldOne.getText();
        this.finalTwo = finalTextFieldTwo.getText();
        this.finalThree = finalTextFieldThree.getText();

        this.oneProgramZero = oneProgramTextFieldZero.getText();
        this.oneProgramOne = oneProgramTextFieldOne.getText();
        this.oneProgramTwo = oneProgramTextFieldTwo.getText();
        this.oneProgramThree = oneProgramTextFieldThree.getText();
        this.oneProgramFour = oneProgramTextFieldFour.getText();
        this.oneProgramFive = oneProgramTextFieldFive.getText();

        this.twoProgramZero = twoProgramTextFieldZero.getText();
        this.twoProgramOne = twoProgramTextFieldOne.getText();
        this.twoProgramTwo = twoProgramTextFieldTwo.getText();
        this.twoProgramThree = twoProgramTextFieldThree.getText();
        this.twoProgramFour = twoProgramTextFieldFour.getText();
        this.twoProgramFive = twoProgramTextFieldFive.getText();

        this.threeProgramZero = threeProgramTextFieldZero.getText();
        this.threeProgramOne = threeProgramTextFieldOne.getText();
        this.threeProgramTwo = threeProgramTextFieldTwo.getText();
        this.threeProgramThree = threeProgramTextFieldThree.getText();
        this.threeProgramFour = threeProgramTextFieldFour.getText();
        this.threeProgramFive = threeProgramTextFieldFive.getText();

        this.fourProgramZero = fourProgramTextFieldZero.getText();
        this.fourProgramOne = fourProgramTextFieldOne.getText();
        this.fourProgramTwo = fourProgramTextFieldTwo.getText();
        this.fourProgramThree = fourProgramTextFieldThree.getText();
        this.fourProgramFour = fourProgramTextFieldFour.getText();
        this.fourProgramFive = fourProgramTextFieldFive.getText();

        this.fiveProgramZero = fiveProgramTextFieldZero.getText();
        this.fiveProgramOne = fiveProgramTextFieldOne.getText();
        this.fiveProgramTwo = fiveProgramTextFieldTwo.getText();
        this.fiveProgramThree = fiveProgramTextFieldThree.getText();
        this.fiveProgramFour = fiveProgramTextFieldFour.getText();
        this.fiveProgramFive = fiveProgramTextFieldFive.getText();

        this.sixProgramZero = sixProgramTextFieldZero.getText();
        this.sixProgramOne = sixProgramTextFieldOne.getText();
        this.sixProgramTwo = sixProgramTextFieldTwo.getText();
        this.sixProgramThree = sixProgramTextFieldThree.getText();
        this.sixProgramFour = sixProgramTextFieldFour.getText();
        this.sixProgramFive = sixProgramTextFieldFive.getText();

        this.sevenProgramZero = sevenProgramTextFieldZero.getText();
        this.sevenProgramOne = sevenProgramTextFieldOne.getText();
        this.sevenProgramTwo = sevenProgramTextFieldTwo.getText();
        this.sevenProgramThree = sevenProgramTextFieldThree.getText();
        this.sevenProgramFour = sevenProgramTextFieldFour.getText();
        this.sevenProgramFive = sevenProgramTextFieldFive.getText();

        this.eightProgramZero = eightProgramTextFieldZero.getText();
        this.eightProgramOne = eightProgramTextFieldOne.getText();
        this.eightProgramTwo = eightProgramTextFieldTwo.getText();
        this.eightProgramThree = eightProgramTextFieldThree.getText();
        this.eightProgramFour = eightProgramTextFieldFour.getText();
        this.eightProgramFive = eightProgramTextFieldFive.getText();

        this.nineProgramZero = nineProgramTextFieldZero.getText();
        this.nineProgramOne = nineProgramTextFieldOne.getText();
        this.nineProgramTwo = nineProgramTextFieldTwo.getText();
        this.nineProgramThree = nineProgramTextFieldThree.getText();
        this.nineProgramFour = nineProgramTextFieldFour.getText();
        this.nineProgramFive = nineProgramTextFieldFive.getText();

        this.tenProgramZero = tenProgramTextFieldZero.getText();
        this.tenProgramOne = tenProgramTextFieldOne.getText();
        this.tenProgramTwo = tenProgramTextFieldTwo.getText();
        this.tenProgramThree = tenProgramTextFieldThree.getText();
        this.tenProgramFour = tenProgramTextFieldFour.getText();
        this.tenProgramFive = tenProgramTextFieldFive.getText();

        this.elevenProgramZero = elevenProgramTextFieldZero.getText();
        this.elevenProgramOne = elevenProgramTextFieldOne.getText();
        this.elevenProgramTwo = elevenProgramTextFieldTwo.getText();
        this.elevenProgramThree = elevenProgramTextFieldThree.getText();
        this.elevenProgramFour = elevenProgramTextFieldFour.getText();
        this.elevenProgramFive = elevenProgramTextFieldFive.getText();

        this.twelveProgramZero = twelveProgramTextFieldZero.getText();
        this.twelveProgramOne = twelveProgramTextFieldOne.getText();
        this.twelveProgramTwo = twelveProgramTextFieldTwo.getText();
        this.twelveProgramThree = twelveProgramTextFieldThree.getText();
        this.twelveProgramFour = twelveProgramTextFieldFour.getText();
        this.twelveProgramFive = twelveProgramTextFieldFive.getText();

        this.thirteenProgramZero = thirteenProgramTextFieldZero.getText();
        this.thirteenProgramOne = thirteenProgramTextFieldOne.getText();
        this.thirteenProgramTwo = thirteenProgramTextFieldTwo.getText();
        this.thirteenProgramThree = thirteenProgramTextFieldThree.getText();
        this.thirteenProgramFour = thirteenProgramTextFieldFour.getText();
        this.thirteenProgramFive = thirteenProgramTextFieldFive.getText();

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
        setAssistantTextField();
        System.out.println("Coursename:"+courseName);
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
