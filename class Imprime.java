class Imprime extend Variavel{
   private string impresao;

   public string setImp(string a){ //escrever na tela

        this.impresao=a;
    }

   public string getImp(){
        return this.impresao;
    }

    public string setIres(string a){ // escrever na tela resultado
        this.impresao=getValor();
    }

    public string getIres(){
        return this.impresao;
    }



}
