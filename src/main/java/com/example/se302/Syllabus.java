package com.example.se302;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class Syllabus implements Serializable {
    private String courseName;
    private String code;
    private String fall;
    private String spring;
    private String theory;
    private String lab;
    private String localCredit;
    private String ects;

    private String prerequisites;
    private String courseLanguage;
    private String courseType;
    private String courseLevel;
    private String teachingMethods;

    private String courseCoordinator;
    private String courseCoordinator2;
    private String assistant;

    private String courseObjectives;
    private String learningOutcomes;
    private String courseDescription;

    private String subjectsTwo;
    private String requiredMaterialsTwo;

    private String subjectsThree;
    private String requiredMaterialsThree;

    private String subjectsFour;
    private String requiredMaterialsFour;

    private String subjectsFive;
    private String requiredMaterialsFive;

    private String subjectsSix;
    private String requiredMaterialsSix;

    private String subjectsSeven;
    private String requiredMaterialsSeven;

    private String subjectsEight;
    private String requiredMaterialsEight;

    private String subjectsNine;
    private String requiredMaterialsNine;

    private String subjectsTen;
    private String requiredMaterialsTen;

    private String subjectsEleven;
    private String requiredMaterialsEleven;

    private String subjectsTwelve;
    private String requiredMaterialsTwelve;

    private String subjectsThirteen;
    private String requiredMaterialsThirteen;

    private String subjectsFourteen;
    private String requiredMaterialsFourteen;

    private String subjectsFifteen;
    private String requiredMaterialsFifteen;

    private String subjectsSixteen;
    private String requiredMaterialsSixteen;

    private String participationOne;
    private String participationTwo;
    private String participationThree;
    private String participationFour;
    private String participationFive;
    private String participationSix;
    private String participationSeven;
    private String participationEight;
    private String participationNine;

    private String laboratoryOne;
    private String laboratoryTwo;
    private String laboratoryThree;
    private String laboratoryFour;
    private String laboratoryFive;
    private String laboratorySix;
    private String laboratorySeven;
    private String laboratoryEight;
    private String laboratoryNine;

    private String fieldWorkOne;
    private String fieldWorkTwo;
    private String fieldWorkThree;
    private String fieldWorkFour;
    private String fieldWorkFive;
    private String fieldWorkSix;
    private String fieldWorkSeven;
    private String fieldWorkEight;
    private String fieldWorkNine;

    private String quiz2One;
    private String quiz2Two;
    private String quiz2Three;
    private String quizFour;
    private String quizFive;
    private String quizSix;
    private String quizSeven;
    private String quizEight;
    private String quizNine;

    private String courseHourOne;
    private String courseHourTwo;

    // Part 2

    private String labhourOne;
    private String labhourTwo;

    private String studyhourOne;
    private String studyhourTwo;
    private String studyhourThree;

    private String fieldworkOne;
    private String fieldworkTwo;
    private String fieldworkThree;

    private String quizOne;
    private String quizTwo;
    private String quizThree;

    private String homeworkOne;
    private String homeworkTwo;
    private String homeworkThree;

    private String presentationOne;
    private String presentationTwo;
    private String presentationThree;

    private String projectOne;
    private String projectTwo;
    private String projectThree;

    private String portfolioOne;
    private String portfolioTwo;
    private String portfolioThree;

    private String seminarOne;
    private String seminarTwo;
    private String seminarThree;

    private String oralOne;
    private String oralTwo;
    private String oralThree;

    private String midtermOne;
    private String midtermTwo;
    private String midtermThree;

    private String finalOne;
    private String finalTwo;
    private String finalThree;

    private String oneProgramZero;
    private String oneProgramOne;
    private String oneProgramTwo;
    private String oneProgramThree;
    private String oneProgramFour;
    private String oneProgramFive;

    private String twoProgramZero;
    private String twoProgramOne;
    private String twoProgramTwo;
    private String twoProgramThree;
    private String twoProgramFour;
    private String twoProgramFive;

    private String threeProgramZero;
    private String threeProgramOne;
    private String threeProgramTwo;
    private String threeProgramThree;
    private String threeProgramFour;
    private String threeProgramFive;

    private String fourProgramZero;
    private String fourProgramOne;
    private String fourProgramTwo;
    private String fourProgramThree;
    private String fourProgramFour;
    private String fourProgramFive;

    private String fiveProgramZero;
    private String fiveProgramOne;
    private String fiveProgramTwo;
    private String fiveProgramThree;
    private String fiveProgramFour;
    private String fiveProgramFive;

    private String sixProgramZero;
    private String sixProgramOne;
    private String sixProgramTwo;
    private String sixProgramThree;
    private String sixProgramFour;
    private String sixProgramFive;

    private String sevenProgramZero;
    private String sevenProgramOne;
    private String sevenProgramTwo;
    private String sevenProgramThree;
    private String sevenProgramFour;
    private String sevenProgramFive;

    private String eightProgramZero;
    private String eightProgramOne;
    private String eightProgramTwo;
    private String eightProgramThree;
    private String eightProgramFour;
    private String eightProgramFive;

    private String nineProgramZero;
    private String nineProgramOne;
    private String nineProgramTwo;
    private String nineProgramThree;
    private String nineProgramFour;
    private String nineProgramFive;

    private String tenProgramZero;
    private String tenProgramOne;
    private String tenProgramTwo;
    private String tenProgramThree;
    private String tenProgramFour;
    private String tenProgramFive;

    private String elevenProgramZero;
    private String elevenProgramOne;
    private String elevenProgramTwo;
    private String elevenProgramThree;
    private String elevenProgramFour;
    private String elevenProgramFive;

    private String twelveProgramZero;
    private String twelveProgramOne;
    private String twelveProgramTwo;
    private String twelveProgramThree;
    private String twelveProgramFour;
    private String twelveProgramFive;

    private String thirteenProgramZero;
    private String thirteenProgramOne;
    private String thirteenProgramTwo;
    private String thirteenProgramThree;
    private String thirteenProgramFour;
    private String thirteenProgramFive;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFall() {
        return fall;
    }

    public void setFall(String fall) {
        this.fall = fall;
    }

    public String getSpring() {
        return spring;
    }

    public void setSpring(String spring) {
        this.spring = spring;
    }

    public String getTheory() {
        return theory;
    }

    public void setTheory(String theory) {
        this.theory = theory;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getLocalCredit() {
        return localCredit;
    }

    public void setLocalCredit(String localCredit) {
        this.localCredit = localCredit;
    }

    public String getEcts() {
        return ects;
    }

    public void setEcts(String ects) {
        this.ects = ects;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }

    public String getTeachingMethods() {
        return teachingMethods;
    }

    public void setTeachingMethods(String teachingMethods) {
        this.teachingMethods = teachingMethods;
    }

    public String getCourseCoordinator() {
        return courseCoordinator;
    }

    public void setCourseCoordinator(String courseCoordinator) {
        this.courseCoordinator = courseCoordinator;
    }

    public String getCourseCoordinator2() {
        return courseCoordinator2;
    }

    public void setCourseCoordinator2(String courseCoordinator2) {
        this.courseCoordinator2 = courseCoordinator2;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getCourseObjectives() {
        return courseObjectives;
    }

    public void setCourseObjectives(String courseObjectives) {
        this.courseObjectives = courseObjectives;
    }

    public String getLearningOutcomes() {
        return learningOutcomes;
    }

    public void setLearningOutcomes(String learningOutcomes) {
        this.learningOutcomes = learningOutcomes;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getSubjectsTwo() {
        return subjectsTwo;
    }

    public void setSubjectsTwo(String subjectsTwo) {
        this.subjectsTwo = subjectsTwo;
    }

    public String getRequiredMaterialsTwo() {
        return requiredMaterialsTwo;
    }

    public void setRequiredMaterialsTwo(String requiredMaterialsTwo) {
        this.requiredMaterialsTwo = requiredMaterialsTwo;
    }

    public String getSubjectsThree() {
        return subjectsThree;
    }

    public void setSubjectsThree(String subjectsThree) {
        this.subjectsThree = subjectsThree;
    }

    public String getRequiredMaterialsThree() {
        return requiredMaterialsThree;
    }

    public void setRequiredMaterialsThree(String requiredMaterialsThree) {
        this.requiredMaterialsThree = requiredMaterialsThree;
    }

    public String getSubjectsFour() {
        return subjectsFour;
    }

    public void setSubjectsFour(String subjectsFour) {
        this.subjectsFour = subjectsFour;
    }

    public String getRequiredMaterialsFour() {
        return requiredMaterialsFour;
    }

    public void setRequiredMaterialsFour(String requiredMaterialsFour) {
        this.requiredMaterialsFour = requiredMaterialsFour;
    }

    public String getSubjectsFive() {
        return subjectsFive;
    }

    public void setSubjectsFive(String subjectsFive) {
        this.subjectsFive = subjectsFive;
    }

    public String getRequiredMaterialsFive() {
        return requiredMaterialsFive;
    }

    public void setRequiredMaterialsFive(String requiredMaterialsFive) {
        this.requiredMaterialsFive = requiredMaterialsFive;
    }

    public String getSubjectsSix() {
        return subjectsSix;
    }

    public void setSubjectsSix(String subjectsSix) {
        this.subjectsSix = subjectsSix;
    }

    public String getRequiredMaterialsSix() {
        return requiredMaterialsSix;
    }

    public void setRequiredMaterialsSix(String requiredMaterialsSix) {
        this.requiredMaterialsSix = requiredMaterialsSix;
    }

    public String getSubjectsSeven() {
        return subjectsSeven;
    }

    public void setSubjectsSeven(String subjectsSeven) {
        this.subjectsSeven = subjectsSeven;
    }

    public String getRequiredMaterialsSeven() {
        return requiredMaterialsSeven;
    }

    public void setRequiredMaterialsSeven(String requiredMaterialsSeven) {
        this.requiredMaterialsSeven = requiredMaterialsSeven;
    }

    public String getSubjectsEight() {
        return subjectsEight;
    }

    public void setSubjectsEight(String subjectsEight) {
        this.subjectsEight = subjectsEight;
    }

    public String getRequiredMaterialsEight() {
        return requiredMaterialsEight;
    }

    public void setRequiredMaterialsEight(String requiredMaterialsEight) {
        this.requiredMaterialsEight = requiredMaterialsEight;
    }

    public String getSubjectsNine() {
        return subjectsNine;
    }

    public void setSubjectsNine(String subjectsNine) {
        this.subjectsNine = subjectsNine;
    }

    public String getRequiredMaterialsNine() {
        return requiredMaterialsNine;
    }

    public void setRequiredMaterialsNine(String requiredMaterialsNine) {
        this.requiredMaterialsNine = requiredMaterialsNine;
    }

    public String getSubjectsTen() {
        return subjectsTen;
    }

    public void setSubjectsTen(String subjectsTen) {
        this.subjectsTen = subjectsTen;
    }

    public String getRequiredMaterialsTen() {
        return requiredMaterialsTen;
    }

    public void setRequiredMaterialsTen(String requiredMaterialsTen) {
        this.requiredMaterialsTen = requiredMaterialsTen;
    }

    public String getSubjectsEleven() {
        return subjectsEleven;
    }

    public void setSubjectsEleven(String subjectsEleven) {
        this.subjectsEleven = subjectsEleven;
    }

    public String getRequiredMaterialsEleven() {
        return requiredMaterialsEleven;
    }

    public void setRequiredMaterialsEleven(String requiredMaterialsEleven) {
        this.requiredMaterialsEleven = requiredMaterialsEleven;
    }

    public String getSubjectsTwelve() {
        return subjectsTwelve;
    }

    public void setSubjectsTwelve(String subjectsTwelve) {
        this.subjectsTwelve = subjectsTwelve;
    }

    public String getRequiredMaterialsTwelve() {
        return requiredMaterialsTwelve;
    }

    public void setRequiredMaterialsTwelve(String requiredMaterialsTwelve) {
        this.requiredMaterialsTwelve = requiredMaterialsTwelve;
    }

    public String getSubjectsThirteen() {
        return subjectsThirteen;
    }

    public void setSubjectsThirteen(String subjectsThirteen) {
        this.subjectsThirteen = subjectsThirteen;
    }

    public String getRequiredMaterialsThirteen() {
        return requiredMaterialsThirteen;
    }

    public void setRequiredMaterialsThirteen(String requiredMaterialsThirteen) {
        this.requiredMaterialsThirteen = requiredMaterialsThirteen;
    }

    public String getSubjectsFourteen() {
        return subjectsFourteen;
    }

    public void setSubjectsFourteen(String subjectsFourteen) {
        this.subjectsFourteen = subjectsFourteen;
    }

    public String getRequiredMaterialsFourteen() {
        return requiredMaterialsFourteen;
    }

    public void setRequiredMaterialsFourteen(String requiredMaterialsFourteen) {
        this.requiredMaterialsFourteen = requiredMaterialsFourteen;
    }

    public String getSubjectsFifteen() {
        return subjectsFifteen;
    }

    public void setSubjectsFifteen(String subjectsFifteen) {
        this.subjectsFifteen = subjectsFifteen;
    }

    public String getRequiredMaterialsFifteen() {
        return requiredMaterialsFifteen;
    }

    public void setRequiredMaterialsFifteen(String requiredMaterialsFifteen) {
        this.requiredMaterialsFifteen = requiredMaterialsFifteen;
    }

    public String getSubjectsSixteen() {
        return subjectsSixteen;
    }

    public void setSubjectsSixteen(String subjectsSixteen) {
        this.subjectsSixteen = subjectsSixteen;
    }

    public String getRequiredMaterialsSixteen() {
        return requiredMaterialsSixteen;
    }

    public void setRequiredMaterialsSixteen(String requiredMaterialsSixteen) {
        this.requiredMaterialsSixteen = requiredMaterialsSixteen;
    }

    public String getParticipationOne() {
        return participationOne;
    }

    public void setParticipationOne(String participationOne) {
        this.participationOne = participationOne;
    }

    public String getParticipationTwo() {
        return participationTwo;
    }

    public void setParticipationTwo(String participationTwo) {
        this.participationTwo = participationTwo;
    }

    public String getParticipationThree() {
        return participationThree;
    }

    public void setParticipationThree(String participationThree) {
        this.participationThree = participationThree;
    }

    public String getParticipationFour() {
        return participationFour;
    }

    public void setParticipationFour(String participationFour) {
        this.participationFour = participationFour;
    }

    public String getParticipationFive() {
        return participationFive;
    }

    public void setParticipationFive(String participationFive) {
        this.participationFive = participationFive;
    }

    public String getParticipationSix() {
        return participationSix;
    }

    public void setParticipationSix(String participationSix) {
        this.participationSix = participationSix;
    }

    public String getParticipationSeven() {
        return participationSeven;
    }

    public void setParticipationSeven(String participationSeven) {
        this.participationSeven = participationSeven;
    }

    public String getParticipationEight() {
        return participationEight;
    }

    public void setParticipationEight(String participationEight) {
        this.participationEight = participationEight;
    }

    public String getParticipationNine() {
        return participationNine;
    }

    public void setParticipationNine(String participationNine) {
        this.participationNine = participationNine;
    }

    public String getLaboratoryOne() {
        return laboratoryOne;
    }

    public void setLaboratoryOne(String laboratoryOne) {
        this.laboratoryOne = laboratoryOne;
    }

    public String getLaboratoryTwo() {
        return laboratoryTwo;
    }

    public void setLaboratoryTwo(String laboratoryTwo) {
        this.laboratoryTwo = laboratoryTwo;
    }

    public String getLaboratoryThree() {
        return laboratoryThree;
    }

    public void setLaboratoryThree(String laboratoryThree) {
        this.laboratoryThree = laboratoryThree;
    }

    public String getLaboratoryFour() {
        return laboratoryFour;
    }

    public void setLaboratoryFour(String laboratoryFour) {
        this.laboratoryFour = laboratoryFour;
    }

    public String getLaboratoryFive() {
        return laboratoryFive;
    }

    public void setLaboratoryFive(String laboratoryFive) {
        this.laboratoryFive = laboratoryFive;
    }

    public String getLaboratorySix() {
        return laboratorySix;
    }

    public void setLaboratorySix(String laboratorySix) {
        this.laboratorySix = laboratorySix;
    }

    public String getLaboratorySeven() {
        return laboratorySeven;
    }

    public void setLaboratorySeven(String laboratorySeven) {
        this.laboratorySeven = laboratorySeven;
    }

    public String getLaboratoryEight() {
        return laboratoryEight;
    }

    public void setLaboratoryEight(String laboratoryEight) {
        this.laboratoryEight = laboratoryEight;
    }

    public String getLaboratoryNine() {
        return laboratoryNine;
    }

    public void setLaboratoryNine(String laboratoryNine) {
        this.laboratoryNine = laboratoryNine;
    }

    public String getFieldWorkOne() {
        return fieldWorkOne;
    }

    public void setFieldWorkOne(String fieldWorkOne) {
        this.fieldWorkOne = fieldWorkOne;
    }

    public String getFieldWorkTwo() {
        return fieldWorkTwo;
    }

    public void setFieldWorkTwo(String fieldWorkTwo) {
        this.fieldWorkTwo = fieldWorkTwo;
    }

    public String getFieldWorkThree() {
        return fieldWorkThree;
    }

    public void setFieldWorkThree(String fieldWorkThree) {
        this.fieldWorkThree = fieldWorkThree;
    }

    public String getFieldWorkFour() {
        return fieldWorkFour;
    }

    public void setFieldWorkFour(String fieldWorkFour) {
        this.fieldWorkFour = fieldWorkFour;
    }

    public String getFieldWorkFive() {
        return fieldWorkFive;
    }

    public void setFieldWorkFive(String fieldWorkFive) {
        this.fieldWorkFive = fieldWorkFive;
    }

    public String getFieldWorkSix() {
        return fieldWorkSix;
    }

    public void setFieldWorkSix(String fieldWorkSix) {
        this.fieldWorkSix = fieldWorkSix;
    }

    public String getFieldWorkSeven() {
        return fieldWorkSeven;
    }

    public void setFieldWorkSeven(String fieldWorkSeven) {
        this.fieldWorkSeven = fieldWorkSeven;
    }

    public String getFieldWorkEight() {
        return fieldWorkEight;
    }

    public void setFieldWorkEight(String fieldWorkEight) {
        this.fieldWorkEight = fieldWorkEight;
    }

    public String getFieldWorkNine() {
        return fieldWorkNine;
    }

    public void setFieldWorkNine(String fieldWorkNine) {
        this.fieldWorkNine = fieldWorkNine;
    }

    public String getQuiz2One() {
        return quiz2One;
    }

    public void setQuiz2One(String quiz2One) {
        this.quiz2One = quiz2One;
    }

    public String getQuiz2Two() {
        return quiz2Two;
    }

    public void setQuiz2Two(String quiz2Two) {
        this.quiz2Two = quiz2Two;
    }

    public String getQuiz2Three() {
        return quiz2Three;
    }

    public void setQuiz2Three(String quiz2Three) {
        this.quiz2Three = quiz2Three;
    }

    public String getQuizFour() {
        return quizFour;
    }

    public void setQuizFour(String quizFour) {
        this.quizFour = quizFour;
    }

    public String getQuizFive() {
        return quizFive;
    }

    public void setQuizFive(String quizFive) {
        this.quizFive = quizFive;
    }

    public String getQuizSix() {
        return quizSix;
    }

    public void setQuizSix(String quizSix) {
        this.quizSix = quizSix;
    }

    public String getQuizSeven() {
        return quizSeven;
    }

    public void setQuizSeven(String quizSeven) {
        this.quizSeven = quizSeven;
    }

    public String getQuizEight() {
        return quizEight;
    }

    public void setQuizEight(String quizEight) {
        this.quizEight = quizEight;
    }

    public String getQuizNine() {
        return quizNine;
    }

    public void setQuizNine(String quizNine) {
        this.quizNine = quizNine;
    }

    public String getCourseHourOne() {
        return courseHourOne;
    }

    public void setCourseHourOne(String courseHourOne) {
        this.courseHourOne = courseHourOne;
    }

    public String getCourseHourTwo() {
        return courseHourTwo;
    }

    public void setCourseHourTwo(String courseHourTwo) {
        this.courseHourTwo = courseHourTwo;
    }

    public String getLabhourOne() {
        return labhourOne;
    }

    public void setLabhourOne(String labhourOne) {
        this.labhourOne = labhourOne;
    }

    public String getLabhourTwo() {
        return labhourTwo;
    }

    public void setLabhourTwo(String labhourTwo) {
        this.labhourTwo = labhourTwo;
    }

    public String getStudyhourOne() {
        return studyhourOne;
    }

    public void setStudyhourOne(String studyhourOne) {
        this.studyhourOne = studyhourOne;
    }

    public String getStudyhourTwo() {
        return studyhourTwo;
    }

    public void setStudyhourTwo(String studyhourTwo) {
        this.studyhourTwo = studyhourTwo;
    }

    public String getStudyhourThree() {
        return studyhourThree;
    }

    public void setStudyhourThree(String studyhourThree) {
        this.studyhourThree = studyhourThree;
    }

    public String getFieldworkOne() {
        return fieldworkOne;
    }

    public void setFieldworkOne(String fieldworkOne) {
        this.fieldworkOne = fieldworkOne;
    }

    public String getFieldworkTwo() {
        return fieldworkTwo;
    }

    public void setFieldworkTwo(String fieldworkTwo) {
        this.fieldworkTwo = fieldworkTwo;
    }

    public String getFieldworkThree() {
        return fieldworkThree;
    }

    public void setFieldworkThree(String fieldworkThree) {
        this.fieldworkThree = fieldworkThree;
    }

    public String getQuizOne() {
        return quizOne;
    }

    public void setQuizOne(String quizOne) {
        this.quizOne = quizOne;
    }

    public String getQuizTwo() {
        return quizTwo;
    }

    public void setQuizTwo(String quizTwo) {
        this.quizTwo = quizTwo;
    }

    public String getQuizThree() {
        return quizThree;
    }

    public void setQuizThree(String quizThree) {
        this.quizThree = quizThree;
    }

    public String getHomeworkOne() {
        return homeworkOne;
    }

    public void setHomeworkOne(String homeworkOne) {
        this.homeworkOne = homeworkOne;
    }

    public String getHomeworkTwo() {
        return homeworkTwo;
    }

    public void setHomeworkTwo(String homeworkTwo) {
        this.homeworkTwo = homeworkTwo;
    }

    public String getHomeworkThree() {
        return homeworkThree;
    }

    public void setHomeworkThree(String homeworkThree) {
        this.homeworkThree = homeworkThree;
    }

    public String getPresentationOne() {
        return presentationOne;
    }

    public void setPresentationOne(String presentationOne) {
        this.presentationOne = presentationOne;
    }

    public String getPresentationTwo() {
        return presentationTwo;
    }

    public void setPresentationTwo(String presentationTwo) {
        this.presentationTwo = presentationTwo;
    }

    public String getPresentationThree() {
        return presentationThree;
    }

    public void setPresentationThree(String presentationThree) {
        this.presentationThree = presentationThree;
    }

    public String getProjectOne() {
        return projectOne;
    }

    public void setProjectOne(String projectOne) {
        this.projectOne = projectOne;
    }

    public String getProjectTwo() {
        return projectTwo;
    }

    public void setProjectTwo(String projectTwo) {
        this.projectTwo = projectTwo;
    }

    public String getProjectThree() {
        return projectThree;
    }

    public void setProjectThree(String projectThree) {
        this.projectThree = projectThree;
    }

    public String getPortfolioOne() {
        return portfolioOne;
    }

    public void setPortfolioOne(String portfolioOne) {
        this.portfolioOne = portfolioOne;
    }

    public String getPortfolioTwo() {
        return portfolioTwo;
    }

    public void setPortfolioTwo(String portfolioTwo) {
        this.portfolioTwo = portfolioTwo;
    }

    public String getPortfolioThree() {
        return portfolioThree;
    }

    public void setPortfolioThree(String portfolioThree) {
        this.portfolioThree = portfolioThree;
    }

    public String getSeminarOne() {
        return seminarOne;
    }

    public void setSeminarOne(String seminarOne) {
        this.seminarOne = seminarOne;
    }

    public String getSeminarTwo() {
        return seminarTwo;
    }

    public void setSeminarTwo(String seminarTwo) {
        this.seminarTwo = seminarTwo;
    }

    public String getSeminarThree() {
        return seminarThree;
    }

    public void setSeminarThree(String seminarThree) {
        this.seminarThree = seminarThree;
    }

    public String getOralOne() {
        return oralOne;
    }

    public void setOralOne(String oralOne) {
        this.oralOne = oralOne;
    }

    public String getOralTwo() {
        return oralTwo;
    }

    public void setOralTwo(String oralTwo) {
        this.oralTwo = oralTwo;
    }

    public String getOralThree() {
        return oralThree;
    }

    public void setOralThree(String oralThree) {
        this.oralThree = oralThree;
    }

    public String getMidtermOne() {
        return midtermOne;
    }

    public void setMidtermOne(String midtermOne) {
        this.midtermOne = midtermOne;
    }

    public String getMidtermTwo() {
        return midtermTwo;
    }

    public void setMidtermTwo(String midtermTwo) {
        this.midtermTwo = midtermTwo;
    }

    public String getMidtermThree() {
        return midtermThree;
    }

    public void setMidtermThree(String midtermThree) {
        this.midtermThree = midtermThree;
    }

    public String getFinalOne() {
        return finalOne;
    }

    public void setFinalOne(String finalOne) {
        this.finalOne = finalOne;
    }

    public String getFinalTwo() {
        return finalTwo;
    }

    public void setFinalTwo(String finalTwo) {
        this.finalTwo = finalTwo;
    }

    public String getFinalThree() {
        return finalThree;
    }

    public void setFinalThree(String finalThree) {
        this.finalThree = finalThree;
    }

    public String getOneProgramZero() {
        return oneProgramZero;
    }

    public void setOneProgramZero(String oneProgramZero) {
        this.oneProgramZero = oneProgramZero;
    }

    public String getOneProgramOne() {
        return oneProgramOne;
    }

    public void setOneProgramOne(String oneProgramOne) {
        this.oneProgramOne = oneProgramOne;
    }

    public String getOneProgramTwo() {
        return oneProgramTwo;
    }

    public void setOneProgramTwo(String oneProgramTwo) {
        this.oneProgramTwo = oneProgramTwo;
    }

    public String getOneProgramThree() {
        return oneProgramThree;
    }

    public void setOneProgramThree(String oneProgramThree) {
        this.oneProgramThree = oneProgramThree;
    }

    public String getOneProgramFour() {
        return oneProgramFour;
    }

    public void setOneProgramFour(String oneProgramFour) {
        this.oneProgramFour = oneProgramFour;
    }

    public String getOneProgramFive() {
        return oneProgramFive;
    }

    public void setOneProgramFive(String oneProgramFive) {
        this.oneProgramFive = oneProgramFive;
    }

    public String getTwoProgramZero() {
        return twoProgramZero;
    }

    public void setTwoProgramZero(String twoProgramZero) {
        this.twoProgramZero = twoProgramZero;
    }

    public String getTwoProgramOne() {
        return twoProgramOne;
    }

    public void setTwoProgramOne(String twoProgramOne) {
        this.twoProgramOne = twoProgramOne;
    }

    public String getTwoProgramTwo() {
        return twoProgramTwo;
    }

    public void setTwoProgramTwo(String twoProgramTwo) {
        this.twoProgramTwo = twoProgramTwo;
    }

    public String getTwoProgramThree() {
        return twoProgramThree;
    }

    public void setTwoProgramThree(String twoProgramThree) {
        this.twoProgramThree = twoProgramThree;
    }

    public String getTwoProgramFour() {
        return twoProgramFour;
    }

    public void setTwoProgramFour(String twoProgramFour) {
        this.twoProgramFour = twoProgramFour;
    }

    public String getTwoProgramFive() {
        return twoProgramFive;
    }

    public void setTwoProgramFive(String twoProgramFive) {
        this.twoProgramFive = twoProgramFive;
    }

    public String getThreeProgramZero() {
        return threeProgramZero;
    }

    public void setThreeProgramZero(String threeProgramZero) {
        this.threeProgramZero = threeProgramZero;
    }

    public String getThreeProgramOne() {
        return threeProgramOne;
    }

    public void setThreeProgramOne(String threeProgramOne) {
        this.threeProgramOne = threeProgramOne;
    }

    public String getThreeProgramTwo() {
        return threeProgramTwo;
    }

    public void setThreeProgramTwo(String threeProgramTwo) {
        this.threeProgramTwo = threeProgramTwo;
    }

    public String getThreeProgramThree() {
        return threeProgramThree;
    }

    public void setThreeProgramThree(String threeProgramThree) {
        this.threeProgramThree = threeProgramThree;
    }

    public String getThreeProgramFour() {
        return threeProgramFour;
    }

    public void setThreeProgramFour(String threeProgramFour) {
        this.threeProgramFour = threeProgramFour;
    }

    public String getThreeProgramFive() {
        return threeProgramFive;
    }

    public void setThreeProgramFive(String threeProgramFive) {
        this.threeProgramFive = threeProgramFive;
    }

    public String getFourProgramZero() {
        return fourProgramZero;
    }

    public void setFourProgramZero(String fourProgramZero) {
        this.fourProgramZero = fourProgramZero;
    }

    public String getFourProgramOne() {
        return fourProgramOne;
    }

    public void setFourProgramOne(String fourProgramOne) {
        this.fourProgramOne = fourProgramOne;
    }

    public String getFourProgramTwo() {
        return fourProgramTwo;
    }

    public void setFourProgramTwo(String fourProgramTwo) {
        this.fourProgramTwo = fourProgramTwo;
    }

    public String getFourProgramThree() {
        return fourProgramThree;
    }

    public void setFourProgramThree(String fourProgramThree) {
        this.fourProgramThree = fourProgramThree;
    }

    public String getFourProgramFour() {
        return fourProgramFour;
    }

    public void setFourProgramFour(String fourProgramFour) {
        this.fourProgramFour = fourProgramFour;
    }

    public String getFourProgramFive() {
        return fourProgramFive;
    }

    public void setFourProgramFive(String fourProgramFive) {
        this.fourProgramFive = fourProgramFive;
    }

    public String getFiveProgramZero() {
        return fiveProgramZero;
    }

    public void setFiveProgramZero(String fiveProgramZero) {
        this.fiveProgramZero = fiveProgramZero;
    }

    public String getFiveProgramOne() {
        return fiveProgramOne;
    }

    public void setFiveProgramOne(String fiveProgramOne) {
        this.fiveProgramOne = fiveProgramOne;
    }

    public String getFiveProgramTwo() {
        return fiveProgramTwo;
    }

    public void setFiveProgramTwo(String fiveProgramTwo) {
        this.fiveProgramTwo = fiveProgramTwo;
    }

    public String getFiveProgramThree() {
        return fiveProgramThree;
    }

    public void setFiveProgramThree(String fiveProgramThree) {
        this.fiveProgramThree = fiveProgramThree;
    }

    public String getFiveProgramFour() {
        return fiveProgramFour;
    }

    public void setFiveProgramFour(String fiveProgramFour) {
        this.fiveProgramFour = fiveProgramFour;
    }

    public String getFiveProgramFive() {
        return fiveProgramFive;
    }

    public void setFiveProgramFive(String fiveProgramFive) {
        this.fiveProgramFive = fiveProgramFive;
    }

    public String getSixProgramZero() {
        return sixProgramZero;
    }

    public void setSixProgramZero(String sixProgramZero) {
        this.sixProgramZero = sixProgramZero;
    }

    public String getSixProgramOne() {
        return sixProgramOne;
    }

    public void setSixProgramOne(String sixProgramOne) {
        this.sixProgramOne = sixProgramOne;
    }

    public String getSixProgramTwo() {
        return sixProgramTwo;
    }

    public void setSixProgramTwo(String sixProgramTwo) {
        this.sixProgramTwo = sixProgramTwo;
    }

    public String getSixProgramThree() {
        return sixProgramThree;
    }

    public void setSixProgramThree(String sixProgramThree) {
        this.sixProgramThree = sixProgramThree;
    }

    public String getSixProgramFour() {
        return sixProgramFour;
    }

    public void setSixProgramFour(String sixProgramFour) {
        this.sixProgramFour = sixProgramFour;
    }

    public String getSixProgramFive() {
        return sixProgramFive;
    }

    public void setSixProgramFive(String sixProgramFive) {
        this.sixProgramFive = sixProgramFive;
    }

    public String getSevenProgramZero() {
        return sevenProgramZero;
    }

    public void setSevenProgramZero(String sevenProgramZero) {
        this.sevenProgramZero = sevenProgramZero;
    }

    public String getSevenProgramOne() {
        return sevenProgramOne;
    }

    public void setSevenProgramOne(String sevenProgramOne) {
        this.sevenProgramOne = sevenProgramOne;
    }

    public String getSevenProgramTwo() {
        return sevenProgramTwo;
    }

    public void setSevenProgramTwo(String sevenProgramTwo) {
        this.sevenProgramTwo = sevenProgramTwo;
    }

    public String getSevenProgramThree() {
        return sevenProgramThree;
    }

    public void setSevenProgramThree(String sevenProgramThree) {
        this.sevenProgramThree = sevenProgramThree;
    }

    public String getSevenProgramFour() {
        return sevenProgramFour;
    }

    public void setSevenProgramFour(String sevenProgramFour) {
        this.sevenProgramFour = sevenProgramFour;
    }

    public String getSevenProgramFive() {
        return sevenProgramFive;
    }

    public void setSevenProgramFive(String sevenProgramFive) {
        this.sevenProgramFive = sevenProgramFive;
    }

    public String getEightProgramZero() {
        return eightProgramZero;
    }

    public void setEightProgramZero(String eightProgramZero) {
        this.eightProgramZero = eightProgramZero;
    }

    public String getEightProgramOne() {
        return eightProgramOne;
    }

    public void setEightProgramOne(String eightProgramOne) {
        this.eightProgramOne = eightProgramOne;
    }

    public String getEightProgramTwo() {
        return eightProgramTwo;
    }

    public void setEightProgramTwo(String eightProgramTwo) {
        this.eightProgramTwo = eightProgramTwo;
    }

    public String getEightProgramThree() {
        return eightProgramThree;
    }

    public void setEightProgramThree(String eightProgramThree) {
        this.eightProgramThree = eightProgramThree;
    }

    public String getEightProgramFour() {
        return eightProgramFour;
    }

    public void setEightProgramFour(String eightProgramFour) {
        this.eightProgramFour = eightProgramFour;
    }

    public String getEightProgramFive() {
        return eightProgramFive;
    }

    public void setEightProgramFive(String eightProgramFive) {
        this.eightProgramFive = eightProgramFive;
    }

    public String getNineProgramZero() {
        return nineProgramZero;
    }

    public void setNineProgramZero(String nineProgramZero) {
        this.nineProgramZero = nineProgramZero;
    }

    public String getNineProgramOne() {
        return nineProgramOne;
    }

    public void setNineProgramOne(String nineProgramOne) {
        this.nineProgramOne = nineProgramOne;
    }

    public String getNineProgramTwo() {
        return nineProgramTwo;
    }

    public void setNineProgramTwo(String nineProgramTwo) {
        this.nineProgramTwo = nineProgramTwo;
    }

    public String getNineProgramThree() {
        return nineProgramThree;
    }

    public void setNineProgramThree(String nineProgramThree) {
        this.nineProgramThree = nineProgramThree;
    }

    public String getNineProgramFour() {
        return nineProgramFour;
    }

    public void setNineProgramFour(String nineProgramFour) {
        this.nineProgramFour = nineProgramFour;
    }

    public String getNineProgramFive() {
        return nineProgramFive;
    }

    public void setNineProgramFive(String nineProgramFive) {
        this.nineProgramFive = nineProgramFive;
    }

    public String getTenProgramZero() {
        return tenProgramZero;
    }

    public void setTenProgramZero(String tenProgramZero) {
        this.tenProgramZero = tenProgramZero;
    }

    public String getTenProgramOne() {
        return tenProgramOne;
    }

    public void setTenProgramOne(String tenProgramOne) {
        this.tenProgramOne = tenProgramOne;
    }

    public String getTenProgramTwo() {
        return tenProgramTwo;
    }

    public void setTenProgramTwo(String tenProgramTwo) {
        this.tenProgramTwo = tenProgramTwo;
    }

    public String getTenProgramThree() {
        return tenProgramThree;
    }

    public void setTenProgramThree(String tenProgramThree) {
        this.tenProgramThree = tenProgramThree;
    }

    public String getTenProgramFour() {
        return tenProgramFour;
    }

    public void setTenProgramFour(String tenProgramFour) {
        this.tenProgramFour = tenProgramFour;
    }

    public String getTenProgramFive() {
        return tenProgramFive;
    }

    public void setTenProgramFive(String tenProgramFive) {
        this.tenProgramFive = tenProgramFive;
    }

    public String getElevenProgramZero() {
        return elevenProgramZero;
    }

    public void setElevenProgramZero(String elevenProgramZero) {
        this.elevenProgramZero = elevenProgramZero;
    }

    public String getElevenProgramOne() {
        return elevenProgramOne;
    }

    public void setElevenProgramOne(String elevenProgramOne) {
        this.elevenProgramOne = elevenProgramOne;
    }

    public String getElevenProgramTwo() {
        return elevenProgramTwo;
    }

    public void setElevenProgramTwo(String elevenProgramTwo) {
        this.elevenProgramTwo = elevenProgramTwo;
    }

    public String getElevenProgramThree() {
        return elevenProgramThree;
    }

    public void setElevenProgramThree(String elevenProgramThree) {
        this.elevenProgramThree = elevenProgramThree;
    }

    public String getElevenProgramFour() {
        return elevenProgramFour;
    }

    public void setElevenProgramFour(String elevenProgramFour) {
        this.elevenProgramFour = elevenProgramFour;
    }

    public String getElevenProgramFive() {
        return elevenProgramFive;
    }

    public void setElevenProgramFive(String elevenProgramFive) {
        this.elevenProgramFive = elevenProgramFive;
    }

    public String getTwelveProgramZero() {
        return twelveProgramZero;
    }

    public void setTwelveProgramZero(String twelveProgramZero) {
        this.twelveProgramZero = twelveProgramZero;
    }

    public String getTwelveProgramOne() {
        return twelveProgramOne;
    }

    public void setTwelveProgramOne(String twelveProgramOne) {
        this.twelveProgramOne = twelveProgramOne;
    }

    public String getTwelveProgramTwo() {
        return twelveProgramTwo;
    }

    public void setTwelveProgramTwo(String twelveProgramTwo) {
        this.twelveProgramTwo = twelveProgramTwo;
    }

    public String getTwelveProgramThree() {
        return twelveProgramThree;
    }

    public void setTwelveProgramThree(String twelveProgramThree) {
        this.twelveProgramThree = twelveProgramThree;
    }

    public String getTwelveProgramFour() {
        return twelveProgramFour;
    }

    public void setTwelveProgramFour(String twelveProgramFour) {
        this.twelveProgramFour = twelveProgramFour;
    }

    public String getTwelveProgramFive() {
        return twelveProgramFive;
    }

    public void setTwelveProgramFive(String twelveProgramFive) {
        this.twelveProgramFive = twelveProgramFive;
    }

    public String getThirteenProgramZero() {
        return thirteenProgramZero;
    }

    public void setThirteenProgramZero(String thirteenProgramZero) {
        this.thirteenProgramZero = thirteenProgramZero;
    }

    public String getThirteenProgramOne() {
        return thirteenProgramOne;
    }

    public void setThirteenProgramOne(String thirteenProgramOne) {
        this.thirteenProgramOne = thirteenProgramOne;
    }

    public String getThirteenProgramTwo() {
        return thirteenProgramTwo;
    }

    public void setThirteenProgramTwo(String thirteenProgramTwo) {
        this.thirteenProgramTwo = thirteenProgramTwo;
    }

    public String getThirteenProgramThree() {
        return thirteenProgramThree;
    }

    public void setThirteenProgramThree(String thirteenProgramThree) {
        this.thirteenProgramThree = thirteenProgramThree;
    }

    public String getThirteenProgramFour() {
        return thirteenProgramFour;
    }

    public void setThirteenProgramFour(String thirteenProgramFour) {
        this.thirteenProgramFour = thirteenProgramFour;
    }

    public String getThirteenProgramFive() {
        return thirteenProgramFive;
    }

    public void setThirteenProgramFive(String thirteenProgramFive) {
        this.thirteenProgramFive = thirteenProgramFive;
    }
}
