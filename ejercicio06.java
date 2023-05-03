package VARIABLES;

public class ejercicio06 {
    public static void main(String[] args) {
        //Escribe un programa que calcule el total de una factura a partir de la base
        //imponible (precio sin IVA). La base imponible estará almacenada en una
        //variable.
        double baseImponible = 22.75;

        System.out.printf("Base imponible------------>\n", baseImponible);
        System.out.printf("IVA----------------------->\n", (baseImponible * 0.21));
        System.out.printf("-------------------------->\n");
        System.out.printf("Total--------------------->\n", (baseImponible * 1.21));
    }
}
