package objetexercices; 

public class Vivantapattes {  // classe mere
//Salut c'est un comm

		private String surname;      // attribut - variables
		private	int nombredepattes ;
		private String nourriture;
		private String marcher;
	public Vivantapattes(int nombredepattes, String surname, String nourriture, String marcher) { // �a c'est le CONSTRUCTEUr sans lui il n'y a rien declare tout ce que va contenir notre classe mere
	
		 this.setSurname(surname); // �a je ne sais pas encore comment l'expliquer
		 this.setNombredepattes(nombredepattes);
		 this.setNourriture(nourriture);
		 this.setMarcher(marcher);
	
	
	}

	public String getSurname() {    // getter et setter qui vont permettre de r�cuperer les infos et les mettre dans le main
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNombredepattes() {
		return nombredepattes;
	}

	public void setNombredepattes(int nombredepattes) {
		this.nombredepattes = nombredepattes;
	}

	public String getNourriture() {
		return nourriture;
	}

	public void setNourriture(String nourriture) {
		this.nourriture = nourriture;
	}

	public String getMarcher() {
		return marcher;
	}

	public void setMarcher(String marcher) {
		this.marcher = marcher;
	}


	
		
	}
















































