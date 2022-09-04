package com.bridgelabz;

public class MoodAnalyser {

    public MoodAnalyser() {}
    public String analyseMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        }else
            return "HAPPY";
    }

    public static void main(String[] args) {
        MoodAnalyser mood = new MoodAnalyser();
        System.out.println(mood.analyseMood("i am sad"));
        System.out.println(mood.analyseMood("i am happy"));
    }
}
