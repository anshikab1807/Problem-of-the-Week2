import java.util.*;

public class StepWordsFinder {
    public static List<String> findStepWords(String base, List<String> dictionary) {
        List<String> result = new ArrayList<>();

        int[] baseFreq = getFrequency(base);

        for (String word : dictionary) {
            if (word.length() != base.length() + 1) continue;

            int[] wordFreq = getFrequency(word);
            boolean isStepWord = true;
            int extra = 0;

            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] < baseFreq[i]) {
                    isStepWord = false;
                    break;
                }
                extra += wordFreq[i] - baseFreq[i];
            }

            if (isStepWord && extra == 1)
                result.add(word);
        }

        return result;
    }

    private static int[] getFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        String base = "apple";
        List<String> dictionary = Arrays.asList("apples", "apply", "applet", "bapple", "appley");

        System.out.println("Valid Step Words:");
        for (String word : findStepWords(base, dictionary)) {
            System.out.println(word);
        }
    }
}
