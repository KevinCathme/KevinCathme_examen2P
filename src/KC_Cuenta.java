public class KC_Cuenta {
    protected float saldo;
    protected int depositos=0;
    protected int retiros=0;
    protected float tasaAnual;

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
