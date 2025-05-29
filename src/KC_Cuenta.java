public class KC_Cuenta {
    public float saldo=0;
    public int depositos=0;
    public int retiros=0;
    public float tasaAnual;

    public KC_Cuenta(float saldo, float tasa){
        this.saldo=saldo;
        this.tasaAnual=tasa;
    }
    public void depositar(float deposito){
        saldo=saldo+deposito;
        depositos=depositos+1;
    }
    public void retiro(float retiro){
        saldo=saldo-retiro;
        retiros=retiros+1;
    }
}
