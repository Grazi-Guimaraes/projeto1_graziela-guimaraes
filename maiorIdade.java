package exercicios_logica;

import javax.swing.JOptionPane;

/**
 *
 * @author Graziela Guimarães
 */
public class Exercicios_logica {
    
     
        

    public static void main(String[] args) {
        
        //Recebe a idade do usuário
        Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
       
        //Atribui o resultado do método a uma String
        String mensagem = testaIdade(idade);
        
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
    public static String testaIdade(Integer idadeRecebida) {
        
        String idadeMetodo  = "";
        
        if(idadeRecebida < 18){
            idadeMetodo = "Menor de idade";
            
        }else if(idadeRecebida >= 18 && idadeRecebida < 60){
            idadeMetodo = "Adulto";
            
        } else{
            idadeMetodo = "Idoso";
        }
        
        return idadeMetodo;
    }
     
}
    