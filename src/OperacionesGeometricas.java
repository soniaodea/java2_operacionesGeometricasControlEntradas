
import java.util.Scanner;
import com.zubiri.geometria.*;

public class OperacionesGeometricas {

	public static void main(String[] ar) {

		String opcion;

		Scanner sc = new Scanner(System.in);

		System.out.println("\nDe que figura quieres hacer los cálculos?");
		System.out.println("\nEscribe `circulo´ o `rectangulo´...");

		opcion = sc.next();

		while(!opcion.equalsIgnoreCase("circulo")&&!opcion.equalsIgnoreCase("rectangulo")){

			System.out.println("\nVa a ser que no has escrito bien...");
			System.out.println("\nPrueba otra vez...");

			opcion = sc.next();
		}

		if(opcion.equalsIgnoreCase("circulo")) {

			Circulo cir = new Circulo(0);
			double radio, area, circunferencia;
			System.out.println("\nVamos a calcular el área y circunferencia de un" + opcion);
			System.out.println("Introduzca el radio del círculo en cuestión");

			radio = sc.nextDouble();
			cir.setRadio(radio);
			area = cir.area();
			circunferencia = cir.circunferencia();

			System.out.println("El área del círculo es: " + area);
			System.out.println("La circunferencia del círculo es: " +circunferencia);
		}else{

			double altura, anchura, perimetro, superficie;
			Rectangulo rec = new Rectangulo(0,0);

			System.out.println("\nVamos a calcular la superficie y el perimetro de un rectangulo");
			System.out.println("\nIntroduce la altura del rectangulo");

			altura = sc.nextDouble();
			rec.setAltura(altura);

			System.out.println("\nAhora introduce la anchura del rectangulo");

			anchura = sc.nextDouble();
			rec.setBase(anchura);

			perimetro = rec.perimetro();
			superficie = rec.area();

			System.out.println("\nCon una altura de: "+ rec.getAltura() + " y una anchura de: "+ rec.getBase() +"...");
			System.out.println("La superficie del rectangulo es: "+ superficie);
			System.out.println("\ny el perimetro es: "+ perimetro);
		}
	}
}
