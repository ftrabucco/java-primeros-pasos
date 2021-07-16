
public class Array_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]matrix = {
				{10,15,18,19,21},
				{81,11,18,11,12},
				{47,14,88,91,71},
				{50,16,12,11,41}
		};
		
		for(int[]fila:matrix) {
			
			System.out.println();
			
			for(int z:fila) {
				
				System.out.print(z+" ");
			}
		}

	}

}
