public class KC_CuentaAhorros extends KC_Cuenta{
private boolean activa;
    public KC_CuentaAhorros(float saldo,float tasa,boolean activa){
            super(saldo,tasa);
            activa=true;
    }
    public void imprimir(){
            System.out.println("Saldo: " + saldo);
            System.out.println("Operaciones: " + (depositos + retiros));
        }

    @Override
    public void depositar(float deposito) {
        super.depositar(deposito);
    }

    @Override
    public void retiro(float retiro) {
        super.retiro(retiro);
    }
}