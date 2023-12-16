package com.example.se302;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class ReadJSON {

    public static Syllabus readJsonFile(String filePath) {
        ObjectMapper objectMapper = new ObjectMapper();
        Syllabus syllabus = null;

        try {
            syllabus = objectMapper.readValue(new File(filePath), Syllabus.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return syllabus;
    }

    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {

            File selectedFile = fileChooser.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();


            Syllabus syllabus = readJsonFile(filePath);

            if (syllabus != null) {

                System.out.println("Course Name: " + syllabus.getCourseName());
                System.out.println("Code: " + syllabus.getCode());
                System.out.println("Fall: " + syllabus.getFall());
                System.out.println("Spring: " + syllabus.getSpring());
                System.out.println("Theory: " + syllabus.getTheory());
                System.out.println("Local Credit: " + syllabus.getLocalCredit());
                System.out.println("ECTS: " + syllabus.getEcts());
                System.out.println("Prerequisites: " + syllabus.getPrerequisites());
                System.out.println("Lab: " + syllabus.getLab());
                System.out.println("Course Language: " + syllabus.getCourseLanguage());
                System.out.println("Course Type: " + syllabus.getCourseType());
                System.out.println("Course Level: " + syllabus.getCourseLevel());
                System.out.println("Teaching Methods: " + syllabus.getTeachingMethods());
                System.out.println("Course Coordinator : " + syllabus.getCourseCoordinator());
                System.out.println("Course Coordinator 2: " + syllabus.getCourseCoordinator2());
                System.out.println("Assistant: " + syllabus.getAssistant());
                System.out.println("Course Objectives: " + syllabus.getCourseObjectives());
                System.out.println("Learning Outcomes: " + syllabus.getLearningOutcomes());
                System.out.println("Course Description: " + syllabus.getCourseDescription());
                System.out.println("Subjects Two:" + syllabus.getSubjectsTwo());
                System.out.println("Subjects Three:" + syllabus.getSubjectsThree());
                System.out.println("Subjects Four :" + syllabus.getSubjectsFour());
                System.out.println("Subjects Five:" + syllabus.getSubjectsFive());
                System.out.println("Subjects Six:" + syllabus.getSubjectsSix());
                System.out.println("Subjects Seven:" + syllabus.getSubjectsSeven());
                System.out.println("Subjects Eight:" + syllabus.getSubjectsEight());
                System.out.println("Subjects Nine:" + syllabus.getSubjectsNine());
                System.out.println("Subjects Ten:" + syllabus.getSubjectsTen());
                System.out.println("Subjects Eleven:" + syllabus.getSubjectsEleven());
                System.out.println("Subjects Twelve:" + syllabus.getSubjectsTwelve());
                System.out.println("Subjects Thirteen:" + syllabus.getSubjectsThirteen());
                System.out.println("Subjects Fourteen:" + syllabus.getSubjectsFourteen());
                System.out.println("Subjects Fifteen:" + syllabus.getSubjectsFifteen());
                System.out.println("Subjects Sixteen:" + syllabus.getSubjectsSixteen());
                System.out.println("Required Materials Two  :" + syllabus.getRequiredMaterialsTwo());
                System.out.println("Required Materials Three :" + syllabus.getRequiredMaterialsThree());
                System.out.println("Required Materials Four :" + syllabus.getRequiredMaterialsFour());
                System.out.println("Required Materials Five :" + syllabus.getRequiredMaterialsFive());
                System.out.println("Required Materials Six :" + syllabus.getRequiredMaterialsSix());
                System.out.println("Required Materials Seven :" + syllabus.getRequiredMaterialsSeven());
                System.out.println("Required Materials Eight :" + syllabus.getRequiredMaterialsEight());
                System.out.println("Required Materials Nine :" + syllabus.getRequiredMaterialsNine());
                System.out.println("Required Materials Ten :" + syllabus.getRequiredMaterialsTen());
                System.out.println("Required Materials Eleven :" + syllabus.getRequiredMaterialsEleven());
                System.out.println("Required Materials Twelve :" + syllabus.getRequiredMaterialsTwelve());
                System.out.println("Required Materials Thirteen :" + syllabus.getRequiredMaterialsThirteen());
                System.out.println("Required Materials Fourteen :" + syllabus.getRequiredMaterialsFourteen());
                System.out.println("Required Materials Fifteen :" + syllabus.getRequiredMaterialsFifteen());
                System.out.println("Required Materials Sixteen :" + syllabus.getRequiredMaterialsSixteen());
                System.out.println("Participation One :" + syllabus.getParticipationOne());
                System.out.println("Participation Two :" + syllabus.getParticipationTwo());
                System.out.println("Participation Three :" + syllabus.getParticipationThree());
                System.out.println("Participation Four :" + syllabus.getParticipationFour());
                System.out.println("Participation Five :" + syllabus.getParticipationFive());
                System.out.println("Participation Six :" + syllabus.getParticipationSix());
                System.out.println("Participation Seven :" + syllabus.getParticipationSeven());
                System.out.println("Participation Eight :" + syllabus.getParticipationEight());
                System.out.println("Participation Nine :" + syllabus.getParticipationNine());
                System.out.println("Laboratory One:" + syllabus.getLaboratoryOne());
                System.out.println("Laboratory Two:" + syllabus.getLaboratoryTwo());
                System.out.println("Laboratory Three:" + syllabus.getLaboratoryThree());
                System.out.println("Laboratory Four:" + syllabus.getLaboratoryFour());
                System.out.println("Laboratory Five:" + syllabus.getLaboratoryFive());
                System.out.println("Laboratory Six:" + syllabus.getLaboratorySix());
                System.out.println("Laboratory Seven:" + syllabus.getLaboratorySeven());
                System.out.println("Laboratory Eight:" + syllabus.getLaboratoryEight());
                System.out.println("Laboratory Nine:" + syllabus.getLaboratoryNine());
                System.out.println("Field Work One:" + syllabus.getFieldworkOne());
                System.out.println("Field Work Two:" + syllabus.getFieldworkTwo());
                System.out.println("Field Work Three:" + syllabus.getFieldworkThree());
                System.out.println("Field Work Four:" + syllabus.getFieldWorkFour());
                System.out.println("Field Work Five:" + syllabus.getFieldWorkFive());
                System.out.println("Field Work Six:" + syllabus.getFieldWorkSix());
                System.out.println("Field Work Seven:" + syllabus.getFieldWorkSeven());
                System.out.println("Field Work Eight:" + syllabus.getFieldWorkEight());
                System.out.println("Field Work Nine:" + syllabus.getFieldWorkNine());
                System.out.println("Quiz2 One:" + syllabus.getQuiz2One());
                System.out.println("Quiz2 Two:" + syllabus.getQuiz2Two());
                System.out.println("Quiz2 Three:" + syllabus.getQuiz2Three());
                System.out.println("Quiz Four:" + syllabus.getQuizFour());
                System.out.println("Quiz Five:" + syllabus.getQuizFive());
                System.out.println("Quiz Six:" + syllabus.getQuizSix());
                System.out.println("Quiz Seven:" + syllabus.getQuizSeven());
                System.out.println("Quiz Eight:" + syllabus.getQuizEight());
                System.out.println("Quiz Nine:" + syllabus.getQuizNine());
                System.out.println("Course Hour One:" + syllabus.getCourseHourOne());
                System.out.println("Course Hour Two:" + syllabus.getCourseHourTwo());
                System.out.println("Lab Hour One:" + syllabus.getLabhourOne());
                System.out.println("Lab Hour Two:" + syllabus.getLabhourTwo());
                System.out.println("Study Hour One:" + syllabus.getStudyhourOne());
                System.out.println("Study Hour Two:" + syllabus.getStudyhourTwo());
                System.out.println("Study Hour Three:" + syllabus.getStudyhourThree());
                System.out.println("Field Work One:" + syllabus.getFieldworkOne());
                System.out.println("Field Work Two:" + syllabus.getFieldworkTwo());
                System.out.println("Field Work Three:" + syllabus.getFieldworkThree());
                System.out.println("quiz One:" + syllabus.getQuizOne());
                System.out.println("quiz Two:" + syllabus.getQuizTwo());
                System.out.println("quiz Three:" + syllabus.getQuizThree());
                System.out.println("Homework One:" + syllabus.getHomeworkOne());
                System.out.println("Homework Two:" + syllabus.getHomeworkTwo());
                System.out.println("Homework Three:" + syllabus.getHomeworkThree());
                System.out.println("presentation One:" + syllabus.getPresentationOne());
                System.out.println("presentation Two:" + syllabus.getPresentationTwo());
                System.out.println("presentation Three:" + syllabus.getPresentationThree());
                System.out.println("Project One:" + syllabus.getProjectOne());
                System.out.println("Project Two:" + syllabus.getProjectTwo());
                System.out.println("Project Three:" + syllabus.getProjectThree());
                System.out.println("Portfolio One:" + syllabus.getPortfolioOne());
                System.out.println("Portfolio Two:" + syllabus.getPortfolioTwo());
                System.out.println("Portfolio Three:" + syllabus.getPortfolioThree());
                System.out.println("Seminar One:" + syllabus.getSeminarOne());
                System.out.println("Seminar Two:" + syllabus.getSeminarTwo());
                System.out.println("Seminar Three:" + syllabus.getSeminarThree());
                System.out.println("Oral One:" + syllabus.getOralOne());
                System.out.println("Oral Two:" + syllabus.getOralTwo());
                System.out.println("Oral Three:" + syllabus.getOralThree());
                System.out.println("Midterm One:" + syllabus.getMidtermOne());
                System.out.println("Midterm Two:" + syllabus.getMidtermTwo());
                System.out.println("Midterm Three:" + syllabus.getMidtermThree());
                System.out.println("Final One:" + syllabus.getFinalOne());
                System.out.println("Final Two:" + syllabus.getFinalTwo());
                System.out.println("Final Three:" + syllabus.getFinalThree());
                System.out.println("OneProgram Zero:" + syllabus.getOneProgramZero());
                System.out.println("OneProgram One:" + syllabus.getOneProgramOne());
                System.out.println("OneProgram Two:" + syllabus.getOneProgramTwo());
                System.out.println("OneProgram Three:" + syllabus.getOneProgramThree());
                System.out.println("OneProgram Four:" + syllabus.getOneProgramFour());
                System.out.println("OneProgram Five:" + syllabus.getOneProgramFive());
                System.out.println("TwoProgram Zero:" + syllabus.getTwoProgramZero());
                System.out.println("TwoProgram One:" + syllabus.getTwoProgramOne());
                System.out.println("TwoProgram Two:" + syllabus.getTwoProgramTwo());
                System.out.println("TwoProgram Three:" + syllabus.getTwoProgramThree());
                System.out.println("TwoProgram Four:" + syllabus.getTwoProgramFour());
                System.out.println("TwoProgram Five:" + syllabus.getTwoProgramFive());
                System.out.println("ThreeProgram Zero:" + syllabus.getThreeProgramZero());
                System.out.println("ThreeProgram One:" + syllabus.getThreeProgramOne());
                System.out.println("ThreeProgram Two:" + syllabus.getThreeProgramTwo());
                System.out.println("ThreeProgram Three:" + syllabus.getThreeProgramThree());
                System.out.println("ThreeProgram Four:" + syllabus.getThreeProgramFour());
                System.out.println("ThreeProgram Five:" + syllabus.getThreeProgramFive());
                System.out.println("FourProgram Zero:" + syllabus.getFourProgramZero());
                System.out.println("FourProgram One:" + syllabus.getFourProgramOne());
                System.out.println("FourProgram Two:" + syllabus.getFourProgramTwo());
                System.out.println("FourProgram Three:" + syllabus.getFourProgramThree());
                System.out.println("FourProgram Four:" + syllabus.getFourProgramFour());
                System.out.println("FourProgram Five:" + syllabus.getFourProgramFive());
                System.out.println("FiveProgram Zero:" + syllabus.getFiveProgramZero());
                System.out.println("FiveProgram One:" + syllabus.getFiveProgramOne());
                System.out.println("FiveProgram Two:" + syllabus.getFiveProgramTwo());
                System.out.println("FiveProgram Three:" + syllabus.getFiveProgramThree());
                System.out.println("FiveProgram Four:" + syllabus.getFiveProgramFour());
                System.out.println("FiveProgram Five:" + syllabus.getFiveProgramFive());
                System.out.println("SixProgram Zero:" + syllabus.getSixProgramZero());
                System.out.println("SixProgram One:" + syllabus.getSixProgramOne());
                System.out.println("SixProgram Two:" + syllabus.getSixProgramTwo());
                System.out.println("SixProgram Three:" + syllabus.getSixProgramThree());
                System.out.println("SixProgram Four:" + syllabus.getSixProgramFour());
                System.out.println("SixProgram Five:" + syllabus.getSixProgramFive());
                System.out.println("SevenProgram Zero:" + syllabus.getSevenProgramZero());
                System.out.println("SevenProgram One:" + syllabus.getSevenProgramOne());
                System.out.println("SevenProgram Two:" + syllabus.getSevenProgramTwo());
                System.out.println("SevenProgram Three:" + syllabus.getSevenProgramThree());
                System.out.println("SevenProgram Four:" + syllabus.getSevenProgramFour());
                System.out.println("SevenProgram Five:" + syllabus.getSevenProgramFive());
                System.out.println("EightProgram Zero:" + syllabus.getEightProgramZero());
                System.out.println("EightProgram One:" + syllabus.getEightProgramOne());
                System.out.println("EightProgram Two:" + syllabus.getEightProgramTwo());
                System.out.println("EightProgram Three:" + syllabus.getEightProgramThree());
                System.out.println("EightProgram Four:" + syllabus.getEightProgramFour());
                System.out.println("EightProgram Five:" + syllabus.getEightProgramFive());
                System.out.println("NineProgram Zero:" + syllabus.getNineProgramZero());
                System.out.println("NineProgram One:" + syllabus.getNineProgramOne());
                System.out.println("NineProgram Two:" + syllabus.getNineProgramTwo());
                System.out.println("NineProgram Three:" + syllabus.getNineProgramThree());
                System.out.println("NineProgram Four:" + syllabus.getNineProgramFour());
                System.out.println("NineProgram Five:" + syllabus.getNineProgramFive());
                System.out.println("TenProgram Zero:" + syllabus.getTenProgramZero());
                System.out.println("TenProgram One:" + syllabus.getTenProgramOne());
                System.out.println("TenProgram Two:" + syllabus.getTenProgramTwo());
                System.out.println("TenProgram Three:" + syllabus.getTenProgramThree());
                System.out.println("TenProgram Four:" + syllabus.getTenProgramFour());
                System.out.println("TenProgram Five:" + syllabus.getTenProgramFive());
                System.out.println("ElevenProgram Zero:" + syllabus.getElevenProgramZero());
                System.out.println("ElevenProgram One:" + syllabus.getElevenProgramOne());
                System.out.println("ElevenProgram Two:" + syllabus.getElevenProgramTwo());
                System.out.println("ElevenProgram Three:" + syllabus.getElevenProgramThree());
                System.out.println("ElevenProgram Four:" + syllabus.getElevenProgramFour());
                System.out.println("ElevenProgram Five:" + syllabus.getElevenProgramFive());
                System.out.println("TwelveProgram Zero:" + syllabus.getTwelveProgramZero());
                System.out.println("TwelveProgram One:" + syllabus.getTwelveProgramOne());
                System.out.println("TwelveProgram Two:" + syllabus.getTwelveProgramTwo());
                System.out.println("TwelveProgram Three:" + syllabus.getTwelveProgramThree());
                System.out.println("TwelveProgram Four:" + syllabus.getTwelveProgramFour());
                System.out.println("TwelveProgram Five:" + syllabus.getTwelveProgramFive());
                System.out.println("ThirteenProgram Zero:" + syllabus.getThirteenProgramZero());
                System.out.println("ThirteenProgram One:" + syllabus.getThirteenProgramOne());
                System.out.println("ThirteenProgram Two:" + syllabus.getThirteenProgramTwo());
                System.out.println("ThirteenProgram Three:" + syllabus.getThirteenProgramThree());
                System.out.println("ThirteenProgram Four:" + syllabus.getThirteenProgramFour());
                System.out.println("ThirteenProgram Five:" + syllabus.getThirteenProgramFive());
                System.out.println("Teaching Methods:" + syllabus.getTeachingMethods());




            } else {
                System.out.println("Failed to read the JSON file.");
            }
        } else {
            System.out.println("File selection canceled by the user.");
        }
    }
}
