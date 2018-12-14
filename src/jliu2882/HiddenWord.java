package jliu2882;

public class HiddenWord {
    private String hiddenWord;

    public HiddenWord(String hiddenWord){
        this.hiddenWord=hiddenWord;
    }

public String getHint(String guessIn){
        if(guessIn.length()==hiddenWord.length()) {
            String hint = "";
            String guess = guessIn.toUpperCase();
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (guess.substring(i, i + 1).equals(hiddenWord.substring(i, i + 1))) {
                    hint += guess.substring(i, i + 1);
                } else {
                    for (int j = 0; j < hiddenWord.length(); j++) {
                        if (guess.substring(i, i + 1).equals(hiddenWord.substring(j, j + 1))) {
                            hint += "+";
                            j = hiddenWord.length();
                        } else {
                            hint += "*";
                            j = hiddenWord.length();
                        }
                    }
                }
            }
            return hint;
        }
        else {
            return null;
        }
    }
}
