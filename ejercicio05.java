package VARIABLES;

public class ejercicio05 {
    public static void main(String[] args) {
        //Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
        //convertir deberá estar almacenada en una variable.
        double euros = 0;
        double pesetas =14567;

        // lo dividimos por 166.3860 porque un ero es igual a 166.3860 pesetas
        euros = pesetas / 166.3860;
        //imprimos el resultado
        System.out.println(euros+" euros es igual a "+pesetas+" pesetas");
    }
}
