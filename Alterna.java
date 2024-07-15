import java.util.ArrayList;

public class Alterna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 ArrayList <Integer> listaNum = new ArrayList <>();
	 listaNum.add(1);
	 listaNum.add(2);
	 listaNum.add(3);
	 listaNum.add(4);
	 listaNum.add(5);
	 listaNum.add(6);
	 
	 for (int i = 0; i < listaNum.size(); i+= 2) {
		 
		 System.out.println(listaNum.get(i));
	 }
	 
for (int i = 1; i < listaNum.size(); i+= 2) {
		 
		 System.out.println(listaNum.get(i));
	 }
	 
	
	}

}
