import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("välkommen till grönan Här kan du åka 5 attraktioner");
        int[] attraklängd = new int[]{120, 140, 140, 140, 120};
        String[] attraknamn = new String[]{"Pumpen", "Monster", "insane","Fritt fall", "Kvasten"};
        int[] attrakålder = {6, 0, 0, 0, 4};
        int[] attrakpris ={3, 4, 3, 3, 3};
        int kuponger = 10;
        int svar[] = new int[2];
        int x;


        System.out.println("Du har tio kuponger attraktionerna kostar mellan 3 och 4 per åk dom du kan åka beror på hur lång du är hur många kupånger du har och din ålder");
        System.out.println("detta är kraven:");
                    for (int i = 0; i < attraknamn.length; i++) {
                System.out.println(attraknamn[i] + " längd krav: " + attraklängd[i] + " ålder krav: " + attrakålder[i] + " pris: " + attrakpris[i] + " kuponger");
            }
        Scanner tb = new Scanner(System.in);
        for(int i = 0; i<2; i++)
        {
            if (i == 0) 
            {
                System.out.println("Hur gammal är du?");
            }
            if (i == 1) 
            {
                System.out.println("Hur lång är du i cm?");
            }
            try {
                svar[i] = tb.nextInt();
            } catch (Exception e) {
                System.out.println("Ogiltig inmatning. Vänligen ange ett heltal.");
                i--; 
                tb.nextLine();
            }
        }
        int åktur = 11;
        String[] attraknamnkanåka = new String[5];
        while (kuponger>2) {
                    if (tb.hasNextInt()) {
        } else {
            System.out.println();
        }
            x = 0;
            System.out.println("Du har " + kuponger + " Kupånger!");
            System.out.println("attraktionerna du kan åka är:");
            int[] kanåka = new int[5];
            System.out.println("Alltså kan du åka:");
            for(int i = 0; i < attraknamn.length; i++) {
                if (attrakpris[i] <= kuponger && svar[1]>= attraklängd[i] &&  svar[0]>= attrakålder[i]) {
                    attraknamnkanåka[i] = attraknamn[i];
                    kanåka[i] = i;
                    System.out.println((i+1) + " " + attraknamnkanåka[i]);
                }
            }
            System.out.println("Vilken karusell vill du åka?");
            try {
                åktur = tb.nextInt();
            } catch (Exception e) {
                System.out.println("Ogiltig inmatning. Vänligen ange ett heltal.");
                // tb.nextLine();
            }
            if (tb.hasNext()) {
                tb.nextLine();
            }

            if (åktur>0|| åktur<6) {
                // åktur--;
                for(int i = 0; i < kanåka.length; i++) {
                    if(kanåka[i] == åktur)
                    {
                        x = 1;
                    }
                }
                    if (x!=1) {
                        
                        if (tb.hasNext()) {
                            tb.nextLine();
                        }
                    
                        System.out.println("Du kan inte åka den där banan");
                        continue;
                    }
                    else
                    {
                        kuponger = kuponger - attrakpris[åktur];
                        
                    }
            }
            else {
                System.out.println("Det där är ingen bana!");
                continue;
                }
            }
            tb.close();
    }
} 

