package com.jap.marksevaluation;

import java.util.Arrays;

public class oakBridgeSchool {
    public static void main(String[] args) {
        //Object of OakBridgeSchool class is created
        oakBridgeSchool oakBridgeSchool = new oakBridgeSchool();
        // Initialize the arrays with 10 values of marks for each subject
        int[] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};
        // The total number of subjects
        int noOfSubjects = 3;
        // Initialize names of 10 Students
        String[] studentNames = {"Michelle", "Katie", "Rob", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};
        // Initialize roll numbers of 10 Students
        int[] rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};
        // Call the methods to calculate total marks and average marks
        int[] totalArray = oakBridgeSchool.calculateTotalMarks(math, science, english);
        int[] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalArray, noOfSubjects);
        // Display the marks and average marks of each student
        System.out.println(Arrays.toString(totalArray));
        System.out.println(Arrays.toString(averageMarks));
        // Call the methods to calculate average marks of science, math and social subjects of the class
        int averageScienceMarks = oakBridgeSchool.calculateAverageScienceMarks(science);
        int averageMathMarks = oakBridgeSchool.calculateAverageMathMarks(math);
        int averageEnglishMarks = oakBridgeSchool.calculateAverageEnglishMarks(english);
        
        // Display the average marks scored by the class in subjects
        
        
    }
    
    /**
     * this method takes marks of math,science and english and displays the total marks as output
     *
     * @param math
     * @param science
     * @param english
     * @return integer
     */
    public int[] calculateTotalMarks(int[] math, int[] science, int[] english) {
        int[] totalMarks = new int[10];
        if (math.length == 0 || science.length == 0 || english.length == 0) {
            return null;
        }
        for (int index = 0; index < 10; index++) {
            totalMarks[index] = math[index] + science[index] + english[index];
        }
        return totalMarks;
    }
    
    /**
     * this method take total marks and no of subjects as input and display the average as the output
     *
     * @param totalMarks
     * @param noOfSubjects
     * @return integer
     */
    public int[] calculateTotalAverageMarksForEachStudent(int[] totalMarks, int noOfSubjects) {
        if (totalMarks.length == 0 || noOfSubjects <= 0) {
            return null;
        }
        noOfSubjects = 3;
        int[] averageMarks = new int[10];
        oakBridgeSchool oakBridgeSchool = new oakBridgeSchool();
        for (int index = 0; index < 10; index++) {
            // Trying to assign the value of `totalMarks[index]/noOfSubjects` to `averageMarks[index]`
            averageMarks[index] = totalMarks[index] / noOfSubjects;
        }
        return averageMarks;
    }
    
    
    /**
     * this method takes science marks as an input and display the average as output
     *
     * @param science
     * @return integer
     */
    public int calculateAverageScienceMarks(int[] science) {
        int averageMarks = 0;
        int averageDiv = science.length;
        if ( averageDiv == 0 ) {
            return -1;
        }
        for (int i = 0; i < science.length; i++) {
            averageMarks += science[i];
        }
        return averageMarks / averageDiv;
    }
    
    /**
     * this method takes english marks as an input and display the average as output
     *
     * @param english
     * @return integer
     */
    public int calculateAverageEnglishMarks(int[] english) {
        int averageMarks = 0;
        int averageDiv = english.length;
        if ( averageDiv == 0 ) {
            return -1;
        }
        for (int i = 0; i < english.length; i++) {
            averageMarks += english[i];
        }
        return averageMarks / averageDiv;
    }
    
    /**
     * this method takes math marks as an input and display the average as output
     *
     * @param math
     * @return integer
     */
    public int calculateAverageMathMarks(int[] math) {
        int averageMarks = 0;
        int averageDiv = math.length;
        if ( averageDiv == 0 ) {
            return -1;
        }
        for (int i = 0; i < math.length; i++) {
            averageMarks += math[i];
        }
        return averageMarks / averageDiv;
    }
}