package exercises;
import java.util.Scanner;
public class FindWord {
    public static void main(String[] args) {
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the word?");
        String find= input.nextLine();

        if(str.toLowerCase().contains(find)){
            System.out.println("yes,the word is found!");
        }else{
            System.out.println("No ,the word is not found!");
        }
      //
        Integer index = str .indexOf(find);
        Integer length = find.length();
        System.out.println("Your search word first appears at index " + index + ". Your word is " + length + " characters long.");

        String modifiedSentence = str.replace(find, "brother");
        System.out.println(modifiedSentence);
    }
}