class Lance extends Fluxo {
	private boolean logico;
	
	public void laco(Operador a,Variavel b, int c){
		int aa = a.condGet();
		if(aa == 0){
			logico = this.logic_igual( b,  c );
		}else if(aa == 1){
			logico =  this.logic_maior( b,  c );
		}else if(aa == -1){
			logico =  this.logic_menor( b,  c );
		}
	}
	
	public boolean getLogico(){
			return this.logico;
	}
	
}
