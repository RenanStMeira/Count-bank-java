package Programa;

import ultilitarios.Ultils;

public class Conta {
    private static int contadorDeContas = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Conta(Pessoa pessoa) {
        this.numeroConta = contadorDeContas;
        this.pessoa = pessoa;
        contadorDeContas += 1;
    }

    public String toString() {
        return "\nNumero da conta: " + this.getNumeroConta() +
                 "\nNome: " + this.pessoa.getNome() +
                 "\nCpf: " + this.pessoa.getCpf() +
                 "\nNome: " + this.pessoa.getEmail() +
                 "\nSalddo: " + Ultils.doubleToString(this.getSaldo()) +
                "\n";
    }

    //Metodo para depositar
    public void depositar(Double valor) {
        if(valor > 0){
            setSaldo(getSaldo() + valor);
            System.out.println("O deposito foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel realizar o deposito");
        }
    }
    //Metodo para sacar
    public void sacar(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("O saque foi realizado com sucesso!");
        } else {
            System.out.println("Não foi possivel sacar o valor");
        }
    }

    //Metodo transferir
    public void transferir(Conta contaParaDeposito, Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);

            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferencia realizada com sucesso !");
        } else {
            System.out.println("Não foi possivel realizar a transferencia");
        }
    }
}
