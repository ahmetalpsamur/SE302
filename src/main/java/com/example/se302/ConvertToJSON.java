package com.example.se302;

import java.io.FileWriter;
import java.io.IOException;

public class ConvertToJSON {

    public static void generateJsonFile(Syllabus syllabus) {  ///// FILL THE BLANK PARTS

        String filePath = "syllabus_" + syllabus.getCode() + ".json";

        String jsonString = "{\n"
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
               // + "  \"courseCoordinator\": \"" + syllabus.getCourseCoordinator1() + "\",\n"
                + "  \"courseCoordinator2\": \"" + syllabus.getCourseCoordinator2() + "\",\n"
                + "  \"assistant\": \"" + syllabus.getAssistant() + "\",\n"
                + "  \"courseObjectives\": \"" + syllabus.getCourseObjectives() + "\",\n"
                + "  \"learningOutcomes\": \"" + syllabus.getLearningOutcomes() + "\",\n"
                + "  \"courseDescription\": \"" + syllabus.getCourseDescription() + "\"\n"
                + "}";

        // Write the JSON string to a file
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(jsonString);
            System.out.println("Data written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
