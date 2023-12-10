package com.example.se302;

import com.fasterxml.jackson.databind.ObjectMapper;
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
        String fileName = "syllabus_.json";
        String programFolder = System.getProperty("user.dir");
        String filePath = programFolder + File.separator + fileName;


        Syllabus syllabus = readJsonFile(filePath);

        if (syllabus != null) {
            System.out.println("Course Name: " + syllabus.getCourseName());
            System.out.println("Code: " + syllabus.getCode());
            System.out.println("fall:" + syllabus.getFall());
            System.out.println("spring:" + syllabus.getSpring());
            System.out.println("theory:" + syllabus.getTheory());
            System.out.println("localCredit:" + syllabus.getLocalCredit());
            System.out.println("ects:" + syllabus.getEcts());
            System.out.println("prerequisities:" + syllabus.getPrerequisites());
            System.out.println("lab:" + syllabus.getLab());
            System.out.println("courseLanguage:" + syllabus.getCourseLanguage());
            System.out.println("courseType:" + syllabus.getCourseType());
            System.out.println("courseLevel:" + syllabus.getCourseLevel());
            System.out.println("teachingMethods:" + syllabus.getTeachingMethods());
           // System.out.println("courseCordinator1:" + syllabus.getCourseCoordinator());
            System.out.println("courseCordinator2:"+ syllabus.getCourseCoordinator2());
            System.out.println("assistant:" + syllabus.getAssistant());
            System.out.println("courseObjectives:"+ syllabus.getCourseObjectives());
            System.out.println("learningOutcomes:" + syllabus.getLearningOutcomes());
            System.out.println("courseDescription:" + syllabus.getCourseDescription());
        } else {
            System.out.println("Failed to read JSON file.");
        }
    }
}
