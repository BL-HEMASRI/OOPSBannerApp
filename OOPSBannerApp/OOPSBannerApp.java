public class OOPSBannerApp {

    static class CharacterPattern {
        private char character;
        private String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ******** ",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                "*        *",
                " ******** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ******** ",
                "*        *",
                "*        *",
                " ******** ",
                "*         ",
                "*         ",
                "*         "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ******** ",
                "*         ",
                "*         ",
                " ******** ",
                "         *",
                "         *",
                " ******** "
        });

        for (int i = 0; i < 7; i++) {
            System.out.println(
                    O.getPattern()[i] + "  " +
                    O.getPattern()[i] + "  " +
                    P.getPattern()[i] + "  " +
                    S.getPattern()[i]
            );
        }
    }
}
