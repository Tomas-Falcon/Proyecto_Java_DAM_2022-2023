public class OperadoresDos {
    public static void main(String ar[]) {
        int numeroA = 5;
        int numeroB = numeroA * 2;
        int numeroC = -numeroB + 1;
        int numeroD = 4;
        int numeroE = numeroA % numeroD;
        int numeroF = numeroA < numeroB ? 15 : 10;
        int numeroG = 0;
        String textoJ = "pepito pasa el rato con manu";
        boolean esString = textoJ instanceof String;

        while (numeroG <= 2) {
            System.out.println(numeroG);
            numeroG++;
            // siempre que numeroG sea menor o igual a 5 se va a sumar un 1 a numeroG
        }

        System.out.println("Es el valor de numeroA: " + numeroA);
        System.out.println("Es el valor de numeroB: " + numeroB);
        System.out.println("Es el valor de numeroC: " + numeroC);
        System.out.println("Es el valor de numeroD: " + numeroD);
        System.out.println("Es el valor de numeroE: " + numeroE);
        System.out.println("Es el valor de numeroF: " + numeroF);
        System.out.println("Es el valor de textoJ: " + esString);
    }
}
