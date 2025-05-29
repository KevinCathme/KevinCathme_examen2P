//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int operacion;
        float valor;
        int a=0;
        float saldoInicial;
        float tasa;
        System.out.println("Ingrese Saldo inicial");
        saldoInicial=leer.nextFloat();
        System.out.println("Ingrese la tasa en %");
        tasa=leer.nextFloat();
        KC_CuentaAhorros cuenta1 = new KC_CuentaAhorros(saldoInicial, tasa, true);
        operacion = leer.nextInt();
        while(a==0) {
            operacion=0;
            valor=0;
            System.out.println("Seleccione una opción \n 1. Depositar\n 2. Retirar\n 3. Ver saldo\n Salir");
            if (operacion == 1) {
                System.out.println("Ingrese Saldo a depositar");
                valor = leer.nextFloat();
                cuenta1.depositar(valor);
                cuenta1.imprimir();
            }
            if (operacion == 2) {
                System.out.println("Ingrese Saldo a depositar");
                valor = leer.nextFloat();
                cuenta1.retiro(valor);
                cuenta1.imprimir();
            }
            if (operacion == 3) {
                cuenta1.imprimir();
            }
            if (operacion == 4) {
                a=1;
            }
        }
    }
}