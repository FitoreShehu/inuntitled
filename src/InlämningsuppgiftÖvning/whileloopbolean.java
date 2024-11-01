package InlämningsuppgiftÖvning;

public class whileloopbolean {
    public static void main(String[] args) {
        boolean isSnowing = false; // Det snöar inte

        while (!isSnowing) { // Så länge det INTE snöar...
            System.out.println("Det snöar inte!"); // Skriv ut detta
            // Här kan koden ändra isSnowing till true någon gång
            isSnowing= true;
        }


    }


}


