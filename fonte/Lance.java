class Lance extends Fluxo extends Operador{

	public boolean while(operador a,variavel b, int c){
			if(a.CondGet()==0){
				return logic_igual(variavel b, int c );
			}
			if(a.CondGet()==1){
				return logic_maior(variavel b, int c);
			}
			if(a.CondGet()==-1){
				return logic_menor(variavel b, int c);
			}
	}




}
