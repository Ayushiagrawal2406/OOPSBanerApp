import java.util.HashMap;
import java.util.Map;

public class BannerUC7 {

    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        }));

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                CharacterPatternMap pattern = patternMap.get(c);
                line.append(pattern.getPattern()[row]).append("  ");
            }

            System.out.println(line);
        }
    }
}