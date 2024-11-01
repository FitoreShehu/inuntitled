package InlämningsuppgiftÖvning;

public class Testobjekt {
    private int antalchar= 0;
    private int antalline=0;
    private String text="";

    public int getAntalchar(){
       return antalchar;
    }
    public int getAntalline(){
        return antalline;
    }
    public String getText(){
        return text;
    }
    public void ändringarna(String newtext){
        antalline++;
        antalchar += newtext.length();
        text += newtext;

    }

}
