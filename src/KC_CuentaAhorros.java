public class KC_CuentaAhorros extends KC_Cuenta{
private boolean activa;
    public KC_CuentaAhorros(float saldo,float tasa,boolean activa){
            super(saldo,tasa);
            activa=true;
    }
    public void imprimir(){
        if(activa==true) {
            System.out.println("Saldo: " + saldo);
            System.out.println("Operaciones: " + (depositos + retiros));
        }
        else{
            System.out.println("La cuenta está inactiva");
        }
    }
}
