class Variavel{
	private String nome;
	private String valor;
	private String tipo;

	public void setTipo(String t){
		this.tipo = t;
	}

	public void setNome(String n){
		this.nome = n;
	}

	public void setValor(String v){
		this.valor = v;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getValor(){
		return this.valor;
	}

	public String getTipo(){
		return this.tipo;
	}

}
