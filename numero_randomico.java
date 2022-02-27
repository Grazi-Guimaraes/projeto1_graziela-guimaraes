package exercicios_logica;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Graziela
 */

public class Exercicios_logica {

    public static void main(String[] args) {

/******************************************/
        //Cria um objeto random
        Random randomico = new Random();

        //De 0 At� 10
        int recebeRandomico = randomico.nextInt(11);

        //Mostra o n�mero sorteado (apenas para teste no console)
        System.out.println("N�mero sorteado: " + recebeRandomico);
        
        
        //Chances de jogar (vidas)
        int chances  = 5;
        
        //enquanto
        while(chances > 0) {
            
        //Recebe seu palpite via caixa de entrada
        int palpite = Integer.parseInt(JOptionPane.showInputDialog("Insira um n�mero de 0 at� 10"));

        if(recebeRandomico == palpite){
            JOptionPane.showMessageDialog(null, "Acertou! N�mero escolhido: " + palpite);
            //Fecha o sistema
            System.exit(0);
            
        } else if(recebeRandomico < palpite){
            
             //retira uma chance
             chances--;
             JOptionPane.showMessageDialog(null, "Errou! N�mero escolhido: " + palpite + ", foi maior que o n�mero sorteado, suas chances: " + chances);

        } else{
            
             //retira uma chance
             chances--;
             JOptionPane.showMessageDialog(null, "Errou! N�mero escolhido: " + palpite + ", foi menor que o n�mero sorteado, suas chances: " + chances);
            
        }
        
       }//fim enquanto

        
    }
}