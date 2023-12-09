package com.example.se302;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Syllabus {
/*
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



    //Assign
    String courseName = courseNameText.getText();
    String code = codeTextField.getText();
    String fall = fallTextField.getText();
    String spring = springTextField.getText();
    String theory = theoryTextField.getText();
    String lab = labTextField.getText();
    String localCredit = localCreditTextField.getText();
    String ects = ectsTextField.getText();

    String prerequisites = prerequisitesTextField.getText();
    String courseLanguage = courseLanguageTextField.getText();
    String courseType = courseTypeTextField.getText();
    String courseLevel = courseLevelTextField.getText();
    String teachingMethods = teachingMethodsTextField.getText();

    String courseCoordinator = courseCoordinatorTextField.getText();
    String courseCoordinator2 = courseCoordinatorTextField2.getText();
    String assistant = assistantTextField.getText();

    String courseObjectives = courseObjectivesTextField.getText();
    String learningOutcomes = learningOutcomesTextField.getText();
    String courseDescription = courseDescriptionTextField.getText();

    String subjectsTwo = subjectsTextFieldTwo.getText();
    String requiredMaterialsTwo = reqiredMaterialsTextFieldTwo.getText();

    String subjectsThree = subjectsTextFieldThree.getText();
    String requiredMaterialsThree = reqiredMaterialsTextFieldThree.getText();

    String subjectsFour = subjectsTextFieldFour.getText();
    String requiredMaterialsFour = reqiredMaterialsTextFieldFour.getText();

    String subjectsFive = subjectsTextFieldFive.getText();
    String requiredMaterialsFive = reqiredMaterialsTextFieldFive.getText();

    String subjectsSix = subjectsTextFieldSix.getText();
    String requiredMaterialsSix = reqiredMaterialsTextFieldSix.getText();

    String subjectsSeven = subjectsTextFieldSeven.getText();
    String requiredMaterialsSeven = reqiredMaterialsTextFieldSeven.getText();

    String subjectsEight = subjectsTextFieldEight.getText();
    String requiredMaterialsEight = reqiredMaterialsTextFieldEight.getText();

    String subjectsNine = subjectsTextFieldNine.getText();
    String requiredMaterialsNine = reqiredMaterialsTextFieldNine.getText();

    String subjectsTen = subjectsTextFieldTen.getText();
    String requiredMaterialsTen = reqiredMaterialsTextFieldTen.getText();

    String subjectsEleven = subjectsTextFieldEleven.getText();
    String requiredMaterialsEleven = reqiredMaterialsTextFieldEleven.getText();

    String subjectsTwelve = subjectsTextFieldTwelve.getText();
    String requiredMaterialsTwelve = reqiredMaterialsTextFieldTwelve.getText();

    String subjectsThirteen = subjectsTextFieldThirteen.getText();
    String requiredMaterialsThirteen = reqiredMaterialsTextFieldThirteen.getText();

    String subjectsFourteen = subjectsTextFieldFourteen.getText();
    String requiredMaterialsFourteen = reqiredMaterialsTextFieldFourteen.getText();

    String subjectsFifteen = subjectsTextFieldFifteen.getText();
    String requiredMaterialsFifteen = reqiredMaterialsTextFieldFifteen.getText();

    String subjectsSixteen = subjectsTextFieldSixteen.getText();
    String requiredMaterialsSixteen = reqiredMaterialsTextFieldSixteen.getText();

    String participationOne = participationTextFieldOne.getText();
    String participationTwo = participationTextFieldTwo.getText();
    String participationThree = participationTextFieldThree.getText();
    String participationFour = participationTextFieldFour.getText();
    String participationFive = participationTextFieldFive.getText();
    String participationSix = participationTextFieldSix.getText();
    String participationSeven = participationTextFieldSeven.getText();
    String participationEight = participationTextFieldEight.getText();
    String participationNine = participationTextFieldNine.getText();

    String laboratoryOne = laboratoryTextFieldOne.getText();
    String laboratoryTwo = laboratoryTextFieldTwo.getText();
    String laboratoryThree = laboratoryTextFieldThree.getText();
    String laboratoryFour = laboratoryTextFieldFour.getText();
    String laboratoryFive = laboratoryTextFieldFive.getText();
    String laboratorySix = laboratoryTextFieldSix.getText();
    String laboratorySeven = laboratoryTextFieldSeven.getText();
    String laboratoryEight = laboratoryTextFieldEight.getText();
    String laboratoryNine = laboratoryTextFieldNine.getText();

    String fieldWorkOne = fieldWorkTextFieldOne.getText();
    String fieldWorkTwo = fieldWorkTextFieldTwo.getText();
    String fieldWorkThree = fieldWorkTextFieldThree.getText();
    String fieldWorkFour = fieldWorkTextFieldFour.getText();
    String fieldWorkFive = fieldWorkTextFieldFive.getText();
    String fieldWorkSix = fieldWorkTextFieldSix.getText();
    String fieldWorkSeven = fieldWorkTextFieldSeven.getText();
    String fieldWorkEight = fieldWorkTextFieldEight.getText();
    String fieldWorkNine = fieldWorkTextFieldNine.getText();

    String quiz2One = quiz2TextFieldOne.getText();
    String quiz2Two = quiz2TextFieldTwo.getText();
    String quiz2Three = quiz2TextFieldThree.getText();
    String quizFour = quizTextFieldFour.getText();
    String quizFive = quizTextFieldFive.getText();
    String quizSix = quizTextFieldSix.getText();
    String quizSeven = quizTextFieldSeven.getText();
    String quizEight = quizTextFieldEight.getText();
    String quizNine = quizTextFieldNine.getText();

    String courseHourOne = coursehourTextFieldOne.getText();
    String courseHourTwo = coursehourTextFieldTwo.getText();

    //Part 2

    String labhourOne = labhourTextFieldOne.getText();
    String labhourTwo = labhourTextFieldTwo.getText();

    String studyhourOne = StudyhourTextFieldOne.getText();
    String studyhourTwo = StudyhourTextFieldTwo.getText();
    String studyhourThree = StudyhourTextFieldThree.getText();

    String fieldworkOne = FieldworkTextFieldOne.getText();
    String fieldworkTwo = FieldworkTextFieldTwo.getText();
    String fieldworkThree = FieldworkTextFieldThree.getText();

    String quizOne = quizTextFieldOne.getText();
    String quizTwo = quizTextFieldTwo.getText();
    String quizThree = quizTextFieldThree.getText();

    String homeworkOne = homeworkTextFieldOne.getText();
    String homeworkTwo = homeworkTextFieldTwo.getText();
    String homeworkThree = homeworkTextFieldThree.getText();

    String presentationOne = presentationTextFieldOne.getText();
    String presentationTwo = presentationTextFieldTwo.getText();
    String presentationThree = presentationTextFieldThree.getText();

    String projectOne = projectTextFieldOne.getText();
    String projectTwo = projectTextFieldTwo.getText();
    String projectThree = projectTextFieldThree.getText();

    String portfolioOne = portfolioTextFieldOne.getText();
    String portfolioTwo = portfolioTextFieldTwo.getText();
    String portfolioThree = portfolioTextFieldThree.getText();

    String seminarOne = seminarTextFieldOne.getText();
    String seminarTwo = seminarTextFieldTwo.getText();
    String seminarThree = seminarTextFieldThree.getText();

    String oralOne = oralTextFieldOne.getText();
    String oralTwo = oralTextFieldTwo.getText();
    String oralThree = oralTextFieldThree.getText();

    String midtermOne = midtermTextFieldOne.getText();
    String midtermTwo = midtermTextFieldTwo.getText();
    String midtermThree = midtermTextFieldThree.getText();

    String finalOne = finalTextFieldOne.getText();
    String finalTwo = finalTextFieldTwo.getText();
    String finalThree = finalTextFieldThree.getText();

    String oneProgramZero = oneProgramTextFieldZero.getText();
    String oneProgramOne = oneProgramTextFieldOne.getText();
    String oneProgramTwo = oneProgramTextFieldTwo.getText();
    String oneProgramThree = oneProgramTextFieldThree.getText();
    String oneProgramFour = oneProgramTextFieldFour.getText();
    String oneProgramFive = oneProgramTextFieldFive.getText();

    String twoProgramZero = twoProgramTextFieldZero.getText();
    String twoProgramOne = twoProgramTextFieldOne.getText();
    String twoProgramTwo = twoProgramTextFieldTwo.getText();
    String twoProgramThree = twoProgramTextFieldThree.getText();
    String twoProgramFour = twoProgramTextFieldFour.getText();
    String twoProgramFive = twoProgramTextFieldFive.getText();

    String threeProgramZero = threeProgramTextFieldZero.getText();
    String threeProgramOne = threeProgramTextFieldOne.getText();
    String threeProgramTwo = threeProgramTextFieldTwo.getText();
    String threeProgramThree = threeProgramTextFieldThree.getText();
    String threeProgramFour = threeProgramTextFieldFour.getText();
    String threeProgramFive = threeProgramTextFieldFive.getText();

    String fourProgramZero = fourProgramTextFieldZero.getText();
    String fourProgramOne = fourProgramTextFieldOne.getText();
    String fourProgramTwo = fourProgramTextFieldTwo.getText();
    String fourProgramThree = fourProgramTextFieldThree.getText();
    String fourProgramFour = fourProgramTextFieldFour.getText();
    String fourProgramFive = fourProgramTextFieldFive.getText();

    String fiveProgramZero = fiveProgramTextFieldZero.getText();
    String fiveProgramOne = fiveProgramTextFieldOne.getText();
    String fiveProgramTwo = fiveProgramTextFieldTwo.getText();
    String fiveProgramThree = fiveProgramTextFieldThree.getText();
    String fiveProgramFour = fiveProgramTextFieldFour.getText();
    String fiveProgramFive = fiveProgramTextFieldFive.getText();

    String sixProgramZero = sixProgramTextFieldZero.getText();
    String sixProgramOne = sixProgramTextFieldOne.getText();
    String sixProgramTwo = sixProgramTextFieldTwo.getText();
    String sixProgramThree = sixProgramTextFieldThree.getText();
    String sixProgramFour = sixProgramTextFieldFour.getText();
    String sixProgramFive = sixProgramTextFieldFive.getText();

    String sevenProgramZero = sevenProgramTextFieldZero.getText();
    String sevenProgramOne = sevenProgramTextFieldOne.getText();
    String sevenProgramTwo = sevenProgramTextFieldTwo.getText();
    String sevenProgramThree = sevenProgramTextFieldThree.getText();
    String sevenProgramFour = sevenProgramTextFieldFour.getText();
    String sevenProgramFive = sevenProgramTextFieldFive.getText();

    String eightProgramZero = eightProgramTextFieldZero.getText();
    String eightProgramOne = eightProgramTextFieldOne.getText();
    String eightProgramTwo = eightProgramTextFieldTwo.getText();
    String eightProgramThree = eightProgramTextFieldThree.getText();
    String eightProgramFour = eightProgramTextFieldFour.getText();
    String eightProgramFive = eightProgramTextFieldFive.getText();

    String nineProgramZero = nineProgramTextFieldZero.getText();
    String nineProgramOne = nineProgramTextFieldOne.getText();
    String nineProgramTwo = nineProgramTextFieldTwo.getText();
    String nineProgramThree = nineProgramTextFieldThree.getText();
    String nineProgramFour = nineProgramTextFieldFour.getText();
    String nineProgramFive = nineProgramTextFieldFive.getText();

    String tenProgramZero = tenProgramTextFieldZero.getText();
    String tenProgramOne = tenProgramTextFieldOne.getText();
    String tenProgramTwo = tenProgramTextFieldTwo.getText();
    String tenProgramThree = tenProgramTextFieldThree.getText();
    String tenProgramFour = tenProgramTextFieldFour.getText();
    String tenProgramFive = tenProgramTextFieldFive.getText();

    String elevenProgramZero = elevenProgramTextFieldZero.getText();
    String elevenProgramOne = elevenProgramTextFieldOne.getText();
    String elevenProgramTwo = elevenProgramTextFieldTwo.getText();
    String elevenProgramThree = elevenProgramTextFieldThree.getText();
    String elevenProgramFour = elevenProgramTextFieldFour.getText();
    String elevenProgramFive = elevenProgramTextFieldFive.getText();

    String twelveProgramZero = twelveProgramTextFieldZero.getText();
    String twelveProgramOne = twelveProgramTextFieldOne.getText();
    String twelveProgramTwo = twelveProgramTextFieldTwo.getText();
    String twelveProgramThree = twelveProgramTextFieldThree.getText();
    String twelveProgramFour = twelveProgramTextFieldFour.getText();
    String twelveProgramFive = twelveProgramTextFieldFive.getText();

    String thirteenProgramZero = thirteenProgramTextFieldZero.getText();
    String thirteenProgramOne = thirteenProgramTextFieldOne.getText();
    String thirteenProgramTwo = thirteenProgramTextFieldTwo.getText();
    String thirteenProgramThree = thirteenProgramTextFieldThree.getText();
    String thirteenProgramFour = thirteenProgramTextFieldFour.getText();
    String thirteenProgramFive = thirteenProgramTextFieldFive.getText(); /*


}
 */
}
