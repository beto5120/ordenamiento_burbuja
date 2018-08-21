
public class Main {
	
	public static void main(String[] args) {
		BurbujaOrdon2 b = new BurbujaOrdon2(true, 10);
		for(int i = 0; i < 10; i++) {
			int valor = (int) Math.random();
			b.setValor(valor, i);
		}
		
		int[] numerosOrdenados = b.obtenElementosOrdenados();
		for(Integer i : numerosOrdenados) {
			System.out.println(i);
		}
		
	}

}
