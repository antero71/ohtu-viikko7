package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends AbstractTekoaly {

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    protected void haeSyote(String ekanSiirto, String tokanSiirto, Tekoaly tekoaly) {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        ekanSiirto = scanner.nextLine();
        System.out.print("Toisen pelaajan siirto: ");
        tokanSiirto = scanner.nextLine();
    }

}
