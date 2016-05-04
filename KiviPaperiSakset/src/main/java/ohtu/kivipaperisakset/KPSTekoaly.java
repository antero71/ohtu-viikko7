package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends AbstractTekoaly{

    private static final Scanner scanner = new Scanner(System.in);

    protected void haeSyote(String ekanSiirto,String tokanSiirto,Tekoaly tekoaly) {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();

        tokanSiirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        tekoaly.asetaSiirto(ekanSiirto);
    }
}
