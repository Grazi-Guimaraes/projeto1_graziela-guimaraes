package controller;

/**
 *
 * @author Graziela Guimar�es
 */
public class Controlador {

    public static void main(String[] args) {

        //Alterando palavras em uma frase (replace)
        //Frase inicial
        String frase = "Ol� mundo!";
        System.out.println("A frase �: " + frase);

        //Frase final
        String novaFrase = frase.replace("mundo", "Devs");
        System.out.println("Nova frase: " + novaFrase);

    }

}