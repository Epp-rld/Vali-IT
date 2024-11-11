package DaySix;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class DaySixUniqueWords {
    public static void main(String[] args) {
        // Exercise 1: Find unique words from a sentence
        //Write a program that takes a sentence as input, splits it into words,
        // and then stores each unique word in a set.
        // Finally, print the set of unique words.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence here: ");
        String sentence = sc.nextLine(); // Kursor liigub rida allapoole.
        sentence = sentence.replace('.',' '); // Tunneb ära et, punktiga lõppev sõna on sama sõna, mis lause sees olev.
        String[] words = sentence.split("\\s+"); // Arvestab tühikuid, tab'e, white space'e.
        // This will return an array of words.
        Set<String> uniqueWords = new HashSet<>(); // Use a HashSet to store unique words.
        // Sets automatically remove duplicate words.

        // Loop through the words array and add each word to the uniqueWords set.
        // The set will ignore duplicates.
        for (String word : words) {
            uniqueWords.add(word.toLowerCase()); // Et programm kohtleks suur- ja väiketähega algavat sama sõna võrdselt.
        }
        System.out.println("Unique words in the sentence: " + uniqueWords);
        sc.close();
    }
}

