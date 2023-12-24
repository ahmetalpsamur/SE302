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
                       + "\"Code of the Class\" : \" " + syllabus.getCode() + "\",\n"
                       + "\"Editor Name and Surname\" : \" " + syllabus.getEditorName() + "\",\n"
                       + "\"Reason for Changes\" : \" " + syllabus.getEditDescription() + "\",\n"
                       + "\"When was change made\" : \" " + syllabus.getEditDate() + "\",\n"
                       + "\"What time was change made\" : \" " + syllabus.getEditTime() + "\",\n"
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

    public static void Compare(Syllabus currentSyllabus, File file, Syllabus currentSyllabus2) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            StringBuilder jsonResult = new StringBuilder("{\n");
            if (currentSyllabus.getCourseName() != null && currentSyllabus2.getCourseName() != null &&
                    !currentSyllabus.getCourseName().equals(currentSyllabus2.getCourseName())) {
                jsonResult.append("  \"CourseName\": \"Changed from '").append(currentSyllabus.getCourseName()).append("' to '").append(currentSyllabus2.getCourseName()).append("'\",\n");
            }

            if (currentSyllabus.getCode() != null && currentSyllabus2.getCode() != null &&
                    !currentSyllabus.getCode().equals(currentSyllabus2.getCode())) {
                jsonResult.append("  \"Code\": \"Changed from '").append(currentSyllabus.getCode()).append("' to '").append(currentSyllabus2.getCode()).append("'\",\n");
            }

            if (currentSyllabus.getFall() != null && currentSyllabus2.getFall() != null &&
                    !currentSyllabus.getFall().equals(currentSyllabus2.getFall())) {
                jsonResult.append("  \"Fall\": \"Changed from '").append(currentSyllabus.getFall()).append("' to '").append(currentSyllabus2.getFall()).append("'\",\n");
            }

            if (currentSyllabus.getSpring() != null && currentSyllabus2.getSpring() != null &&
                    !currentSyllabus.getSpring().equals(currentSyllabus2.getSpring())) {
                jsonResult.append("  \"Spring\": \"Changed from '").append(currentSyllabus.getSpring()).append("' to '").append(currentSyllabus2.getSpring()).append("'\",\n");
            }

            if (currentSyllabus.getTheory() != null && currentSyllabus2.getTheory() != null &&
                    !currentSyllabus.getTheory().equals(currentSyllabus2.getTheory())) {
                jsonResult.append("  \"Theory\": \"Changed from '").append(currentSyllabus.getTheory()).append("' to '").append(currentSyllabus2.getTheory()).append("'\",\n");
            }

            if (currentSyllabus.getLocalCredit() != null && currentSyllabus2.getLocalCredit() != null &&
                    !currentSyllabus.getLocalCredit().equals(currentSyllabus2.getLocalCredit())) {
                jsonResult.append("  \"LocalCredit\": \"Changed from '").append(currentSyllabus.getLocalCredit()).append("' to '").append(currentSyllabus2.getLocalCredit()).append("'\",\n");
            }

            if (currentSyllabus.getEcts() != null && currentSyllabus2.getEcts() != null &&
                    !currentSyllabus.getEcts().equals(currentSyllabus2.getEcts())) {
                jsonResult.append("  \"Ects\": \"Changed from '").append(currentSyllabus.getEcts()).append("' to '").append(currentSyllabus2.getEcts()).append("'\",\n");
            }

            if (currentSyllabus.getPrerequisites() != null && currentSyllabus2.getPrerequisites() != null &&
                    !currentSyllabus.getPrerequisites().equals(currentSyllabus2.getPrerequisites())) {
                jsonResult.append("  \"Prerequisites\": \"Changed from '").append(currentSyllabus.getPrerequisites()).append("' to '").append(currentSyllabus2.getPrerequisites()).append("'\",\n");
            }

            if (currentSyllabus.getLab() != null && currentSyllabus2.getLab() != null &&
                    !currentSyllabus.getLab().equals(currentSyllabus2.getLab())) {
                jsonResult.append("  \"Lab\": \"Changed from '").append(currentSyllabus.getLab()).append("' to '").append(currentSyllabus2.getLab()).append("'\",\n");
            }

            if (currentSyllabus.getCourseLanguage() != null && currentSyllabus2.getCourseLanguage() != null &&
                    !currentSyllabus.getCourseLanguage().equals(currentSyllabus2.getCourseLanguage())) {
                jsonResult.append("  \"CourseLanguage\": \"Changed from '").append(currentSyllabus.getCourseLanguage()).append("' to '").append(currentSyllabus2.getCourseLanguage()).append("'\",\n");
            }

            if (currentSyllabus.getCourseType() != null && currentSyllabus2.getCourseType() != null &&
                    !currentSyllabus.getCourseType().equals(currentSyllabus2.getCourseType())) {
                jsonResult.append("  \"CourseType\": \"Changed from '").append(currentSyllabus.getCourseType()).append("' to '").append(currentSyllabus2.getCourseType()).append("'\",\n");
            }

            if (currentSyllabus.getCourseLevel() != null && currentSyllabus2.getCourseLevel() != null &&
                    !currentSyllabus.getCourseLevel().equals(currentSyllabus2.getCourseLevel())) {
                jsonResult.append("  \"CourseLevel\": \"Changed from '").append(currentSyllabus.getCourseLevel()).append("' to '").append(currentSyllabus2.getCourseLevel()).append("'\",\n");
            }

            if (currentSyllabus.getTeachingMethods() != null && currentSyllabus2.getTeachingMethods() != null &&
                    !currentSyllabus.getTeachingMethods().equals(currentSyllabus2.getTeachingMethods())) {
                jsonResult.append("  \"TeachingMethods\": \"Changed from '").append(currentSyllabus.getTeachingMethods()).append("' to '").append(currentSyllabus2.getTeachingMethods()).append("'\",\n");
            }

            if (currentSyllabus.getCourseCoordinator() != null && currentSyllabus2.getCourseCoordinator() != null &&
                    !currentSyllabus.getCourseCoordinator().equals(currentSyllabus2.getCourseCoordinator())) {
                jsonResult.append("  \"CourseCoordinator\": \"Changed from '").append(currentSyllabus.getCourseCoordinator()).append("' to '").append(currentSyllabus2.getCourseCoordinator()).append("'\",\n");
            }

            if (currentSyllabus.getCourseCoordinator2() != null && currentSyllabus2.getCourseCoordinator2() != null &&
                    !currentSyllabus.getCourseCoordinator2().equals(currentSyllabus2.getCourseCoordinator2())) {
                jsonResult.append("  \"CourseCoordinator2\": \"Changed from '").append(currentSyllabus.getCourseCoordinator2()).append("' to '").append(currentSyllabus2.getCourseCoordinator2()).append("'\",\n");
            }

            if (currentSyllabus.getAssistant() != null && currentSyllabus2.getAssistant() != null &&
                    !currentSyllabus.getAssistant().equals(currentSyllabus2.getAssistant())) {
                jsonResult.append("  \"Assistant\": \"Changed from '").append(currentSyllabus.getAssistant()).append("' to '").append(currentSyllabus2.getAssistant()).append("'\",\n");
            }

            if (currentSyllabus.getCourseObjectives() != null && currentSyllabus2.getCourseObjectives() != null &&
                    !currentSyllabus.getCourseObjectives().equals(currentSyllabus2.getCourseObjectives())) {
                jsonResult.append("  \"CourseObjectives\": \"Changed from '").append(currentSyllabus.getCourseObjectives()).append("' to '").append(currentSyllabus2.getCourseObjectives()).append("'\",\n");
            }

            if (currentSyllabus.getLearningOutcomes() != null && currentSyllabus2.getLearningOutcomes() != null &&
                    !currentSyllabus.getLearningOutcomes().equals(currentSyllabus2.getLearningOutcomes())) {
                jsonResult.append("  \"LearningOutcomes\": \"Changed from '").append(currentSyllabus.getLearningOutcomes()).append("' to '").append(currentSyllabus2.getLearningOutcomes()).append("'\",\n");
            }

            if (currentSyllabus.getCourseDescription() != null && currentSyllabus2.getCourseDescription() != null &&
                    !currentSyllabus.getCourseDescription().equals(currentSyllabus2.getCourseDescription())) {
                jsonResult.append("  \"CourseDescription\": \"Changed from '").append(currentSyllabus.getCourseDescription()).append("' to '").append(currentSyllabus2.getCourseDescription()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsTwo() != null && currentSyllabus2.getSubjectsTwo() != null &&
                    !currentSyllabus.getSubjectsTwo().equals(currentSyllabus2.getSubjectsTwo())) {
                jsonResult.append("  \"SubjectsTwo\": \"Changed from '").append(currentSyllabus.getSubjectsTwo()).append("' to '").append(currentSyllabus2.getSubjectsTwo()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsThree() != null && currentSyllabus2.getSubjectsThree() != null &&
                    !currentSyllabus.getSubjectsThree().equals(currentSyllabus2.getSubjectsThree())) {
                jsonResult.append("  \"SubjectsThree\": \"Changed from '").append(currentSyllabus.getSubjectsThree()).append("' to '").append(currentSyllabus2.getSubjectsThree()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsFour() != null && currentSyllabus2.getSubjectsFour() != null &&
                    !currentSyllabus.getSubjectsFour().equals(currentSyllabus2.getSubjectsFour())) {
                jsonResult.append("  \"SubjectsFour\": \"Changed from '").append(currentSyllabus.getSubjectsFour()).append("' to '").append(currentSyllabus2.getSubjectsFour()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsFive() != null && currentSyllabus2.getSubjectsFive() != null &&
                    !currentSyllabus.getSubjectsFive().equals(currentSyllabus2.getSubjectsFive())) {
                jsonResult.append("  \"SubjectsFive\": \"Changed from '").append(currentSyllabus.getSubjectsFive()).append("' to '").append(currentSyllabus2.getSubjectsFive()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsSix() != null && currentSyllabus2.getSubjectsSix() != null &&
                    !currentSyllabus.getSubjectsSix().equals(currentSyllabus2.getSubjectsSix())) {
                jsonResult.append("  \"SubjectsSix\": \"Changed from '").append(currentSyllabus.getSubjectsSix()).append("' to '").append(currentSyllabus2.getSubjectsSix()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsSeven() != null && currentSyllabus2.getSubjectsSeven() != null &&
                    !currentSyllabus.getSubjectsSeven().equals(currentSyllabus2.getSubjectsSeven())) {
                jsonResult.append("  \"SubjectsSeven\": \"Changed from '").append(currentSyllabus.getSubjectsSeven()).append("' to '").append(currentSyllabus2.getSubjectsSeven()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsEight() != null && currentSyllabus2.getSubjectsEight() != null &&
                    !currentSyllabus.getSubjectsEight().equals(currentSyllabus2.getSubjectsEight())) {
                jsonResult.append("  \"SubjectsEight\": \"Changed from '").append(currentSyllabus.getSubjectsEight()).append("' to '").append(currentSyllabus2.getSubjectsEight()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsNine() != null && currentSyllabus2.getSubjectsNine() != null &&
                    !currentSyllabus.getSubjectsNine().equals(currentSyllabus2.getSubjectsNine())) {
                jsonResult.append("  \"SubjectsNine\": \"Changed from '").append(currentSyllabus.getSubjectsNine()).append("' to '").append(currentSyllabus2.getSubjectsNine()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsTen() != null && currentSyllabus2.getSubjectsTen() != null &&
                    !currentSyllabus.getSubjectsTen().equals(currentSyllabus2.getSubjectsTen())) {
                jsonResult.append("  \"SubjectsTen\": \"Changed from '").append(currentSyllabus.getSubjectsTen()).append("' to '").append(currentSyllabus2.getSubjectsTen()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsEleven() != null && currentSyllabus2.getSubjectsEleven() != null &&
                    !currentSyllabus.getSubjectsEleven().equals(currentSyllabus2.getSubjectsEleven())) {
                jsonResult.append("  \"SubjectsEleven\": \"Changed from '").append(currentSyllabus.getSubjectsEleven()).append("' to '").append(currentSyllabus2.getSubjectsEleven()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsTwelve() != null && currentSyllabus2.getSubjectsTwelve() != null &&
                    !currentSyllabus.getSubjectsTwelve().equals(currentSyllabus2.getSubjectsTwelve())) {
                jsonResult.append("  \"SubjectsTwelve\": \"Changed from '").append(currentSyllabus.getSubjectsTwelve()).append("' to '").append(currentSyllabus2.getSubjectsTwelve()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsThirteen() != null && currentSyllabus2.getSubjectsThirteen() != null &&
                    !currentSyllabus.getSubjectsThirteen().equals(currentSyllabus2.getSubjectsThirteen())) {
                jsonResult.append("  \"SubjectsThirteen\": \"Changed from '").append(currentSyllabus.getSubjectsThirteen()).append("' to '").append(currentSyllabus2.getSubjectsThirteen()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsFourteen() != null && currentSyllabus2.getSubjectsFourteen() != null &&
                    !currentSyllabus.getSubjectsFourteen().equals(currentSyllabus2.getSubjectsFourteen())) {
                jsonResult.append("  \"SubjectsFourteen\": \"Changed from '").append(currentSyllabus.getSubjectsFourteen()).append("' to '").append(currentSyllabus2.getSubjectsFourteen()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsFifteen() != null && currentSyllabus2.getSubjectsFifteen() != null &&
                    !currentSyllabus.getSubjectsFifteen().equals(currentSyllabus2.getSubjectsFifteen())) {
                jsonResult.append("  \"SubjectsFifteen\": \"Changed from '").append(currentSyllabus.getSubjectsFifteen()).append("' to '").append(currentSyllabus2.getSubjectsFifteen()).append("'\",\n");
            }

            if (currentSyllabus.getSubjectsSixteen() != null && currentSyllabus2.getSubjectsSixteen() != null &&
                    !currentSyllabus.getSubjectsSixteen().equals(currentSyllabus2.getSubjectsSixteen())) {
                jsonResult.append("  \"SubjectsSixteen\": \"Changed from '").append(currentSyllabus.getSubjectsSixteen()).append("' to '").append(currentSyllabus2.getSubjectsSixteen()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsTwo() != null && currentSyllabus2.getRequiredMaterialsTwo() != null &&
                    !currentSyllabus.getRequiredMaterialsTwo().equals(currentSyllabus2.getRequiredMaterialsTwo())) {
                jsonResult.append("  \"RequiredMaterialsTwo\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsTwo()).append("' to '").append(currentSyllabus2.getRequiredMaterialsTwo()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsThree() != null && currentSyllabus2.getRequiredMaterialsThree() != null &&
                    !currentSyllabus.getRequiredMaterialsThree().equals(currentSyllabus2.getRequiredMaterialsThree())) {
                jsonResult.append("  \"RequiredMaterialsThree\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsThree()).append("' to '").append(currentSyllabus2.getRequiredMaterialsThree()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsFour() != null && currentSyllabus2.getRequiredMaterialsFour() != null &&
                    !currentSyllabus.getRequiredMaterialsFour().equals(currentSyllabus2.getRequiredMaterialsFour())) {
                jsonResult.append("  \"RequiredMaterialsFour\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsFour()).append("' to '").append(currentSyllabus2.getRequiredMaterialsFour()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsFive() != null && currentSyllabus2.getRequiredMaterialsFive() != null &&
                    !currentSyllabus.getRequiredMaterialsFive().equals(currentSyllabus2.getRequiredMaterialsFive())) {
                jsonResult.append("  \"RequiredMaterialsFive\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsFive()).append("' to '").append(currentSyllabus2.getRequiredMaterialsFive()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsSix() != null && currentSyllabus2.getRequiredMaterialsSix() != null &&
                    !currentSyllabus.getRequiredMaterialsSix().equals(currentSyllabus2.getRequiredMaterialsSix())) {
                jsonResult.append("  \"RequiredMaterialsSix\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsSix()).append("' to '").append(currentSyllabus2.getRequiredMaterialsSix()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsSeven() != null && currentSyllabus2.getRequiredMaterialsSeven() != null &&
                    !currentSyllabus.getRequiredMaterialsSeven().equals(currentSyllabus2.getRequiredMaterialsSeven())) {
                jsonResult.append("  \"RequiredMaterialsSeven\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsSeven()).append("' to '").append(currentSyllabus2.getRequiredMaterialsSeven()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsEight() != null && currentSyllabus2.getRequiredMaterialsEight() != null &&
                    !currentSyllabus.getRequiredMaterialsEight().equals(currentSyllabus2.getRequiredMaterialsEight())) {
                jsonResult.append("  \"RequiredMaterialsEight\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsEight()).append("' to '").append(currentSyllabus2.getRequiredMaterialsEight()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsNine() != null && currentSyllabus2.getRequiredMaterialsNine() != null &&
                    !currentSyllabus.getRequiredMaterialsNine().equals(currentSyllabus2.getRequiredMaterialsNine())) {
                jsonResult.append("  \"RequiredMaterialsNine\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsNine()).append("' to '").append(currentSyllabus2.getRequiredMaterialsNine()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsTen() != null && currentSyllabus2.getRequiredMaterialsTen() != null &&
                    !currentSyllabus.getRequiredMaterialsTen().equals(currentSyllabus2.getRequiredMaterialsTen())) {
                jsonResult.append("  \"RequiredMaterialsTen\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsTen()).append("' to '").append(currentSyllabus2.getRequiredMaterialsTen()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsEleven() != null && currentSyllabus2.getRequiredMaterialsEleven() != null &&
                    !currentSyllabus.getRequiredMaterialsEleven().equals(currentSyllabus2.getRequiredMaterialsEleven())) {
                jsonResult.append("  \"RequiredMaterialsEleven\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsEleven()).append("' to '").append(currentSyllabus2.getRequiredMaterialsEleven()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsTwelve() != null && currentSyllabus2.getRequiredMaterialsTwelve() != null &&
                    !currentSyllabus.getRequiredMaterialsTwelve().equals(currentSyllabus2.getRequiredMaterialsTwelve())) {
                jsonResult.append("  \"RequiredMaterialsTwelve\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsTwelve()).append("' to '").append(currentSyllabus2.getRequiredMaterialsTwelve()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsThirteen() != null && currentSyllabus2.getRequiredMaterialsThirteen() != null &&
                    !currentSyllabus.getRequiredMaterialsThirteen().equals(currentSyllabus2.getRequiredMaterialsThirteen())) {
                jsonResult.append("  \"RequiredMaterialsThirteen\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsThirteen()).append("' to '").append(currentSyllabus2.getRequiredMaterialsThirteen()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsFourteen() != null && currentSyllabus2.getRequiredMaterialsFourteen() != null &&
                    !currentSyllabus.getRequiredMaterialsFourteen().equals(currentSyllabus2.getRequiredMaterialsFourteen())) {
                jsonResult.append("  \"RequiredMaterialsFourteen\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsFourteen()).append("' to '").append(currentSyllabus2.getRequiredMaterialsFourteen()).append("'\",\n");
            }

            if (currentSyllabus.getRequiredMaterialsFifteen() != null && currentSyllabus2.getRequiredMaterialsFifteen() != null &&
                    !currentSyllabus.getRequiredMaterialsFifteen().equals(currentSyllabus2.getRequiredMaterialsFifteen())) {
                jsonResult.append("  \"RequiredMaterialsFifteen\": \"Changed from '").append(currentSyllabus.getRequiredMaterialsFifteen()).append("' to '").append(currentSyllabus2.getRequiredMaterialsFifteen()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationOne() != null && currentSyllabus2.getParticipationOne() != null &&
                    !currentSyllabus.getParticipationOne().equals(currentSyllabus2.getParticipationOne())) {
                jsonResult.append("  \"ParticipationOne\": \"Changed from '").append(currentSyllabus.getParticipationOne()).append("' to '").append(currentSyllabus2.getParticipationOne()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationTwo() != null && currentSyllabus2.getParticipationTwo() != null &&
                    !currentSyllabus.getParticipationTwo().equals(currentSyllabus2.getParticipationTwo())) {
                jsonResult.append("  \"ParticipationTwo\": \"Changed from '").append(currentSyllabus.getParticipationTwo()).append("' to '").append(currentSyllabus2.getParticipationTwo()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationThree() != null && currentSyllabus2.getParticipationThree() != null &&
                    !currentSyllabus.getParticipationThree().equals(currentSyllabus2.getParticipationThree())) {
                jsonResult.append("  \"ParticipationThree\": \"Changed from '").append(currentSyllabus.getParticipationThree()).append("' to '").append(currentSyllabus2.getParticipationThree()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationFour() != null && currentSyllabus2.getParticipationFour() != null &&
                    !currentSyllabus.getParticipationFour().equals(currentSyllabus2.getParticipationFour())) {
                jsonResult.append("  \"ParticipationFour\": \"Changed from '").append(currentSyllabus.getParticipationFour()).append("' to '").append(currentSyllabus2.getParticipationFour()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationFive() != null && currentSyllabus2.getParticipationFive() != null &&
                    !currentSyllabus.getParticipationFive().equals(currentSyllabus2.getParticipationFive())) {
                jsonResult.append("  \"ParticipationFive\": \"Changed from '").append(currentSyllabus.getParticipationFive()).append("' to '").append(currentSyllabus2.getParticipationFive()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationSix() != null && currentSyllabus2.getParticipationSix() != null &&
                    !currentSyllabus.getParticipationSix().equals(currentSyllabus2.getParticipationSix())) {
                jsonResult.append("  \"ParticipationSix\": \"Changed from '").append(currentSyllabus.getParticipationSix()).append("' to '").append(currentSyllabus2.getParticipationSix()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationSeven() != null && currentSyllabus2.getParticipationSeven() != null &&
                    !currentSyllabus.getParticipationSeven().equals(currentSyllabus2.getParticipationSeven())) {
                jsonResult.append("  \"ParticipationSeven\": \"Changed from '").append(currentSyllabus.getParticipationSeven()).append("' to '").append(currentSyllabus2.getParticipationSeven()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationEight() != null && currentSyllabus2.getParticipationEight() != null &&
                    !currentSyllabus.getParticipationEight().equals(currentSyllabus2.getParticipationEight())) {
                jsonResult.append("  \"ParticipationEight\": \"Changed from '").append(currentSyllabus.getParticipationEight()).append("' to '").append(currentSyllabus2.getParticipationEight()).append("'\",\n");
            }

            if (currentSyllabus.getParticipationNine() != null && currentSyllabus2.getParticipationNine() != null &&
                    !currentSyllabus.getParticipationNine().equals(currentSyllabus2.getParticipationNine())) {
                jsonResult.append("  \"ParticipationNine\": \"Changed from '").append(currentSyllabus.getParticipationNine()).append("' to '").append(currentSyllabus2.getParticipationNine()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratoryOne() != null && currentSyllabus2.getLaboratoryOne() != null &&
                    !currentSyllabus.getLaboratoryOne().equals(currentSyllabus2.getLaboratoryOne())) {
                jsonResult.append("  \"LaboratoryOne\": \"Changed from '").append(currentSyllabus.getLaboratoryOne()).append("' to '").append(currentSyllabus2.getLaboratoryOne()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratoryTwo() != null && currentSyllabus2.getLaboratoryTwo() != null &&
                    !currentSyllabus.getLaboratoryTwo().equals(currentSyllabus2.getLaboratoryTwo())) {
                jsonResult.append("  \"LaboratoryTwo\": \"Changed from '").append(currentSyllabus.getLaboratoryTwo()).append("' to '").append(currentSyllabus2.getLaboratoryTwo()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratoryThree() != null && currentSyllabus2.getLaboratoryThree() != null &&
                    !currentSyllabus.getLaboratoryThree().equals(currentSyllabus2.getLaboratoryThree())) {
                jsonResult.append("  \"LaboratoryThree\": \"Changed from '").append(currentSyllabus.getLaboratoryThree()).append("' to '").append(currentSyllabus2.getLaboratoryThree()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratoryFour() != null && currentSyllabus2.getLaboratoryFour() != null &&
                    !currentSyllabus.getLaboratoryFour().equals(currentSyllabus2.getLaboratoryFour())) {
                jsonResult.append("  \"LaboratoryFour\": \"Changed from '").append(currentSyllabus.getLaboratoryFour()).append("' to '").append(currentSyllabus2.getLaboratoryFour()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratoryFive() != null && currentSyllabus2.getLaboratoryFive() != null &&
                    !currentSyllabus.getLaboratoryFive().equals(currentSyllabus2.getLaboratoryFive())) {
                jsonResult.append("  \"LaboratoryFive\": \"Changed from '").append(currentSyllabus.getLaboratoryFive()).append("' to '").append(currentSyllabus2.getLaboratoryFive()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratorySix() != null && currentSyllabus2.getLaboratorySix() != null &&
                    !currentSyllabus.getLaboratorySix().equals(currentSyllabus2.getLaboratorySix())) {
                jsonResult.append("  \"LaboratorySix\": \"Changed from '").append(currentSyllabus.getLaboratorySix()).append("' to '").append(currentSyllabus2.getLaboratorySix()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratorySeven() != null && currentSyllabus2.getLaboratorySeven() != null &&
                    !currentSyllabus.getLaboratorySeven().equals(currentSyllabus2.getLaboratorySeven())) {
                jsonResult.append("  \"LaboratorySeven\": \"Changed from '").append(currentSyllabus.getLaboratorySeven()).append("' to '").append(currentSyllabus2.getLaboratorySeven()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratoryEight() != null && currentSyllabus2.getLaboratoryEight() != null &&
                    !currentSyllabus.getLaboratoryEight().equals(currentSyllabus2.getLaboratoryEight())) {
                jsonResult.append("  \"LaboratoryEight\": \"Changed from '").append(currentSyllabus.getLaboratoryEight()).append("' to '").append(currentSyllabus2.getLaboratoryEight()).append("'\",\n");
            }

            if (currentSyllabus.getLaboratoryNine() != null && currentSyllabus2.getLaboratoryNine() != null &&
                    !currentSyllabus.getLaboratoryNine().equals(currentSyllabus2.getLaboratoryNine())) {
                jsonResult.append("  \"LaboratoryNine\": \"Changed from '").append(currentSyllabus.getLaboratoryNine()).append("' to '").append(currentSyllabus2.getLaboratoryNine()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkOne() != null && currentSyllabus2.getFieldWorkOne() != null &&
                    !currentSyllabus.getFieldWorkOne().equals(currentSyllabus2.getFieldWorkOne())) {
                jsonResult.append("  \"FieldWorkOne\": \"Changed from '").append(currentSyllabus.getFieldWorkOne()).append("' to '").append(currentSyllabus2.getFieldWorkOne()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkTwo() != null && currentSyllabus2.getFieldWorkTwo() != null &&
                    !currentSyllabus.getFieldWorkTwo().equals(currentSyllabus2.getFieldWorkTwo())) {
                jsonResult.append("  \"FieldWorkTwo\": \"Changed from '").append(currentSyllabus.getFieldWorkTwo()).append("' to '").append(currentSyllabus2.getFieldWorkTwo()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkThree() != null && currentSyllabus2.getFieldWorkThree() != null &&
                    !currentSyllabus.getFieldWorkThree().equals(currentSyllabus2.getFieldWorkThree())) {
                jsonResult.append("  \"FieldWorkThree\": \"Changed from '").append(currentSyllabus.getFieldWorkThree()).append("' to '").append(currentSyllabus2.getFieldWorkThree()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkFour() != null && currentSyllabus2.getFieldWorkFour() != null &&
                    !currentSyllabus.getFieldWorkFour().equals(currentSyllabus2.getFieldWorkFour())) {
                jsonResult.append("  \"FieldWorkFour\": \"Changed from '").append(currentSyllabus.getFieldWorkFour()).append("' to '").append(currentSyllabus2.getFieldWorkFour()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkFive() != null && currentSyllabus2.getFieldWorkFive() != null &&
                    !currentSyllabus.getFieldWorkFive().equals(currentSyllabus2.getFieldWorkFive())) {
                jsonResult.append("  \"FieldWorkFive\": \"Changed from '").append(currentSyllabus.getFieldWorkFive()).append("' to '").append(currentSyllabus2.getFieldWorkFive()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkSix() != null && currentSyllabus2.getFieldWorkSix() != null &&
                    !currentSyllabus.getFieldWorkSix().equals(currentSyllabus2.getFieldWorkSix())) {
                jsonResult.append("  \"FieldWorkSix\": \"Changed from '").append(currentSyllabus.getFieldWorkSix()).append("' to '").append(currentSyllabus2.getFieldWorkSix()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkSeven() != null && currentSyllabus2.getFieldWorkSeven() != null &&
                    !currentSyllabus.getFieldWorkSeven().equals(currentSyllabus2.getFieldWorkSeven())) {
                jsonResult.append("  \"FieldWorkSeven\": \"Changed from '").append(currentSyllabus.getFieldWorkSeven()).append("' to '").append(currentSyllabus2.getFieldWorkSeven()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkEight() != null && currentSyllabus2.getFieldWorkEight() != null &&
                    !currentSyllabus.getFieldWorkEight().equals(currentSyllabus2.getFieldWorkEight())) {
                jsonResult.append("  \"FieldWorkEight\": \"Changed from '").append(currentSyllabus.getFieldWorkEight()).append("' to '").append(currentSyllabus2.getFieldWorkEight()).append("'\",\n");
            }

            if (currentSyllabus.getFieldWorkNine() != null && currentSyllabus2.getFieldWorkNine() != null &&
                    !currentSyllabus.getFieldWorkNine().equals(currentSyllabus2.getFieldWorkNine())) {
                jsonResult.append("  \"FieldWorkNine\": \"Changed from '").append(currentSyllabus.getFieldWorkNine()).append("' to '").append(currentSyllabus2.getFieldWorkNine()).append("'\",\n");
            }

            if (currentSyllabus.getQuiz2One() != null && currentSyllabus2.getQuiz2One() != null &&
                    !currentSyllabus.getQuiz2One().equals(currentSyllabus2.getQuiz2One())) {
                jsonResult.append("  \"Quiz2One\": \"Changed from '").append(currentSyllabus.getQuiz2One()).append("' to '").append(currentSyllabus2.getQuiz2One()).append("'\",\n");
            }

            if (currentSyllabus.getQuiz2Two() != null && currentSyllabus2.getQuiz2Two() != null &&
                    !currentSyllabus.getQuiz2Two().equals(currentSyllabus2.getQuiz2Two())) {
                jsonResult.append("  \"Quiz2Two\": \"Changed from '").append(currentSyllabus.getQuiz2Two()).append("' to '").append(currentSyllabus2.getQuiz2Two()).append("'\",\n");
            }

            if (currentSyllabus.getQuiz2Three() != null && currentSyllabus2.getQuiz2Three() != null &&
                    !currentSyllabus.getQuiz2Three().equals(currentSyllabus2.getQuiz2Three())) {
                jsonResult.append("  \"Quiz2Three\": \"Changed from '").append(currentSyllabus.getQuiz2Three()).append("' to '").append(currentSyllabus2.getQuiz2Three()).append("'\",\n");
            }

            if (currentSyllabus.getQuizFour() != null && currentSyllabus2.getQuizFour() != null &&
                    !currentSyllabus.getQuizFour().equals(currentSyllabus2.getQuizFour())) {
                jsonResult.append("  \"QuizFour\": \"Changed from '").append(currentSyllabus.getQuizFour()).append("' to '").append(currentSyllabus2.getQuizFour()).append("'\",\n");
            }

            if (currentSyllabus.getQuizFive() != null && currentSyllabus2.getQuizFive() != null &&
                    !currentSyllabus.getQuizFive().equals(currentSyllabus2.getQuizFive())) {
                jsonResult.append("  \"QuizFive\": \"Changed from '").append(currentSyllabus.getQuizFive()).append("' to '").append(currentSyllabus2.getQuizFive()).append("'\",\n");
            }

            if (currentSyllabus.getQuizSix() != null && currentSyllabus2.getQuizSix() != null &&
                    !currentSyllabus.getQuizSix().equals(currentSyllabus2.getQuizSix())) {
                jsonResult.append("  \"QuizSix\": \"Changed from '").append(currentSyllabus.getQuizSix()).append("' to '").append(currentSyllabus2.getQuizSix()).append("'\",\n");
            }

            if (currentSyllabus.getQuizSeven() != null && currentSyllabus2.getQuizSeven() != null &&
                    !currentSyllabus.getQuizSeven().equals(currentSyllabus2.getQuizSeven())) {
                jsonResult.append("  \"QuizSeven\": \"Changed from '").append(currentSyllabus.getQuizSeven()).append("' to '").append(currentSyllabus2.getQuizSeven()).append("'\",\n");
            }

            if (currentSyllabus.getQuizEight() != null && currentSyllabus2.getQuizEight() != null &&
                    !currentSyllabus.getQuizEight().equals(currentSyllabus2.getQuizEight())) {
                jsonResult.append("  \"QuizEight\": \"Changed from '").append(currentSyllabus.getQuizEight()).append("' to '").append(currentSyllabus2.getQuizEight()).append("'\",\n");
            }

            if (currentSyllabus.getQuizNine() != null && currentSyllabus2.getQuizNine() != null &&
                    !currentSyllabus.getQuizNine().equals(currentSyllabus2.getQuizNine())) {
                jsonResult.append("  \"QuizNine\": \"Changed from '").append(currentSyllabus.getQuizNine()).append("' to '").append(currentSyllabus2.getQuizNine()).append("'\",\n");
            }

            if (currentSyllabus.getCourseHourOne() != null && currentSyllabus2.getCourseHourOne() != null &&
                    !currentSyllabus.getCourseHourOne().equals(currentSyllabus2.getCourseHourOne())) {
                jsonResult.append("  \"CourseHourOne\": \"Changed from '").append(currentSyllabus.getCourseHourOne()).append("' to '").append(currentSyllabus2.getCourseHourOne()).append("'\",\n");
            }

            if (currentSyllabus.getCourseHourTwo() != null && currentSyllabus2.getCourseHourTwo() != null &&
                    !currentSyllabus.getCourseHourTwo().equals(currentSyllabus2.getCourseHourTwo())) {
                jsonResult.append("  \"CourseHourTwo\": \"Changed from '").append(currentSyllabus.getCourseHourTwo()).append("' to '").append(currentSyllabus2.getCourseHourTwo()).append("'\",\n");
            }

            if (currentSyllabus.getLabhourOne() != null && currentSyllabus2.getLabhourOne() != null &&
                    !currentSyllabus.getLabhourOne().equals(currentSyllabus2.getLabhourOne())) {
                jsonResult.append("  \"LabhourOne\": \"Changed from '").append(currentSyllabus.getLabhourOne()).append("' to '").append(currentSyllabus2.getLabhourOne()).append("'\",\n");
            }

            if (currentSyllabus.getLabhourTwo() != null && currentSyllabus2.getLabhourTwo() != null &&
                    !currentSyllabus.getLabhourTwo().equals(currentSyllabus2.getLabhourTwo())) {
                jsonResult.append("  \"LabhourTwo\": \"Changed from '").append(currentSyllabus.getLabhourTwo()).append("' to '").append(currentSyllabus2.getLabhourTwo()).append("'\",\n");
            }

            if (currentSyllabus.getStudyhourOne() != null && currentSyllabus2.getStudyhourOne() != null &&
                    !currentSyllabus.getStudyhourOne().equals(currentSyllabus2.getStudyhourOne())) {
                jsonResult.append("  \"StudyhourOne\": \"Changed from '").append(currentSyllabus.getStudyhourOne()).append("' to '").append(currentSyllabus2.getStudyhourOne()).append("'\",\n");
            }

            if (currentSyllabus.getStudyhourTwo() != null && currentSyllabus2.getStudyhourTwo() != null &&
                    !currentSyllabus.getStudyhourTwo().equals(currentSyllabus2.getStudyhourTwo())) {
                jsonResult.append("  \"StudyhourTwo\": \"Changed from '").append(currentSyllabus.getStudyhourTwo()).append("' to '").append(currentSyllabus2.getStudyhourTwo()).append("'\",\n");
            }

            if (currentSyllabus.getStudyhourThree() != null && currentSyllabus2.getStudyhourThree() != null &&
                    !currentSyllabus.getStudyhourThree().equals(currentSyllabus2.getStudyhourThree())) {
                jsonResult.append("  \"StudyhourThree\": \"Changed from '").append(currentSyllabus.getStudyhourThree()).append("' to '").append(currentSyllabus2.getStudyhourThree()).append("'\",\n");
            }

            if (currentSyllabus.getFieldworkOne() != null && currentSyllabus2.getFieldworkOne() != null &&
                    !currentSyllabus.getFieldworkOne().equals(currentSyllabus2.getFieldworkOne())) {
                jsonResult.append("  \"FieldworkOne\": \"Changed from '").append(currentSyllabus.getFieldworkOne()).append("' to '").append(currentSyllabus2.getFieldworkOne()).append("'\",\n");
            }

            if (currentSyllabus.getFieldworkTwo() != null && currentSyllabus2.getFieldworkTwo() != null &&
                    !currentSyllabus.getFieldworkTwo().equals(currentSyllabus2.getFieldworkTwo())) {
                jsonResult.append("  \"FieldworkTwo\": \"Changed from '").append(currentSyllabus.getFieldworkTwo()).append("' to '").append(currentSyllabus2.getFieldworkTwo()).append("'\",\n");
            }

            if (currentSyllabus.getFieldworkThree() != null && currentSyllabus2.getFieldworkThree() != null &&
                    !currentSyllabus.getFieldworkThree().equals(currentSyllabus2.getFieldworkThree())) {
                jsonResult.append("  \"FieldworkThree\": \"Changed from '").append(currentSyllabus.getFieldworkThree()).append("' to '").append(currentSyllabus2.getFieldworkThree()).append("'\",\n");
            }

            if (currentSyllabus.getQuizOne() != null && currentSyllabus2.getQuizOne() != null &&
                    !currentSyllabus.getQuizOne().equals(currentSyllabus2.getQuizOne())) {
                jsonResult.append("  \"QuizOne\": \"Changed from '").append(currentSyllabus.getQuizOne()).append("' to '").append(currentSyllabus2.getQuizOne()).append("'\",\n");
            }

            if (currentSyllabus.getQuizTwo() != null && currentSyllabus2.getQuizTwo() != null &&
                    !currentSyllabus.getQuizTwo().equals(currentSyllabus2.getQuizTwo())) {
                jsonResult.append("  \"QuizTwo\": \"Changed from '").append(currentSyllabus.getQuizTwo()).append("' to '").append(currentSyllabus2.getQuizTwo()).append("'\",\n");
            }

            if (currentSyllabus.getQuizThree() != null && currentSyllabus2.getQuizThree() != null &&
                    !currentSyllabus.getQuizThree().equals(currentSyllabus2.getQuizThree())) {
                jsonResult.append("  \"QuizThree\": \"Changed from '").append(currentSyllabus.getQuizThree()).append("' to '").append(currentSyllabus2.getQuizThree()).append("'\",\n");
            }

            if (currentSyllabus.getHomeworkOne() != null && currentSyllabus2.getHomeworkOne() != null &&
                    !currentSyllabus.getHomeworkOne().equals(currentSyllabus2.getHomeworkOne())) {
                jsonResult.append("  \"HomeworkOne\": \"Changed from '").append(currentSyllabus.getHomeworkOne()).append("' to '").append(currentSyllabus2.getHomeworkOne()).append("'\",\n");
            }

            if (currentSyllabus.getHomeworkTwo() != null && currentSyllabus2.getHomeworkTwo() != null &&
                    !currentSyllabus.getHomeworkTwo().equals(currentSyllabus2.getHomeworkTwo())) {
                jsonResult.append("  \"HomeworkTwo\": \"Changed from '").append(currentSyllabus.getHomeworkTwo()).append("' to '").append(currentSyllabus2.getHomeworkTwo()).append("'\",\n");
            }

            if (currentSyllabus.getHomeworkThree() != null && currentSyllabus2.getHomeworkThree() != null &&
                    !currentSyllabus.getHomeworkThree().equals(currentSyllabus2.getHomeworkThree())) {
                jsonResult.append("  \"HomeworkThree\": \"Changed from '").append(currentSyllabus.getHomeworkThree()).append("' to '").append(currentSyllabus2.getHomeworkThree()).append("'\",\n");
            }

            if (currentSyllabus.getPresentationOne() != null && currentSyllabus2.getPresentationOne() != null &&
                    !currentSyllabus.getPresentationOne().equals(currentSyllabus2.getPresentationOne())) {
                jsonResult.append("  \"PresentationOne\": \"Changed from '").append(currentSyllabus.getPresentationOne()).append("' to '").append(currentSyllabus2.getPresentationOne()).append("'\",\n");
            }

            if (currentSyllabus.getPresentationTwo() != null && currentSyllabus2.getPresentationTwo() != null &&
                    !currentSyllabus.getPresentationTwo().equals(currentSyllabus2.getPresentationTwo())) {
                jsonResult.append("  \"PresentationTwo\": \"Changed from '").append(currentSyllabus.getPresentationTwo()).append("' to '").append(currentSyllabus2.getPresentationTwo()).append("'\",\n");
            }

            if (currentSyllabus.getPresentationThree() != null && currentSyllabus2.getPresentationThree() != null &&
                    !currentSyllabus.getPresentationThree().equals(currentSyllabus2.getPresentationThree())) {
                jsonResult.append("  \"PresentationThree\": \"Changed from '").append(currentSyllabus.getPresentationThree()).append("' to '").append(currentSyllabus2.getPresentationThree()).append("'\",\n");
            }

            if (currentSyllabus.getProjectOne() != null && currentSyllabus2.getProjectOne() != null &&
                    !currentSyllabus.getProjectOne().equals(currentSyllabus2.getProjectOne())) {
                jsonResult.append("  \"ProjectOne\": \"Changed from '").append(currentSyllabus.getProjectOne()).append("' to '").append(currentSyllabus2.getProjectOne()).append("'\",\n");
            }

            if (currentSyllabus.getProjectTwo() != null && currentSyllabus2.getProjectTwo() != null &&
                    !currentSyllabus.getProjectTwo().equals(currentSyllabus2.getProjectTwo())) {
                jsonResult.append("  \"ProjectTwo\": \"Changed from '").append(currentSyllabus.getProjectTwo()).append("' to '").append(currentSyllabus2.getProjectTwo()).append("'\",\n");
            }

            if (currentSyllabus.getProjectThree() != null && currentSyllabus2.getProjectThree() != null &&
                    !currentSyllabus.getProjectThree().equals(currentSyllabus2.getProjectThree())) {
                jsonResult.append("  \"ProjectThree\": \"Changed from '").append(currentSyllabus.getProjectThree()).append("' to '").append(currentSyllabus2.getProjectThree()).append("'\",\n");
            }

            if (currentSyllabus.getPortfolioOne() != null && currentSyllabus2.getPortfolioOne() != null &&
                    !currentSyllabus.getPortfolioOne().equals(currentSyllabus2.getPortfolioOne())) {
                jsonResult.append("  \"PortfolioOne\": \"Changed from '").append(currentSyllabus.getPortfolioOne()).append("' to '").append(currentSyllabus2.getPortfolioOne()).append("'\",\n");
            }

            if (currentSyllabus.getPortfolioTwo() != null && currentSyllabus2.getPortfolioTwo() != null &&
                    !currentSyllabus.getPortfolioTwo().equals(currentSyllabus2.getPortfolioTwo())) {
                jsonResult.append("  \"PortfolioTwo\": \"Changed from '").append(currentSyllabus.getPortfolioTwo()).append("' to '").append(currentSyllabus2.getPortfolioTwo()).append("'\",\n");
            }

            if (currentSyllabus.getPortfolioThree() != null && currentSyllabus2.getPortfolioThree() != null &&
                    !currentSyllabus.getPortfolioThree().equals(currentSyllabus2.getPortfolioThree())) {
                jsonResult.append("  \"PortfolioThree\": \"Changed from '").append(currentSyllabus.getPortfolioThree()).append("' to '").append(currentSyllabus2.getPortfolioThree()).append("'\",\n");
            }

            if (currentSyllabus.getSeminarOne() != null && currentSyllabus2.getSeminarOne() != null &&
                    !currentSyllabus.getSeminarOne().equals(currentSyllabus2.getSeminarOne())) {
                jsonResult.append("  \"SeminarOne\": \"Changed from '").append(currentSyllabus.getSeminarOne()).append("' to '").append(currentSyllabus2.getSeminarOne()).append("'\",\n");
            }

            if (currentSyllabus.getSeminarTwo() != null && currentSyllabus2.getSeminarTwo() != null &&
                    !currentSyllabus.getSeminarTwo().equals(currentSyllabus2.getSeminarTwo())) {
                jsonResult.append("  \"SeminarTwo\": \"Changed from '").append(currentSyllabus.getSeminarTwo()).append("' to '").append(currentSyllabus2.getSeminarTwo()).append("'\",\n");
            }

            if (currentSyllabus.getSeminarThree() != null && currentSyllabus2.getSeminarThree() != null &&
                    !currentSyllabus.getSeminarThree().equals(currentSyllabus2.getSeminarThree())) {
                jsonResult.append("  \"SeminarThree\": \"Changed from '").append(currentSyllabus.getSeminarThree()).append("' to '").append(currentSyllabus2.getSeminarThree()).append("'\",\n");
            }

            if (currentSyllabus.getOralOne() != null && currentSyllabus2.getOralOne() != null &&
                    !currentSyllabus.getOralOne().equals(currentSyllabus2.getOralOne())) {
                jsonResult.append("  \"OralOne\": \"Changed from '").append(currentSyllabus.getOralOne()).append("' to '").append(currentSyllabus2.getOralOne()).append("'\",\n");
            }

            if (currentSyllabus.getOralTwo() != null && currentSyllabus2.getOralTwo() != null &&
                    !currentSyllabus.getOralTwo().equals(currentSyllabus2.getOralTwo())) {
                jsonResult.append("  \"OralTwo\": \"Changed from '").append(currentSyllabus.getOralTwo()).append("' to '").append(currentSyllabus2.getOralTwo()).append("'\",\n");
            }

            if (currentSyllabus.getOralThree() != null && currentSyllabus2.getOralThree() != null &&
                    !currentSyllabus.getOralThree().equals(currentSyllabus2.getOralThree())) {
                jsonResult.append("  \"OralThree\": \"Changed from '").append(currentSyllabus.getOralThree()).append("' to '").append(currentSyllabus2.getOralThree()).append("'\",\n");
            }

            if (currentSyllabus.getMidtermOne() != null && currentSyllabus2.getMidtermOne() != null &&
                    !currentSyllabus.getMidtermOne().equals(currentSyllabus2.getMidtermOne())) {
                jsonResult.append("  \"MidtermOne\": \"Changed from '").append(currentSyllabus.getMidtermOne()).append("' to '").append(currentSyllabus2.getMidtermOne()).append("'\",\n");
            }

            if (currentSyllabus.getMidtermTwo() != null && currentSyllabus2.getMidtermTwo() != null &&
                    !currentSyllabus.getMidtermTwo().equals(currentSyllabus2.getMidtermTwo())) {
                jsonResult.append("  \"MidtermTwo\": \"Changed from '").append(currentSyllabus.getMidtermTwo()).append("' to '").append(currentSyllabus2.getMidtermTwo()).append("'\",\n");
            }

            if (currentSyllabus.getMidtermThree() != null && currentSyllabus2.getMidtermThree() != null &&
                    !currentSyllabus.getMidtermThree().equals(currentSyllabus2.getMidtermThree())) {
                jsonResult.append("  \"MidtermThree\": \"Changed from '").append(currentSyllabus.getMidtermThree()).append("' to '").append(currentSyllabus2.getMidtermThree()).append("'\",\n");
            }

            if (currentSyllabus.getFinalOne() != null && currentSyllabus2.getFinalOne() != null &&
                    !currentSyllabus.getFinalOne().equals(currentSyllabus2.getFinalOne())) {
                jsonResult.append("  \"FinalOne\": \"Changed from '").append(currentSyllabus.getFinalOne()).append("' to '").append(currentSyllabus2.getFinalOne()).append("'\",\n");
            }

            if (currentSyllabus.getFinalTwo() != null && currentSyllabus2.getFinalTwo() != null &&
                    !currentSyllabus.getFinalTwo().equals(currentSyllabus2.getFinalTwo())) {
                jsonResult.append("  \"FinalTwo\": \"Changed from '").append(currentSyllabus.getFinalTwo()).append("' to '").append(currentSyllabus2.getFinalTwo()).append("'\",\n");
            }

            if (currentSyllabus.getFinalThree() != null && currentSyllabus2.getFinalThree() != null &&
                    !currentSyllabus.getFinalThree().equals(currentSyllabus2.getFinalThree())) {
                jsonResult.append("  \"FinalThree\": \"Changed from '").append(currentSyllabus.getFinalThree()).append("' to '").append(currentSyllabus2.getFinalThree()).append("'\",\n");
            }

            if (currentSyllabus.getOneProgramZero() != null && currentSyllabus2.getOneProgramZero() != null &&
                    !currentSyllabus.getOneProgramZero().equals(currentSyllabus2.getOneProgramZero())) {
                jsonResult.append("  \"OneProgramZero\": \"Changed from '").append(currentSyllabus.getOneProgramZero()).append("' to '").append(currentSyllabus2.getOneProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getOneProgramOne() != null && currentSyllabus2.getOneProgramOne() != null &&
                    !currentSyllabus.getOneProgramOne().equals(currentSyllabus2.getOneProgramOne())) {
                jsonResult.append("  \"OneProgramOne\": \"Changed from '").append(currentSyllabus.getOneProgramOne()).append("' to '").append(currentSyllabus2.getOneProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getOneProgramTwo() != null && currentSyllabus2.getOneProgramTwo() != null &&
                    !currentSyllabus.getOneProgramTwo().equals(currentSyllabus2.getOneProgramTwo())) {
                jsonResult.append("  \"OneProgramTwo\": \"Changed from '").append(currentSyllabus.getOneProgramTwo()).append("' to '").append(currentSyllabus2.getOneProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getOneProgramThree() != null && currentSyllabus2.getOneProgramThree() != null &&
                    !currentSyllabus.getOneProgramThree().equals(currentSyllabus2.getOneProgramThree())) {
                jsonResult.append("  \"OneProgramThree\": \"Changed from '").append(currentSyllabus.getOneProgramThree()).append("' to '").append(currentSyllabus2.getOneProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getOneProgramFour() != null && currentSyllabus2.getOneProgramFour() != null &&
                    !currentSyllabus.getOneProgramFour().equals(currentSyllabus2.getOneProgramFour())) {
                jsonResult.append("  \"OneProgramFour\": \"Changed from '").append(currentSyllabus.getOneProgramFour()).append("' to '").append(currentSyllabus2.getOneProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getOneProgramFive() != null && currentSyllabus2.getOneProgramFive() != null &&
                    !currentSyllabus.getOneProgramFive().equals(currentSyllabus2.getOneProgramFive())) {
                jsonResult.append("  \"OneProgramFive\": \"Changed from '").append(currentSyllabus.getOneProgramFive()).append("' to '").append(currentSyllabus2.getOneProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getTwoProgramZero() != null && currentSyllabus2.getTwoProgramZero() != null &&
                    !currentSyllabus.getTwoProgramZero().equals(currentSyllabus2.getTwoProgramZero())) {
                jsonResult.append("  \"TwoProgramZero\": \"Changed from '").append(currentSyllabus.getTwoProgramZero()).append("' to '").append(currentSyllabus2.getTwoProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getTwoProgramOne() != null && currentSyllabus2.getTwoProgramOne() != null &&
                    !currentSyllabus.getTwoProgramOne().equals(currentSyllabus2.getTwoProgramOne())) {
                jsonResult.append("  \"TwoProgramOne\": \"Changed from '").append(currentSyllabus.getTwoProgramOne()).append("' to '").append(currentSyllabus2.getTwoProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getTwoProgramTwo() != null && currentSyllabus2.getTwoProgramTwo() != null &&
                    !currentSyllabus.getTwoProgramTwo().equals(currentSyllabus2.getTwoProgramTwo())) {
                jsonResult.append("  \"TwoProgramTwo\": \"Changed from '").append(currentSyllabus.getTwoProgramTwo()).append("' to '").append(currentSyllabus2.getTwoProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getTwoProgramThree() != null && currentSyllabus2.getTwoProgramThree() != null &&
                    !currentSyllabus.getTwoProgramThree().equals(currentSyllabus2.getTwoProgramThree())) {
                jsonResult.append("  \"TwoProgramThree\": \"Changed from '").append(currentSyllabus.getTwoProgramThree()).append("' to '").append(currentSyllabus2.getTwoProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getTwoProgramFour() != null && currentSyllabus2.getTwoProgramFour() != null &&
                    !currentSyllabus.getTwoProgramFour().equals(currentSyllabus2.getTwoProgramFour())) {
                jsonResult.append("  \"TwoProgramFour\": \"Changed from '").append(currentSyllabus.getTwoProgramFour()).append("' to '").append(currentSyllabus2.getTwoProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getTwoProgramFive() != null && currentSyllabus2.getTwoProgramFive() != null &&
                    !currentSyllabus.getTwoProgramFive().equals(currentSyllabus2.getTwoProgramFive())) {
                jsonResult.append("  \"TwoProgramFive\": \"Changed from '").append(currentSyllabus.getTwoProgramFive()).append("' to '").append(currentSyllabus2.getTwoProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getThreeProgramZero() != null && currentSyllabus2.getThreeProgramZero() != null &&
                    !currentSyllabus.getThreeProgramZero().equals(currentSyllabus2.getThreeProgramZero())) {
                jsonResult.append("  \"ThreeProgramZero\": \"Changed from '").append(currentSyllabus.getThreeProgramZero()).append("' to '").append(currentSyllabus2.getThreeProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getThreeProgramOne() != null && currentSyllabus2.getThreeProgramOne() != null &&
                    !currentSyllabus.getThreeProgramOne().equals(currentSyllabus2.getThreeProgramOne())) {
                jsonResult.append("  \"ThreeProgramOne\": \"Changed from '").append(currentSyllabus.getThreeProgramOne()).append("' to '").append(currentSyllabus2.getThreeProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getThreeProgramTwo() != null && currentSyllabus2.getThreeProgramTwo() != null &&
                    !currentSyllabus.getThreeProgramTwo().equals(currentSyllabus2.getThreeProgramTwo())) {
                jsonResult.append("  \"ThreeProgramTwo\": \"Changed from '").append(currentSyllabus.getThreeProgramTwo()).append("' to '").append(currentSyllabus2.getThreeProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getThreeProgramThree() != null && currentSyllabus2.getThreeProgramThree() != null &&
                    !currentSyllabus.getThreeProgramThree().equals(currentSyllabus2.getThreeProgramThree())) {
                jsonResult.append("  \"ThreeProgramThree\": \"Changed from '").append(currentSyllabus.getThreeProgramThree()).append("' to '").append(currentSyllabus2.getThreeProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getThreeProgramFour() != null && currentSyllabus2.getThreeProgramFour() != null &&
                    !currentSyllabus.getThreeProgramFour().equals(currentSyllabus2.getThreeProgramFour())) {
                jsonResult.append("  \"ThreeProgramFour\": \"Changed from '").append(currentSyllabus.getThreeProgramFour()).append("' to '").append(currentSyllabus2.getThreeProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getThreeProgramFive() != null && currentSyllabus2.getThreeProgramFive() != null &&
                    !currentSyllabus.getThreeProgramFive().equals(currentSyllabus2.getThreeProgramFive())) {
                jsonResult.append("  \"ThreeProgramFive\": \"Changed from '").append(currentSyllabus.getThreeProgramFive()).append("' to '").append(currentSyllabus2.getThreeProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getFourProgramZero() != null && currentSyllabus2.getFourProgramZero() != null &&
                    !currentSyllabus.getFourProgramZero().equals(currentSyllabus2.getFourProgramZero())) {
                jsonResult.append("  \"FourProgramZero\": \"Changed from '").append(currentSyllabus.getFourProgramZero()).append("' to '").append(currentSyllabus2.getFourProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getFourProgramOne() != null && currentSyllabus2.getFourProgramOne() != null &&
                    !currentSyllabus.getFourProgramOne().equals(currentSyllabus2.getFourProgramOne())) {
                jsonResult.append("  \"FourProgramOne\": \"Changed from '").append(currentSyllabus.getFourProgramOne()).append("' to '").append(currentSyllabus2.getFourProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getFourProgramTwo() != null && currentSyllabus2.getFourProgramTwo() != null &&
                    !currentSyllabus.getFourProgramTwo().equals(currentSyllabus2.getFourProgramTwo())) {
                jsonResult.append("  \"FourProgramTwo\": \"Changed from '").append(currentSyllabus.getFourProgramTwo()).append("' to '").append(currentSyllabus2.getFourProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getFourProgramThree() != null && currentSyllabus2.getFourProgramThree() != null &&
                    !currentSyllabus.getFourProgramThree().equals(currentSyllabus2.getFourProgramThree())) {
                jsonResult.append("  \"FourProgramThree\": \"Changed from '").append(currentSyllabus.getFourProgramThree()).append("' to '").append(currentSyllabus2.getFourProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getFourProgramFour() != null && currentSyllabus2.getFourProgramFour() != null &&
                    !currentSyllabus.getFourProgramFour().equals(currentSyllabus2.getFourProgramFour())) {
                jsonResult.append("  \"FourProgramFour\": \"Changed from '").append(currentSyllabus.getFourProgramFour()).append("' to '").append(currentSyllabus2.getFourProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getFourProgramFive() != null && currentSyllabus2.getFourProgramFive() != null &&
                    !currentSyllabus.getFourProgramFive().equals(currentSyllabus2.getFourProgramFive())) {
                jsonResult.append("  \"FourProgramFive\": \"Changed from '").append(currentSyllabus.getFourProgramFive()).append("' to '").append(currentSyllabus2.getFourProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getFiveProgramZero() != null && currentSyllabus2.getFiveProgramZero() != null &&
                    !currentSyllabus.getFiveProgramZero().equals(currentSyllabus2.getFiveProgramZero())) {
                jsonResult.append("  \"FiveProgramZero\": \"Changed from '").append(currentSyllabus.getFiveProgramZero()).append("' to '").append(currentSyllabus2.getFiveProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getFiveProgramOne() != null && currentSyllabus2.getFiveProgramOne() != null &&
                    !currentSyllabus.getFiveProgramOne().equals(currentSyllabus2.getFiveProgramOne())) {
                jsonResult.append("  \"FiveProgramOne\": \"Changed from '").append(currentSyllabus.getFiveProgramOne()).append("' to '").append(currentSyllabus2.getFiveProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getFiveProgramTwo() != null && currentSyllabus2.getFiveProgramTwo() != null &&
                    !currentSyllabus.getFiveProgramTwo().equals(currentSyllabus2.getFiveProgramTwo())) {
                jsonResult.append("  \"FiveProgramTwo\": \"Changed from '").append(currentSyllabus.getFiveProgramTwo()).append("' to '").append(currentSyllabus2.getFiveProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getFiveProgramThree() != null && currentSyllabus2.getFiveProgramThree() != null &&
                    !currentSyllabus.getFiveProgramThree().equals(currentSyllabus2.getFiveProgramThree())) {
                jsonResult.append("  \"FiveProgramThree\": \"Changed from '").append(currentSyllabus.getFiveProgramThree()).append("' to '").append(currentSyllabus2.getFiveProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getFiveProgramFour() != null && currentSyllabus2.getFiveProgramFour() != null &&
                    !currentSyllabus.getFiveProgramFour().equals(currentSyllabus2.getFiveProgramFour())) {
                jsonResult.append("  \"FiveProgramFour\": \"Changed from '").append(currentSyllabus.getFiveProgramFour()).append("' to '").append(currentSyllabus2.getFiveProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getFiveProgramFive() != null && currentSyllabus2.getFiveProgramFive() != null &&
                    !currentSyllabus.getFiveProgramFive().equals(currentSyllabus2.getFiveProgramFive())) {
                jsonResult.append("  \"FiveProgramFive\": \"Changed from '").append(currentSyllabus.getFiveProgramFive()).append("' to '").append(currentSyllabus2.getFiveProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getSixProgramZero() != null && currentSyllabus2.getSixProgramZero() != null &&
                    !currentSyllabus.getSixProgramZero().equals(currentSyllabus2.getSixProgramZero())) {
                jsonResult.append("  \"SixProgramZero\": \"Changed from '").append(currentSyllabus.getSixProgramZero()).append("' to '").append(currentSyllabus2.getSixProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getSixProgramOne() != null && currentSyllabus2.getSixProgramOne() != null &&
                    !currentSyllabus.getSixProgramOne().equals(currentSyllabus2.getSixProgramOne())) {
                jsonResult.append("  \"SixProgramOne\": \"Changed from '").append(currentSyllabus.getSixProgramOne()).append("' to '").append(currentSyllabus2.getSixProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getSixProgramTwo() != null && currentSyllabus2.getSixProgramTwo() != null &&
                    !currentSyllabus.getSixProgramTwo().equals(currentSyllabus2.getSixProgramTwo())) {
                jsonResult.append("  \"SixProgramTwo\": \"Changed from '").append(currentSyllabus.getSixProgramTwo()).append("' to '").append(currentSyllabus2.getSixProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getSixProgramThree() != null && currentSyllabus2.getSixProgramThree() != null &&
                    !currentSyllabus.getSixProgramThree().equals(currentSyllabus2.getSixProgramThree())) {
                jsonResult.append("  \"SixProgramThree\": \"Changed from '").append(currentSyllabus.getSixProgramThree()).append("' to '").append(currentSyllabus2.getSixProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getSixProgramFour() != null && currentSyllabus2.getSixProgramFour() != null &&
                    !currentSyllabus.getSixProgramFour().equals(currentSyllabus2.getSixProgramFour())) {
                jsonResult.append("  \"SixProgramFour\": \"Changed from '").append(currentSyllabus.getSixProgramFour()).append("' to '").append(currentSyllabus2.getSixProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getSixProgramFive() != null && currentSyllabus2.getSixProgramFive() != null &&
                    !currentSyllabus.getSixProgramFive().equals(currentSyllabus2.getSixProgramFive())) {
                jsonResult.append("  \"SixProgramFive\": \"Changed from '").append(currentSyllabus.getSixProgramFive()).append("' to '").append(currentSyllabus2.getSixProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getSevenProgramZero() != null && currentSyllabus2.getSevenProgramZero() != null &&
                    !currentSyllabus.getSevenProgramZero().equals(currentSyllabus2.getSevenProgramZero())) {
                jsonResult.append("  \"SevenProgramZero\": \"Changed from '").append(currentSyllabus.getSevenProgramZero()).append("' to '").append(currentSyllabus2.getSevenProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getSevenProgramOne() != null && currentSyllabus2.getSevenProgramOne() != null &&
                    !currentSyllabus.getSevenProgramOne().equals(currentSyllabus2.getSevenProgramOne())) {
                jsonResult.append("  \"SevenProgramOne\": \"Changed from '").append(currentSyllabus.getSevenProgramOne()).append("' to '").append(currentSyllabus2.getSevenProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getSevenProgramTwo() != null && currentSyllabus2.getSevenProgramTwo() != null &&
                    !currentSyllabus.getSevenProgramTwo().equals(currentSyllabus2.getSevenProgramTwo())) {
                jsonResult.append("  \"SevenProgramTwo\": \"Changed from '").append(currentSyllabus.getSevenProgramTwo()).append("' to '").append(currentSyllabus2.getSevenProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getSevenProgramThree() != null && currentSyllabus2.getSevenProgramThree() != null &&
                    !currentSyllabus.getSevenProgramThree().equals(currentSyllabus2.getSevenProgramThree())) {
                jsonResult.append("  \"SevenProgramThree\": \"Changed from '").append(currentSyllabus.getSevenProgramThree()).append("' to '").append(currentSyllabus2.getSevenProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getSevenProgramFour() != null && currentSyllabus2.getSevenProgramFour() != null &&
                    !currentSyllabus.getSevenProgramFour().equals(currentSyllabus2.getSevenProgramFour())) {
                jsonResult.append("  \"SevenProgramFour\": \"Changed from '").append(currentSyllabus.getSevenProgramFour()).append("' to '").append(currentSyllabus2.getSevenProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getSevenProgramFive() != null && currentSyllabus2.getSevenProgramFive() != null &&
                    !currentSyllabus.getSevenProgramFive().equals(currentSyllabus2.getSevenProgramFive())) {
                jsonResult.append("  \"SevenProgramFive\": \"Changed from '").append(currentSyllabus.getSevenProgramFive()).append("' to '").append(currentSyllabus2.getSevenProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getEightProgramZero() != null && currentSyllabus2.getEightProgramZero() != null &&
                    !currentSyllabus.getEightProgramZero().equals(currentSyllabus2.getEightProgramZero())) {
                jsonResult.append("  \"EightProgramZero\": \"Changed from '").append(currentSyllabus.getEightProgramZero()).append("' to '").append(currentSyllabus2.getEightProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getEightProgramOne() != null && currentSyllabus2.getEightProgramOne() != null &&
                    !currentSyllabus.getEightProgramOne().equals(currentSyllabus2.getEightProgramOne())) {
                jsonResult.append("  \"EightProgramOne\": \"Changed from '").append(currentSyllabus.getEightProgramOne()).append("' to '").append(currentSyllabus2.getEightProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getEightProgramTwo() != null && currentSyllabus2.getEightProgramTwo() != null &&
                    !currentSyllabus.getEightProgramTwo().equals(currentSyllabus2.getEightProgramTwo())) {
                jsonResult.append("  \"EightProgramTwo\": \"Changed from '").append(currentSyllabus.getEightProgramTwo()).append("' to '").append(currentSyllabus2.getEightProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getEightProgramThree() != null && currentSyllabus2.getEightProgramThree() != null &&
                    !currentSyllabus.getEightProgramThree().equals(currentSyllabus2.getEightProgramThree())) {
                jsonResult.append("  \"EightProgramThree\": \"Changed from '").append(currentSyllabus.getEightProgramThree()).append("' to '").append(currentSyllabus2.getEightProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getEightProgramFour() != null && currentSyllabus2.getEightProgramFour() != null &&
                    !currentSyllabus.getEightProgramFour().equals(currentSyllabus2.getEightProgramFour())) {
                jsonResult.append("  \"EightProgramFour\": \"Changed from '").append(currentSyllabus.getEightProgramFour()).append("' to '").append(currentSyllabus2.getEightProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getEightProgramFive() != null && currentSyllabus2.getEightProgramFive() != null &&
                    !currentSyllabus.getEightProgramFive().equals(currentSyllabus2.getEightProgramFive())) {
                jsonResult.append("  \"EightProgramFive\": \"Changed from '").append(currentSyllabus.getEightProgramFive()).append("' to '").append(currentSyllabus2.getEightProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getNineProgramZero() != null && currentSyllabus2.getNineProgramZero() != null &&
                    !currentSyllabus.getNineProgramZero().equals(currentSyllabus2.getNineProgramZero())) {
                jsonResult.append("  \"NineProgramZero\": \"Changed from '").append(currentSyllabus.getNineProgramZero()).append("' to '").append(currentSyllabus2.getNineProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getNineProgramOne() != null && currentSyllabus2.getNineProgramOne() != null &&
                    !currentSyllabus.getNineProgramOne().equals(currentSyllabus2.getNineProgramOne())) {
                jsonResult.append("  \"NineProgramOne\": \"Changed from '").append(currentSyllabus.getNineProgramOne()).append("' to '").append(currentSyllabus2.getNineProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getNineProgramTwo() != null && currentSyllabus2.getNineProgramTwo() != null &&
                    !currentSyllabus.getNineProgramTwo().equals(currentSyllabus2.getNineProgramTwo())) {
                jsonResult.append("  \"NineProgramTwo\": \"Changed from '").append(currentSyllabus.getNineProgramTwo()).append("' to '").append(currentSyllabus2.getNineProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getNineProgramThree() != null && currentSyllabus2.getNineProgramThree() != null &&
                    !currentSyllabus.getNineProgramThree().equals(currentSyllabus2.getNineProgramThree())) {
                jsonResult.append("  \"NineProgramThree\": \"Changed from '").append(currentSyllabus.getNineProgramThree()).append("' to '").append(currentSyllabus2.getNineProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getNineProgramFour() != null && currentSyllabus2.getNineProgramFour() != null &&
                    !currentSyllabus.getNineProgramFour().equals(currentSyllabus2.getNineProgramFour())) {
                jsonResult.append("  \"NineProgramFour\": \"Changed from '").append(currentSyllabus.getNineProgramFour()).append("' to '").append(currentSyllabus2.getNineProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getNineProgramFive() != null && currentSyllabus2.getNineProgramFive() != null &&
                    !currentSyllabus.getNineProgramFive().equals(currentSyllabus2.getNineProgramFive())) {
                jsonResult.append("  \"NineProgramFive\": \"Changed from '").append(currentSyllabus.getNineProgramFive()).append("' to '").append(currentSyllabus2.getNineProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getTenProgramZero() != null && currentSyllabus2.getTenProgramZero() != null &&
                    !currentSyllabus.getTenProgramZero().equals(currentSyllabus2.getTenProgramZero())) {
                jsonResult.append("  \"TenProgramZero\": \"Changed from '").append(currentSyllabus.getTenProgramZero()).append("' to '").append(currentSyllabus2.getTenProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getTenProgramOne() != null && currentSyllabus2.getTenProgramOne() != null &&
                    !currentSyllabus.getTenProgramOne().equals(currentSyllabus2.getTenProgramOne())) {
                jsonResult.append("  \"TenProgramOne\": \"Changed from '").append(currentSyllabus.getTenProgramOne()).append("' to '").append(currentSyllabus2.getTenProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getTenProgramTwo() != null && currentSyllabus2.getTenProgramTwo() != null &&
                    !currentSyllabus.getTenProgramTwo().equals(currentSyllabus2.getTenProgramTwo())) {
                jsonResult.append("  \"TenProgramTwo\": \"Changed from '").append(currentSyllabus.getTenProgramTwo()).append("' to '").append(currentSyllabus2.getTenProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getTenProgramThree() != null && currentSyllabus2.getTenProgramThree() != null &&
                    !currentSyllabus.getTenProgramThree().equals(currentSyllabus2.getTenProgramThree())) {
                jsonResult.append("  \"TenProgramThree\": \"Changed from '").append(currentSyllabus.getTenProgramThree()).append("' to '").append(currentSyllabus2.getTenProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getTenProgramFour() != null && currentSyllabus2.getTenProgramFour() != null &&
                    !currentSyllabus.getTenProgramFour().equals(currentSyllabus2.getTenProgramFour())) {
                jsonResult.append("  \"TenProgramFour\": \"Changed from '").append(currentSyllabus.getTenProgramFour()).append("' to '").append(currentSyllabus2.getTenProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getTenProgramFive() != null && currentSyllabus2.getTenProgramFive() != null &&
                    !currentSyllabus.getTenProgramFive().equals(currentSyllabus2.getTenProgramFive())) {
                jsonResult.append("  \"TenProgramFive\": \"Changed from '").append(currentSyllabus.getTenProgramFive()).append("' to '").append(currentSyllabus2.getTenProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getElevenProgramZero() != null && currentSyllabus2.getElevenProgramZero() != null &&
                    !currentSyllabus.getElevenProgramZero().equals(currentSyllabus2.getElevenProgramZero())) {
                jsonResult.append("  \"ElevenProgramZero\": \"Changed from '").append(currentSyllabus.getElevenProgramZero()).append("' to '").append(currentSyllabus2.getElevenProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getElevenProgramOne() != null && currentSyllabus2.getElevenProgramOne() != null &&
                    !currentSyllabus.getElevenProgramOne().equals(currentSyllabus2.getElevenProgramOne())) {
                jsonResult.append("  \"ElevenProgramOne\": \"Changed from '").append(currentSyllabus.getElevenProgramOne()).append("' to '").append(currentSyllabus2.getElevenProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getElevenProgramTwo() != null && currentSyllabus2.getElevenProgramTwo() != null &&
                    !currentSyllabus.getElevenProgramTwo().equals(currentSyllabus2.getElevenProgramTwo())) {
                jsonResult.append("  \"ElevenProgramTwo\": \"Changed from '").append(currentSyllabus.getElevenProgramTwo()).append("' to '").append(currentSyllabus2.getElevenProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getElevenProgramThree() != null && currentSyllabus2.getElevenProgramThree() != null &&
                    !currentSyllabus.getElevenProgramThree().equals(currentSyllabus2.getElevenProgramThree())) {
                jsonResult.append("  \"ElevenProgramThree\": \"Changed from '").append(currentSyllabus.getElevenProgramThree()).append("' to '").append(currentSyllabus2.getElevenProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getElevenProgramFour() != null && currentSyllabus2.getElevenProgramFour() != null &&
                    !currentSyllabus.getElevenProgramFour().equals(currentSyllabus2.getElevenProgramFour())) {
                jsonResult.append("  \"ElevenProgramFour\": \"Changed from '").append(currentSyllabus.getElevenProgramFour()).append("' to '").append(currentSyllabus2.getElevenProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getElevenProgramFive() != null && currentSyllabus2.getElevenProgramFive() != null &&
                    !currentSyllabus.getElevenProgramFive().equals(currentSyllabus2.getElevenProgramFive())) {
                jsonResult.append("  \"ElevenProgramFive\": \"Changed from '").append(currentSyllabus.getElevenProgramFive()).append("' to '").append(currentSyllabus2.getElevenProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getTwelveProgramZero() != null && currentSyllabus2.getTwelveProgramZero() != null &&
                    !currentSyllabus.getTwelveProgramZero().equals(currentSyllabus2.getTwelveProgramZero())) {
                jsonResult.append("  \"TwelveProgramZero\": \"Changed from '").append(currentSyllabus.getTwelveProgramZero()).append("' to '").append(currentSyllabus2.getTwelveProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getTwelveProgramOne() != null && currentSyllabus2.getTwelveProgramOne() != null &&
                    !currentSyllabus.getTwelveProgramOne().equals(currentSyllabus2.getTwelveProgramOne())) {
                jsonResult.append("  \"TwelveProgramOne\": \"Changed from '").append(currentSyllabus.getTwelveProgramOne()).append("' to '").append(currentSyllabus2.getTwelveProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getTwelveProgramTwo() != null && currentSyllabus2.getTwelveProgramTwo() != null &&
                    !currentSyllabus.getTwelveProgramTwo().equals(currentSyllabus2.getTwelveProgramTwo())) {
                jsonResult.append("  \"TwelveProgramTwo\": \"Changed from '").append(currentSyllabus.getTwelveProgramTwo()).append("' to '").append(currentSyllabus2.getTwelveProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getTwelveProgramThree() != null && currentSyllabus2.getTwelveProgramThree() != null &&
                    !currentSyllabus.getTwelveProgramThree().equals(currentSyllabus2.getTwelveProgramThree())) {
                jsonResult.append("  \"TwelveProgramThree\": \"Changed from '").append(currentSyllabus.getTwelveProgramThree()).append("' to '").append(currentSyllabus2.getTwelveProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getTwelveProgramFour() != null && currentSyllabus2.getTwelveProgramFour() != null &&
                    !currentSyllabus.getTwelveProgramFour().equals(currentSyllabus2.getTwelveProgramFour())) {
                jsonResult.append("  \"TwelveProgramFour\": \"Changed from '").append(currentSyllabus.getTwelveProgramFour()).append("' to '").append(currentSyllabus2.getTwelveProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getTwelveProgramFive() != null && currentSyllabus2.getTwelveProgramFive() != null &&
                    !currentSyllabus.getTwelveProgramFive().equals(currentSyllabus2.getTwelveProgramFive())) {
                jsonResult.append("  \"TwelveProgramFive\": \"Changed from '").append(currentSyllabus.getTwelveProgramFive()).append("' to '").append(currentSyllabus2.getTwelveProgramFive()).append("'\",\n");
            }

            if (currentSyllabus.getThirteenProgramZero() != null && currentSyllabus2.getThirteenProgramZero() != null &&
                    !currentSyllabus.getThirteenProgramZero().equals(currentSyllabus2.getThirteenProgramZero())) {
                jsonResult.append("  \"ThirteenProgramZero\": \"Changed from '").append(currentSyllabus.getThirteenProgramZero()).append("' to '").append(currentSyllabus2.getThirteenProgramZero()).append("'\",\n");
            }

            if (currentSyllabus.getThirteenProgramOne() != null && currentSyllabus2.getThirteenProgramOne() != null &&
                    !currentSyllabus.getThirteenProgramOne().equals(currentSyllabus2.getThirteenProgramOne())) {
                jsonResult.append("  \"ThirteenProgramOne\": \"Changed from '").append(currentSyllabus.getThirteenProgramOne()).append("' to '").append(currentSyllabus2.getThirteenProgramOne()).append("'\",\n");
            }

            if (currentSyllabus.getThirteenProgramTwo() != null && currentSyllabus2.getThirteenProgramTwo() != null &&
                    !currentSyllabus.getThirteenProgramTwo().equals(currentSyllabus2.getThirteenProgramTwo())) {
                jsonResult.append("  \"ThirteenProgramTwo\": \"Changed from '").append(currentSyllabus.getThirteenProgramTwo()).append("' to '").append(currentSyllabus2.getThirteenProgramTwo()).append("'\",\n");
            }

            if (currentSyllabus.getThirteenProgramThree() != null && currentSyllabus2.getThirteenProgramThree() != null &&
                    !currentSyllabus.getThirteenProgramThree().equals(currentSyllabus2.getThirteenProgramThree())) {
                jsonResult.append("  \"ThirteenProgramThree\": \"Changed from '").append(currentSyllabus.getThirteenProgramThree()).append("' to '").append(currentSyllabus2.getThirteenProgramThree()).append("'\",\n");
            }

            if (currentSyllabus.getThirteenProgramFour() != null && currentSyllabus2.getThirteenProgramFour() != null &&
                    !currentSyllabus.getThirteenProgramFour().equals(currentSyllabus2.getThirteenProgramFour())) {
                jsonResult.append("  \"ThirteenProgramFour\": \"Changed from '").append(currentSyllabus.getThirteenProgramFour()).append("' to '").append(currentSyllabus2.getThirteenProgramFour()).append("'\",\n");
            }

            if (currentSyllabus.getThirteenProgramFive() != null && currentSyllabus2.getThirteenProgramFive() != null &&
                    !currentSyllabus.getThirteenProgramFive().equals(currentSyllabus2.getThirteenProgramFive())) {
                jsonResult.append("  \"ThirteenProgramFive\": \"Changed from '").append(currentSyllabus.getThirteenProgramFive()).append("' to '").append(currentSyllabus2.getThirteenProgramFive()).append("'\",\n");
                jsonResult.append("  \"ThirteenProgramFive\": \"Changed from '").append(currentSyllabus.getThirteenProgramFive()).append("' to '").append(currentSyllabus2.getThirteenProgramFive()).append("'\",\n");
            }
            jsonResult.deleteCharAt(jsonResult.length() - 2);
            jsonResult.append("}");

            fileWriter.write(jsonResult.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}