class Variavel{
	private String nome;
	private String valor;
	
	public Variavel(String n, int v){
		valor = String.valueOf(v);
		nome = n;
	}
	public Variavel(String n, boolean v){
		valor = String.valueOf(v);
		nome = n;
	}
	public Variavel(String n, String v){
		valor = v;
		nome = n;
	}
	public Variavel(String n, double v){
		valor = String.valueOf(v);
		nome = n;
	}

	public void setValor(int v){
		valor = String.valueOf(v);
	}

	public void setValor(boolean v){
		valor = String.valueOf(v);
	}

	public void setValor(double v){
		valor = String.valueOf(v);
	}

	public void setValor(String v){
		valor = v;
	}
	
	public String getNome(){
		return this.nome;
	}
	
		public String getValor(){
		return this.valor;
	}

}
