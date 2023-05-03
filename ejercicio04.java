package VARIABLES;

public class ejercicio04 {
    public static void main(String[] args) {
        //Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
        //convertir deberá estar almacenada en una variable
        int euros = 1623;
        double pesetas =0;

        // lo multiplicamos por 166.3860 porque un ero es igual a 166.3860 pesetas
        pesetas = euros * 166.3860;
        //imprimos el resultado
        System.out.println(euros+" euros es igual a "+pesetas+" pesetas");
    }
}
