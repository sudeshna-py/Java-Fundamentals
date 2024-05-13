import java.util.Scanner;

//Write a program that takes a sentence as input and counts the number of words in it.
public class WordCouter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine().trim(); // it will read the input sentence & trail the whitespaces

        int wordCount = countWords(sentence); // count the no. of words in the sentence

        System.out.println("Number of words in the sentence is: " + wordCount); //Display the no. of words

    }
    //function to count the no. of words in a sentence
    private static int countWords(String sentence){
        if(sentence.isEmpty()){
            return 0; //if the sentence is empty, return 0
        }
        String[] words = sentence.split("\\s+"); // split the sentence into words using whitespace as delimiter

        return words.length; //return the no. of words
    }
}
