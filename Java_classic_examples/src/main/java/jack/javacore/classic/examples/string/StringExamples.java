package jack.javacore.classic.examples.string;

import javax.sound.midi.Soundbank;

public class StringExamples {
    private int i = 1;

    public static void main(String[] args) {
        new StringExamples().subStringPlay();
    }

    private void subStringPlay() {
        String s = "Java is great.";
        System.out.println(s.substring(5));
        System.out.println(s.substring(1, 5) + "/");
    }

    private void stringTokenizerPlay() {
        
    }

}
