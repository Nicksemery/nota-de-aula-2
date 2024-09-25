public class ContaPoupanca extends Conta {

    public ContaPoupanca(){}
    public ContaPoupanca(double depositar, double sacar, int id_conta, String titular){
        super(sacar,depositar, id_conta, titular);
    }


}