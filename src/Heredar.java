import java.util.Scanner;
public class Heredar extends Metodos{
    private String nombre;
    public void ejecutar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1=sc.nextInt();
        System.out.println("Ingrese otro numero");
        int num2=sc.nextInt();
        suma(num1,num2);
        System.out.println(num1+" + "+num2+" = "+suma(num1,num2));
        resta(num1,num2);
        System.out.println(num1+" + "+num2+" = "+resta(num1,num2));
        division(num1,num2);
        System.out.println(num1+" / "+num2+" = "+division(num1,num2));
        multiplicacion(num1,num2);
        System.out.println(num1+" + "+num2+" = "+multiplicacion(num1,num2));
        potencia(num1,num2);
        System.out.println(num1+" ^ "+num2+" = "+potencia(num1,num2));
        cuenta(num1,num2);
        parImpar(num1,num2);
        mayor(num1,num2);
        divisionExacta(num1,num2);
        residuo(num1,num2);
        System.out.println("El residuo de la division entre "+num1+" y "+num2+" Es "+residuo(num1,num2));
    }
}
