public class Interpretador{

	public void interpreta(String c[]){
		Variavel var[] = new Variavel[50];
		int i, l = 0;
		int ifff = 1; 		

		for(i = 0 ; i < c.length; i++){
			if(c[i] != null && ifff != 0){				
				this.testa(c[i], var, i);
			}else{
				if(c[i] == "fimSe"){
					ifff = 1;
				}
			}
		}


	}


	private int  testa(String a, Variavel v[], int j){
		Fluxo iff = new Fluxo();
		int i, h, testin;
		boolean  teste;
		String file[] = a.split(" ");
		for(i = 0; i < 100; i++){
			if(file[0] == "var" && file[4] == ";"){
				v[i - 1].setTipo(file[1]);
				v[i - 1].setNome(file[2]);
				v[i - 1].setValor(file[3]);
			}else if(file[0] == "se"){
				double aux1 = 0.0, aux3 = 0.0;
				String aux2 = " ";
				if(file[3] != null){					
					for(h = 0; h < 50; h++){
						if(file[1] == "se"){
							if(file[2] == v[h].getNome()){
								aux1 = Double.valueOf(v[h].getValor());
							}else if(file[4] == v[h].getNome()){
								aux3 = Double.valueOf(v[h].getValor());
							}else{
								aux1 = Double.valueOf(file[2]);
								aux3 = Double.valueOf(file[4]);
							}
							aux2 = file[3];
						}else{
							if(file[1] == v[h].getNome()){
								aux1 = Double.valueOf(v[h].getValor());
							}else if(file[3] == v[h].getNome()){
								aux3 = Double.valueOf(v[h].getValor());
							}else{
								aux1 = Double.valueOf(file[1]);
								aux3 = Double.valueOf(file[3]);
							}
						aux2 = file[2];
						}
					}
					teste = iff.testaIf(aux1,aux2,aux3);
				}else{
					if((h = Integer.parseInt(file[2])) != 0){
						return 1;
					}else{
						return 0;
					}
				}
				if(teste == false){
					return 0;
				}
				return 1;
			}else if(file[0] == "laco"){
	
			}else if(file[0] == "imp"){
				for(h = 0; h < 50; h++){
					if(file[1] == v[h].getNome()){
						System.out.println(v[h].getValor());
					}
				}
				
			}else if(file[0] == "op1"){
				Variavel u = v[0];
				double v1 = 0.0, v2 = 0.0;
				String gg = file[3];
				for(h = 0; h < 50; h++){
					if(String.valueOf(v[h].getNome()) == file[1]){
						u = v[h];
					}
				}
				v1 = Double.valueOf(file[2]);
				v2 = Double.valueOf(file[4]);
				if(gg == "+"){
					v1 = v1 + v2;
				}else if(gg == "-"){
					v1 = v1 - v2;
				}else if(gg == "*"){
					v1 = v1 * v2;
				}else if(gg == "/"){
					v1 = v1 / v2;
				}
				u.setValor(String.valueOf(v1));
			}else if(file[0] == "op2"){
				Variavel u1 = v[0], u2 = v[0];
				double v1 = 0.0, v2 = 0.0;
				String gg = file[3];
				for(h = 0; h < 50; h++){
					if(String.valueOf(v[h].getNome()) == file[1]){
						u1 = v[h];
					}
				}
				for(h = 0; h < 50; h++){
					if(String.valueOf(v[h].getNome()) == file[2]){
						u2 = v[h];
					}
				}
				v1 = Double.valueOf(u2.getValor());
				v2 = Double.valueOf(file[4]);
				if(gg == "+"){
					v1 = v1 + v2;
				}else if(gg == "-"){
					v1 = v1 - v2;
				}else if(gg == "*"){
					v1 = v1 * v2;
				}else if(gg == "/"){
					v1 = v1 / v2;
				}
				u1.setValor(String.valueOf(v1));			
			}else if(file[0] == "op3"){
				Variavel u1 = v[0], u2= v[0], u3= v[0];
				double v1 = 0.0, v2 = 0.0;
				String gg = file[3];
				for(h = 0; h < 50; h++){
					if(String.valueOf(v[h].getNome()) == file[1]){
						u1 = v[h];
					}
				}
				for(h = 0; h < 50; h++){
					if(String.valueOf(v[h].getNome()) == file[2]){
						u2 = v[h];
					}
				}
				for(h = 0; h < 50; h++){
					if(String.valueOf(v[h].getNome()) == file[4]){
						u3 = v[h];
					}
				}
				v1 = Double.valueOf(u2.getValor());
				v2 = Double.valueOf(u3.getValor());
				
				if(gg == "+"){
					v1 = v1 + v2;
				}else if(gg == "-"){
					v1 = v1 - v2;
				}else if(gg == "*"){
					v1 = v1 * v2;
				}else if(gg == "/"){
					v1 = v1 / v2;
				}
				u1.setValor(String.valueOf(v1));
			}
			
		}

		return 1;

	}


}
