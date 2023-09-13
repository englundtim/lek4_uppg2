import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Mata in en text på ett valfritt antal ord");
        String word = in.nextLine();

        int letters = word.length();
        System.out.println("\""+word+"\""+" har "+letters+" bokstäver i sig."); 

        System.out.println("Välj en bokstav som programmet ska leta efter");
        String seek = in.nextLine();
        int seek_index = word.indexOf(seek);
        System.out.println("Bokstaven ligger på plats "+(seek_index+1));
        
        
    }
}
