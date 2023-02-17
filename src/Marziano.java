public abstract class Marziano {
	protected String matricola;
	protected int autonomia, AI, tecnologia;
	 Marziano (String m, int a, int ai, int t){
		 this.matricola=m;
		 this.autonomia=a;
		 this.AI=ai;
		 this.tecnologia=t;
	 }
	 
	 public Marziano( String matricola, int [] param) {
		 this.matricola=matricola;
		 this.autonomia=param[0];
		 this.AI=param[1];
		 this.tecnologia=param[2];
		 System.out.println("Il terrestre "+matricola+" entra in gioco.");
	 }
	 
	 public void attaccaTerrestri() {
		 if (!attivo())
			 System.out.println("Blix blop blup (Non sono attivo, impossibile attaccare.)");
		 else
			 autonomia=autonomia-20+2*AI+tecnologia;
	 }
	 public boolean attivo() {
		 if (autonomia>0) 
			 return true;
		 else 
			 return false;
	 }
	 public String toString() {
		 return "Marziano "+matricola+"."+"Autonoia= "+autonomia+".";
	 }
	 public boolean equals( Marziano x) {
		 if (autonomia==x.autonomia) {
			 if (AI==x.AI)
				 if (tecnologia==x.tecnologia)
					 return true;
		 }
			 return false;
	 }
}