
public class Programa { 										//Define o nome da classe(Programa);
	public static void main(String[] args) {  					//Define o metodo main, do tipo String utilizando o vetor args;
		Filme f = new Filme(); 									//Criando o objeto f do tipo Filme;
		f.setCodigo(123); 										//Ele dará o valor do atributo Codigo dentro de f;
		f.setNome("A Era do Gelo"); 							//Ele define o valor do atributo Nome dentro de f;
		f.setValor(2.50); 										//Ele dará o valor do atributo Valor dentro de f;
		f.devolver(); 											//Chamado do método devolver de f;
		
		f.mostra(); 											//Chamado do método mostra de f;
		
		f.retirar(); 											//Chamado do método retirar de f;
		
		f.mostra(); 											//Chamado do método mostra de f;
		
		try {  													//Função para verificar se vai ocorrer um erro ns proximas linhas;
			f.retirar(); 										//Chamado do método retirar de f;
		} catch (RuntimeException e) {  						//Caso ocorra um erro no bloco de cógido acima;
			System.out.println(e.getMessage()); 				//Executa um comando print do erro;
		} 														//Fecha o bloco de catch;
		
		
	} 															//Fecha o bloco do metodo main;
} 																// Fecha o bloco da Classe Programa;
