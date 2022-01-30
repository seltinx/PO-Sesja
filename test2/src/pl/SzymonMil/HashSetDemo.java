package pl.SzymonMil;

import java.util.*;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;

public class HashSetDemo {
    public static void main(String[] args) throws FileNotFoundException
    {
        // Klasa HashSet implementuje interfejs Set
        Set<String> words = new HashSet<String>();
        long totalTime = 0;

        Scanner in = new Scanner(new File("C:\\Users\\Szymon\\Desktop\\WordsInHashSet\\alice30.txt"));
        while (in.hasNext()) {
            String word = in.next();
            long callTime = System.currentTimeMillis();
            words.add(word);
            callTime = System.currentTimeMillis() - callTime;
            totalTime += callTime;
        }


        Iterator<String> iter = words.iterator();
        for (int j = 1; j <= 20; ++j) {
            System.out.println(iter.next());
        }

        System.out.println(". . .");
        System.out.println(words.size() + " unikalnych słów. " + totalTime + " milisekund.");
    }
}
