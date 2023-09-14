package ua.hillel.dolhykh.homeworks.training;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class TextParser {

    private List<Character> parsedChars;

    public TextParser() {
        this.parsedChars = new ArrayList<>();
    }

    public void parseText(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        int nextChar;
        while ((nextChar = reader.read()) != -1) {
            char charValue = (char) nextChar;
            this.parsedChars.add(charValue);
        }
        reader.close();
    }

    public void printParsedChars() {
        for (char c : this.parsedChars) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        TextParser parser = new TextParser();
        try {
            String fileName = "SimpleText.txt";
            String absolutePath = new File(fileName).getAbsolutePath();
            parser.parseText(absolutePath);
            parser.printParsedChars();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}


/*
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CharacterParser {
    public static void main(String[] args) {
        String fileName = "Example1"; // Replace with your actual file name
        List<Character> charList = parseCharacters(fileName);

        for (Character c : charList) {
            System.out.println(c);
        }
    }

    public static List<Character> parseCharacters(String fileName) {
        List<Character> charList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int charCode;
            while ((charCode = reader.read()) != -1) {
                char character = (char) charCode;
                charList.add(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return charList;
    }
}
*/
