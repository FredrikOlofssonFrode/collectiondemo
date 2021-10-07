package se.fredrik;

import java.util.ArrayList;

public class CollectionDemo {

    public void run(){

        //ArrayList<String> players = new ArrayList<>();
       
        var players = new ArrayList<String>();

        while(true){

            System.out.println("1. Skapa ny spelare");
            System.out.println("2. Rensa spelare");
            System.out.println("3. Lista alla");    
            System.out.println("4. EXIT");
            System.out.print("\nGör ditt val: ");

            int sel = Integer.parseInt(System.console().readLine());

            if ( sel == 1){
                System.out.print("Skriv in namn: ");
                String namn = System.console().readLine();
                players.add(namn);
            }
            if ( sel == 2){
                System.out.print("Skriv in det namn du vill ta bort: ");
                String namn = System.console().readLine();
                players.remove(namn);

                if ( players.contains(namn) == false){
                    System.out.print("Skriv in det namn du vill ta bort: ");
                    players.add(namn);
            }
            if(sel == 3){
                for(String p : players){
                    System.out.println(p);
                }
                if (sel == 4){
                    break;
                }
            
            
       
            }


            

        // int [] talen = {12,456,345,68,12334,445566,4334345,343434434};
        // int largest = talen[0];

        // for (int tal : talen) {
        //     if (tal > largest)
        //     largest = tal;

        // }
        // System.out.println("Största talet är: " + largest);

        // String [] minaBarn = new String[3];

        //  String [] minaBarn2 = {"Fanny, Daniel, Simon, Matilda, Fredrik"};

        // minaBarn [0] = "Fanny";
        // minaBarn [1] = "Daniel";
        // minaBarn [2] = "Simon";
        // minaBarn [3] = "Matilda";
        // minaBarn [4] = "Fredrik";

    
        //  for(String oneChild : minaBarn){
        //     System.out.println(oneChild);
         }

        //System.out.println(minaBarn[1] +" "+ minaBarn[0] +" "+ minaBarn[2]);
       
        //For-loopen går igenom hela arrayen (minaBarn) och skriver ut dem i ordning från 0-3 (först: Fanny, andra: Daniel, tredje: Simon) 
        //for ( int i = 0; i < minaBarn.length; i++){
        //    System.out.println(minaBarn[i]);
        }

        // String mening = "hej hopp sss";
        // String [] words = mening.split(" ");

    }

    }
