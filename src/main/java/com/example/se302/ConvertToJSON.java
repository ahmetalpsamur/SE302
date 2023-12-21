package com.example.se302;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ConvertToJSON {

    static ArrayList<String> fileList = new ArrayList();
    private static int sameFileCounter = 0;


    public static void generateJsonFile(Syllabus syllabus, File file) {  ///// FILL THE BLANK PARTS

        if (syllabus.getCode() != null) {
            if (!fileList.contains("syllabus" + syllabus.getCode() + ".json")) {

                String filePath = "syllabus_" + syllabus.getCode() + ".json";
                sameFileCounter++;
                fileList.add("syllabus_" + syllabus.getCode() + ".json");

                String jsonString = "{\n"

                       + "Changes Detail: "
                       + "\"Code of the Class\" : \" " + syllabus.getCode() + "\n"
                       + "\"Editor Name and Surname\" : \" " + syllabus.getEditorName() + "\n"  //add editor info with get
                       + "\"Reason for Changes\" : \" " + syllabus.getEditDescription() + "\n" // get why change info
                       + "\"When was change made\" : \" " + syllabus.getEditDate() + "\n" //get date box
                       + "\"What time was change made\" : \" " + syllabus.getEditTime() + "\n" //get time box
                    //    + "\"Language of the Syllabus\" : \" " + syllabus.getSyllabusLanguage() + "\n" //get language

                        + "\n"

                        + "  \"courseName\": \"" + syllabus.getCourseName() + "\",\n"
                        + "  \"code\": \"" + syllabus.getCode() + "\",\n"
                        + "  \"fall\": \"" + syllabus.getFall() + "\",\n"
                        + "  \"spring\": \"" + syllabus.getSpring() + "\",\n"
                        + "  \"theory\": \"" + syllabus.getTheory() + "\",\n"
                        + "  \"localCredit\": \"" + syllabus.getLocalCredit() + "\",\n"
                        + "  \"ects\": \"" + syllabus.getEcts() + "\",\n"
                        + "  \"prerequisites\": \"" + syllabus.getPrerequisites() + "\",\n"
                        + "  \"lab\": \"" + syllabus.getLab() + "\",\n"
                        + "  \"courseLanguage\": \"" + syllabus.getCourseLanguage() + "\",\n"
                        + "  \"courseType\": \"" + syllabus.getCourseType() + "\",\n"
                        + "  \"courseLevel\": \"" + syllabus.getCourseLevel() + "\",\n"
                        + "  \"teachingMethods\": \"" + syllabus.getTeachingMethods() + "\",\n"
                        + "  \"courseCoordinator\": \"" + syllabus.getCourseCoordinator() + "\",\n"
                        + "  \"courseCoordinator2\": \"" + syllabus.getCourseCoordinator2() + "\",\n"
                        + "  \"assistant\": \"" + syllabus.getAssistant() + "\",\n"
                        + "  \"courseObjectives\": \"" + syllabus.getCourseObjectives() + "\",\n"
                        + "  \"learningOutcomes\": \"" + syllabus.getLearningOutcomes() + "\",\n"
                        + "  \"courseDescription\": \"" + syllabus.getCourseDescription() + "\",\n"
                        + "  \"Course Category\": \"" + syllabus.getCourseCategory() + "\",\n"
                        + "  \"Subjects Two\": \"" + syllabus.getSubjectsTwo() + "\",\n"
                        + "  \"Subjects Three\": \"" + syllabus.getSubjectsThree() + "\",\n"
                        + "  \"Subjects Four\": \"" + syllabus.getSubjectsFour() + "\",\n"
                        + "  \"Subjects Five\": \"" + syllabus.getSubjectsFive() + "\",\n"
                        + "  \"Subjects Six\": \"" + syllabus.getSubjectsSix() + "\",\n"
                        + "  \"Subjects Seven\": \"" + syllabus.getSubjectsSeven() + "\",\n"
                        + "  \"Subjects Eight\": \"" + syllabus.getSubjectsEight() + "\",\n"
                        + "  \"Subjects Nine\": \"" + syllabus.getSubjectsNine() + "\",\n"
                        + "  \"Subjects Ten\": \"" + syllabus.getSubjectsTen() + "\",\n"
                        + "  \"Subjects Eleven\": \"" + syllabus.getSubjectsEleven() + "\",\n"
                        + "  \"Subjects Twelve\": \"" + syllabus.getSubjectsTwelve() + "\",\n"
                        + "  \"Subjects Thirteen\": \"" + syllabus.getSubjectsThirteen() + "\",\n"
                        + "  \"Subjects Fourteen\": \"" + syllabus.getSubjectsFourteen() + "\",\n"
                        + "  \"Subjects Fifteen\": \"" + syllabus.getSubjectsFifteen() + "\",\n"
                        + "  \"Subjects Sixteen\": \"" + syllabus.getSubjectsSixteen() + "\",\n"
                        + "  \"Required Two\": \"" + syllabus.getRequiredMaterialsTwo() + "\",\n"
                        + "  \"Required Three\": \"" + syllabus.getRequiredMaterialsThree() + "\",\n"
                        + "  \"Required Four\": \"" + syllabus.getRequiredMaterialsFour() + "\",\n"
                        + "  \"Required Five\": \"" + syllabus.getRequiredMaterialsFive() + "\",\n"
                        + "  \"Required Six\": \"" + syllabus.getRequiredMaterialsSix() + "\",\n"
                        + "  \"Required Seven\": \"" + syllabus.getRequiredMaterialsSeven() + "\",\n"
                        + "  \"Required Eight\": \"" + syllabus.getRequiredMaterialsEight() + "\",\n"
                        + "  \"Required Nine\": \"" + syllabus.getRequiredMaterialsNine() + "\",\n"
                        + "  \"Required Ten\": \"" + syllabus.getRequiredMaterialsTen() + "\",\n"
                        + "  \"Required Eleven\": \"" + syllabus.getRequiredMaterialsEleven() + "\",\n"
                        + "  \"Required Twelve\": \"" + syllabus.getRequiredMaterialsTwelve() + "\",\n"
                        + "  \"Required Thirteen\": \"" + syllabus.getRequiredMaterialsThirteen() + "\",\n"
                        + "  \"Required Fourteen\": \"" + syllabus.getRequiredMaterialsFourteen() + "\",\n"
                        + "  \"Required Fifteen\": \"" + syllabus.getRequiredMaterialsFifteen() + "\",\n"
                        + "  \"Participation One\": \"" + syllabus.getParticipationOne() + "\",\n"
                        + "  \"Participation Two\": \"" + syllabus.getParticipationTwo() + "\",\n"
                        + "  \"Participation Three\": \"" + syllabus.getParticipationThree() + "\",\n"
                        + "  \"Participation Four\": \"" + syllabus.getParticipationFour() + "\",\n"
                        + "  \"Participation Five\": \"" + syllabus.getParticipationFive() + "\",\n"
                        + "  \"Participation Six\": \"" + syllabus.getParticipationSix() + "\",\n"
                        + "  \"Participation Seven\": \"" + syllabus.getParticipationSeven() + "\",\n"
                        + "  \"Participation Eight\": \"" + syllabus.getParticipationEight() + "\",\n"
                        + "  \"Participation Nine\": \"" + syllabus.getParticipationNine() + "\",\n"
                        + "  \"Laboratory One\": \"" + syllabus.getLaboratoryOne() + "\",\n"
                        + "  \"Laboratory Two\": \"" + syllabus.getLaboratoryTwo() + "\",\n"
                        + "  \"Laboratory Three\": \"" + syllabus.getLaboratoryThree() + "\",\n"
                        + "  \"Laboratory Four\": \"" + syllabus.getLaboratoryFour() + "\",\n"
                        + "  \"Laboratory Five\": \"" + syllabus.getLaboratoryFive() + "\",\n"
                        + "  \"Laboratory Six\": \"" + syllabus.getLaboratorySix() + "\",\n"
                        + "  \"Laboratory Seven\": \"" + syllabus.getLaboratorySeven() + "\",\n"
                        + "  \"Laboratory Eight\": \"" + syllabus.getLaboratoryEight() + "\",\n"
                        + "  \"Laboratory Nine\": \"" + syllabus.getLaboratoryNine() + "\",\n"
                        + "  \"FieldWork One\": \"" + syllabus.getFieldWorkOne() + "\",\n"
                        + "  \"FieldWork Two\": \"" + syllabus.getFieldWorkTwo() + "\",\n"
                        + "  \"FieldWork Three\": \"" + syllabus.getFieldWorkThree() + "\",\n"
                        + "  \"FieldWork Four\": \"" + syllabus.getFieldWorkFour() + "\",\n"
                        + "  \"FieldWork Five\": \"" + syllabus.getFieldWorkFive() + "\",\n"
                        + "  \"FieldWork Six\": \"" + syllabus.getFieldWorkSix() + "\",\n"
                        + "  \"FieldWork Seven\": \"" + syllabus.getFieldWorkSeven() + "\",\n"
                        + "  \"FieldWork Eight\": \"" + syllabus.getFieldWorkEight() + "\",\n"
                        + "  \"FieldWork Nine\": \"" + syllabus.getFieldWorkNine() + "\",\n"
                        + "  \"Quiz2 One\": \"" + syllabus.getQuiz2One() + "\",\n"
                        + "  \"Quiz2 Two\": \"" + syllabus.getQuiz2Two() + "\",\n"
                        + "  \"Quiz2 Three\": \"" + syllabus.getQuiz2Three() + "\",\n"
                        + "  \"Quiz Four\": \"" + syllabus.getQuizFour() + "\",\n"
                        + "  \"Quiz Five\": \"" + syllabus.getQuizFive() + "\",\n"
                        + "  \"Quiz Six\": \"" + syllabus.getQuizSix() + "\",\n"
                        + "  \"Quiz Seven\": \"" + syllabus.getQuizSeven() + "\",\n"
                        + "  \"Quiz Eight\": \"" + syllabus.getQuizEight() + "\",\n"
                        + "  \"Quiz Nine\": \"" + syllabus.getQuizNine() + "\",\n"
                        + "  \"Coursehour One\": \"" + syllabus.getCourseHourOne() + "\",\n"
                        + "  \"Coursehour Two\": \"" + syllabus.getCourseHourTwo() + "\",\n"
                        + "  \"Labhour One\": \"" + syllabus.getLabhourOne() + "\",\n"
                        + "  \"Labhour Two\": \"" + syllabus.getLabhourTwo() + "\",\n"
                        + "  \"Studyhour One\": \"" + syllabus.getStudyhourOne() + "\",\n"
                        + "  \"Studyhour Two\": \"" + syllabus.getStudyhourTwo() + "\",\n"
                        + "  \"Studyhour Three\": \"" + syllabus.getStudyhourThree() + "\",\n"
                        + "  \"Fieldwork One\": \"" + syllabus.getFieldworkOne() + "\",\n"
                        + "  \"Fieldwork Two\": \"" + syllabus.getFieldworkTwo() + "\",\n"
                        + "  \"Fieldwork Three\": \"" + syllabus.getFieldworkThree() + "\",\n"
                        + "  \"Quiz One\": \"" + syllabus.getQuizOne() + "\",\n"
                        + "  \"Quiz Two\": \"" + syllabus.getQuizTwo() + "\",\n"
                        + "  \"Quiz Three\": \"" + syllabus.getQuizThree() + "\",\n"
                        + "  \"Homework One\": \"" + syllabus.getHomeworkOne() + "\",\n"
                        + "  \"Homework Two\": \"" + syllabus.getHomeworkTwo() + "\",\n"
                        + "  \"Homework Three\": \"" + syllabus.getHomeworkThree() + "\",\n"
                        + "  \"Presentation One\": \"" + syllabus.getPresentationOne() + "\",\n"
                        + "  \"Presentation Two\": \"" + syllabus.getPresentationTwo() + "\",\n"
                        + "  \"Presentation Three\": \"" + syllabus.getPresentationThree() + "\",\n"
                        + "  \"Project One\": \"" + syllabus.getProjectOne() + "\",\n"
                        + "  \"Project Two\": \"" + syllabus.getProjectTwo() + "\",\n"
                        + "  \"Project Three\": \"" + syllabus.getProjectThree() + "\",\n"
                        + "  \"Portfolio One\": \"" + syllabus.getPortfolioOne() + "\",\n"
                        + "  \"Portfolio Two\": \"" + syllabus.getPortfolioTwo() + "\",\n"
                        + "  \"Portfolio Three\": \"" + syllabus.getPortfolioThree() + "\",\n"
                        + "  \"Seminar One\": \"" + syllabus.getSeminarOne() + "\",\n"
                        + "  \"Seminar Two\": \"" + syllabus.getSeminarTwo() + "\",\n"
                        + "  \"Seminar Three\": \"" + syllabus.getSeminarThree() + "\",\n"
                        + "  \"Oral One\": \"" + syllabus.getOralOne() + "\",\n"
                        + "  \"Oral Two\": \"" + syllabus.getOralTwo() + "\",\n"
                        + "  \"Oral Three\": \"" + syllabus.getOralThree() + "\",\n"
                        + "  \"Midterm One\": \"" + syllabus.getMidtermOne() + "\",\n"
                        + "  \"Midterm Two\": \"" + syllabus.getMidtermTwo() + "\",\n"
                        + "  \"Midterm Three\": \"" + syllabus.getMidtermThree() + "\",\n"
                        + "  \"Final One\": \"" + syllabus.getFinalOne() + "\",\n"
                        + "  \"Final Two\": \"" + syllabus.getFinalTwo() + "\",\n"
                        + "  \"Final Three\": \"" + syllabus.getFinalThree() + "\",\n"
                        + "  \"OneProgram Zero\": \"" + syllabus.getOneProgramZero() + "\",\n"
                        + "  \"OneProgram One\": \"" + syllabus.getOneProgramOne() + "\",\n"
                        + "  \"OneProgram Two\": \"" + syllabus.getOneProgramTwo() + "\",\n"
                        + "  \"OneProgram Three\": \"" + syllabus.getOneProgramThree() + "\",\n"
                        + "  \"OneProgram Four\": \"" + syllabus.getOneProgramFour() + "\",\n"
                        + "  \"OneProgram Five\": \"" + syllabus.getOneProgramFive() + "\",\n"
                        + "  \"TwoProgramZero\": \"" + syllabus.getTwoProgramZero() + "\",\n"
                        + "  \"TwoProgramOne\": \"" + syllabus.getTwoProgramOne() + "\",\n"
                        + "  \"TwoProgramTwo\": \"" + syllabus.getTwoProgramTwo() + "\",\n"
                        + "  \"TwoProgramThree\": \"" + syllabus.getTwoProgramThree() + "\",\n"
                        + "  \"TwoProgramFour\": \"" + syllabus.getTwoProgramFour() + "\",\n"
                        + "  \"TwoProgramFive\": \"" + syllabus.getTwoProgramFive() + "\",\n"
                        + "  \"ThreeProgramZero\": \"" + syllabus.getThreeProgramZero() + "\",\n"
                        + "  \"ThreeProgramOne\": \"" + syllabus.getThreeProgramOne() + "\",\n"
                        + "  \"ThreeProgramTwo\": \"" + syllabus.getThreeProgramTwo() + "\",\n"
                        + "  \"ThreeProgramThree\": \"" + syllabus.getThreeProgramThree() + "\",\n"
                        + "  \"ThreeProgramFour\": \"" + syllabus.getThreeProgramFour() + "\",\n"
                        + "  \"ThreeProgramFive\": \"" + syllabus.getThreeProgramFive() + "\",\n"
                        + "  \"FourProgramZero\": \"" + syllabus.getFourProgramZero() + "\",\n"
                        + "  \"FourProgramOne\": \"" + syllabus.getFourProgramOne() + "\",\n"
                        + "  \"FourProgramTwo\": \"" + syllabus.getFourProgramTwo() + "\",\n"
                        + "  \"FourProgramThree\": \"" + syllabus.getFourProgramThree() + "\",\n"
                        + "  \"FourProgramFour\": \"" + syllabus.getFourProgramFour() + "\",\n"
                        + "  \"FourProgramFive\": \"" + syllabus.getFourProgramFive() + "\",\n"
                        + "  \"FiveProgramZero\": \"" + syllabus.getFiveProgramZero() + "\",\n"
                        + "  \"FiveProgramOne\": \"" + syllabus.getFiveProgramOne() + "\",\n"
                        + "  \"FiveProgramTwo\": \"" + syllabus.getFiveProgramTwo() + "\",\n"
                        + "  \"FiveProgramThree\": \"" + syllabus.getFiveProgramThree() + "\",\n"
                        + "  \"FiveProgramFour\": \"" + syllabus.getFiveProgramFour() + "\",\n"
                        + "  \"FiveProgramFive\": \"" + syllabus.getFiveProgramFive() + "\",\n"
                        + "  \"SixProgramZero\": \"" + syllabus.getSixProgramZero() + "\",\n"
                        + "  \"SixProgramOne\": \"" + syllabus.getSixProgramOne() + "\",\n"
                        + "  \"SixProgramTwo\": \"" + syllabus.getSixProgramTwo() + "\",\n"
                        + "  \"SixProgramThree\": \"" + syllabus.getSixProgramThree() + "\",\n"
                        + "  \"SixProgramFour\": \"" + syllabus.getSixProgramFour() + "\",\n"
                        + "  \"SixProgramFive\": \"" + syllabus.getSixProgramFive() + "\",\n"
                        + "  \"SevenProgramZero\": \"" + syllabus.getSevenProgramZero() + "\",\n"
                        + "  \"SevenProgramOne\": \"" + syllabus.getSevenProgramOne() + "\",\n"
                        + "  \"SevenProgramTwo\": \"" + syllabus.getSevenProgramTwo() + "\",\n"
                        + "  \"SevenProgramThree\": \"" + syllabus.getSevenProgramThree() + "\",\n"
                        + "  \"SevenProgramFour\": \"" + syllabus.getSevenProgramFour() + "\",\n"
                        + "  \"SevenProgramFive\": \"" + syllabus.getSevenProgramFive() + "\",\n"
                        + "  \"EightProgramZero\": \"" + syllabus.getEightProgramZero() + "\",\n"
                        + "  \"EightProgramOne\": \"" + syllabus.getEightProgramOne() + "\",\n"
                        + "  \"EightProgramTwo\": \"" + syllabus.getEightProgramTwo() + "\",\n"
                        + "  \"EightProgramThree\": \"" + syllabus.getEightProgramThree() + "\",\n"
                        + "  \"EightProgramFour\": \"" + syllabus.getEightProgramFour() + "\",\n"
                        + "  \"EightProgramFive\": \"" + syllabus.getEightProgramFive() + "\",\n"
                        + "  \"NineProgramZero\": \"" + syllabus.getNineProgramZero() + "\",\n"
                        + "  \"NineProgramOne\": \"" + syllabus.getNineProgramOne() + "\",\n"
                        + "  \"NineProgramTwo\": \"" + syllabus.getNineProgramTwo() + "\",\n"
                        + "  \"NineProgramThree\": \"" + syllabus.getNineProgramThree() + "\",\n"
                        + "  \"NineProgramFour\": \"" + syllabus.getNineProgramFour() + "\",\n"
                        + "  \"NineProgramFive\": \"" + syllabus.getNineProgramFive() + "\",\n"
                        + "  \"TenProgramZero\": \"" + syllabus.getTenProgramZero() + "\",\n"
                        + "  \"TenProgramOne\": \"" + syllabus.getTenProgramOne() + "\",\n"
                        + "  \"TenProgramTwo\": \"" + syllabus.getTenProgramTwo() + "\",\n"
                        + "  \"TenProgramThree\": \"" + syllabus.getTenProgramThree() + "\",\n"
                        + "  \"TenProgramFour\": \"" + syllabus.getTenProgramFour() + "\",\n"
                        + "  \"TenProgramFive\": \"" + syllabus.getTenProgramFive() + "\",\n"
                        + "  \"ElevenProgramZero\": \"" + syllabus.getElevenProgramZero() + "\",\n"
                        + "  \"ElevenProgramOne\": \"" + syllabus.getElevenProgramOne() + "\",\n"
                        + "  \"ElevenProgramTwo\": \"" + syllabus.getElevenProgramTwo() + "\",\n"
                        + "  \"ElevenProgramThree\": \"" + syllabus.getElevenProgramThree() + "\",\n"
                        + "  \"ElevenProgramFour\": \"" + syllabus.getElevenProgramFour() + "\",\n"
                        + "  \"ElevenProgramFive\": \"" + syllabus.getElevenProgramFive() + "\",\n"
                        + "  \"TwelveProgramZero\": \"" + syllabus.getTwelveProgramZero() + "\",\n"
                        + "  \"TwelveProgramOne\": \"" + syllabus.getTwelveProgramOne() + "\",\n"
                        + "  \"TwelveProgramTwo\": \"" + syllabus.getTwelveProgramTwo() + "\",\n"
                        + "  \"TwelveProgramThree\": \"" + syllabus.getTwelveProgramThree() + "\",\n"
                        + "  \"TwelveProgramFour\": \"" + syllabus.getTwelveProgramFour() + "\",\n"
                        + "  \"TwelveProgramFive\": \"" + syllabus.getTwelveProgramFive() + "\",\n"
                        + "  \"ThirteenProgramZero\": \"" + syllabus.getThirteenProgramZero() + "\",\n"
                        + "  \"ThirteenProgramOne\": \"" + syllabus.getThirteenProgramOne() + "\",\n"
                        + "  \"ThirteenProgramTwo\": \"" + syllabus.getThirteenProgramTwo() + "\",\n"
                        + "  \"ThirteenProgramThree\": \"" + syllabus.getThirteenProgramThree() + "\",\n"
                        + "  \"ThirteenProgramFour\": \"" + syllabus.getThirteenProgramFour() + "\",\n"
                        + "  \"ThirteenProgramFive\": \"" + syllabus.getThirteenProgramFive() + "\",\n"
                        + "  \"teachingMethods\": \"" + syllabus.getTeachingMethods() + "\"\n"
                        + "}";

                // Write the JSON string to a file
                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write(jsonString);
                    System.out.println("Data written to " + file.getAbsolutePath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }  /* else if (fileList.contains("syllabus" + syllabus.getCode() + ".json"){
           String filePath = "syllabus_" + syllabus.getCode() + sameFileCounter + ".json";
        } */     //IF THERE IS A FILE WITH THE SAME NAME,
        //ADD THE FILE NAME (1), (2) ,...
        else {
            System.out.println("Please enter the course code");
        }
    }













    public static void Compare(Syllabus syllabus, Syllabus editSyllabus, File file){

        try {
            String compareFilePath;
            if (!syllabus.getCode().equals(editSyllabus.getCode())) {
                compareFilePath = "Changes_" + editSyllabus.getCode() + ".json";
            } else {
                compareFilePath = "Changes_" + syllabus.getCode() + ".json";
            }

            FileWriter fileWriter = new FileWriter(compareFilePath);

            if (!syllabus.getCode().equals(editSyllabus.getCode())) {
                sameFileCounter++;
                fileList.add(compareFilePath);
            }

            if (!syllabus.getCourseName().equals(editSyllabus.getCourseName())) {
                fileWriter.write("  Course Name changed from '" + syllabus.getCourseName() + "' to '" + editSyllabus.getCourseName() + "'");
            }

            if (!syllabus.getCode().equals(editSyllabus.getCode())) {
                fileWriter.write("  Code changed from '" + syllabus.getCode() + "' to '" + editSyllabus.getCode() + "'");
            }

            if (!syllabus.getFall().equals(editSyllabus.getFall())) {
                fileWriter.write("  Fall changed from '" + syllabus.getFall() + "' to '" + editSyllabus.getFall() + "'");
            }

            if (!syllabus.getSpring().equals(editSyllabus.getSpring())) {
                fileWriter.write("  Spring changed from '" + syllabus.getSpring() + "' to '" + editSyllabus.getSpring() + "'");
            }

            if (!syllabus.getTheory().equals(editSyllabus.getTheory())) {
                fileWriter.write("  Theory changed from '" + syllabus.getTheory() + "' to '" + editSyllabus.getTheory() + "'");
            }

            if (!syllabus.getLocalCredit().equals(editSyllabus.getLocalCredit())) {
                fileWriter.write("  Local Credit changed from '" + syllabus.getLocalCredit() + "' to '" + editSyllabus.getLocalCredit() + "'");
            }

            if (!syllabus.getEcts().equals(editSyllabus.getEcts())) {
                fileWriter.write("  ECTS changed from '" + syllabus.getEcts() + "' to '" + editSyllabus.getEcts() + "'");
            }

            if (!syllabus.getPrerequisites().equals(editSyllabus.getPrerequisites())) {
                fileWriter.write("  Prerequisites changed from '" + syllabus.getPrerequisites() + "' to '" + editSyllabus.getPrerequisites() + "'");
            }

            if (!syllabus.getLab().equals(editSyllabus.getLab())) {
                fileWriter.write("  Lab changed from '" + syllabus.getLab() + "' to '" + editSyllabus.getLab() + "'");
            }

            if (!syllabus.getCourseLanguage().equals(editSyllabus.getCourseLanguage())) {
                fileWriter.write("  Course Language changed from '" + syllabus.getCourseLanguage() + "' to '" + editSyllabus.getCourseLanguage() + "'");
            }

            if (!syllabus.getCourseType().equals(editSyllabus.getCourseType())) {
                fileWriter.write("  Course Type changed from '" + syllabus.getCourseType() + "' to '" + editSyllabus.getCourseType() + "'");
            }

            if (!syllabus.getCourseLevel().equals(editSyllabus.getCourseLevel())) {
                fileWriter.write("  Course Level changed from '" + syllabus.getCourseLevel() + "' to '" + editSyllabus.getCourseLevel() + "'");
            }

            if (!syllabus.getTeachingMethods().equals(editSyllabus.getTeachingMethods())) {
                fileWriter.write("  Teaching Methods changed from '" + syllabus.getTeachingMethods() + "' to '" + editSyllabus.getTeachingMethods() + "'");
            }

            if (!syllabus.getCourseCoordinator().equals(editSyllabus.getCourseCoordinator())) {
                fileWriter.write("  Course Coordinator changed from '" + syllabus.getCourseCoordinator() + "' to '" + editSyllabus.getCourseCoordinator() + "'");
            }

            if (!syllabus.getCourseCoordinator2().equals(editSyllabus.getCourseCoordinator2())) {
                fileWriter.write("  Course Coordinator2 changed from '" + syllabus.getCourseCoordinator2() + "' to '" + editSyllabus.getCourseCoordinator2() + "'");
            }

            if (!syllabus.getAssistant().equals(editSyllabus.getAssistant())) {
                fileWriter.write("  Assistant changed from '" + syllabus.getAssistant() + "' to '" + editSyllabus.getAssistant() + "'");
            }

            if (!syllabus.getCourseObjectives().equals(editSyllabus.getCourseObjectives())) {
                fileWriter.write("  Course Objectives changed from '" + syllabus.getCourseObjectives() + "' to '" + editSyllabus.getCourseObjectives() + "'");
            }

            if (!syllabus.getLearningOutcomes().equals(editSyllabus.getLearningOutcomes())) {
                fileWriter.write("  Learning Outcomes changed from '" + syllabus.getLearningOutcomes() + "' to '" + editSyllabus.getLearningOutcomes() + "'");
            }

            if (!syllabus.getCourseDescription().equals(editSyllabus.getCourseDescription())) {
                fileWriter.write("  Course Description changed from '" + syllabus.getCourseDescription() + "' to '" + editSyllabus.getCourseDescription() + "'");
            }
            if (!syllabus.getSubjectsTwo().equals(editSyllabus.getSubjectsTwo())) {
                fileWriter.write("  Subjects Two changed from '" + syllabus.getSubjectsTwo() + "' to '" + editSyllabus.getSubjectsTwo() + "'");
            }

            if (!syllabus.getSubjectsThree().equals(editSyllabus.getSubjectsThree())) {
                fileWriter.write("  Subjects Three changed from '" + syllabus.getSubjectsThree() + "' to '" + editSyllabus.getSubjectsThree() + "'");
            }

            if (!syllabus.getSubjectsFour().equals(editSyllabus.getSubjectsFour())) {
                fileWriter.write("  Subjects Four changed from '" + syllabus.getSubjectsFour() + "' to '" + editSyllabus.getSubjectsFour() + "'");
            }

            if (!syllabus.getSubjectsFive().equals(editSyllabus.getSubjectsFive())) {
                fileWriter.write("  Subjects Five changed from '" + syllabus.getSubjectsFive() + "' to '" + editSyllabus.getSubjectsFive() + "'");
            }

            if (!syllabus.getSubjectsSix().equals(editSyllabus.getSubjectsSix())) {
                fileWriter.write("  Subjects Six changed from '" + syllabus.getSubjectsSix() + "' to '" + editSyllabus.getSubjectsSix() + "'");
            }

            if (!syllabus.getSubjectsSeven().equals(editSyllabus.getSubjectsSeven())) {
                fileWriter.write("  Subjects Seven changed from '" + syllabus.getSubjectsSeven() + "' to '" + editSyllabus.getSubjectsSeven() + "'");
            }

            if (!syllabus.getSubjectsEight().equals(editSyllabus.getSubjectsEight())) {
                fileWriter.write("  Subjects Eight changed from '" + syllabus.getSubjectsEight() + "' to '" + editSyllabus.getSubjectsEight() + "'");
            }

            if (!syllabus.getSubjectsNine().equals(editSyllabus.getSubjectsNine())) {
                fileWriter.write("  Subjects Nine changed from '" + syllabus.getSubjectsNine() + "' to '" + editSyllabus.getSubjectsNine() + "'");
            }

            if (!syllabus.getSubjectsTen().equals(editSyllabus.getSubjectsTen())) {
                fileWriter.write("  Subjects Ten changed from '" + syllabus.getSubjectsTen() + "' to '" + editSyllabus.getSubjectsTen() + "'");
            }

            if (!syllabus.getSubjectsEleven().equals(editSyllabus.getSubjectsEleven())) {
                fileWriter.write("  Subjects Eleven changed from '" + syllabus.getSubjectsEleven() + "' to '" + editSyllabus.getSubjectsEleven() + "'");
            }

            if (!syllabus.getSubjectsTwelve().equals(editSyllabus.getSubjectsTwelve())) {
                fileWriter.write("  Subjects Twelve changed from '" + syllabus.getSubjectsTwelve() + "' to '" + editSyllabus.getSubjectsTwelve() + "'");
            }

            if (!syllabus.getSubjectsThirteen().equals(editSyllabus.getSubjectsThirteen())) {
                fileWriter.write("  Subjects Thirteen changed from '" + syllabus.getSubjectsThirteen() + "' to '" + editSyllabus.getSubjectsThirteen() + "'");
            }

            if (!syllabus.getSubjectsFourteen().equals(editSyllabus.getSubjectsFourteen())) {
                fileWriter.write("  Subjects Fourteen changed from '" + syllabus.getSubjectsFourteen() + "' to '" + editSyllabus.getSubjectsFourteen() + "'");
            }

            if (!syllabus.getSubjectsFifteen().equals(editSyllabus.getSubjectsFifteen())) {
                fileWriter.write("  Subjects Fifteen changed from '" + syllabus.getSubjectsFifteen() + "' to '" + editSyllabus.getSubjectsFifteen() + "'");
            }

            if (!syllabus.getSubjectsSixteen().equals(editSyllabus.getSubjectsSixteen())) {
                fileWriter.write("  Subjects Sixteen changed from '" + syllabus.getSubjectsSixteen() + "' to '" + editSyllabus.getSubjectsSixteen() + "'");
            }

            if (!syllabus.getRequiredMaterialsTwo().equals(editSyllabus.getRequiredMaterialsTwo())) {
                fileWriter.write("  Required Two changed from '" + syllabus.getRequiredMaterialsTwo() + "' to '" + editSyllabus.getRequiredMaterialsTwo() + "'");
            }

            if (!syllabus.getRequiredMaterialsThree().equals(editSyllabus.getRequiredMaterialsThree())) {
                fileWriter.write("  Required Three changed from '" + syllabus.getRequiredMaterialsThree() + "' to '" + editSyllabus.getRequiredMaterialsThree() + "'");
            }

            if (!syllabus.getRequiredMaterialsFour().equals(editSyllabus.getRequiredMaterialsFour())) {
                fileWriter.write("  Required Four changed from '" + syllabus.getRequiredMaterialsFour() + "' to '" + editSyllabus.getRequiredMaterialsFour() + "'");
            }

            if (!syllabus.getRequiredMaterialsFive().equals(editSyllabus.getRequiredMaterialsFive())) {
                fileWriter.write("  Required Five changed from '" + syllabus.getRequiredMaterialsFive() + "' to '" + editSyllabus.getRequiredMaterialsFive() + "'");
            }

            if (!syllabus.getRequiredMaterialsSix().equals(editSyllabus.getRequiredMaterialsSix())) {
                fileWriter.write("  Required Six changed from '" + syllabus.getRequiredMaterialsSix() + "' to '" + editSyllabus.getRequiredMaterialsSix() + "'");
            }

            if (!syllabus.getRequiredMaterialsSeven().equals(editSyllabus.getRequiredMaterialsSeven())) {
                fileWriter.write("  Required Seven changed from '" + syllabus.getRequiredMaterialsSeven() + "' to '" + editSyllabus.getRequiredMaterialsSeven() + "'");
            }

            if (!syllabus.getRequiredMaterialsEight().equals(editSyllabus.getRequiredMaterialsEight())) {
                fileWriter.write("  Required Eight changed from '" + syllabus.getRequiredMaterialsEight() + "' to '" + editSyllabus.getRequiredMaterialsEight() + "'");
            }

            if (!syllabus.getRequiredMaterialsNine().equals(editSyllabus.getRequiredMaterialsNine())) {
                fileWriter.write("  Required Nine changed from '" + syllabus.getRequiredMaterialsNine() + "' to '" + editSyllabus.getRequiredMaterialsNine() + "'");
            }

            if (!syllabus.getRequiredMaterialsTen().equals(editSyllabus.getRequiredMaterialsTen())) {
                fileWriter.write("  Required Ten changed from '" + syllabus.getRequiredMaterialsTen() + "' to '" + editSyllabus.getRequiredMaterialsTen() + "'");
            }

            if (!syllabus.getRequiredMaterialsEleven().equals(editSyllabus.getRequiredMaterialsEleven())) {
                fileWriter.write("  Required Eleven changed from '" + syllabus.getRequiredMaterialsEleven() + "' to '" + editSyllabus.getRequiredMaterialsEleven() + "'");
            }

            if (!syllabus.getRequiredMaterialsTwelve().equals(editSyllabus.getRequiredMaterialsTwelve())) {
                fileWriter.write("  Required Twelve changed from '" + syllabus.getRequiredMaterialsTwelve() + "' to '" + editSyllabus.getRequiredMaterialsTwelve() + "'");
            }

            if (!syllabus.getRequiredMaterialsThirteen().equals(editSyllabus.getRequiredMaterialsThirteen())) {
                fileWriter.write("  Required Thirteen changed from '" + syllabus.getRequiredMaterialsThirteen() + "' to '" + editSyllabus.getRequiredMaterialsThirteen() + "'");
            }
            if (!syllabus.getRequiredMaterialsFourteen().equals(editSyllabus.getRequiredMaterialsFourteen())) {
                fileWriter.write("  Required Fourteen changed from '" + syllabus.getRequiredMaterialsFourteen() + "' to '" + editSyllabus.getRequiredMaterialsFourteen() + "'");
            }

            if (!syllabus.getRequiredMaterialsFifteen().equals(editSyllabus.getRequiredMaterialsFifteen())) {
                fileWriter.write("  Required Fifteen changed from '" + syllabus.getRequiredMaterialsFifteen() + "' to '" + editSyllabus.getRequiredMaterialsFifteen() + "'");
            }

            if (!syllabus.getParticipationOne().equals(editSyllabus.getParticipationOne())) {
                fileWriter.write("  Participation One changed from '" + syllabus.getParticipationOne() + "' to '" + editSyllabus.getParticipationOne() + "'");
            }

            if (!syllabus.getParticipationTwo().equals(editSyllabus.getParticipationTwo())) {
                fileWriter.write("  Participation Two changed from '" + syllabus.getParticipationTwo() + "' to '" + editSyllabus.getParticipationTwo() + "'");
            }

            if (!syllabus.getParticipationThree().equals(editSyllabus.getParticipationThree())) {
                fileWriter.write("  Participation Three changed from '" + syllabus.getParticipationThree() + "' to '" + editSyllabus.getParticipationThree() + "'");
            }

            if (!syllabus.getParticipationFour().equals(editSyllabus.getParticipationFour())) {
                fileWriter.write("  Participation Four changed from '" + syllabus.getParticipationFour() + "' to '" + editSyllabus.getParticipationFour() + "'");
            }

            if (!syllabus.getParticipationFive().equals(editSyllabus.getParticipationFive())) {
                fileWriter.write("  Participation Five changed from '" + syllabus.getParticipationFive() + "' to '" + editSyllabus.getParticipationFive() + "'");
            }

            if (!syllabus.getParticipationSix().equals(editSyllabus.getParticipationSix())) {
                fileWriter.write("  Participation Six changed from '" + syllabus.getParticipationSix() + "' to '" + editSyllabus.getParticipationSix() + "'");
            }

            if (!syllabus.getParticipationSeven().equals(editSyllabus.getParticipationSeven())) {
                fileWriter.write("  Participation Seven changed from '" + syllabus.getParticipationSeven() + "' to '" + editSyllabus.getParticipationSeven() + "'");
            }

            if (!syllabus.getParticipationEight().equals(editSyllabus.getParticipationEight())) {
                fileWriter.write("  Participation Eight changed from '" + syllabus.getParticipationEight() + "' to '" + editSyllabus.getParticipationEight() + "'");
            }

            if (!syllabus.getParticipationNine().equals(editSyllabus.getParticipationNine())) {
                fileWriter.write("  Participation Nine changed from '" + syllabus.getParticipationNine() + "' to '" + editSyllabus.getParticipationNine() + "'");
            }

            if (!syllabus.getLaboratoryOne().equals(editSyllabus.getLaboratoryOne())) {
                fileWriter.write("  Laboratory One changed from '" + syllabus.getLaboratoryOne() + "' to '" + editSyllabus.getLaboratoryOne() + "'");
            }

            if (!syllabus.getLaboratoryTwo().equals(editSyllabus.getLaboratoryTwo())) {
                fileWriter.write("  Laboratory Two changed from '" + syllabus.getLaboratoryTwo() + "' to '" + editSyllabus.getLaboratoryTwo() + "'");
            }
            if (!syllabus.getLaboratoryThree().equals(editSyllabus.getLaboratoryThree())) {
                fileWriter.write("  Laboratory Three changed from '" + syllabus.getLaboratoryThree() + "' to '" + editSyllabus.getLaboratoryThree() + "'");
            }

            if (!syllabus.getLaboratoryFour().equals(editSyllabus.getLaboratoryFour())) {
                fileWriter.write("  Laboratory Four changed from '" + syllabus.getLaboratoryFour() + "' to '" + editSyllabus.getLaboratoryFour() + "'");
            }

            if (!syllabus.getLaboratoryFive().equals(editSyllabus.getLaboratoryFive())) {
                fileWriter.write("  Laboratory Five changed from '" + syllabus.getLaboratoryFive() + "' to '" + editSyllabus.getLaboratoryFive() + "'");
            }

            if (!syllabus.getLaboratorySix().equals(editSyllabus.getLaboratorySix())) {
                fileWriter.write("  Laboratory Six changed from '" + syllabus.getLaboratorySix() + "' to '" + editSyllabus.getLaboratorySix() + "'");
            }

            if (!syllabus.getLaboratorySeven().equals(editSyllabus.getLaboratorySeven())) {
                fileWriter.write("  Laboratory Seven changed from '" + syllabus.getLaboratorySeven() + "' to '" + editSyllabus.getLaboratorySeven() + "'");
            }

            if (!syllabus.getLaboratoryEight().equals(editSyllabus.getLaboratoryEight())) {
                fileWriter.write("  Laboratory Eight changed from '" + syllabus.getLaboratoryEight() + "' to '" + editSyllabus.getLaboratoryEight() + "'");
            }

            if (!syllabus.getLaboratoryNine().equals(editSyllabus.getLaboratoryNine())) {
                fileWriter.write("  Laboratory Nine changed from '" + syllabus.getLaboratoryNine() + "' to '" + editSyllabus.getLaboratoryNine() + "'");
            }
            if (!syllabus.getFieldWorkOne().equals(editSyllabus.getFieldWorkOne())) {
                fileWriter.write("  FieldWork One changed from '" + syllabus.getFieldWorkOne() + "' to '" + editSyllabus.getFieldWorkOne() + "'");
            }

            if (!syllabus.getFieldWorkTwo().equals(editSyllabus.getFieldWorkTwo())) {
                fileWriter.write("  FieldWork Two changed from '" + syllabus.getFieldWorkTwo() + "' to '" + editSyllabus.getFieldWorkTwo() + "'");
            }
            if (!syllabus.getFieldWorkThree().equals(editSyllabus.getFieldWorkThree())) {
                fileWriter.write("  FieldWork Three changed from '" + syllabus.getFieldWorkThree() + "' to '" + editSyllabus.getFieldWorkThree() + "'");
            }

            if (!syllabus.getFieldWorkFour().equals(editSyllabus.getFieldWorkFour())) {
                fileWriter.write("  FieldWork Four changed from '" + syllabus.getFieldWorkFour() + "' to '" + editSyllabus.getFieldWorkFour() + "'");
            }

            if (!syllabus.getFieldWorkFive().equals(editSyllabus.getFieldWorkFive())) {
                fileWriter.write("  FieldWork Five changed from '" + syllabus.getFieldWorkFive() + "' to '" + editSyllabus.getFieldWorkFive() + "'");
            }

            if (!syllabus.getFieldWorkSix().equals(editSyllabus.getFieldWorkSix())) {
                fileWriter.write("  FieldWork Six changed from '" + syllabus.getFieldWorkSix() + "' to '" + editSyllabus.getFieldWorkSix() + "'");
            }

            if (!syllabus.getFieldWorkSeven().equals(editSyllabus.getFieldWorkSeven())) {
                fileWriter.write("  FieldWork Seven changed from '" + syllabus.getFieldWorkSeven() + "' to '" + editSyllabus.getFieldWorkSeven() + "'");
            }

            if (!syllabus.getFieldWorkEight().equals(editSyllabus.getFieldWorkEight())) {
                fileWriter.write("  FieldWork Eight changed from '" + syllabus.getFieldWorkEight() + "' to '" + editSyllabus.getFieldWorkEight() + "'");
            }

            if (!syllabus.getFieldWorkNine().equals(editSyllabus.getFieldWorkNine())) {
                fileWriter.write("  FieldWork Nine changed from '" + syllabus.getFieldWorkNine() + "' to '" + editSyllabus.getFieldWorkNine() + "'");
            }
            if (!syllabus.getQuiz2One().equals(editSyllabus.getQuiz2One())) {
                fileWriter.write("  Quiz2 One changed from '" + syllabus.getQuiz2One() + "' to '" + editSyllabus.getQuiz2One() + "'");
            }

            if (!syllabus.getQuiz2Two().equals(editSyllabus.getQuiz2Two())) {
                fileWriter.write("  Quiz2 Two changed from '" + syllabus.getQuiz2Two() + "' to '" + editSyllabus.getQuiz2Two() + "'");
            }
            if (!syllabus.getQuiz2Three().equals(editSyllabus.getQuiz2Three())) {
                fileWriter.write("  Quiz2 Three changed from '" + syllabus.getQuiz2Three() + "' to '" + editSyllabus.getQuiz2Three() + "'");
            }
            if (!syllabus.getQuizFour().equals(editSyllabus.getQuizFour())) {
                fileWriter.write("  Quiz2 Four changed from '" + syllabus.getQuizFour() + "' to '" + editSyllabus.getQuizFour() + "'");
            }

            if (!syllabus.getQuizFive().equals(editSyllabus.getQuizFive())) {
                fileWriter.write("  Quiz2 Five changed from '" + syllabus.getQuizFive() + "' to '" + editSyllabus.getQuizFive() + "'");
            }

            if (!syllabus.getQuizSix().equals(editSyllabus.getQuizSix())) {
                fileWriter.write("  Quiz2 Six changed from '" + syllabus.getQuizSix() + "' to '" + editSyllabus.getQuizSix() + "'");
            }

            if (!syllabus.getQuizSeven().equals(editSyllabus.getQuizSeven())) {
                fileWriter.write("  Quiz2 Seven changed from '" + syllabus.getQuizSeven() + "' to '" + editSyllabus.getQuizSeven() + "'");
            }

            if (!syllabus.getQuizEight().equals(editSyllabus.getQuizEight())) {
                fileWriter.write("  Quiz2 Eight changed from '" + syllabus.getQuizEight() + "' to '" + editSyllabus.getQuizEight() + "'");
            }

            if (!syllabus.getQuizNine().equals(editSyllabus.getQuizNine())) {
                fileWriter.write("  Quiz2 Nine changed from '" + syllabus.getQuizNine() + "' to '" + editSyllabus.getQuizNine() + "'");
            }
            if (!syllabus.getCourseHourOne().equals(editSyllabus.getCourseHourOne())) {
                fileWriter.write("  Coursehour One changed from '" + syllabus.getCourseHourOne() + "' to '" + editSyllabus.getCourseHourOne() + "'");
            }

            if (!syllabus.getCourseHourTwo().equals(editSyllabus.getCourseHourTwo())) {
                fileWriter.write("  Coursehour Two changed from '" + syllabus.getCourseHourTwo() + "' to '" + editSyllabus.getCourseHourTwo() + "'");
            }

            if (!syllabus.getLabhourOne().equals(editSyllabus.getLabhourOne())) {
                fileWriter.write("  Labhour One changed from '" + syllabus.getLabhourOne() + "' to '" + editSyllabus.getLabhourOne() + "'");
            }
            if (!syllabus.getLabhourTwo().equals(editSyllabus.getLabhourTwo())) {
                fileWriter.write("  Labhour Two changed from '" + syllabus.getLabhourTwo() + "' to '" + editSyllabus.getLabhourTwo() + "'");
            }

            if (!syllabus.getStudyhourOne().equals(editSyllabus.getStudyhourOne())) {
                fileWriter.write("  Studyhour One changed from '" + syllabus.getStudyhourOne() + "' to '" + editSyllabus.getStudyhourOne() + "'");
            }

            if (!syllabus.getStudyhourTwo().equals(editSyllabus.getStudyhourTwo())) {
                fileWriter.write("  Studyhour Two changed from '" + syllabus.getStudyhourTwo() + "' to '" + editSyllabus.getStudyhourTwo() + "'");
            }

            if (!syllabus.getStudyhourThree().equals(editSyllabus.getStudyhourThree())) {
                fileWriter.write("  Studyhour Three changed from '" + syllabus.getStudyhourThree() + "' to '" + editSyllabus.getStudyhourThree() + "'");
            }

            if (!syllabus.getFieldworkOne().equals(editSyllabus.getFieldworkOne())) {
                fileWriter.write("  Fieldwork One changed from '" + syllabus.getFieldworkOne() + "' to '" + editSyllabus.getFieldworkOne() + "'");
            }

            if (!syllabus.getFieldworkTwo().equals(editSyllabus.getFieldworkTwo())) {
                fileWriter.write("  Fieldwork Two changed from '" + syllabus.getFieldworkTwo() + "' to '" + editSyllabus.getFieldworkTwo() + "'");
            }

            if (!syllabus.getFieldworkThree().equals(editSyllabus.getFieldworkThree())) {
                fileWriter.write("  Fieldwork Three changed from '" + syllabus.getFieldworkThree() + "' to '" + editSyllabus.getFieldworkThree() + "'");
            }

            if (!syllabus.getQuizOne().equals(editSyllabus.getQuizOne())) {
                fileWriter.write("  Quiz One changed from '" + syllabus.getQuizOne() + "' to '" + editSyllabus.getQuizOne() + "'");
            }

            if (!syllabus.getQuizTwo().equals(editSyllabus.getQuizTwo())) {
                fileWriter.write("  Quiz Two changed from '" + syllabus.getQuizTwo() + "' to '" + editSyllabus.getQuizTwo() + "'");
            }

            if (!syllabus.getQuizThree().equals(editSyllabus.getQuizThree())) {
                fileWriter.write("  Quiz Three changed from '" + syllabus.getQuizThree() + "' to '" + editSyllabus.getQuizThree() + "'");
            }

            if (!syllabus.getHomeworkOne().equals(editSyllabus.getHomeworkOne())) {
                fileWriter.write("  Homework One changed from '" + syllabus.getHomeworkOne() + "' to '" + editSyllabus.getHomeworkOne() + "'");
            }

            if (!syllabus.getHomeworkTwo().equals(editSyllabus.getHomeworkTwo())) {
                fileWriter.write("  Homework Two changed from '" + syllabus.getHomeworkTwo() + "' to '" + editSyllabus.getHomeworkTwo() + "'");
            }

            if (!syllabus.getHomeworkThree().equals(editSyllabus.getHomeworkThree())) {
                fileWriter.write("  Homework Three changed from '" + syllabus.getHomeworkThree() + "' to '" + editSyllabus.getHomeworkThree() + "'");
            }

            if (!syllabus.getPresentationOne().equals(editSyllabus.getPresentationOne())) {
                fileWriter.write("  Presentation One changed from '" + syllabus.getPresentationOne() + "' to '" + editSyllabus.getPresentationOne() + "'");
            }

            if (!syllabus.getPresentationTwo().equals(editSyllabus.getPresentationTwo())) {
                fileWriter.write("  Presentation Two changed from '" + syllabus.getPresentationTwo() + "' to '" + editSyllabus.getPresentationTwo() + "'");
            }

            if (!syllabus.getPresentationThree().equals(editSyllabus.getPresentationThree())) {
                fileWriter.write("  Presentation Three changed from '" + syllabus.getPresentationThree() + "' to '" + editSyllabus.getPresentationThree() + "'");
            }

            if (!syllabus.getProjectOne().equals(editSyllabus.getProjectOne())) {
                fileWriter.write("  Project One changed from '" + syllabus.getProjectOne() + "' to '" + editSyllabus.getProjectOne() + "'");
            }

            if (!syllabus.getProjectTwo().equals(editSyllabus.getProjectTwo())) {
                fileWriter.write("  Project Two changed from '" + syllabus.getProjectTwo() + "' to '" + editSyllabus.getProjectTwo() + "'");
            }

            if (!syllabus.getProjectThree().equals(editSyllabus.getProjectThree())) {
                fileWriter.write("  Project Three changed from '" + syllabus.getProjectThree() + "' to '" + editSyllabus.getProjectThree() + "'");
            }

            if (!syllabus.getPortfolioOne().equals(editSyllabus.getPortfolioOne())) {
                fileWriter.write("  Portfolio One changed from '" + syllabus.getPortfolioOne() + "' to '" + editSyllabus.getPortfolioOne() + "'");
            }

            if (!syllabus.getPortfolioTwo().equals(editSyllabus.getPortfolioTwo())) {
                fileWriter.write("  Portfolio Two changed from '" + syllabus.getPortfolioTwo() + "' to '" + editSyllabus.getPortfolioTwo() + "'");
            }

            if (!syllabus.getPortfolioThree().equals(editSyllabus.getPortfolioThree())) {
                fileWriter.write("  Portfolio Three changed from '" + syllabus.getPortfolioThree() + "' to '" + editSyllabus.getPortfolioThree() + "'");
            }

            if (!syllabus.getSeminarOne().equals(editSyllabus.getSeminarOne())) {
                fileWriter.write("  Seminar One changed from '" + syllabus.getSeminarOne() + "' to '" + editSyllabus.getSeminarOne() + "'");
            }

            if (!syllabus.getSeminarTwo().equals(editSyllabus.getSeminarTwo())) {
                fileWriter.write("  Seminar Two changed from '" + syllabus.getSeminarTwo() + "' to '" + editSyllabus.getSeminarTwo() + "'");
            }

            if (!syllabus.getSeminarThree().equals(editSyllabus.getSeminarThree())) {
                fileWriter.write("  Seminar Three changed from '" + syllabus.getSeminarThree() + "' to '" + editSyllabus.getSeminarThree() + "'");
            }

            if (!syllabus.getOralOne().equals(editSyllabus.getOralOne())) {
                fileWriter.write("  Oral One changed from '" + syllabus.getOralOne() + "' to '" + editSyllabus.getOralOne() + "'");
            }

            if (!syllabus.getOralTwo().equals(editSyllabus.getOralTwo())) {
                fileWriter.write("  Oral Two changed from '" + syllabus.getOralTwo() + "' to '" + editSyllabus.getOralTwo() + "'");
            }

            if (!syllabus.getOralThree().equals(editSyllabus.getOralThree())) {
                fileWriter.write("  Oral Three changed from '" + syllabus.getOralThree() + "' to '" + editSyllabus.getOralThree() + "'");
            }

            if (!syllabus.getMidtermOne().equals(editSyllabus.getMidtermOne())) {
                fileWriter.write("  Midterm One changed from '" + syllabus.getMidtermOne() + "' to '" + editSyllabus.getMidtermOne() + "'");
            }

            if (!syllabus.getMidtermTwo().equals(editSyllabus.getMidtermTwo())) {
                fileWriter.write("  Midterm Two changed from '" + syllabus.getMidtermTwo() + "' to '" + editSyllabus.getMidtermTwo() + "'");
            }

            if (!syllabus.getMidtermThree().equals(editSyllabus.getMidtermThree())) {
                fileWriter.write("  Midterm Three changed from '" + syllabus.getMidtermThree() + "' to '" + editSyllabus.getMidtermThree() + "'");
            }

            if (!syllabus.getFinalOne().equals(editSyllabus.getFinalOne())) {
                fileWriter.write("  Final One changed from '" + syllabus.getFinalOne() + "' to '" + editSyllabus.getFinalOne() + "'");
            }

            if (!syllabus.getFinalTwo().equals(editSyllabus.getFinalTwo())) {
                fileWriter.write("  Final Two changed from '" + syllabus.getFinalTwo() + "' to '" + editSyllabus.getFinalTwo() + "'");
            }

            if (!syllabus.getFinalThree().equals(editSyllabus.getFinalThree())) {
                fileWriter.write("  Final Three changed from '" + syllabus.getFinalThree() + "' to '" + editSyllabus.getFinalThree() + "'");
            }

            if (!syllabus.getOneProgramZero().equals(editSyllabus.getOneProgramZero())) {
                fileWriter.write("  OneProgram Zero changed from '" + syllabus.getOneProgramZero() + "' to '" + editSyllabus.getOneProgramZero() + "'");
            }

            if (!syllabus.getOneProgramOne().equals(editSyllabus.getOneProgramOne())) {
                fileWriter.write("  OneProgram One changed from '" + syllabus.getOneProgramOne() + "' to '" + editSyllabus.getOneProgramOne() + "'");
            }

            if (!syllabus.getOneProgramTwo().equals(editSyllabus.getOneProgramTwo())) {
                fileWriter.write("  OneProgram Two changed from '" + syllabus.getOneProgramTwo() + "' to '" + editSyllabus.getOneProgramTwo() + "'");
            }

            if (!syllabus.getOneProgramThree().equals(editSyllabus.getOneProgramThree())) {
                fileWriter.write("  OneProgram Three changed from '" + syllabus.getOneProgramThree() + "' to '" + editSyllabus.getOneProgramThree() + "'");
            }

            if (!syllabus.getOneProgramFour().equals(editSyllabus.getOneProgramFour())) {
                fileWriter.write("  OneProgram Four changed from '" + syllabus.getOneProgramFour() + "' to '" + editSyllabus.getOneProgramFour() + "'");
            }

            if (!syllabus.getOneProgramFive().equals(editSyllabus.getOneProgramFive())) {
                fileWriter.write("  OneProgram Five changed from '" + syllabus.getOneProgramFive() + "' to '" + editSyllabus.getOneProgramFive() + "'");
            }

            if (!syllabus.getTwoProgramZero().equals(editSyllabus.getTwoProgramZero())) {
                fileWriter.write("  TwoProgram Zero changed from '" + syllabus.getTwoProgramZero() + "' to '" + editSyllabus.getTwoProgramZero() + "'");
            }

            if (!syllabus.getTwoProgramOne().equals(editSyllabus.getTwoProgramOne())) {
                fileWriter.write("  TwoProgram One changed from '" + syllabus.getTwoProgramOne() + "' to '" + editSyllabus.getTwoProgramOne() + "'");
            }

            if (!syllabus.getTwoProgramTwo().equals(editSyllabus.getTwoProgramTwo())) {
                fileWriter.write("  TwoProgram Two changed from '" + syllabus.getTwoProgramTwo() + "' to '" + editSyllabus.getTwoProgramTwo() + "'");
            }

            if (!syllabus.getTwoProgramThree().equals(editSyllabus.getTwoProgramThree())) {
                fileWriter.write("  TwoProgram Three changed from '" + syllabus.getTwoProgramThree() + "' to '" + editSyllabus.getTwoProgramThree() + "'");
            }

            if (!syllabus.getTwoProgramFour().equals(editSyllabus.getTwoProgramFour())) {
                fileWriter.write("  TwoProgram Four changed from '" + syllabus.getTwoProgramFour() + "' to '" + editSyllabus.getTwoProgramFour() + "'");
            }

            if (!syllabus.getTwoProgramFive().equals(editSyllabus.getTwoProgramFive())) {
                fileWriter.write("  TwoProgram Five changed from '" + syllabus.getTwoProgramFive() + "' to '" + editSyllabus.getTwoProgramFive() + "'");
            }

            if (!syllabus.getThreeProgramZero().equals(editSyllabus.getThreeProgramZero())) {
                fileWriter.write("  ThreeProgram Zero changed from '" + syllabus.getThreeProgramZero() + "' to '" + editSyllabus.getThreeProgramZero() + "'");
            }

            if (!syllabus.getThreeProgramOne().equals(editSyllabus.getThreeProgramOne())) {
                fileWriter.write("  ThreeProgram One changed from '" + syllabus.getThreeProgramOne() + "' to '" + editSyllabus.getThreeProgramOne() + "'");
            }

            if (!syllabus.getThreeProgramTwo().equals(editSyllabus.getThreeProgramTwo())) {
                fileWriter.write("  ThreeProgram Two changed from '" + syllabus.getThreeProgramTwo() + "' to '" + editSyllabus.getThreeProgramTwo() + "'");
            }

            if (!syllabus.getThreeProgramThree().equals(editSyllabus.getThreeProgramThree())) {
                fileWriter.write("  ThreeProgram Three changed from '" + syllabus.getThreeProgramThree() + "' to '" + editSyllabus.getThreeProgramThree() + "'");
            }

            if (!syllabus.getThreeProgramFour().equals(editSyllabus.getThreeProgramFour())) {
                fileWriter.write("  ThreeProgram Four changed from '" + syllabus.getThreeProgramFour() + "' to '" + editSyllabus.getThreeProgramFour() + "'");
            }

            if (!syllabus.getThreeProgramFive().equals(editSyllabus.getThreeProgramFive())) {
                fileWriter.write("  ThreeProgram Five changed from '" + syllabus.getThreeProgramFive() + "' to '" + editSyllabus.getThreeProgramFive() + "'");
            }

            if (!syllabus.getFourProgramZero().equals(editSyllabus.getFourProgramZero())) {
                fileWriter.write("  FourProgram Zero changed from '" + syllabus.getFourProgramZero() + "' to '" + editSyllabus.getFourProgramZero() + "'");
            }

            if (!syllabus.getFourProgramOne().equals(editSyllabus.getFourProgramOne())) {
                fileWriter.write("  FourProgram One changed from '" + syllabus.getFourProgramOne() + "' to '" + editSyllabus.getFourProgramOne() + "'");
            }

            if (!syllabus.getFourProgramTwo().equals(editSyllabus.getFourProgramTwo())) {
                fileWriter.write("  FourProgram Two changed from '" + syllabus.getFourProgramTwo() + "' to '" + editSyllabus.getFourProgramTwo() + "'");
            }

            if (!syllabus.getFourProgramThree().equals(editSyllabus.getFourProgramThree())) {
                fileWriter.write("  FourProgram Three changed from '" + syllabus.getFourProgramThree() + "' to '" + editSyllabus.getFourProgramThree() + "'");
            }

            if (!syllabus.getFourProgramFour().equals(editSyllabus.getFourProgramFour())) {
                fileWriter.write("  FourProgram Four changed from '" + syllabus.getFourProgramFour() + "' to '" + editSyllabus.getFourProgramFour() + "'");
            }

            if (!syllabus.getFourProgramFive().equals(editSyllabus.getFourProgramFive())) {
                fileWriter.write("  FourProgram Five changed from '" + syllabus.getFourProgramFive() + "' to '" + editSyllabus.getFourProgramFive() + "'");
            }

            if (!syllabus.getFiveProgramZero().equals(editSyllabus.getFiveProgramZero())) {
                fileWriter.write("  FiveProgram Zero changed from '" + syllabus.getFiveProgramZero() + "' to '" + editSyllabus.getFiveProgramZero() + "'");
            }

            if (!syllabus.getFiveProgramOne().equals(editSyllabus.getFiveProgramOne())) {
                fileWriter.write("  FiveProgram One changed from '" + syllabus.getFiveProgramOne() + "' to '" + editSyllabus.getFiveProgramOne() + "'");
            }

            if (!syllabus.getFiveProgramTwo().equals(editSyllabus.getFiveProgramTwo())) {
                fileWriter.write("  FiveProgram Two changed from '" + syllabus.getFiveProgramTwo() + "' to '" + editSyllabus.getFiveProgramTwo() + "'");
            }

            if (!syllabus.getFiveProgramThree().equals(editSyllabus.getFiveProgramThree())) {
                fileWriter.write("  FiveProgram Three changed from '" + syllabus.getFiveProgramThree() + "' to '" + editSyllabus.getFiveProgramThree() + "'");
            }

            if (!syllabus.getFiveProgramFour().equals(editSyllabus.getFiveProgramFour())) {
                fileWriter.write("  FiveProgram Four changed from '" + syllabus.getFiveProgramFour() + "' to '" + editSyllabus.getFiveProgramFour() + "'");
            }

            if (!syllabus.getFiveProgramFive().equals(editSyllabus.getFiveProgramFive())) {
                fileWriter.write("  FiveProgram Five changed from '" + syllabus.getFiveProgramFive() + "' to '" + editSyllabus.getFiveProgramFive() + "'");
            }

            if (!syllabus.getSixProgramZero().equals(editSyllabus.getSixProgramZero())) {
                fileWriter.write("  SixProgram Zero changed from '" + syllabus.getSixProgramZero() + "' to '" + editSyllabus.getSixProgramZero() + "'");
            }

            if (!syllabus.getSixProgramOne().equals(editSyllabus.getSixProgramOne())) {
                fileWriter.write("  SixProgram One changed from '" + syllabus.getSixProgramOne() + "' to '" + editSyllabus.getSixProgramOne() + "'");
            }

            if (!syllabus.getSixProgramTwo().equals(editSyllabus.getSixProgramTwo())) {
                fileWriter.write("  SixProgram Two changed from '" + syllabus.getSixProgramTwo() + "' to '" + editSyllabus.getSixProgramTwo() + "'");
            }

            if (!syllabus.getSixProgramThree().equals(editSyllabus.getSixProgramThree())) {
                fileWriter.write("  SixProgram Three changed from '" + syllabus.getSixProgramThree() + "' to '" + editSyllabus.getSixProgramThree() + "'");
            }

            if (!syllabus.getSixProgramFour().equals(editSyllabus.getSixProgramFour())) {
                fileWriter.write("  SixProgram Four changed from '" + syllabus.getSixProgramFour() + "' to '" + editSyllabus.getSixProgramFour() + "'");
            }

            if (!syllabus.getSixProgramFive().equals(editSyllabus.getSixProgramFive())) {
                fileWriter.write("  SixProgram Five changed from '" + syllabus.getSixProgramFive() + "' to '" + editSyllabus.getSixProgramFive() + "'");
            }

            if (!syllabus.getSevenProgramZero().equals(editSyllabus.getSevenProgramZero())) {
                fileWriter.write("  SevenProgram Zero changed from '" + syllabus.getSevenProgramZero() + "' to '" + editSyllabus.getSevenProgramZero() + "'");
            }

            if (!syllabus.getSevenProgramOne().equals(editSyllabus.getSevenProgramOne())) {
                fileWriter.write("  SevenProgram One changed from '" + syllabus.getSevenProgramOne() + "' to '" + editSyllabus.getSevenProgramOne() + "'");
            }

            if (!syllabus.getSevenProgramTwo().equals(editSyllabus.getSevenProgramTwo())) {
                fileWriter.write("  SevenProgram Two changed from '" + syllabus.getSevenProgramTwo() + "' to '" + editSyllabus.getSevenProgramTwo() + "'");
            }

            if (!syllabus.getSevenProgramThree().equals(editSyllabus.getSevenProgramThree())) {
                fileWriter.write("  SevenProgram Three changed from '" + syllabus.getSevenProgramThree() + "' to '" + editSyllabus.getSevenProgramThree() + "'");
            }

            if (!syllabus.getSevenProgramFour().equals(editSyllabus.getSevenProgramFour())) {
                fileWriter.write("  SevenProgram Four changed from '" + syllabus.getSevenProgramFour() + "' to '" + editSyllabus.getSevenProgramFour() + "'");
            }

            if (!syllabus.getSevenProgramFive().equals(editSyllabus.getSevenProgramFive())) {
                fileWriter.write("  SevenProgram Five changed from '" + syllabus.getSevenProgramFive() + "' to '" + editSyllabus.getSevenProgramFive() + "'");
            }

            if (!syllabus.getEightProgramZero().equals(editSyllabus.getEightProgramZero())) {
                fileWriter.write("  EightProgram Zero changed from '" + syllabus.getEightProgramZero() + "' to '" + editSyllabus.getEightProgramZero() + "'");
            }

            if (!syllabus.getEightProgramOne().equals(editSyllabus.getEightProgramOne())) {
                fileWriter.write("  EightProgram One changed from '" + syllabus.getEightProgramOne() + "' to '" + editSyllabus.getEightProgramOne() + "'");
            }

            if (!syllabus.getEightProgramTwo().equals(editSyllabus.getEightProgramTwo())) {
                fileWriter.write("  EightProgram Two changed from '" + syllabus.getEightProgramTwo() + "' to '" + editSyllabus.getEightProgramTwo() + "'");
            }

            if (!syllabus.getEightProgramThree().equals(editSyllabus.getEightProgramThree())) {
                fileWriter.write("  EightProgram Three changed from '" + syllabus.getEightProgramThree() + "' to '" + editSyllabus.getEightProgramThree() + "'");
            }

            if (!syllabus.getEightProgramFour().equals(editSyllabus.getEightProgramFour())) {
                fileWriter.write("  EightProgram Four changed from '" + syllabus.getEightProgramFour() + "' to '" + editSyllabus.getEightProgramFour() + "'");
            }

            if (!syllabus.getEightProgramFive().equals(editSyllabus.getEightProgramFive())) {
                fileWriter.write("  EightProgram Five changed from '" + syllabus.getEightProgramFive() + "' to '" + editSyllabus.getEightProgramFive() + "'");
            }

            if (!syllabus.getNineProgramZero().equals(editSyllabus.getNineProgramZero())) {
                fileWriter.write("  NineProgram Zero changed from '" + syllabus.getNineProgramZero() + "' to '" + editSyllabus.getNineProgramZero() + "'");
            }

            if (!syllabus.getNineProgramOne().equals(editSyllabus.getNineProgramOne())) {
                fileWriter.write("  NineProgram One changed from '" + syllabus.getNineProgramOne() + "' to '" + editSyllabus.getNineProgramOne() + "'");
            }

            if (!syllabus.getNineProgramTwo().equals(editSyllabus.getNineProgramTwo())) {
                fileWriter.write("  NineProgram Two changed from '" + syllabus.getNineProgramTwo() + "' to '" + editSyllabus.getNineProgramTwo() + "'");
            }

            if (!syllabus.getNineProgramThree().equals(editSyllabus.getNineProgramThree())) {
                fileWriter.write("  NineProgram Three changed from '" + syllabus.getNineProgramThree() + "' to '" + editSyllabus.getNineProgramThree() + "'");
            }

            if (!syllabus.getNineProgramFour().equals(editSyllabus.getNineProgramFour())) {
                fileWriter.write("  NineProgram Four changed from '" + syllabus.getNineProgramFour() + "' to '" + editSyllabus.getNineProgramFour() + "'");
            }

            if (!syllabus.getNineProgramFive().equals(editSyllabus.getNineProgramFive())) {
                fileWriter.write("  NineProgram Five changed from '" + syllabus.getNineProgramFive() + "' to '" + editSyllabus.getNineProgramFive() + "'");
            }

            if (!syllabus.getTenProgramZero().equals(editSyllabus.getTenProgramZero())) {
                fileWriter.write("  TenProgram Zero changed from '" + syllabus.getTenProgramZero() + "' to '" + editSyllabus.getTenProgramZero() + "'");
            }

            if (!syllabus.getTenProgramOne().equals(editSyllabus.getTenProgramOne())) {
                fileWriter.write("  TenProgram One changed from '" + syllabus.getTenProgramOne() + "' to '" + editSyllabus.getTenProgramOne() + "'");
            }

            if (!syllabus.getTenProgramTwo().equals(editSyllabus.getTenProgramTwo())) {
                fileWriter.write("  TenProgram Two changed from '" + syllabus.getTenProgramTwo() + "' to '" + editSyllabus.getTenProgramTwo() + "'");
            }

            if (!syllabus.getTenProgramThree().equals(editSyllabus.getTenProgramThree())) {
                fileWriter.write("  TenProgram Three changed from '" + syllabus.getTenProgramThree() + "' to '" + editSyllabus.getTenProgramThree() + "'");
            }

            if (!syllabus.getTenProgramFour().equals(editSyllabus.getTenProgramFour())) {
                fileWriter.write("  TenProgram Four changed from '" + syllabus.getTenProgramFour() + "' to '" + editSyllabus.getTenProgramFour() + "'");
            }

            if (!syllabus.getTenProgramFive().equals(editSyllabus.getTenProgramFive())) {
                fileWriter.write("  TenProgram Five changed from '" + syllabus.getTenProgramFive() + "' to '" + editSyllabus.getTenProgramFive() + "'");
            }

            if (!syllabus.getElevenProgramZero().equals(editSyllabus.getElevenProgramZero())) {
                fileWriter.write("  ElevenProgram Zero changed from '" + syllabus.getElevenProgramZero() + "' to '" + editSyllabus.getElevenProgramZero() + "'");
            }

            if (!syllabus.getElevenProgramOne().equals(editSyllabus.getElevenProgramOne())) {
                fileWriter.write("  ElevenProgram One changed from '" + syllabus.getElevenProgramOne() + "' to '" + editSyllabus.getElevenProgramOne() + "'");
            }

            if (!syllabus.getElevenProgramTwo().equals(editSyllabus.getElevenProgramTwo())) {
                fileWriter.write("  ElevenProgram Two changed from '" + syllabus.getElevenProgramTwo() + "' to '" + editSyllabus.getElevenProgramTwo() + "'");
            }

            if (!syllabus.getElevenProgramThree().equals(editSyllabus.getElevenProgramThree())) {
                fileWriter.write("  ElevenProgram Three changed from '" + syllabus.getElevenProgramThree() + "' to '" + editSyllabus.getElevenProgramThree() + "'");
            }

            if (!syllabus.getElevenProgramFour().equals(editSyllabus.getElevenProgramFour())) {
                fileWriter.write("  ElevenProgram Four changed from '" + syllabus.getElevenProgramFour() + "' to '" + editSyllabus.getElevenProgramFour() + "'");
            }

            if (!syllabus.getElevenProgramFive().equals(editSyllabus.getElevenProgramFive())) {
                fileWriter.write("  ElevenProgram Five changed from '" + syllabus.getElevenProgramFive() + "' to '" + editSyllabus.getElevenProgramFive() + "'");
            }

            if (!syllabus.getTwelveProgramZero().equals(editSyllabus.getTwelveProgramZero())) {
                fileWriter.write("  TwelveProgram Zero changed from '" + syllabus.getTwelveProgramZero() + "' to '" + editSyllabus.getTwelveProgramZero() + "'");
            }

            if (!syllabus.getTwelveProgramOne().equals(editSyllabus.getTwelveProgramOne())) {
                fileWriter.write("  TwelveProgram One changed from '" + syllabus.getTwelveProgramOne() + "' to '" + editSyllabus.getTwelveProgramOne() + "'");
            }

            if (!syllabus.getTwelveProgramTwo().equals(editSyllabus.getTwelveProgramTwo())) {
                fileWriter.write("  TwelveProgram Two changed from '" + syllabus.getTwelveProgramTwo() + "' to '" + editSyllabus.getTwelveProgramTwo() + "'");
            }

            if (!syllabus.getTwelveProgramThree().equals(editSyllabus.getTwelveProgramThree())) {
                fileWriter.write("  TwelveProgram Three changed from '" + syllabus.getTwelveProgramThree() + "' to '" + editSyllabus.getTwelveProgramThree() + "'");
            }

            if (!syllabus.getTwelveProgramFour().equals(editSyllabus.getTwelveProgramFour())) {
                fileWriter.write("  TwelveProgram Four changed from '" + syllabus.getTwelveProgramFour() + "' to '" + editSyllabus.getTwelveProgramFour() + "'");
            }

            if (!syllabus.getTwelveProgramFive().equals(editSyllabus.getTwelveProgramFive())) {
                fileWriter.write("  TwelveProgram Five changed from '" + syllabus.getTwelveProgramFive() + "' to '" + editSyllabus.getTwelveProgramFive() + "'");
            }

            if (!syllabus.getThirteenProgramZero().equals(editSyllabus.getThirteenProgramZero())) {
                fileWriter.write("  ThirteenProgram Zero changed from '" + syllabus.getThirteenProgramZero() + "' to '" + editSyllabus.getThirteenProgramZero() + "'");
            }

            if (!syllabus.getThirteenProgramOne().equals(editSyllabus.getThirteenProgramOne())) {
                fileWriter.write("  ThirteenProgram One changed from '" + syllabus.getThirteenProgramOne() + "' to '" + editSyllabus.getThirteenProgramOne() + "'");
            }

            if (!syllabus.getThirteenProgramTwo().equals(editSyllabus.getThirteenProgramTwo())) {
                fileWriter.write("  ThirteenProgram Two changed from '" + syllabus.getThirteenProgramTwo() + "' to '" + editSyllabus.getThirteenProgramTwo() + "'");
            }

            if (!syllabus.getThirteenProgramThree().equals(editSyllabus.getThirteenProgramThree())) {
                fileWriter.write("  ThirteenProgram Three changed from '" + syllabus.getThirteenProgramThree() + "' to '" + editSyllabus.getThirteenProgramThree() + "'");
            }

            if (!syllabus.getThirteenProgramFour().equals(editSyllabus.getThirteenProgramFour())) {
                fileWriter.write("  ThirteenProgram Four changed from '" + syllabus.getThirteenProgramFour() + "' to '" + editSyllabus.getThirteenProgramFour() + "'");
            }

            if (!syllabus.getThirteenProgramFive().equals(editSyllabus.getThirteenProgramFive())) {
                fileWriter.write("  ThirteenProgram Five changed from '" + syllabus.getThirteenProgramFive() + "' to '" + editSyllabus.getThirteenProgramFive() + "'");
            }

            if (!syllabus.getTeachingMethods().equals(editSyllabus.getTeachingMethods())) {
                fileWriter.write("  teachingMethods changed from '" + syllabus.getTeachingMethods() + "' to '" + editSyllabus.getTeachingMethods() + "'");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


