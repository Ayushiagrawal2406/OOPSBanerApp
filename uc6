public class BannerUC6 {

    public static void main(String[] args) {

        String[] banner = {
                buildLine(0),
                buildLine(1),
                buildLine(2),
                buildLine(3),
                buildLine(4),
                buildLine(5),
                buildLine(6)
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static String buildLine(int row) {
        return buildO(row) + "  " + buildO(row) + "  " + buildP(row) + "  " + buildS(row);
    }

    static String buildO(int row) {
        String[] O = {
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };
        return O[row];
    }

    static String buildP(int row) {
        String[] P = {
                "*****  ",
                "*   *  ",
                "*   *  ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        };
        return P[row];
    }

    static String buildS(int row) {
        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ****  ",
                "     * ",
                "     * ",
                "*****  "
        };
        return S[row];
    }
}