package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        String phrase = "";
        while (counter < chars.length) {
            phrase+=chars[counter];
        }
        System.out.println(phrase);
    }
}
