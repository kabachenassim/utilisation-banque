package ban;
import org.uvsq.tod.*;
public class banque {

	public static void main(String[] args) {
		Compte c=new Compte(100);
         c.crediteSolde(10);
         c.debiteSolde(10);
	}

}
