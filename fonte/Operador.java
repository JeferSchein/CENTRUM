class Operador extends Variavel{
		private int condicao;

		public void setOper (Variavel a){
			condicao = Integer.parseInt(a.getValor());
		}

	        public int  condGet(){
			return this.condicao;	
		}



}
