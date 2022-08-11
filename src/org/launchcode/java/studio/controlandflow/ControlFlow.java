package org.launchcode.java.studio.controlandflow;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the sentence:");
        String strChar = input.nextLine();
        strChar = strChar.replaceAll("[^a-zA-Z0-9]", " ");
        char[] charactersInString = strChar.toCharArray();

        HashMap<Character, Integer> characterCount = new HashMap<>();

        for (char i : charactersInString) {
            if (characterCount.containsKey(i)) {
                characterCount.put(i, (characterCount.get(i) + 1));
            } else if (i == ' ') {
            } else {
                characterCount.put(i, 1);
            }
        }

        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }

}