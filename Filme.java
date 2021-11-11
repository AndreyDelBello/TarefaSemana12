
public class Filme {  								//Define o nome da classe(Filme);
	private int codigo; 							//Criação do atributo privado codigo;
	private String nome; 							//Criação do atributo privado nome;
	private double valor; 							//Criação do atributo privado valor;
	private boolean disponivel; 					//Criação do atributo privado disponivel;

	public int getCodigo() { 						//Criação de um metodo para retornar o Codigo;
		return codigo;								//Retorna o atributo Codigo;
	}												//Fecha o bloco do metodo de retorno de codigo;

	public void setCodigo(int codigo) {				//Criação de um metodo para definir o valor de codigo;
		this.codigo = codigo;						//Define o valor de codigo;
	}												//Fecha o bloco do metodo de definição do valor de codigo;

	public String getNome() {						//Criação de um metodo para retornar o Nome;
		return nome;								//Retorna o atributo nome;
	}												//Fecha o bloco do metodo para retornar o nome;

	public void setNome(String nome) {				//Criação de um metodo para definir o valor do nome;
		this.nome = nome;							//Define o valor do nome;
	}												//Fecha o bloco do metodo para definir o valor do nome;

	public double getValor() {						//Criação de um metodo para retornar o valor do atributo valor;
		return valor;								//Retorna o valor do atributo valor;
	}												//Fecha o bloco do metodo para retornar o valor do atributo valor;

	public void setValor(double valor) {			//Criação de um metodo para definir o valor do atributo valor;
		this.valor = valor;							//Define o valor do atributo valor;
	}											 	//Fecha o bloco do metodo para definir o valor do atributo valor;

	public boolean isDisponivel() {					//Criação de um metodo para retornar o valor de Disponivel;
		return disponivel;							//Retorna o valor do disponivel;
	}												//Fecha o bloco do metodo para retornar o valor de Disponivel;

	public void setDisponivel(boolean disponivel) {	//Criação de um metodo para definir o valor de Disponivel;
		this.disponivel = disponivel;				//Define o valor do atributo Disponivel;
	}												//Fecha o bloco do metodo para definir o valor de Disponivel;

	public void retirar() {							//Criação do metodo retirar;
		if(disponivel == true) {					//Verifica se o disponivel é verdadeiro;
			disponivel = false;						//Define o valor de disponivel para falso;
		}else{			 							//Caso disponivel seja falso;							
			throw new RuntimeException("Este filme n�o est� dispon�vel para loca��o!");  //Para o programa com um erro: "Este filme n�o est� dispon�vel para loca��o!";
		}											//Fecha o bloco do else;
				
	}												//Fecha o bloco do metodo retirar;

	public void devolver() {						//Criação do metodo devolver;
		disponivel = true;							//Define o disponivel para verdadeiro;
	}												//Fecha o bloco do metodo devolver;
	
	public void mostra(){							//Criação do metodo mostra;
		System.out.println("C�digo do filme:" + this.codigo);			//Mostra na tela: C�digo do filme:, e o valor de codigo;
		System.out.println("Nome do filme:" + this.nome);				//Mostra na tela: Nome do filme:, e o valor de nome;
		System.out.println("Valor: R$" + this.valor);					//Mostra na tela: Valor: R$, e o valor do atributo valor;
		System.out.println("Dispon�vel:" + this.disponivel);			//Mostra na tela: Dispon�vel:, e o valor de disponivel;
	}																	//Fecha o bloco do metodo mostra;
	

}																		//Fecha o bloco da classe Filme;
