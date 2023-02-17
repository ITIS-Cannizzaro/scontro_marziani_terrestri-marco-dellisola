public abstract class Terrestre {
	protected  String nome;
	protected int vita, velocita, armamento;
	Terrestre (String n, int v, int ve, int a){
		this.nome=n;
		this.vita=v;
		this.velocita=ve;
		this.armamento=a;
	}
	public Terrestre( String nome, int[] param) {
		 this.nome=nome;
		 this.vita=param[0];
		 this.velocita=param[1];
		 this.armamento=param[2];
		 System.out.println("Il terrestre "+nome+" entra in gioco.");
	}
	
	public void attaccaMarziano() {
		if (!vivente())
			System.out.println("Sono morto, non posso attaccare.");
		else 
			vita=vita-20+ 2*velocita+armamento;
	}
	public boolean vivente() {
		if (vita>0)
			return true;
		else 
			return false;
	}
	public String toString() {
		return "Terrestre "+nome+"."+"Vita= "+vita+".";
	}
	public boolean equals(Terrestre x) {
		if (vita==x.vita) 
			if (velocita==x.velocita)
				if (armamento==x.armamento)
					return true; 
		return false;
	}
	
	
	
}
