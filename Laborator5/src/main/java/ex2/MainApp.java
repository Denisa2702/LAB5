package ex2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void scriere(List<PerecheNumere> lista) {
        try {
            ObjectMapper mapper=new ObjectMapper();
            File file=new File("src/main/resources/pereche_numere_out.json");
            mapper.writeValue(file,lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        try {
            File file=new File("src/main/resources/pereche_numere.json");
            ObjectMapper mapper=new ObjectMapper();
            List<PerecheNumere> lista = mapper
                    .readValue(file, new TypeReference<List<PerecheNumere>>(){});
            return lista;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {

        List<PerecheNumere> lista=citire(); //citesc valorile din fisier si le salvez in lista

        Scanner my_scanner=new Scanner(System.in);
        int opt;

        while(true)
        {
            System.out.println("0. Iesire");
            System.out.println("1. Afisare");
            System.out.println("2. Sir Fibonaci");
            System.out.println("3. CMMDC");
            System.out.println("4. Suma cifrelor egale");
            System.out.println("5. Acelasi numar de cifre pare");

            System.out.print("\nAlegeti optiunea dorita: ");
            opt=my_scanner.nextInt();
            my_scanner.nextLine();

            switch(opt)
            {
                case 0:
                    System.exit(0);

                case 1:
                {
                    System.out.println("\nLista de perechi de numere:");
                    for(PerecheNumere p: lista)
                        System.out.println((p.toString()));
                    System.out.println();
                    break;
                }

                case 2:
                {
                    for(PerecheNumere p:lista)
                        if(p.suntConsecutiveInFibonacci())
                            System.out.println(p.toString());
                    System.out.println();
                    break;
                }

                case 3:
                {
                    System.out.println("\nCMMDC: ");
                    for(PerecheNumere p:lista)
                    {
                        int cmmdc=p.CMMDC();
                        System.out.println(p.toString()+ " CMMDC: "+cmmdc);
                    }
                    System.out.println();
                    break;
                }

                case 4:
                {

                }


            }

        }

    }

}
