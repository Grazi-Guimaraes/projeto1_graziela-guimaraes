package controller;

/**
 *
 * @author Graziela Guimarães
 */
public class Controlador {

    public static void main(String[] args) {

        //Alterando palavras em uma frase (replace)
        //Frase inicial
        String frase = "Olá mundo!";
        System.out.println("A frase é: " + frase);

        //Frase final
        String novaFrase = frase.replace("mundo", "Devs");
        System.out.println("Nova frase: " + novaFrase);

    }

}