
public class Banheiro {
	
	private String estado;
	int qtdMulher;
	int qtdHomem;

	public String getEstado() {
		return estado;
	}

	public void entrar(String sexo) {
		if(this.estado == null) {
			System.out.println("Vazio");
			if(sexo.equalsIgnoreCase("Masculino")) {
				this.qtdHomem++;
				this.estado = sexo;
			}
			else {
				this.qtdMulher++;
				this.estado = sexo;
			}
		}
		else if(this.estado != null){
			if(this.qtdHomem != 0 && sexo.equalsIgnoreCase("Feminino") ){
				System.out.println("Homens presentes");
				this.estado = sexo;
			}
			
			else if(this.qtdHomem != 0 && sexo.equalsIgnoreCase("Masculino")){
				this.estado = sexo;
				this.qtdHomem++;
			}
			
			else if(this.qtdHomem != 0 && sexo.equalsIgnoreCase("Feminino")) {
				this.estado = sexo;
				this.qtdMulher++;
			}


			else if(this.qtdMulher != 0 && sexo.equalsIgnoreCase("feminino")) {
				System.out.println("Mulheres presentes");
				this.estado = sexo;
			}
		}
	}
	public void sair(String sexo) {
		if(this.estado.equalsIgnoreCase("Feminino") && sexo.equalsIgnoreCase("Feminino")) {
			this.qtdMulher--;
		}
		else if(this.estado.equalsIgnoreCase("Masculino") && sexo.equalsIgnoreCase("Masculino")){
			this.qtdHomem--;
		}
	}
			int homens = 0; //Variavel de controle dos homens
			int mulheres = 0; /// Variavel de controle das mulheres

			int homens_mutex = Semaforo(1); //#Controla o acesso dos homens ao banheiro
			int mulheres_mutex = Semaforo(1); //#Controla o acesso das mulheres ao banheiro

			int controlador = Semaforo(1); //#Variavel de controle ao uso do banheiro

			public void woman_wants_to_enter() {
			    while(true) {
			        down(mulheres_mutex);
			        mulheres += 1;
			        if(mulheres == 1) {
			            down(controlador);
			        }
			        up(mulheres_mutex);
			    }
			}

			private int Semaforo(int i) {
				// TODO Auto-generated method stub
				return 0;
			}

			public void man_wants_to_enter() {
			    while(true) {
			        down(homens_mutex);
			        man += 1;
			        if(homens == 1) {
			            down(controlador);
			        }
			        up(homens_mutex);
			    }
			}

			public void woman_leaves() {
			    down(mulheres_mutex);
			    mulheres_mutex -= 1;
			    if(mulheres_mutex == 0) {
			        up(controlador);
			    }
			    up(mulheres_mutex);
			}

			public void man_leaves() {
			    down(homens_mutex);
			    homens_mutex -= 1;
			    if(homens_mutex == 0) {
			        up(controlador);
			    }
			    up(homens_mutex);
			}

}
