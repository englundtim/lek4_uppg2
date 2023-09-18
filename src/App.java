import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Mata in en text på ett valfritt antal bokstäver");
        String word = in.nextLine();

        int letters = word.length();
        System.out.println("\""+word+"\""+" har "+letters+" bokstäver i sig."); 

        System.out.println("Välj en bokstav som programmet ska leta efter");
        String seek = in.nextLine();
        int seek_index = word.indexOf(seek);
        System.out.println("Bokstaven ligger på plats "+(seek_index+1));

        System.out.println("Var är första stället du vill dela på texten?");
        int divorced_dad = in.nextInt();
        System.out.println("Var är andra stället du vill dela på texten?");
        int divorced_mom = in.nextInt();

        String sub_string = word.substring(divorced_dad, divorced_mom);
        System.out.println("Texten mellan "+divorced_dad+" och "+divorced_mom+" är "+sub_string);

        System.out.println("Vilket ord ska programmet leta efter?");
            in.nextLine();
        String boo = in.nextLine();
        boolean lean = word.contains(boo);
        System.out.println("Innehåller texten "+boo+":   "+lean);

        System.out.println("Vad vill du byta ut i ditt ord?");
        String single_dad = in.nextLine();
        System.out.println("Vad vill du byta ut det mot?");
        String step_father = in.nextLine();
        String new_word = word.replace(single_dad, step_father);
        System.out.println("Ditt nya ord är: "+new_word);
        
        
    }
}
