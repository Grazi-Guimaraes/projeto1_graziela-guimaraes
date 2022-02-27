package exercicios_logica;

import javax.swing.JOptionPane;


/*
Exerc�cio para c�lculo da m�dia de aluno e verifica��o de status do mesmo
*/

public class Exercicios_logica {

    public static void main(String[] args) {
        
        //Vetor de 4 notas
        Double notas[] = {6.0, 5.5, 6.0, 6.0};
        
        //Inicializando a vari�vel m�dia
        Double media = 0.0;
    
        for (int i =0; i < notas.length; i++) {
            
            //Exibindo cada posi��o do array com suas notas no console (para teste)
            System.out.println("Posi��o: " + i + " - nota: " + notas[i]);
            
            //Somando as notas do array a vari�vel m�dia
            media = media + notas[i];
            
            
        }
        
        //Verificando se a soma foi correta no console (para teste)
        System.out.println("Valor da soma das notas: " + media);
        
        //Dividindo o valor total da soma entre as 4 notas do array, pela quantidade de notas.
        media = media / 4;
        
        //Exibindo a m�dia no console
        System.out.println("M�dia: " + media);
        
        //Exibindo a m�dia em uma caixa de texto
        JOptionPane.showMessageDialog(null, "Resultado da m�dia: " + media);
        
        
        //Verificando se o aluno foi aprovado, est� em teste ou foi reprovado.
        if(media < 6) {
            JOptionPane.showMessageDialog(null, "Aluno reprovado: " + media);
            
        }else if(media >= 6 && media < 7){
            JOptionPane.showMessageDialog(null, "Aluno em teste: " + media);
            
        }else{
            JOptionPane.showMessageDialog(null, "Aluno aprovado: " + media);
        }
        
    }
}