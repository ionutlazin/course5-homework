import java.util.Random;

public class Homework {
    public static void main(String[] args) {

        int[] intArray = {5, 10, 20, 50, 100};
        int sumaLaIesire = exercitiul1(intArray);
        System.out.println(sumaLaIesire);

        int[] intArray2 = {10, 20, 50, 100, 105};
        int sumaNumarNumereImpare = exercitiul2(intArray2);
        System.out.println(sumaNumarNumereImpare);


        int[] intArray3 = {19, 21, 25, 30, 50};
        //if i nu se divide cu 2
        int[] numereMaiMari = exercitiul3(intArray3, 40);
        for (int numar : numereMaiMari) {
            System.out.println("Numar mai mare " + numar);
        }


    }

    public static int exercitiul1(int[] intArray) {
        int sum = 0;
        for (int numar : intArray) {
            sum = sum + numar;
        }

        return sum;


    }

    public static int exercitiul2(int[] intArray) {
        int totalimpar = 0;

        for (int numar : intArray) {
            boolean impar = numar % 2 != 0;
            if (impar == true) {
                totalimpar = totalimpar + 1;
            }


        }

        return totalimpar;


    }

    public static int[] exercitiul3(int[] Array, int a) {

        int totalNumere = 0;
        int[] Arraystocare;
        for (int numar : Array) {
            if (numar > a) {
                totalNumere = totalNumere + 1;
            }
        }

        Arraystocare = new int[totalNumere];
        int indexArray = 0;
        for (int numar : Array) {
            if (numar > a) {
                Arraystocare[indexArray] = numar;
                indexArray = indexArray + 1;
            }
        }
        return Arraystocare;
    }


}