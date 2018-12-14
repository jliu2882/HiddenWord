package jliu2882;

public class HiddenWord {
    private String hiddenWord;

    public HiddenWord(String hiddenWord){
        this.hiddenWord=hiddenWord;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public String getHint(String guessIn) {
        String hint = "";
        try {
            String guess = guessIn.toUpperCase();
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (guess.substring(i, i + 1).equals(hiddenWord.substring(i, i + 1))) {
                    hint += guess.substring(i, i + 1);
                } else if (hiddenWord.indexOf(guess.charAt(i)) >= 0) {
                    hint += "+";
                } else {
                    hint += "*";
                }
            }
            }
            catch(StringIndexOutOfBoundsException e){
                System.out.println("Your guess does not match the hidden word!");
            }
        return hint;
    }
}
