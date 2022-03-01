package controller;

/**
 *
 * @author Graziela Guimarães
 */
public class Controlador {

    public static void main(String[] args) {

        /**
         * ************************************************
         */
        //Cartão ponto do funcionário
        /**
         * ************************************************
         */
        Double horaEntrada = 08.00; //08:00 
        Double intervalo = 01.00;   //01:00 -> hora de almoço
        Double horaSaida = 17.00;   //17:00

        Double horaTrabalhada = (horaSaida - horaEntrada) - intervalo;
        System.out.println(horaTrabalhada + " horas trabalhadas");

        /**
         * ************************************************
         */
        //Calculando atrasos do funcionário
        Double salarioFuncionario = 2500.00;
        Double cargaHorariaMensal = 244.00; // horas no mês

        Double valorHora = salarioFuncionario / cargaHorariaMensal;
        System.out.println("Valor da hora: " + valorHora);

        //Atrasos
        Double atrasos = 0.50 / 0.60; // Exemplo em minutos
        System.out.println("Atrasos: " + atrasos);

        //Valor do desconto dos atrasos
        Double descontos = valorHora * atrasos;
        System.out.println("Descontos: " + descontos);

        /**
         * **************************************
         */
        //Horas extras normais 50%
        Double horasExtras = valorHora * 1.5;
        System.out.println("Horas extras: " + horasExtras);

        int quantidadeHorasMes = 11; //Funcionário fez 11 horas extras no mês
        Double horasExtrasTotal = (valorHora * quantidadeHorasMes) * 1.5;
        System.out.println("Horas extras a receber: R$ " + horasExtrasTotal);

        /**
         * *************************************
         */
        //Horas noturnas - a partir das 22:00 -> terão 20% de acréscimo no valorHora
        //Exemplo: valorHora * (20 / 100)
        /**
         * *************************************
         */
    }

}
