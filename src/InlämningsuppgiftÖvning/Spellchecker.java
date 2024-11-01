package InlämningsuppgiftÖvning;

public class Spellchecker {

    public boolean isLetter(char sign) {
        boolean isLetter = false;
        if ((sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z')) {
            isLetter = true;
        }else {
            System.out.println("It's not a letter");
        }
        return isLetter;
    }
}
