package com.cs5890;

/**
 * Grader is a singleton instance that will grade the student answer as compared
 */
public class Grader {
    private static Grader ourInstance = new Grader();

    public static Grader getInstance() {
        return ourInstance;
    }

    //private constructor due to singleton
    private Grader() {
    }

    static void grade(String accepted, String unverified){
        System.out.println("This is the part where we would be grading");
    }
}
