
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Livre l1,l2, l3;
		String titre1="Programmation Java";
		l1= new Livre();
		l2= new Livre (titre1, "Adams",50);
		l3= new Livre ("Les Base de données avec SQL SERVER", "XXXX",50, 2015);
		l1.afficher();
		l2.afficher();
		l3.afficher();
		
	}

}
