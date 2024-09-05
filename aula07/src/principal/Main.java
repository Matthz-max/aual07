package principal;


import entidade.cachorro;
import entidade.gato;
import entidade.vaca;

public class Main {

	public static void main(String[] args) {
		 
	    cachorro x = new cachorro();
				
		
	    System.out.println("Cachorro é au, au");
		System.out.println(x.EmitirSom()+"\n");
		
		gato y = new gato();
		System.out.println("Gato é miau, miau");
		System.out.println(y.EmitirSom()+"\n");
		
		
		vaca w = new vaca();
		System.out.println("A vaca faz");
		System.out.println(w.EmitirSom());
		
		
		

	}

}
