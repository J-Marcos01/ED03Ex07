package controller;

public class Operacoes 
{
	public Operacoes() 
	{
		super();
	}
	
	public int somaTermos(int n)
	{
		int rest=0;
		if(n<10)       //Parada , quando o número for menor que 10 o programa enviará o próprio numero .
		{
			return n;
		}
		else        //chamada da recursiva a cada rodada o programa soma o resto do número/10 e chama a mesma função enviando como parametro o número dividido por 10.
		{
			rest=n%10;
			return rest+somaTermos(n/10);
		}
	}
}
