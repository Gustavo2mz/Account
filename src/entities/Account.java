package entities;

public class Account  {

    private Integer conta;
    private String nome;
    private Double saldo;

    public Account(Integer conta, String nome, Double saldo){
        this.conta = conta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Account(Integer conta, String nome){
        this.conta = conta;
        this.nome = nome;
        this.saldo = 0.0;
    }

    public void deposito(Double quantmais){
        this.saldo += quantmais;
    }
    public void saque(Double quantmenos){
        this.saldo -= quantmenos +5;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return "Dados da conta:\n"
                + "Conta: " + getConta() + "\n"
                + "Titular: " + getNome() + "\n"
                + "Saldo: R$ " + String.format("%.2f", getSaldo());
    }

}
