package exercicios_logica;

import javax.swing.JOptionPane;


/*
Exercício para cálculo da média de aluno e verificação de status do mesmo
*/

public class Exercicios_logica {

    public static void main(String[] args) {
        
        //Vetor de 4 notas
        Double notas[] = {6.0, 5.5, 6.0, 6.0};
        
        //Inicializando a variável média
        Double media = 0.0;
    
        for (int i =0; i < notas.length; i++) {
            
            //Exibindo cada posição do array com suas notas no console (para teste)
            System.out.println("Posição: " + i + " - nota: " + notas[i]);
            
            //Somando as notas do array a variável média
            media = media + notas[i];
            
            
        }
        
        //Verificando se a soma foi correta no console (para teste)
        System.out.println("Valor da soma das notas: " + media);
        
        //Dividindo o valor total da soma entre as 4 notas do array, pela quantidade de notas.
        media = media / 4;
        
        //Exibindo a média no console
        System.out.println("Média: " + media);
        
        //Exibindo a média em uma caixa de texto
        JOptionPane.showMessageDialog(null, "Resultado da média: " + media);
        
        
        //Verificando se o aluno foi aprovado, está em teste ou foi reprovado.
        if(media < 6) {
            JOptionPane.showMessageDialog(null, "Aluno reprovado: " + media);
            
        }else if(media >= 6 && media < 7){
            JOptionPane.showMessageDialog(null, "Aluno em teste: " + media);
            
        }else{
            JOptionPane.showMessageDialog(null, "Aluno aprovado: " + media);
        }
        
    }
}