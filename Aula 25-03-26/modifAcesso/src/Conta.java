
public class Conta {
    // atributos da classe conta
    private double saldo;
    private String nome;
    private static int numero;
    private double limite;

    // getters e setters
    public void setNome(String nome) {
        if (nome != null && nome.length() > 1) {
            this.nome = nome;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNumero(int num){
        if(num>0){
            this.numero = num;
        }
    }

    public int getNumero(){
        return this.numero;
    }

    private void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setLimite(double limite){
        
        
        if(limite>0){
            this.limite = limite;
        }

    }

    public double getLimite(){
        return this.limite;
    }

    // public void saque(double valor){
    // if(saldo>=valor && valor>0){
    // this.saldo = this.saldo-valor
    // this.saldo -= valor;
    // System.out.println("Saque efetuado com sucesso");
    // }else{
    // System.out.println("Saldo insuficiente ou valor inválido");
    // }
    // System.out.println("Seu saldo atual é: R$"+ this.saldo);

    // }

    public boolean sacaVerifica(double valor) {
        if (valor > this.saldo || valor <= 0) {
            return false;
        } else {
            setSaldo(valor);;
             System.out.println("Saldo: R$" + this.saldo);
            return true;
        }

    }

    //metodo padrão para visualizar o objeto
    public String toString() {
        return "Nome: " + this.nome + "\nNúmero: " + this.numero + "\nSaldo: R$" + this.saldo + "\nLimite: R$"
                + this.limite;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            System.out.println("Valor antes do deposito: R$" + this.saldo);
            setSaldo(getSaldo()+valor);
            System.out.println("Valor após o deposito: R$" + this.saldo);
        } else {
            System.out.println("Valor inválido, tente novamente mais tarde");
        }
    }
}
