import java.util.ArrayList;
import java.util.Scanner;




/*Guten Tag,

das ist meine Entwurf um eine App zu entwickeln den ich in meiner Freizeit programmiert habe.
Die App soll die Inhaltstoffe ein oder mehrer Lebensmittel speichern, zusammenrechnen und die wiedergeben.
Durch mein Studium habe ich die Fachliche Expertise um das Programm weiter zu entwickeln und verbessern.

Ich kann sehr gerne persönlich alles besprechen.

Viele Grüße 

Tommaso Rubini*/
public class Main
{


    public static void main(String[] args)
    {
        ArrayList<Produkt> menu = new ArrayList<>(); // create an array list of product

        System.out.println("Wie viele Produkte willst du rechnen?");
        Scanner myObj = new Scanner(System.in); // object to take an input
        Produkt end_prod = new Produkt();
        end_prod.name = "Total";
        int numofprod = myObj.nextInt(); //ask number of product to create
        myObj.nextLine();

        for(int i = 0; i < numofprod; i++)
        { // create the number of product
            Produkt p = new Produkt(); // insert first product

            System.out.println("Name von dem " + (i+1) + ". Produkt");
            p.name = myObj.nextLine();


            System.out.println("Name Produkt: " + p.name);
            System.out.println("Wie viele Gramm willst du essen? ");
            double gram = myObj.nextDouble();
            System.out.print("Kcal per 100gr: ");
            double kcal = myObj.nextDouble();
            System.out.print("Fett per 100gr: ");
            double fett = myObj.nextDouble();
            System.out.print("davon gesättigte Fettsäuren per 100gr: ");
            double fettsaeure = myObj.nextDouble();
            System.out.print("Kohlenhydrate per 100gr: ");
            double kohlenhydrate = myObj.nextDouble();
            System.out.print("davon Zucker per 100gr: ");
            double zucker = myObj.nextDouble();
            System.out.print("Eiweiss per 100gr: ");
            double eiweiss = myObj.nextDouble();
            System.out.print("Salz per 100gr: ");
            double salz = myObj.nextDouble();
            myObj.nextLine();

            p.gram = gram;
            p.kcal = kcal;
            p.fett = fett;
            p.fettsaeure = fettsaeure;
            p.kohlenhydrate = kohlenhydrate;
            p.zucker = zucker;
            p.eiweiss = eiweiss;
            p.salz = salz;


            menu.add(i,p);
        }
        //sehe ob die richtige produkte in meine liste sind
        for (int i = 0; i < menu.size(); i++)
        {

            end_prod.kcal = end_prod.kcal + (menu.get(i).kcal * menu.get(i).gram/100);
            end_prod.fett = end_prod.fett + (menu.get(i).fett * menu.get(i).gram/100);
            end_prod.fettsaeure = end_prod.fettsaeure + (menu.get(i).fettsaeure * menu.get(i).gram/100);
            end_prod.kohlenhydrate = end_prod.kohlenhydrate + (menu.get(i).kohlenhydrate * menu.get(i).gram/100);
            end_prod.zucker = end_prod.zucker + (menu.get(i).zucker * menu.get(i).gram/100);
            end_prod.eiweiss = end_prod.eiweiss + (menu.get(i).eiweiss * menu.get(i).gram/100);
            end_prod.salz = end_prod.salz + (menu.get(i).salz * menu.get(i).gram/100);
            end_prod.gram = end_prod.gram + menu.get(i).gram;
            System.out.println(menu.get(i).name);
        }


        System.out.println("Gesammte Nahwerte von deine Menu:");
        System.out.println(end_prod.name);
        System.out.println("Kcal: " + end_prod.kcal);
        System.out.println("Fett: " + end_prod.fett);
        System.out.println("Fettsaeure: " + end_prod.fettsaeure);
        System.out.println("Kohlenhydraten: " + end_prod.kohlenhydrate);
        System.out.println("davon Zucker: " + end_prod.zucker);
        System.out.println("Eiweiss:" + end_prod.eiweiss);
        System.out.println("Salz: " + end_prod.salz);





           /* //System.out.println("Das Lebensmittel hat die folgende Nahwerte:");
            System.out.println("Name: " + a.name);
            System.out.println("Kcal: " + a.kcal);
            System.out.println("Fett: " + a.fett);
            System.out.println("davon gesaettigte Fettsäuren: " + a.fettsaeure);
            System.out.println("Kohlenhydrate: " + a.kohlenhydrate);
            System.out.println("davon Zucker: " + a.zucker);
            System.out.println("Eiweiß: " + a.eiweiss);
            System.out.println("Salz: " + a.salz);
            */






        /*
        System.out.println("Die gesammte Menü hat die folgende Nahwerte:");
        System.out.println("Kcal: " + a.kcal);
        System.out.println("Fett:" + a.fett);
        System.out.println("davon gesaettigte Fettsäuren: " + a.fettsaeure);
        System.out.println("Kohlenhydrate: " + a.kohlenhydrate);
        System.out.println("davon Zucker: " + a.zucker);
        System.out.println("Eiweiß: " + a.eiweiss);
        System.out.println("Salz: " + a.salz);
            */

    }
}
