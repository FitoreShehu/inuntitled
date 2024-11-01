package InlämningsuppgiftÖvning;

public class Övning {
    public static void main(String[] args) {
        Spellchecker spell = new Spellchecker();
        if (spell.isLetter('H')){
            System.out.println("H is a latter");
        }
        if (spell.isLetter('z')){
            System.out.println("Z is a letter");
        }
        if (spell.isLetter('#')){
            System.out.println("# is a letter");
        }
    }
}
