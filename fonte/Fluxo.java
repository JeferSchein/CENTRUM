class Fluxo{

	public boolean logico;
	
	public boolean logic_igual(Variavel b,int a){
		if(Integer.parseInt(b.getValor()) == a){
		      return logico = true;
		}
		else{
		      return logico = false;		
		}
	}		
	public boolean logic_maior (Variavel b, int a){
		if(Integer.parseInt(b.getValor()) > a){
			return logico = true;	
		}	
		else{
			return logico = false;		
		}
	}
	public boolean logic_menor(Variavel b,int a){
		if(Integer.parseInt(b.getValor()) < a){
			return logico = true;	
		}	
		else{
			return logico = false;		
		}	
	}
		
}
