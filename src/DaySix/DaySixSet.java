package DaySix;

import java.util.Set;
import java.util.HashSet;

public class DaySixSet {
    // Exercise 2: Remove all vowels from a set of characters.
    // Create a set of lowecase alphabet characters, then remove all vowels from the set.
    // Finally, print the set with only consonants.
    public static void main(String[] args) {
        Set<Character> alphabet = new HashSet<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }

        System.out.println("Alphabet: " + alphabet);

        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); // Add vowels one by one. Saab ka set.of kasutada.
        // Teine variant: Set<Character> vowels = Set.of('a', ...);
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        System.out.println("Vowels: " + vowels);

        alphabet.removeAll(vowels);

        System.out.println("Alphabet with only consonants: " + alphabet);
    }
}