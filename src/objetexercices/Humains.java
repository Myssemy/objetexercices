package objetexercices;

public class Humains extends Vivantapattes { //classe fille héritée de la classe mere ..... c'est le extends qui va rapeller la classe mere et nous permettre de recuperer les infos communes
												

	
			
			private String name; // re attributs - variables
			
			private String job;
	
public Humains(int nombredepattes, String name, String surname, String job,String nourriture,String marcher) { // comme dans classe mere contenu souhaiter
	super (nombredepattes,surname,nourriture,marcher); // rappele ce qui est dans la classe mere
	
		this.name= name;
		
		this.job=job;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getJob() {
	return job;
}

public void setJob(String job) {
	this.job = job;
}
}