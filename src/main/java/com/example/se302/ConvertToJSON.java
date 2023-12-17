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

                        //     + "Changes Detail: "
                        //     + "\"Code of the Class\" : \" " + syllabus.getCode() + "\n"
                        //     + "\"Editor Name and Surname\" : \" " + syllabus.getCode() + "\n"  //add editor info with get
                        //     + "\"Reason for Changes\" : \" " + syllabus.getCode() + "\n" // get why change info
                        //     + "\"When was change made\" : \" " + syllabus.getCode() + "\n" //get date box
                        //     + "\"What time was change made\" : \" " + syllabus.getCode() + "\n" //get time box
                        //     + "\"Language of the Syllabus\" : \" " + syllabus.getCode() + "\n" //get language

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


    /*
    public static void Compare(Syllabus syllabus, Syllabus editSyllabus, File file) {

// Create comparison json file.


//Compare
if (!syllabus.getCourseName().equals(editSyllabus.getCourseName())) {
    System.out.println("  Course Name changed from '" + syllabus.getCourseName() + "' to '" + editSyllabus.getCourseName() + "'");
}

if (!syllabus.getCode().equals(editSyllabus.getCode())) {
    System.out.println("  Code changed from '" + syllabus.getCode() + "' to '" + editSyllabus.getCode() + "'");
}

if (!syllabus.getFall().equals(editSyllabus.getFall())) {
    System.out.println("  Fall changed from '" + syllabus.getFall() + "' to '" + editSyllabus.getFall() + "'");
}

if (!syllabus.getSpring().equals(editSyllabus.getSpring())) {
    System.out.println("  Spring changed from '" + syllabus.getSpring() + "' to '" + editSyllabus.getSpring() + "'");
}

if (!syllabus.getTheory().equals(editSyllabus.getTheory())) {
    System.out.println("  Theory changed from '" + syllabus.getTheory() + "' to '" + editSyllabus.getTheory() + "'");
}

if (!syllabus.getLocalCredit().equals(editSyllabus.getLocalCredit())) {
    System.out.println("  Local Credit changed from '" + syllabus.getLocalCredit() + "' to '" + editSyllabus.getLocalCredit() + "'");
}

if (!syllabus.getEcts().equals(editSyllabus.getEcts())) {
    System.out.println("  ECTS changed from '" + syllabus.getEcts() + "' to '" + editSyllabus.getEcts() + "'");
}

if (!syllabus.getPrerequisites().equals(editSyllabus.getPrerequisites())) {
    System.out.println("  Prerequisites changed from '" + syllabus.getPrerequisites() + "' to '" + editSyllabus.getPrerequisites() + "'");
}

if (!syllabus.getLab().equals(editSyllabus.getLab())) {
    System.out.println("  Lab changed from '" + syllabus.getLab() + "' to '" + editSyllabus.getLab() + "'");
}

if (!syllabus.getCourseLanguage().equals(editSyllabus.getCourseLanguage())) {
    System.out.println("  Course Language changed from '" + syllabus.getCourseLanguage() + "' to '" + editSyllabus.getCourseLanguage() + "'");
}

if (!syllabus.getCourseType().equals(editSyllabus.getCourseType())) {
    System.out.println("  Course Type changed from '" + syllabus.getCourseType() + "' to '" + editSyllabus.getCourseType() + "'");
}

if (!syllabus.getCourseLevel().equals(editSyllabus.getCourseLevel())) {
    System.out.println("  Course Level changed from '" + syllabus.getCourseLevel() + "' to '" + editSyllabus.getCourseLevel() + "'");
}

if (!syllabus.getTeachingMethods().equals(editSyllabus.getTeachingMethods())) {
    System.out.println("  Teaching Methods changed from '" + syllabus.getTeachingMethods() + "' to '" + editSyllabus.getTeachingMethods() + "'");
}

if (!syllabus.getCourseCoordinator().equals(editSyllabus.getCourseCoordinator())) {
    System.out.println("  Course Coordinator changed from '" + syllabus.getCourseCoordinator() + "' to '" + editSyllabus.getCourseCoordinator() + "'");
}

if (!syllabus.getCourseCoordinator2().equals(editSyllabus.getCourseCoordinator2())) {
    System.out.println("  Course Coordinator2 changed from '" + syllabus.getCourseCoordinator2() + "' to '" + editSyllabus.getCourseCoordinator2() + "'");
}

if (!syllabus.getAssistant().equals(editSyllabus.getAssistant())) {
    System.out.println("  Assistant changed from '" + syllabus.getAssistant() + "' to '" + editSyllabus.getAssistant() + "'");
}

if (!syllabus.getCourseObjectives().equals(editSyllabus.getCourseObjectives())) {
    System.out.println("  Course Objectives changed from '" + syllabus.getCourseObjectives() + "' to '" + editSyllabus.getCourseObjectives() + "'");
}

if (!syllabus.getLearningOutcomes().equals(editSyllabus.getLearningOutcomes())) {
    System.out.println("  Learning Outcomes changed from '" + syllabus.getLearningOutcomes() + "' to '" + editSyllabus.getLearningOutcomes() + "'");
}

if (!syllabus.getCourseDescription().equals(editSyllabus.getCourseDescription())) {
    System.out.println("  Course Description changed from '" + syllabus.getCourseDescription() + "' to '" + editSyllabus.getCourseDescription() + "'");
}
if (!syllabus.getSubjectsTwo().equals(editSyllabus.getSubjectsTwo())) {
    System.out.println("  Subjects Two changed from '" + syllabus.getSubjectsTwo() + "' to '" + editSyllabus.getSubjectsTwo() + "'");
}

if (!syllabus.getSubjectsThree().equals(editSyllabus.getSubjectsThree())) {
    System.out.println("  Subjects Three changed from '" + syllabus.getSubjectsThree() + "' to '" + editSyllabus.getSubjectsThree() + "'");
}

if (!syllabus.getSubjectsFour().equals(editSyllabus.getSubjectsFour())) {
    System.out.println("  Subjects Four changed from '" + syllabus.getSubjectsFour() + "' to '" + editSyllabus.getSubjectsFour() + "'");
}

if (!syllabus.getSubjectsFive().equals(editSyllabus.getSubjectsFive())) {
    System.out.println("  Subjects Five changed from '" + syllabus.getSubjectsFive() + "' to '" + editSyllabus.getSubjectsFive() + "'");
}

if (!syllabus.getSubjectsSix().equals(editSyllabus.getSubjectsSix())) {
    System.out.println("  Subjects Six changed from '" + syllabus.getSubjectsSix() + "' to '" + editSyllabus.getSubjectsSix() + "'");
}

if (!syllabus.getSubjectsSeven().equals(editSyllabus.getSubjectsSeven())) {
    System.out.println("  Subjects Seven changed from '" + syllabus.getSubjectsSeven() + "' to '" + editSyllabus.getSubjectsSeven() + "'");
}

if (!syllabus.getSubjectsEight().equals(editSyllabus.getSubjectsEight())) {
    System.out.println("  Subjects Eight changed from '" + syllabus.getSubjectsEight() + "' to '" + editSyllabus.getSubjectsEight() + "'");
}

if (!syllabus.getSubjectsNine().equals(editSyllabus.getSubjectsNine())) {
    System.out.println("  Subjects Nine changed from '" + syllabus.getSubjectsNine() + "' to '" + editSyllabus.getSubjectsNine() + "'");
}

if (!syllabus.getSubjectsTen().equals(editSyllabus.getSubjectsTen())) {
    System.out.println("  Subjects Ten changed from '" + syllabus.getSubjectsTen() + "' to '" + editSyllabus.getSubjectsTen() + "'");
}

if (!syllabus.getSubjectsEleven().equals(editSyllabus.getSubjectsEleven())) {
    System.out.println("  Subjects Eleven changed from '" + syllabus.getSubjectsEleven() + "' to '" + editSyllabus.getSubjectsEleven() + "'");
}

if (!syllabus.getSubjectsTwelve().equals(editSyllabus.getSubjectsTwelve())) {
    System.out.println("  Subjects Twelve changed from '" + syllabus.getSubjectsTwelve() + "' to '" + editSyllabus.getSubjectsTwelve() + "'");
}

if (!syllabus.getSubjectsThirteen().equals(editSyllabus.getSubjectsThirteen())) {
    System.out.println("  Subjects Thirteen changed from '" + syllabus.getSubjectsThirteen() + "' to '" + editSyllabus.getSubjectsThirteen() + "'");
}

if (!syllabus.getSubjectsFourteen().equals(editSyllabus.getSubjectsFourteen())) {
    System.out.println("  Subjects Fourteen changed from '" + syllabus.getSubjectsFourteen() + "' to '" + editSyllabus.getSubjectsFourteen() + "'");
}

if (!syllabus.getSubjectsFifteen().equals(editSyllabus.getSubjectsFifteen())) {
    System.out.println("  Subjects Fifteen changed from '" + syllabus.getSubjectsFifteen() + "' to '" + editSyllabus.getSubjectsFifteen() + "'");
}

if (!syllabus.getSubjectsSixteen().equals(editSyllabus.getSubjectsSixteen())) {
    System.out.println("  Subjects Sixteen changed from '" + syllabus.getSubjectsSixteen() + "' to '" + editSyllabus.getSubjectsSixteen() + "'");
}

if (!syllabus.getRequiredMaterialsTwo().equals(editSyllabus.getRequiredMaterialsTwo())) {
    System.out.println("  Required Two changed from '" + syllabus.getRequiredMaterialsTwo() + "' to '" + editSyllabus.getRequiredMaterialsTwo() + "'");
}

if (!syllabus.getRequiredMaterialsThree().equals(editSyllabus.getRequiredMaterialsThree())) {
    System.out.println("  Required Three changed from '" + syllabus.getRequiredMaterialsThree() + "' to '" + editSyllabus.getRequiredMaterialsThree() + "'");
}

if (!syllabus.getRequiredMaterialsFour().equals(editSyllabus.getRequiredMaterialsFour())) {
    System.out.println("  Required Four changed from '" + syllabus.getRequiredMaterialsFour() + "' to '" + editSyllabus.getRequiredMaterialsFour() + "'");
}

if (!syllabus.getRequiredMaterialsFive().equals(editSyllabus.getRequiredMaterialsFive())) {
    System.out.println("  Required Five changed from '" + syllabus.getRequiredMaterialsFive() + "' to '" + editSyllabus.getRequiredMaterialsFive() + "'");
}

if (!syllabus.getRequiredMaterialsSix().equals(editSyllabus.getRequiredMaterialsSix())) {
    System.out.println("  Required Six changed from '" + syllabus.getRequiredMaterialsSix() + "' to '" + editSyllabus.getRequiredMaterialsSix() + "'");
}

if (!syllabus.getRequiredMaterialsSeven().equals(editSyllabus.getRequiredMaterialsSeven())) {
    System.out.println("  Required Seven changed from '" + syllabus.getRequiredMaterialsSeven() + "' to '" + editSyllabus.getRequiredMaterialsSeven() + "'");
}

if (!syllabus.getRequiredMaterialsEight().equals(editSyllabus.getRequiredMaterialsEight())) {
    System.out.println("  Required Eight changed from '" + syllabus.getRequiredMaterialsEight() + "' to '" + editSyllabus.getRequiredMaterialsEight() + "'");
}

if (!syllabus.getRequiredMaterialsNine().equals(editSyllabus.getRequiredMaterialsNine())) {
    System.out.println("  Required Nine changed from '" + syllabus.getRequiredMaterialsNine() + "' to '" + editSyllabus.getRequiredMaterialsNine() + "'");
}

if (!syllabus.getRequiredMaterialsTen().equals(editSyllabus.getRequiredMaterialsTen())) {
    System.out.println("  Required Ten changed from '" + syllabus.getRequiredMaterialsTen() + "' to '" + editSyllabus.getRequiredMaterialsTen() + "'");
}

if (!syllabus.getRequiredMaterialsEleven().equals(editSyllabus.getRequiredMaterialsEleven())) {
    System.out.println("  Required Eleven changed from '" + syllabus.getRequiredMaterialsEleven() + "' to '" + editSyllabus.getRequiredMaterialsEleven() + "'");
}

if (!syllabus.getRequiredMaterialsTwelve().equals(editSyllabus.getRequiredMaterialsTwelve())) {
    System.out.println("  Required Twelve changed from '" + syllabus.getRequiredMaterialsTwelve() + "' to '" + editSyllabus.getRequiredMaterialsTwelve() + "'");
}

if (!syllabus.getRequiredMaterialsThirteen().equals(editSyllabus.getRequiredMaterialsThirteen())) {
    System.out.println("  Required Thirteen changed from '" + syllabus.getRequiredMaterialsThirteen() + "' to '" + editSyllabus.getRequiredMaterialsThirteen() + "'");
}
if (!syllabus.getRequiredMaterialsFourteen().equals(editSyllabus.getRequiredMaterialsFourteen())) {
    System.out.println("  Required Fourteen changed from '" + syllabus.getRequiredMaterialsFourteen() + "' to '" + editSyllabus.getRequiredMaterialsFourteen() + "'");
}

if (!syllabus.getRequiredMaterialsFifteen().equals(editSyllabus.getRequiredMaterialsFifteen())) {
    System.out.println("  Required Fifteen changed from '" + syllabus.getRequiredMaterialsFifteen() + "' to '" + editSyllabus.getRequiredMaterialsFifteen() + "'");
}

// Participation fields
if (!syllabus.getParticipationOne().equals(editSyllabus.getParticipationOne())) {
    System.out.println("  Participation One changed from '" + syllabus.getParticipationOne() + "' to '" + editSyllabus.getParticipationOne() + "'");
}

if (!syllabus.getParticipationTwo().equals(editSyllabus.getParticipationTwo())) {
    System.out.println("  Participation Two changed from '" + syllabus.getParticipationTwo() + "' to '" + editSyllabus.getParticipationTwo() + "'");
}

if (!syllabus.getParticipationThree().equals(editSyllabus.getParticipationThree())) {
    System.out.println("  Participation Three changed from '" + syllabus.getParticipationThree() + "' to '" + editSyllabus.getParticipationThree() + "'");
}

if (!syllabus.getParticipationFour().equals(editSyllabus.getParticipationFour())) {
    System.out.println("  Participation Four changed from '" + syllabus.getParticipationFour() + "' to '" + editSyllabus.getParticipationFour() + "'");
}

if (!syllabus.getParticipationFive().equals(editSyllabus.getParticipationFive())) {
    System.out.println("  Participation Five changed from '" + syllabus.getParticipationFive() + "' to '" + editSyllabus.getParticipationFive() + "'");
}

if (!syllabus.getParticipationSix().equals(editSyllabus.getParticipationSix())) {
    System.out.println("  Participation Six changed from '" + syllabus.getParticipationSix() + "' to '" + editSyllabus.getParticipationSix() + "'");
}

if (!syllabus.getParticipationSeven().equals(editSyllabus.getParticipationSeven())) {
    System.out.println("  Participation Seven changed from '" + syllabus.getParticipationSeven() + "' to '" + editSyllabus.getParticipationSeven() + "'");
}

if (!syllabus.getParticipationEight().equals(editSyllabus.getParticipationEight())) {
    System.out.println("  Participation Eight changed from '" + syllabus.getParticipationEight() + "' to '" + editSyllabus.getParticipationEight() + "'");
}

if (!syllabus.getParticipationNine().equals(editSyllabus.getParticipationNine())) {
    System.out.println("  Participation Nine changed from '" + syllabus.getParticipationNine() + "' to '" + editSyllabus.getParticipationNine() + "'");
}

if (!syllabus.getLaboratoryOne().equals(editSyllabus.getLaboratoryOne())) {
    System.out.println("  Laboratory One changed from '" + syllabus.getLaboratoryOne() + "' to '" + editSyllabus.getLaboratoryOne() + "'");
}

if (!syllabus.getLaboratoryTwo().equals(editSyllabus.getLaboratoryTwo())) {
    System.out.println("  Laboratory Two changed from '" + syllabus.getLaboratoryTwo() + "' to '" + editSyllabus.getLaboratoryTwo() + "'");
}
if (!syllabus.getLaboratoryThree().equals(editSyllabus.getLaboratoryThree())) {
    System.out.println("  Laboratory Three changed from '" + syllabus.getLaboratoryThree() + "' to '" + editSyllabus.getLaboratoryThree() + "'");
}

if (!syllabus.getLaboratoryFour().equals(editSyllabus.getLaboratoryFour())) {
    System.out.println("  Laboratory Four changed from '" + syllabus.getLaboratoryFour() + "' to '" + editSyllabus.getLaboratoryFour() + "'");
}

if (!syllabus.getLaboratoryFive().equals(editSyllabus.getLaboratoryFive())) {
    System.out.println("  Laboratory Five changed from '" + syllabus.getLaboratoryFive() + "' to '" + editSyllabus.getLaboratoryFive() + "'");
}

if (!syllabus.getLaboratorySix().equals(editSyllabus.getLaboratorySix())) {
    System.out.println("  Laboratory Six changed from '" + syllabus.getLaboratorySix() + "' to '" + editSyllabus.getLaboratorySix() + "'");
}

if (!syllabus.getLaboratorySeven().equals(editSyllabus.getLaboratorySeven())) {
    System.out.println("  Laboratory Seven changed from '" + syllabus.getLaboratorySeven() + "' to '" + editSyllabus.getLaboratorySeven() + "'");
}

if (!syllabus.getLaboratoryEight().equals(editSyllabus.getLaboratoryEight())) {
    System.out.println("  Laboratory Eight changed from '" + syllabus.getLaboratoryEight() + "' to '" + editSyllabus.getLaboratoryEight() + "'");
}

if (!syllabus.getLaboratoryNine().equals(editSyllabus.getLaboratoryNine())) {
    System.out.println("  Laboratory Nine changed from '" + syllabus.getLaboratoryNine() + "' to '" + editSyllabus.getLaboratoryNine() + "'");
}
if (!syllabus.getFieldWorkOne().equals(editSyllabus.getFieldWorkOne())) {
    System.out.println("  FieldWork One changed from '" + syllabus.getFieldWorkOne() + "' to '" + editSyllabus.getFieldWorkOne() + "'");
}

if (!syllabus.getFieldWorkTwo().equals(editSyllabus.getFieldWorkTwo())) {
    System.out.println("  FieldWork Two changed from '" + syllabus.getFieldWorkTwo() + "' to '" + editSyllabus.getFieldWorkTwo() + "'");
}
if (!syllabus.getFieldWorkThree().equals(editSyllabus.getFieldWorkThree())) {
    System.out.println("  FieldWork Three changed from '" + syllabus.getFieldWorkThree() + "' to '" + editSyllabus.getFieldWorkThree() + "'");
}

if (!syllabus.getFieldWorkFour().equals(editSyllabus.getFieldWorkFour())) {
    System.out.println("  FieldWork Four changed from '" + syllabus.getFieldWorkFour() + "' to '" + editSyllabus.getFieldWorkFour() + "'");
}

if (!syllabus.getFieldWorkFive().equals(editSyllabus.getFieldWorkFive())) {
    System.out.println("  FieldWork Five changed from '" + syllabus.getFieldWorkFive() + "' to '" + editSyllabus.getFieldWorkFive() + "'");
}

if (!syllabus.getFieldWorkSix().equals(editSyllabus.getFieldWorkSix())) {
    System.out.println("  FieldWork Six changed from '" + syllabus.getFieldWorkSix() + "' to '" + editSyllabus.getFieldWorkSix() + "'");
}

if (!syllabus.getFieldWorkSeven().equals(editSyllabus.getFieldWorkSeven())) {
    System.out.println("  FieldWork Seven changed from '" + syllabus.getFieldWorkSeven() + "' to '" + editSyllabus.getFieldWorkSeven() + "'");
}

if (!syllabus.getFieldWorkEight().equals(editSyllabus.getFieldWorkEight())) {
    System.out.println("  FieldWork Eight changed from '" + syllabus.getFieldWorkEight() + "' to '" + editSyllabus.getFieldWorkEight() + "'");
}

if (!syllabus.getFieldWorkNine().equals(editSyllabus.getFieldWorkNine())) {
    System.out.println("  FieldWork Nine changed from '" + syllabus.getFieldWorkNine() + "' to '" + editSyllabus.getFieldWorkNine() + "'");
}
if (!syllabus.getQuiz2One().equals(editSyllabus.getQuiz2One())) {
    System.out.println("  Quiz2 One changed from '" + syllabus.getQuiz2One() + "' to '" + editSyllabus.getQuiz2One() + "'");
}

if (!syllabus.getQuiz2Two().equals(editSyllabus.getQuiz2Two())) {
    System.out.println("  Quiz2 Two changed from '" + syllabus.getQuiz2Two() + "' to '" + editSyllabus.getQuiz2Two() + "'");
}
if (!syllabus.getQuiz2Three().equals(editSyllabus.getQuiz2Three())) {
    System.out.println("  Quiz2 Three changed from '" + syllabus.getQuiz2Three() + "' to '" + editSyllabus.getQuiz2Three() + "'");
}
if (!syllabus.getQuiz2Four().equals(editSyllabus.getQuiz2Four())) {
    System.out.println("  Quiz2 Four changed from '" + syllabus.getQuiz2Four() + "' to '" + editSyllabus.getQuiz2Four() + "'");
}

if (!syllabus.getQuiz2Five().equals(editSyllabus.getQuiz2Five())) {
    System.out.println("  Quiz2 Five changed from '" + syllabus.getQuiz2Five() + "' to '" + editSyllabus.getQuiz2Five() + "'");
}

if (!syllabus.getQuiz2Six().equals(editSyllabus.getQuiz2Six())) {
    System.out.println("  Quiz2 Six changed from '" + syllabus.getQuiz2Six() + "' to '" + editSyllabus.getQuiz2Six() + "'");
}

if (!syllabus.getQuiz2Seven().equals(editSyllabus.getQuiz2Seven())) {
    System.out.println("  Quiz2 Seven changed from '" + syllabus.getQuiz2Seven() + "' to '" + editSyllabus.getQuiz2Seven() + "'");
}

if (!syllabus.getQuiz2Eight().equals(editSyllabus.getQuiz2Eight())) {
    System.out.println("  Quiz2 Eight changed from '" + syllabus.getQuiz2Eight() + "' to '" + editSyllabus.getQuiz2Eight() + "'");
}

if (!syllabus.getQuiz2Nine().equals(editSyllabus.getQuiz2Nine())) {
    System.out.println("  Quiz2 Nine changed from '" + syllabus.getQuiz2Nine() + "' to '" + editSyllabus.getQuiz2Nine() + "'");
}
if (!syllabus.getCourseHourOne().equals(editSyllabus.getCourseHourOne())) {
    System.out.println("  Coursehour One changed from '" + syllabus.getCourseHourOne() + "' to '" + editSyllabus.getCourseHourOne() + "'");
}

if (!syllabus.getCourseHourTwo().equals(editSyllabus.getCourseHourTwo())) {
    System.out.println("  Coursehour Two changed from '" + syllabus.getCourseHourTwo() + "' to '" + editSyllabus.getCourseHourTwo() + "'");
}

if (!syllabus.getLabhourOne().equals(editSyllabus.getLabhourOne())) {
    System.out.println("  Labhour One changed from '" + syllabus.getLabhourOne() + "' to '" + editSyllabus.getLabhourOne() + "'");
}
if (!syllabus.getLabhourTwo().equals(editSyllabus.getLabhourTwo())) {
    System.out.println("  Labhour Two changed from '" + syllabus.getLabhourTwo() + "' to '" + editSyllabus.getLabhourTwo() + "'");
}

if (!syllabus.getStudyhourOne().equals(editSyllabus.getStudyhourOne())) {
    System.out.println("  Studyhour One changed from '" + syllabus.getStudyhourOne() + "' to '" + editSyllabus.getStudyhourOne() + "'");
}

if (!syllabus.getStudyhourTwo().equals(editSyllabus.getStudyhourTwo())) {
    System.out.println("  Studyhour Two changed from '" + syllabus.getStudyhourTwo() + "' to '" + editSyllabus.getStudyhourTwo() + "'");
}

if (!syllabus.getStudyhourThree().equals(editSyllabus.getStudyhourThree())) {
    System.out.println("  Studyhour Three changed from '" + syllabus.getStudyhourThree() + "' to '" + editSyllabus.getStudyhourThree() + "'");
}

if (!syllabus.getFieldworkOne().equals(editSyllabus.getFieldworkOne())) {
    System.out.println("  Fieldwork One changed from '" + syllabus.getFieldworkOne() + "' to '" + editSyllabus.getFieldworkOne() + "'");
}

if (!syllabus.getFieldworkTwo().equals(editSyllabus.getFieldworkTwo())) {
    System.out.println("  Fieldwork Two changed from '" + syllabus.getFieldworkTwo() + "' to '" + editSyllabus.getFieldworkTwo() + "'");
}

if (!syllabus.getFieldworkThree().equals(editSyllabus.getFieldworkThree())) {
    System.out.println("  Fieldwork Three changed from '" + syllabus.getFieldworkThree() + "' to '" + editSyllabus.getFieldworkThree() + "'");
}

if (!syllabus.getQuizOne().equals(editSyllabus.getQuizOne())) {
    System.out.println("  Quiz One changed from '" + syllabus.getQuizOne() + "' to '" + editSyllabus.getQuizOne() + "'");
}

if (!syllabus.getQuizTwo().equals(editSyllabus.getQuizTwo())) {
    System.out.println("  Quiz Two changed from '" + syllabus.getQuizTwo() + "' to '" + editSyllabus.getQuizTwo() + "'");
}

if (!syllabus.getQuizThree().equals(editSyllabus.getQuizThree())) {
    System.out.println("  Quiz Three changed from '" + syllabus.getQuizThree() + "' to '" + editSyllabus.getQuizThree() + "'");
}

if (!syllabus.getHomeworkOne().equals(editSyllabus.getHomeworkOne())) {
    System.out.println("  Homework One changed from '" + syllabus.getHomeworkOne() + "' to '" + editSyllabus.getHomeworkOne() + "'");
}

if (!syllabus.getHomeworkTwo().equals(editSyllabus.getHomeworkTwo())) {
    System.out.println("  Homework Two changed from '" + syllabus.getHomeworkTwo() + "' to '" + editSyllabus.getHomeworkTwo() + "'");
}

if (!syllabus.getHomeworkThree().equals(editSyllabus.getHomeworkThree())) {
    System.out.println("  Homework Three changed from '" + syllabus.getHomeworkThree() + "' to '" + editSyllabus.getHomeworkThree() + "'");
}

if (!syllabus.getPresentationOne().equals(editSyllabus.getPresentationOne())) {
    System.out.println("  Presentation One changed from '" + syllabus.getPresentationOne() + "' to '" + editSyllabus.getPresentationOne() + "'");
}

if (!syllabus.getPresentationTwo().equals(editSyllabus.getPresentationTwo())) {
    System.out.println("  Presentation Two changed from '" + syllabus.getPresentationTwo() + "' to '" + editSyllabus.getPresentationTwo() + "'");
}

if (!syllabus.getPresentationThree().equals(editSyllabus.getPresentationThree())) {
    System.out.println("  Presentation Three changed from '" + syllabus.getPresentationThree() + "' to '" + editSyllabus.getPresentationThree() + "'");
}

if (!syllabus.getProjectOne().equals(editSyllabus.getProjectOne())) {
    System.out.println("  Project One changed from '" + syllabus.getProjectOne() + "' to '" + editSyllabus.getProjectOne() + "'");
}

if (!syllabus.getProjectTwo().equals(editSyllabus.getProjectTwo())) {
    System.out.println("  Project Two changed from '" + syllabus.getProjectTwo() + "' to '" + editSyllabus.getProjectTwo() + "'");
}

if (!syllabus.getProjectThree().equals(editSyllabus.getProjectThree())) {
    System.out.println("  Project Three changed from '" + syllabus.getProjectThree() + "' to '" + editSyllabus.getProjectThree() + "'");
}

if (!syllabus.getPortfolioOne().equals(editSyllabus.getPortfolioOne())) {
    System.out.println("  Portfolio One changed from '" + syllabus.getPortfolioOne() + "' to '" + editSyllabus.getPortfolioOne() + "'");
}

if (!syllabus.getPortfolioTwo().equals(editSyllabus.getPortfolioTwo())) {
    System.out.println("  Portfolio Two changed from '" + syllabus.getPortfolioTwo() + "' to '" + editSyllabus.getPortfolioTwo() + "'");
}

if (!syllabus.getPortfolioThree().equals(editSyllabus.getPortfolioThree())) {
    System.out.println("  Portfolio Three changed from '" + syllabus.getPortfolioThree() + "' to '" + editSyllabus.getPortfolioThree() + "'");
}

if (!syllabus.getSeminarOne().equals(editSyllabus.getSeminarOne())) {
    System.out.println("  Seminar One changed from '" + syllabus.getSeminarOne() + "' to '" + editSyllabus.getSeminarOne() + "'");
}

if (!syllabus.getSeminarTwo().equals(editSyllabus.getSeminarTwo())) {
    System.out.println("  Seminar Two changed from '" + syllabus.getSeminarTwo() + "' to '" + editSyllabus.getSeminarTwo() + "'");
}

if (!syllabus.getSeminarThree().equals(editSyllabus.getSeminarThree())) {
    System.out.println("  Seminar Three changed from '" + syllabus.getSeminarThree() + "' to '" + editSyllabus.getSeminarThree() + "'");
}

if (!syllabus.getOralOne().equals(editSyllabus.getOralOne())) {
    System.out.println("  Oral One changed from '" + syllabus.getOralOne() + "' to '" + editSyllabus.getOralOne() + "'");
}

if (!syllabus.getOralTwo().equals(editSyllabus.getOralTwo())) {
    System.out.println("  Oral Two changed from '" + syllabus.getOralTwo() + "' to '" + editSyllabus.getOralTwo() + "'");
}

if (!syllabus.getOralThree().equals(editSyllabus.getOralThree())) {
    System.out.println("  Oral Three changed from '" + syllabus.getOralThree() + "' to '" + editSyllabus.getOralThree() + "'");
}

if (!syllabus.getMidtermOne().equals(editSyllabus.getMidtermOne())) {
    System.out.println("  Midterm One changed from '" + syllabus.getMidtermOne() + "' to '" + editSyllabus.getMidtermOne() + "'");
}

if (!syllabus.getMidtermTwo().equals(editSyllabus.getMidtermTwo())) {
    System.out.println("  Midterm Two changed from '" + syllabus.getMidtermTwo() + "' to '" + editSyllabus.getMidtermTwo() + "'");
}

if (!syllabus.getMidtermThree().equals(editSyllabus.getMidtermThree())) {
    System.out.println("  Midterm Three changed from '" + syllabus.getMidtermThree() + "' to '" + editSyllabus.getMidtermThree() + "'");
}

if (!syllabus.getFinalOne().equals(editSyllabus.getFinalOne())) {
    System.out.println("  Final One changed from '" + syllabus.getFinalOne() + "' to '" + editSyllabus.getFinalOne() + "'");
}

if (!syllabus.getFinalTwo().equals(editSyllabus.getFinalTwo())) {
    System.out.println("  Final Two changed from '" + syllabus.getFinalTwo() + "' to '" + editSyllabus.getFinalTwo() + "'");
}

if (!syllabus.getFinalThree().equals(editSyllabus.getFinalThree())) {
    System.out.println("  Final Three changed from '" + syllabus.getFinalThree() + "' to '" + editSyllabus.getFinalThree() + "'");
}

if (!syllabus.getOneProgramZero().equals(editSyllabus.getOneProgramZero())) {
    System.out.println("  OneProgram Zero changed from '" + syllabus.getOneProgramZero() + "' to '" + editSyllabus.getOneProgramZero() + "'");
}

if (!syllabus.getOneProgramOne().equals(editSyllabus.getOneProgramOne())) {
    System.out.println("  OneProgram One changed from '" + syllabus.getOneProgramOne() + "' to '" + editSyllabus.getOneProgramOne() + "'");
}

if (!syllabus.getOneProgramTwo().equals(editSyllabus.getOneProgramTwo())) {
    System.out.println("  OneProgram Two changed from '" + syllabus.getOneProgramTwo() + "' to '" + editSyllabus.getOneProgramTwo() + "'");
}

if (!syllabus.getOneProgramThree().equals(editSyllabus.getOneProgramThree())) {
    System.out.println("  OneProgram Three changed from '" + syllabus.getOneProgramThree() + "' to '" + editSyllabus.getOneProgramThree() + "'");
}

if (!syllabus.getOneProgramFour().equals(editSyllabus.getOneProgramFour())) {
    System.out.println("  OneProgram Four changed from '" + syllabus.getOneProgramFour() + "' to '" + editSyllabus.getOneProgramFour() + "'");
}

if (!syllabus.getOneProgramFive().equals(editSyllabus.getOneProgramFive())) {
    System.out.println("  OneProgram Five changed from '" + syllabus.getOneProgramFive() + "' to '" + editSyllabus.getOneProgramFive() + "'");
}

if (!syllabus.getTwoProgramZero().equals(editSyllabus.getTwoProgramZero())) {
    System.out.println("  TwoProgram Zero changed from '" + syllabus.getTwoProgramZero() + "' to '" + editSyllabus.getTwoProgramZero() + "'");
}

if (!syllabus.getTwoProgramOne().equals(editSyllabus.getTwoProgramOne())) {
    System.out.println("  TwoProgram One changed from '" + syllabus.getTwoProgramOne() + "' to '" + editSyllabus.getTwoProgramOne() + "'");
}

if (!syllabus.getTwoProgramTwo().equals(editSyllabus.getTwoProgramTwo())) {
    System.out.println("  TwoProgram Two changed from '" + syllabus.getTwoProgramTwo() + "' to '" + editSyllabus.getTwoProgramTwo() + "'");
}

if (!syllabus.getTwoProgramThree().equals(editSyllabus.getTwoProgramThree())) {
    System.out.println("  TwoProgram Three changed from '" + syllabus.getTwoProgramThree() + "' to '" + editSyllabus.getTwoProgramThree() + "'");
}

if (!syllabus.getTwoProgramFour().equals(editSyllabus.getTwoProgramFour())) {
    System.out.println("  TwoProgram Four changed from '" + syllabus.getTwoProgramFour() + "' to '" + editSyllabus.getTwoProgramFour() + "'");
}

if (!syllabus.getTwoProgramFive().equals(editSyllabus.getTwoProgramFive())) {
    System.out.println("  TwoProgram Five changed from '" + syllabus.getTwoProgramFive() + "' to '" + editSyllabus.getTwoProgramFive() + "'");
}
// ThreeProgram fields
if (!syllabus.getThreeProgramZero().equals(editSyllabus.getThreeProgramZero())) {
    System.out.println("  ThreeProgram Zero changed from '" + syllabus.getThreeProgramZero() + "' to '" + editSyllabus.getThreeProgramZero() + "'");
}

if (!syllabus.getThreeProgramOne().equals(editSyllabus.getThreeProgramOne())) {
    System.out.println("  ThreeProgram One changed from '" + syllabus.getThreeProgramOne() + "' to '" + editSyllabus.getThreeProgramOne() + "'");
}

if (!syllabus.getThreeProgramTwo().equals(editSyllabus.getThreeProgramTwo())) {
    System.out.println("  ThreeProgram Two changed from '" + syllabus.getThreeProgramTwo() + "' to '" + editSyllabus.getThreeProgramTwo() + "'");
}

if (!syllabus.getThreeProgramThree().equals(editSyllabus.getThreeProgramThree())) {
    System.out.println("  ThreeProgram Three changed from '" + syllabus.getThreeProgramThree() + "' to '" + editSyllabus.getThreeProgramThree() + "'");
}

if (!syllabus.getThreeProgramFour().equals(editSyllabus.getThreeProgramFour())) {
    System.out.println("  ThreeProgram Four changed from '" + syllabus.getThreeProgramFour() + "' to '" + editSyllabus.getThreeProgramFour() + "'");
}

if (!syllabus.getThreeProgramFive().equals(editSyllabus.getThreeProgramFive())) {
    System.out.println("  ThreeProgram Five changed from '" + syllabus.getThreeProgramFive() + "' to '" + editSyllabus.getThreeProgramFive() + "'");
}

// FourProgram fields
if (!syllabus.getFourProgramZero().equals(editSyllabus.getFourProgramZero())) {
    System.out.println("  FourProgram Zero changed from '" + syllabus.getFourProgramZero() + "' to '" + editSyllabus.getFourProgramZero() + "'");
}

if (!syllabus.getFourProgramOne().equals(editSyllabus.getFourProgramOne())) {
    System.out.println("  FourProgram One changed from '" + syllabus.getFourProgramOne() + "' to '" + editSyllabus.getFourProgramOne() + "'");
}

if (!syllabus.getFourProgramTwo().equals(editSyllabus.getFourProgramTwo())) {
    System.out.println("  FourProgram Two changed from '" + syllabus.getFourProgramTwo() + "' to '" + editSyllabus.getFourProgramTwo() + "'");
}

if (!syllabus.getFourProgramThree().equals(editSyllabus.getFourProgramThree())) {
    System.out.println("  FourProgram Three changed from '" + syllabus.getFourProgramThree() + "' to '" + editSyllabus.getFourProgramThree() + "'");
}

if (!syllabus.getFourProgramFour().equals(editSyllabus.getFourProgramFour())) {
    System.out.println("  FourProgram Four changed from '" + syllabus.getFourProgramFour() + "' to '" + editSyllabus.getFourProgramFour() + "'");
}

if (!syllabus.getFourProgramFive().equals(editSyllabus.getFourProgramFive())) {
    System.out.println("  FourProgram Five changed from '" + syllabus.getFourProgramFive() + "' to '" + editSyllabus.getFourProgramFive() + "'");
}

// FiveProgram fields
if (!syllabus.getFiveProgramZero().equals(editSyllabus.getFiveProgramZero())) {
    System.out.println("  FiveProgram Zero changed from '" + syllabus.getFiveProgramZero() + "' to '" + editSyllabus.getFiveProgramZero() + "'");
}

if (!syllabus.getFiveProgramOne().equals(editSyllabus.getFiveProgramOne())) {
    System.out.println("  FiveProgram One changed from '" + syllabus.getFiveProgramOne() + "' to '" + editSyllabus.getFiveProgramOne() + "'");
}

if (!syllabus.getFiveProgramTwo().equals(editSyllabus.getFiveProgramTwo())) {
    System.out.println("  FiveProgram Two changed from '" + syllabus.getFiveProgramTwo() + "' to '" + editSyllabus.getFiveProgramTwo() + "'");
}

if (!syllabus.getFiveProgramThree().equals(editSyllabus.getFiveProgramThree())) {
    System.out.println("  FiveProgram Three changed from '" + syllabus.getFiveProgramThree() + "' to '" + editSyllabus.getFiveProgramThree() + "'");
}

if (!syllabus.getFiveProgramFour().equals(editSyllabus.getFiveProgramFour())) {
    System.out.println("  FiveProgram Four changed from '" + syllabus.getFiveProgramFour() + "' to '" + editSyllabus.getFiveProgramFour() + "'");
}

if (!syllabus.getFiveProgramFive().equals(editSyllabus.getFiveProgramFive())) {
    System.out.println("  FiveProgram Five changed from '" + syllabus.getFiveProgramFive() + "' to '" + editSyllabus.getFiveProgramFive() + "'");
}

// SixProgram fields
if (!syllabus.getSixProgramZero().equals(editSyllabus.getSixProgramZero())) {
    System.out.println("  SixProgram Zero changed from '" + syllabus.getSixProgramZero() + "' to '" + editSyllabus.getSixProgramZero() + "'");
}

if (!syllabus.getSixProgramOne().equals(editSyllabus.getSixProgramOne())) {
    System.out.println("  SixProgram One changed from '" + syllabus.getSixProgramOne() + "' to '" + editSyllabus.getSixProgramOne() + "'");
}

if (!syllabus.getSixProgramTwo().equals(editSyllabus.getSixProgramTwo())) {
    System.out.println("  SixProgram Two changed from '" + syllabus.getSixProgramTwo() + "' to '" + editSyllabus.getSixProgramTwo() + "'");
}

if (!syllabus.getSixProgramThree().equals(editSyllabus.getSixProgramThree())) {
    System.out.println("  SixProgram Three changed from '" + syllabus.getSixProgramThree() + "' to '" + editSyllabus.getSixProgramThree() + "'");
}

if (!syllabus.getSixProgramFour().equals(editSyllabus.getSixProgramFour())) {
    System.out.println("  SixProgram Four changed from '" + syllabus.getSixProgramFour() + "' to '" + editSyllabus.getSixProgramFour() + "'");
}

if (!syllabus.getSixProgramFive().equals(editSyllabus.getSixProgramFive())) {
    System.out.println("  SixProgram Five changed from '" + syllabus.getSixProgramFive() + "' to '" + editSyllabus.getSixProgramFive() + "'");
}
// SevenProgram fields
if (!syllabus.getSevenProgramZero().equals(editSyllabus.getSevenProgramZero())) {
    System.out.println("  SevenProgram Zero changed from '" + syllabus.getSevenProgramZero() + "' to '" + editSyllabus.getSevenProgramZero() + "'");
}

if (!syllabus.getSevenProgramOne().equals(editSyllabus.getSevenProgramOne())) {
    System.out.println("  SevenProgram One changed from '" + syllabus.getSevenProgramOne() + "' to '" + editSyllabus.getSevenProgramOne() + "'");
}

if (!syllabus.getSevenProgramTwo().equals(editSyllabus.getSevenProgramTwo())) {
    System.out.println("  SevenProgram Two changed from '" + syllabus.getSevenProgramTwo() + "' to '" + editSyllabus.getSevenProgramTwo() + "'");
}

if (!syllabus.getSevenProgramThree().equals(editSyllabus.getSevenProgramThree())) {
    System.out.println("  SevenProgram Three changed from '" + syllabus.getSevenProgramThree() + "' to '" + editSyllabus.getSevenProgramThree() + "'");
}

if (!syllabus.getSevenProgramFour().equals(editSyllabus.getSevenProgramFour())) {
    System.out.println("  SevenProgram Four changed from '" + syllabus.getSevenProgramFour() + "' to '" + editSyllabus.getSevenProgramFour() + "'");
}

if (!syllabus.getSevenProgramFive().equals(editSyllabus.getSevenProgramFive())) {
    System.out.println("  SevenProgram Five changed from '" + syllabus.getSevenProgramFive() + "' to '" + editSyllabus.getSevenProgramFive() + "'");
}

// EightProgram fields
if (!syllabus.getEightProgramZero().equals(editSyllabus.getEightProgramZero())) {
    System.out.println("  EightProgram Zero changed from '" + syllabus.getEightProgramZero() + "' to '" + editSyllabus.getEightProgramZero() + "'");
}

if (!syllabus.getEightProgramOne().equals(editSyllabus.getEightProgramOne())) {
    System.out.println("  EightProgram One changed from '" + syllabus.getEightProgramOne() + "' to '" + editSyllabus.getEightProgramOne() + "'");
}

if (!syllabus.getEightProgramTwo().equals(editSyllabus.getEightProgramTwo())) {
    System.out.println("  EightProgram Two changed from '" + syllabus.getEightProgramTwo() + "' to '" + editSyllabus.getEightProgramTwo() + "'");
}

if (!syllabus.getEightProgramThree().equals(editSyllabus.getEightProgramThree())) {
    System.out.println("  EightProgram Three changed from '" + syllabus.getEightProgramThree() + "' to '" + editSyllabus.getEightProgramThree() + "'");
}

if (!syllabus.getEightProgramFour().equals(editSyllabus.getEightProgramFour())) {
    System.out.println("  EightProgram Four changed from '" + syllabus.getEightProgramFour() + "' to '" + editSyllabus.getEightProgramFour() + "'");
}

if (!syllabus.getEightProgramFive().equals(editSyllabus.getEightProgramFive())) {
    System.out.println("  EightProgram Five changed from '" + syllabus.getEightProgramFive() + "' to '" + editSyllabus.getEightProgramFive() + "'");
}

// NineProgram fields
if (!syllabus.getNineProgramZero().equals(editSyllabus.getNineProgramZero())) {
    System.out.println("  NineProgram Zero changed from '" + syllabus.getNineProgramZero() + "' to '" + editSyllabus.getNineProgramZero() + "'");
}

if (!syllabus.getNineProgramOne().equals(editSyllabus.getNineProgramOne())) {
    System.out.println("  NineProgram One changed from '" + syllabus.getNineProgramOne() + "' to '" + editSyllabus.getNineProgramOne() + "'");
}

if (!syllabus.getNineProgramTwo().equals(editSyllabus.getNineProgramTwo())) {
    System.out.println("  NineProgram Two changed from '" + syllabus.getNineProgramTwo() + "' to '" + editSyllabus.getNineProgramTwo() + "'");
}

if (!syllabus.getNineProgramThree().equals(editSyllabus.getNineProgramThree())) {
    System.out.println("  NineProgram Three changed from '" + syllabus.getNineProgramThree() + "' to '" + editSyllabus.getNineProgramThree() + "'");
}

if (!syllabus.getNineProgramFour().equals(editSyllabus.getNineProgramFour())) {
    System.out.println("  NineProgram Four changed from '" + syllabus.getNineProgramFour() + "' to '" + editSyllabus.getNineProgramFour() + "'");
}

if (!syllabus.getNineProgramFive().equals(editSyllabus.getNineProgramFive())) {
    System.out.println("  NineProgram Five changed from '" + syllabus.getNineProgramFive() + "' to '" + editSyllabus.getNineProgramFive() + "'");
}
// TenProgram fields
if (!syllabus.getTenProgramZero().equals(editSyllabus.getTenProgramZero())) {
    System.out.println("  TenProgram Zero changed from '" + syllabus.getTenProgramZero() + "' to '" + editSyllabus.getTenProgramZero() + "'");
}

if (!syllabus.getTenProgramOne().equals(editSyllabus.getTenProgramOne())) {
    System.out.println("  TenProgram One changed from '" + syllabus.getTenProgramOne() + "' to '" + editSyllabus.getTenProgramOne() + "'");
}

if (!syllabus.getTenProgramTwo().equals(editSyllabus.getTenProgramTwo())) {
    System.out.println("  TenProgram Two changed from '" + syllabus.getTenProgramTwo() + "' to '" + editSyllabus.getTenProgramTwo() + "'");
}

if (!syllabus.getTenProgramThree().equals(editSyllabus.getTenProgramThree())) {
    System.out.println("  TenProgram Three changed from '" + syllabus.getTenProgramThree() + "' to '" + editSyllabus.getTenProgramThree() + "'");
}

if (!syllabus.getTenProgramFour().equals(editSyllabus.getTenProgramFour())) {
    System.out.println("  TenProgram Four changed from '" + syllabus.getTenProgramFour() + "' to '" + editSyllabus.getTenProgramFour() + "'");
}

if (!syllabus.getTenProgramFive().equals(editSyllabus.getTenProgramFive())) {
    System.out.println("  TenProgram Five changed from '" + syllabus.getTenProgramFive() + "' to '" + editSyllabus.getTenProgramFive() + "'");
}

// ElevenProgram fields
if (!syllabus.getElevenProgramZero().equals(editSyllabus.getElevenProgramZero())) {
    System.out.println("  ElevenProgram Zero changed from '" + syllabus.getElevenProgramZero() + "' to '" + editSyllabus.getElevenProgramZero() + "'");
}

if (!syllabus.getElevenProgramOne().equals(editSyllabus.getElevenProgramOne())) {
    System.out.println("  ElevenProgram One changed from '" + syllabus.getElevenProgramOne() + "' to '" + editSyllabus.getElevenProgramOne() + "'");
}

if (!syllabus.getElevenProgramTwo().equals(editSyllabus.getElevenProgramTwo())) {
    System.out.println("  ElevenProgram Two changed from '" + syllabus.getElevenProgramTwo() + "' to '" + editSyllabus.getElevenProgramTwo() + "'");
}

if (!syllabus.getElevenProgramThree().equals(editSyllabus.getElevenProgramThree())) {
    System.out.println("  ElevenProgram Three changed from '" + syllabus.getElevenProgramThree() + "' to '" + editSyllabus.getElevenProgramThree() + "'");
}

if (!syllabus.getElevenProgramFour().equals(editSyllabus.getElevenProgramFour())) {
    System.out.println("  ElevenProgram Four changed from '" + syllabus.getElevenProgramFour() + "' to '" + editSyllabus.getElevenProgramFour() + "'");
}

if (!syllabus.getElevenProgramFive().equals(editSyllabus.getElevenProgramFive())) {
    System.out.println("  ElevenProgram Five changed from '" + syllabus.getElevenProgramFive() + "' to '" + editSyllabus.getElevenProgramFive() + "'");
}

// TwelveProgram fields
if (!syllabus.getTwelveProgramZero().equals(editSyllabus.getTwelveProgramZero())) {
    System.out.println("  TwelveProgram Zero changed from '" + syllabus.getTwelveProgramZero() + "' to '" + editSyllabus.getTwelveProgramZero() + "'");
}

if (!syllabus.getTwelveProgramOne().equals(editSyllabus.getTwelveProgramOne())) {
    System.out.println("  TwelveProgram One changed from '" + syllabus.getTwelveProgramOne() + "' to '" + editSyllabus.getTwelveProgramOne() + "'");
}

if (!syllabus.getTwelveProgramTwo().equals(editSyllabus.getTwelveProgramTwo())) {
    System.out.println("  TwelveProgram Two changed from '" + syllabus.getTwelveProgramTwo() + "' to '" + editSyllabus.getTwelveProgramTwo() + "'");
}

if (!syllabus.getTwelveProgramThree().equals(editSyllabus.getTwelveProgramThree())) {
    System.out.println("  TwelveProgram Three changed from '" + syllabus.getTwelveProgramThree() + "' to '" + editSyllabus.getTwelveProgramThree() + "'");
}

if (!syllabus.getTwelveProgramFour().equals(editSyllabus.getTwelveProgramFour())) {
    System.out.println("  TwelveProgram Four changed from '" + syllabus.getTwelveProgramFour() + "' to '" + editSyllabus.getTwelveProgramFour() + "'");
}

if (!syllabus.getTwelveProgramFive().equals(editSyllabus.getTwelveProgramFive())) {
    System.out.println("  TwelveProgram Five changed from '" + syllabus.getTwelveProgramFive() + "' to '" + editSyllabus.getTwelveProgramFive() + "'");
}

// ThirteenProgram fields
if (!syllabus.getThirteenProgramZero().equals(editSyllabus.getThirteenProgramZero())) {
    System.out.println("  ThirteenProgram Zero changed from '" + syllabus.getThirteenProgramZero() + "' to '" + editSyllabus.getThirteenProgramZero() + "'");
}

if (!syllabus.getThirteenProgramOne().equals(editSyllabus.getThirteenProgramOne())) {
    System.out.println("  ThirteenProgram One changed from '" + syllabus.getThirteenProgramOne() + "' to '" + editSyllabus.getThirteenProgramOne() + "'");
}

if (!syllabus.getThirteenProgramTwo().equals(editSyllabus.getThirteenProgramTwo())) {
    System.out.println("  ThirteenProgram Two changed from '" + syllabus.getThirteenProgramTwo() + "' to '" + editSyllabus.getThirteenProgramTwo() + "'");
}

if (!syllabus.getThirteenProgramThree().equals(editSyllabus.getThirteenProgramThree())) {
    System.out.println("  ThirteenProgram Three changed from '" + syllabus.getThirteenProgramThree() + "' to '" + editSyllabus.getThirteenProgramThree() + "'");
}

if (!syllabus.getThirteenProgramFour().equals(editSyllabus.getThirteenProgramFour())) {
    System.out.println("  ThirteenProgram Four changed from '" + syllabus.getThirteenProgramFour() + "' to '" + editSyllabus.getThirteenProgramFour() + "'");
}

if (!syllabus.getThirteenProgramFive().equals(editSyllabus.getThirteenProgramFive())) {
    System.out.println("  ThirteenProgram Five changed from '" + syllabus.getThirteenProgramFive() + "' to '" + editSyllabus.getThirteenProgramFive() + "'");
}

if (!syllabus.getTeachingMethods().equals(editSyllabus.getTeachingMethods())) {
    System.out.println("  teachingMethods changed from '" + syllabus.getTeachingMethods() + "' to '" + editSyllabus.getTeachingMethods() + "'");
}

}
*/

}