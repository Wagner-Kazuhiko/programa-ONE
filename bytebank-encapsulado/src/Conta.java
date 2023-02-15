public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(){}

    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("o total de contas é " + this.total);
        System.out.println("estou criando uma conta " + this.numero);
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta(double saldo, int agencia, int numero, Cliente titular) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public  boolean transfere(double valor, Conta destino){
        if (saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        else{
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("não pode valor menor ou igual a zero");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }


    public static int getTotal() {
        return Conta.total;
    }

    public static void setTotal(int total) {
        Conta.total = total;
    }
}
