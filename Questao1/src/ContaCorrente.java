public class ContaCorrente extends Conta {

    private double chequeS;

    public ContaCorrente(){
    }

    public ContaCorrente(double chequeS, double sacar, double depositar, int id_conta, String titular){
        super(sacar,depositar, id_conta, titular);
        this.chequeS = chequeS;
    }

    public void setChequeS(double chequeS){
        this.chequeS = chequeS;
    }

    public Double getCheques(){
        return chequeS;
    }

}
