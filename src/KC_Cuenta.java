public class KC_Cuenta {
    float saldo;
    int depositos;
    int retiros;
    float tasaAnual;

    cuenta(float saldo, float tasa){
        this.saldo=saldo;
        this.tasaAnual=tasa;
    }
    void depositar(float deposito){
        saldo=saldo+deposito;
    }
    void retiro(float retiro){
        saldo=saldo-retiro;
    }
}
