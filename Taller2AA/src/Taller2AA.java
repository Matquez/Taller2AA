
public class Taller2AA {
	
	final static double lado_cuadrado = 2.0000000000;
	final static double radio = 1.000000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero_aciertos = 0.0;
		double total_puntos = 0.0;		
		int numero_iteraciones = 20;
		
		double x = 0.0000000;
		double y = 0.0000000;
		//Con 20 iteraciones:
		System.out.println("\nCon "+ numero_iteraciones + " iteraciones:");
		for(int i = 0; i < numero_iteraciones; i++){
			//Puntos en rango [-1,1]
			x = 2.0*Math.random() - 1.0;
			System.out.println("x: "+ x);
			y = 2.0*Math.random() - 1.0;
			System.out.println("y: "+ y);
			
			//Verificamos si esta dentro del circulo de radio 1:
			if(dentro_circulo(x, y)){
				numero_aciertos++;
			}
			total_puntos++;
		}
				
		double pi = (numero_aciertos*lado_cuadrado*lado_cuadrado)/(total_puntos*radio*radio);
		System.out.println("Aproximacion de PI: "+ pi);
		System.out.println("Pi real: " + Math.PI);
		System.out.println("Error: "+ Math.abs(100*(pi - Math.PI)/Math.PI) + "%");
		
		
		//Con 100 iteraciones:
		numero_iteraciones = 100;
		numero_aciertos = 0;
		total_puntos = 0;
		System.out.println("\nCon "+ numero_iteraciones + " iteraciones:");
		for(int i = 0; i < numero_iteraciones; i++){
			//Puntos en rango [-1,1]
			x = 2*Math.random() - 1;
			y = 2*Math.random() - 1;
			
			//Verificamos si esta dentro del circulo de radio 1:
			if(dentro_circulo(x, y)){
				numero_aciertos++;
			}
			total_puntos++;
		}
		
		pi = (numero_aciertos*lado_cuadrado*lado_cuadrado)/(total_puntos*radio*radio);
		System.out.println("Aproximacion de PI: "+ pi);
		System.out.println("Pi real: " + Math.PI);
		System.out.println("Error: "+ Math.abs(100.0*(pi - Math.PI)/Math.PI) + "%");
		
		//Con 500 iteraciones:
		numero_iteraciones = 500;
		numero_aciertos = 0;
		total_puntos = 0;
		System.out.println("\nCon "+ numero_iteraciones + " iteraciones:");
		for(int i = 0; i < numero_iteraciones; i++){
		//Puntos en rango [-1,1]
			x = 2.0*Math.random() - 1.0;
			y = 2.0*Math.random() - 1.0;
					
			//Verificamos si esta dentro del circulo de radio 1:
			if(dentro_circulo(x, y)){
				numero_aciertos++;
			}
			total_puntos++;
		}
				
		pi = (numero_aciertos*lado_cuadrado*lado_cuadrado)/(total_puntos*radio*radio);
		System.out.println("Aproximacion de PI: "+ pi);
		System.out.println("Pi real: " + Math.PI);
		System.out.println("Error: "+ Math.abs(100.0*(pi - Math.PI)/Math.PI) + "%");		
		
		
		
		

	}
	private static double distancia_entre_puntos(double x0, double y0, double x1, double y1){		
		
		return Math.sqrt(Math.pow((x1-x0), 2) + Math.pow((y1-y0), 2));
		
	}
	
	private static boolean dentro_circulo(double x1, double y1){
		
		if(distancia_entre_puntos(0, 0, x1, y1) <= radio){
			return true;
		}
		
		return false;
	}
	
	
	
	

}
