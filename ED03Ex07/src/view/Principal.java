package view;

import controller.Operacoes;

public class Principal 
{
	public static void main(String[] args) 
	{
		Operacoes op = new Operacoes();
		int n=9999;
		int res=op.somaTermos(n);
		System.out.println(res);
		
		
	}
		
	
	
	
}
