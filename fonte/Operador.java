class Operador extends Variavel{
		private int condicao;

		public Operador(variavel a){	
			if(a.valor==0){
				a.condicao=0;	
			}
			if(a.valor==1){
				a.condicao=1;	
			}
			if(a.valor==-1){
				a.condicao=-1;	
			}
		}
	
	        public int  condGet(){
			return a.condicao;	
		}
	
	
	
}
