public class KC_Cuenta {
    float saldo=0;
    int depositos=0;
    int retiros=0;
    float tasaAnual;

    public KC_Cuenta(float saldo, float tasa){
        this.saldo=saldo;
        this.tasaAnual=tasa;
    }
    void depositar(float deposito){
        saldo=saldo+deposito;
        depositos=depositos+1;
    }
    void retiro(float retiro){
        saldo=saldo-retiro;
        retiros=retiros+1;
    }
}
