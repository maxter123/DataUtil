package es.cliente.datautil;

import javax.swing.JOptionPane;

import es.datautil.Data;
import es.datautil.Meses;

public class Principal {

	public static void main(String[] args) {
		
		/*
		   IMPLEMENTAR 
		   
		   
		   Acrescente uns Prints para Feeedback e para mostrar os resultados
		  
		   LER numero do mês
		   Converte numero do mês para um objecto do enumerado Meses e guarda na variável mes
		   
		   Se mes igual a MESES.FEVEREIRO
		     então
		        LER ano
		        Invocar método classe Data para obter o número de dias do mês
		     senão
		        Invocar método classe Data para obter o número de dias do mês
		        
		   Fim_SE
		   
		
	    */ 
		int mes = 1;
		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Insira um mes!"));
	      } while (mes < 1 && mes > 12);
		if (Meses.mesFromInt(mes) == Meses.FEVEREIRO) {
			System.out.println(Data.diasMes(Meses.mesFromInt(mes), Integer.parseInt(JOptionPane.showInputDialog("Insira o ano!"))));
		} else {
			System.out.println(Data.diasMes(Meses.mesFromInt(mes)));
		}
		
		
		
		
	}

}
