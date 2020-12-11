package prueba_endes;

import java.util.Scanner;

public class prueba1 {
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Introduce el numero");
        n = sc.nextInt();

        if (n>=0){
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }
}
