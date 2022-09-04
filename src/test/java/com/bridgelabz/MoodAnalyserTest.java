package com.bridgelabz;

import com.bridgelabz.MoodAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class MoodAnalyserTest {
    @Test
    public void givenSadMoodShouldReturnSad() {
        MoodAnalyser analyse = new MoodAnalyser();
        String mood = analyse.analyseMood("I am in sad mood");
        assertSame("SAD", mood);
    }

    @Test
    public void givenAnyMoodShouldReturnHappy() {
        MoodAnalyser analyse = new MoodAnalyser();
        String mood = analyse.analyseMood("I am in any mood");
        assertSame("HAPPY", mood);
    }
}
