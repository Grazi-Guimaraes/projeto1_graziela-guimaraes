package exercicios_logica;

import javax.swing.JOptionPane;


/**
 *
 * @author Graziela Guimar�es
 */
public class Exercicios_logica {
    
     
        

    public static void main(String[] args) {

        //Recendo as notas via caixas de entrada
        Double nota01 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 1"));
        Double nota02 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 2"));
        Double nota03 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 3"));
        Double nota04 = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota 4"));

        //Chamando o m�todo para ser executado, passando as notas via par�metro
        calculaMediaAluno(nota01, nota02, nota03, nota04);

    }
                                         // Recebendo as notas para fazer o c�lculo da m�dia
    public static void calculaMediaAluno(Double nota1, Double nota2, Double nota3, Double nota4) {

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        String resultado = "A m�dia foi: " + media;

        JOptionPane.showMessageDialog(null, resultado);

    }

        
        
}