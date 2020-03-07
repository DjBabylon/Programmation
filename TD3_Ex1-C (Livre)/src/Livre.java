
public class Livre {
	String	titre ;
	String	auteur ;
	float	prix; 
	int	annee; 

	//Il est possible d'écrire plusieurs constructeurs 
	Livre(){	
		titre =  "";
    	auteur = "";
    	prix = 0; 
    	annee  = 0;
	}
	   
	Livre(String t, String a, float p){
		titre =  t;
    	auteur = a;
    	prix = p; 
    	annee  = 0;	
	} 	
	
    Livre(String t, String a, float p, int an){
    	titre =  t;
    	auteur = a;
    	prix = p; 
    	annee  = an;	
	}

	void afficher(){
		System.out.println ("Titre: "+ titre + ", Auteur: " + auteur + ", Prix: "+ prix + ", Ann�e: "+ annee);
	}
	
}
