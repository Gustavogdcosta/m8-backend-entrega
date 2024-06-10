package br.com.M8Entrega;

public class CalculaMedia {
	
	 public static void main(String[] args) {
		 
		 String nomeAluno = "EBAC #123";
		 double num1 = 10;
		 double num2 = 3;
		 double num3 = 9.3;
		 double num4 = 7.5;
		 
		double num5 = (num1+num2+num3+num4)/4;
		 
		 System.out.println("O(a) aluno(a) " + nomeAluno + " teve média igual a: " + num5);
		 
		 if (num5 >= 6) {
			 System.out.println("portanto, o(a) aluno(a) está Aprovado(a)!!!");
		 }
		 else {  System.out.println("Infelizmente o(a) aluno(a) está Reprovado(a)");}
	 }
	 
	
	
}
