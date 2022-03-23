package nyugtaprojektek;

public class Nyugta1 {

    public static void main(String[] args) {
        String csillag = "******************";
        String vonal = "------------------";
        String duplaVonal = "==================";
        String penzNem = "Ft";
        String rovidVonal = "_______";
        int tetel1 = 350;
        int tetel2 = 90;
        int tetel3 = 650;
        int kedvezemeny = 10;
        int osszeg = tetel1 + tetel2 + tetel3;
        double kedvezmenyesOsszeg = osszeg - (osszeg / kedvezemeny);

        System.out.println(csillag);
        System.out.printf("%12s\n", "Nyugta1");
        System.out.println(csillag);
        System.out.printf("%8s %5d %3s\n", "Tétel 1:", tetel1, penzNem);
        System.out.printf("%8s %5d %3s\n", "Tétel 2:", tetel2, penzNem);
        System.out.printf("%8s %5d %3s\n", "Tétel 3:", tetel3, penzNem);
        System.out.println(duplaVonal);
        System.out.printf("%9s %4s %3s\n", "Összesen:", osszeg, penzNem);
        System.out.println(vonal);
        System.out.printf("%5s %3s %3s\n", "Kedvezmény:", "109", penzNem);
        System.out.printf("(%d%s)\n", kedvezemeny, "%");
        System.out.println(duplaVonal);
        System.out.printf("%10s %.5g %3s\n", "Fizetendő:", kedvezmenyesOsszeg, penzNem);
        System.out.println(vonal);
        System.out.println("");
        System.out.printf("%6s %9s\n", rovidVonal, rovidVonal);
        System.out.printf("%6s %8s\n", "Dátum", "Név");
        System.out.println(csillag);
        System.out.printf("%15s\n", "CÉG");
        System.out.println(csillag);
    }

}
