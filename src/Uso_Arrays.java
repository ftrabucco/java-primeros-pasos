
public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int [] mi_matriz=new int[5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=34;
		mi_matriz[2]=23;
		mi_matriz[3]=-92;
		mi_matriz[4]=7;*/
		
		int [] mi_matriz= {5,34,23,-92,7,65,12,73,48,32,14};
		
		for(int i=0;i<mi_matriz.length;i++) {
			
			System.out.println("Valor del índice "+ i +" = "+ mi_matriz[i]);
		}
	}

}
