package com.example.alphabets.model;

/**
 * Created by Promlert on 11/8/2015.
 */
public class EnglishAlphabet {

    public final char letter;
    public final int image;

    public EnglishAlphabet(char letter, int image) {
        this.letter = letter;
        this.image = image;
    }

    @Override
    public String toString() {
        return String.valueOf(letter);
    }

    public static final EnglishAlphabet[] DATA = {
            new EnglishAlphabet('A', 0),
            new EnglishAlphabet('B', 0),
            new EnglishAlphabet('C', 0),
            new EnglishAlphabet('D', 0),
            new EnglishAlphabet('E', 0),
            new EnglishAlphabet('F', 0),
            new EnglishAlphabet('G', 0),
            new EnglishAlphabet('H', 0)
    };
}
