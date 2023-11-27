import java.util.Scanner;
public class Calculator{
    Scanner input = new Scanner();
    char veprimi;
    double nr1, nr2, rezultat;

    do{
        System.out.println("Zgjidhni veprimin qe doni te kryeni '+'/'-'/'x'/'/', ose shtypni 'q' per te dale.");
        veprimi = input.next().charAt(0);

        if(veprimi == q){
            System.out.println("Mirupafshim!");
            break;
        }

        if(veprimi != '+' && veprimi != '-' && veprimi != 'x' && veprimi != '/'){
            System.out.println("Ju keni futur nje veprim te padisponueshem. Ju lutem zgjidhni nje nga veprimet me lart!");
            continue;
        }

        System.out.println("Ju lutem jepni numrin e pare: ");
        nr1 = input.nextDouble();
        if(nr1 < 1 || nr1 > 99){
            System.out.println("Ju keni futur nje numer jashte intervalit te vlerave te lejuara.");
            System.out.println("Ju lutem fusni nje numer nga 1-99");
            continue;
        }
        System.out.println("Ju lutem jepni numrin e dyte: ");
        nr2 = input.nextDouble();
        if(nr2 < 1 || nr2 > 99){
            System.out.println("Ju keni futur nje numer jashte intervalit te vlerave te lejuara.");
            System.out.println("Ju lutem fusni nje numer nga 1-99");
            continue;
        }

        switch(veprimi){
            case '+':
                rezultat = nr1 + nr2;
                System.out.println("Rezultati i veprimit '+' eshte "+rezultat);
                break;

            case '-':
                rezultat = nr1 - nr2;
                System.out.println("Rezultati i veprimit '-' eshte "+rezultat);
                break;

            case 'x':
                rezultat = nr1 * nr2;
                System.out.println("Rezultati i veprimit 'x' eshte "+rezultat);
                break;

            case '/':
                rezultat = nr1 / nr2;
                System.out.println("Rezultati i veprimit '/' eshte "+rezultat);
                break;
        }while (true);

        input.close();

    }
    
}