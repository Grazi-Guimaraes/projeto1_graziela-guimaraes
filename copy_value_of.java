package controller;

/**
 *
 * @author Graziela Guimarães
 */
public class Controlador {

    public static void main(String[] args) {

        char[] soletrando = {'J', 'A', 'V', 'A'};

        //Percorrendo cada letra do array e sua posição
        for (int i = 0; i < soletrando.length; i++) {
            System.out.println("Posição: " + i + " - Letra: " + soletrando[i]);
        }

        //Juntando todas as letras do array
        System.out.println("/*******************************/");
        String palavraCompleta = String.copyValueOf(soletrando);
        System.out.println("Palavra completa: " + palavraCompleta);
        
        //Indica onde iremos iniciar o array e quantas letras iremos contar após iniciarmos.
        System.out.println("/*******************************/");
        String off = String.copyValueOf(soletrando, 2, 2);
        System.out.println("Letras que foram selecionadas: " + off);

    }

}  
   
    

