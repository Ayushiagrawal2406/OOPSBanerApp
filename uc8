import java.util.HashMap;
import java.util.Map;

public class BannerUC8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = initializePatterns();

        String word = "OOPS";

        renderBanner(word, patternMap);
    }

    static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patterns.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patterns.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        return patterns;
    }

    static void renderBanner(String word, Map<Character, String[]> patterns) {

        int height = 7;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patterns.get(c);

                if (pattern != null) {
                    line.append(pattern[row]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}