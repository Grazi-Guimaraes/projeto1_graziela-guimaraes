package controller;

/**
 *
 * @author Graziela Guimar�es
 */
public class Controlador {

    public static void main(String[] args) {

        char[] soletrando = {'J', 'A', 'V', 'A'};

        //Percorrendo cada letra do array e sua posi��o
        for (int i = 0; i < soletrando.length; i++) {
            System.out.println("Posi��o: " + i + " - Letra: " + soletrando[i]);
        }

        //Juntando todas as letras do array
        String palavraCompleta = String.copyValueOf(soletrando);
        System.out.println("Palavra completa: " + palavraCompleta);

    }

}