
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    public String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> potential_words) {

        char[] word_chars = word.toLowerCase().toCharArray();
        Arrays.sort(word_chars);
        String sorted_word = new String(word_chars);

        List<String> matched_list = new ArrayList<>();

        for (int i = 0; i < potential_words.size(); i++) {

            if (!potential_words.get(i).toLowerCase().equals(word.toLowerCase())) {

                String unsorted_potential_word = potential_words.get(i);
                char[] chars = unsorted_potential_word.toLowerCase().toCharArray();
                Arrays.sort(chars);
                String sorted_potential_word = new String(chars);

                if (sorted_potential_word.equals(sorted_word)) {
                    matched_list.add(potential_words.get(i));
                }
            }
        }
        return matched_list;

    }

}
