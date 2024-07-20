public class Metodos {
    private String nombre;

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    public double division(int num1, int num2) {
        return (double) num1 / num2;
    }

    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public int potencia(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public void cuenta(int num1, int num2) {
        System.out.println("Numeros entre "+num1+" y "+num2);
        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }else {
            System.out.println("Numeros entre "+num2+" y "+num1);
            for (int i = num2; i >= num1; i--) {
                System.out.println(i);
            }
        }
    }
    public void parImpar(int num1, int num2){
        if (num1 % 2 == 0 && num2 % 2 ==0){
            System.out.println(num1+" y "+num2+" Son par");
        } else if (num1 % 2 != 0 && num2 % 2 ==0){
            System.out.println(num1+" Es impar "+num2+" Es par");
        } else if (num1 % 2 == 0 && num2 % 2 != 0) {
            System.out.println(num1+" Es par "+num2+" Es impar");
        }else {
            System.out.println(num1+" y "+num2+" Son impares");
        }
    }
    public void mayor(int num1, int num2){
        if (num1<num2){
            System.out.println(num2+" Es mayor que "+num1);
        }else {
            System.out.println(num1+" Es mayor que "+num2);
        }
    }
    public boolean divisionExacta(int num1, int num2) {
        if (num1 % num2 == 0){
            System.out.println("La division entre los numero es exacta");
            return true;
        }else {
            System.out.println("La division entre los numero es inexacta");
            return false;
        }
    }
    public double residuo(int num1,int num2){
        return num1%num2;
    }
}