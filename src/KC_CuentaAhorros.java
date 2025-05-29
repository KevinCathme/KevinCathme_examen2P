public class KC_CuentaAhorros extends KC_Cuenta{
boolean activa;
        public KC_CuentaAhorros(float saldo,float tasa,boolean activa){
            super(saldo,tasa);
            activa=true;
    }
    void imprimir(){
            System.out.println("Saldo: "+saldo);
            System.out.println("Operaciones: "+(depositos+retiros));
    }
}
