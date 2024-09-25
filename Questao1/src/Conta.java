public class Conta {

    protected double depositar, sacar;
    protected int id_conta;
    protected String titular;

    double x = 0;

    public Conta(){
    }

    public Conta(double depositar, double sacar, int id_conta, String titular){
        this.titular = titular;
        this.id_conta = id_conta;
        this.sacar = sacar;
        this.depositar = depositar;
    }


    public void setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular(){
        return titular;
    }

    public void setDepositar(Double depositar){
        this.depositar = depositar;
    }
    public double getDepositar(){
        return depositar;
    }

    public void setSacar(Double sacar){
        this.sacar = sacar;
    }
    public Double getSacar(){
        return sacar;
    }

    public void setDepositar(int id){
        this.id_conta = id;
    }

    public double calcDep (){
        return depositar + x;
    }

    public void detalhes(){
        System.out.println("Titular: "+ titular);
        System.out.println("ID da conta: "+ id_conta);
        System.out.println("Valor da conta atual: "+ x);
    }




}