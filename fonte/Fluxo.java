class Fluxo extends Operador{

	public boolean logic_igual(Variavel b,int a){
		if(Integer.parseInt(b.getValor()) == a){
		      return true;
		}else{
		      	return false;				
		}
	}		
	public boolean logic_maior (Variavel b, int a){
		if(Integer.parseInt(b.getValor()) > a){
			return true;	
		}else{
			return false;		
		}
	}
	public boolean logic_menor(Variavel b,int a){
		if(Integer.parseInt(b.getValor()) < a){
			return true;
		}else{
			return false;	
		}	
	}

	public boolean testaIf(double a, String b, double c){
		if(b == "=="){
			if(a == c){
				return true;
			}
			return false;
		}else if(b == "<"){
			if(a < c){
				return true;			
			}
			return false;
		}else if(b == "<="){
			if(a <= c){
				return true;
			}
			return false;
		}else if(b == ">"){
			if(a > c){
				return true;
			}
			return false;
		}else if(b == ">="){
			if(a >= c){
				return true;
			}
			return false;
		}else if(b =="!="){
			if(a != c){
				return true;
			}
			return false;
		}
		return false;
	}

}
