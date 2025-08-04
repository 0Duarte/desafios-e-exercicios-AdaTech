public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor - 0.5;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor + 0.5) {
            saldo = saldo - valor - 0.5;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta destino, double valor) {
        if (valor > 0 && saldo >= valor + 0.5) {
            saldo = saldo - valor - 0.5;
            destino.saldo = destino.saldo + valor;
            return true;
        }
        return false;
    }

    public boolean pagar(double valor) {
        if (valor > 0 && saldo >= valor + 0.5) {
            saldo = saldo - valor - 0.5;
            return true;
        }
        return false;
    }
}
