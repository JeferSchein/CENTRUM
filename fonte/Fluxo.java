class Fluxo{

	public boolean logico;
	
	public boolean logic_igual(variavel b,int a){
		if(b.getVALOR() == a){
		      return logico = TRUE;
		}
		else{
		      return logico = FALSE;		
		}
	}		
	public boolean logic_maior (variavel b, int a){
		if(b.getVALOR()> a){
			return logico = TRUE;	
		}	
		else{
			return logico = FALSE;		
		}
	}
	public boolean logic_menor(variavel b,int a){
		if(b.getVALOR() < a){
			return logico = TRUE;	
		}	
		else{
			return logico = FALSE;		
		}	
	}
	
	
}
