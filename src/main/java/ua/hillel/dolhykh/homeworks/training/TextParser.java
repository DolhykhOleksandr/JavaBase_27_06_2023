package ua.hillel.dolhykh.homeworks.training;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//Create class and implement inside main method ability to parse text from attached file. Parsing algorithm should to parse text char by char (line reading is unacceptable) and store them to the List. After parsing all characters should to be printed (each char on a new line).
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
            parser.parseText("C:\\Users\\User\\IdeaProjects\\Java_Base_27_06_2023\\src\\main\\java\\ua\\hillel\\dolhykh\\homeworks\\training\\Example.txt");
            parser.printParsedChars();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
