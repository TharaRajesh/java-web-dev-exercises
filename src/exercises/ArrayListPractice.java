package exercises;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListPractice {
    static int EvenSum(ArrayList<Integer> arrLst) {
        int sumOfEven = 0;

        // Loop to find even sum
        for (int integer : arrLst) {
            if (integer % 2 == 0) {
                sumOfEven += integer;
            }
        }
        return sumOfEven;

    }
static boolean IsFiveLetterWord(String word){
    if(word.length() == 5){
        return true;
    }
    return false;
}

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);
        arrList.add(8);
        arrList.add(9);
        arrList.add(10);
        System.out.println("Sum of Even Numbers:"+ EvenSum(arrList));

        ArrayList<String> words = new ArrayList<>();
        words.add("Bring");
        words.add("Cannot");
        words.add("Testing");
        words.add("Go");
        words.add("Earth");
        words.add("Swing");
        words.add("Cat");
        words.add("Drop");
        words.add("Tow");
        words.add("put");
        words.add("Do");
        words.add("Mat");
        words.add("Sink");
        words.add("Mine");
        words.add("Lion");

        System.out.println("The list of 5 letters words:");
        for (String word : words) {
            if(IsFiveLetterWord(word))
                System.out.println(word);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the word length");
        int wordSearch = input.nextInt();
        System.out.println("The list of " + wordSearch + " letters words :" );
        for (String word : words) {
            if(word.length()==wordSearch){
                System.out.println(word);
        }
    }
}
}