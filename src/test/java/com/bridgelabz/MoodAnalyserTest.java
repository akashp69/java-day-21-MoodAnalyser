package com.bridgelabz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class MoodAnalyserTest {
    @Test
    public void givenSadMoodShouldReturnSad(){
        MoodAnalyser analyse=new MoodAnalyser();
        String mood=analyse.analyseMood("I am in sad mood");
        assertSame("SAD", mood);
    }
}