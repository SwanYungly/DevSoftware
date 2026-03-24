public class Conta {
    // atributos da classe conta
    double saldo;
    String nome;
    int numero;
    double limite;

    // public void saque(double valor){
    //     if(saldo>=valor && valor>0){
    //         this.saldo = this.saldo-valor
    //         this.saldo -= valor;
    //         System.out.println("Saque efetuado com sucesso");
    //     }else{
    //         System.out.println("Saldo insuficiente ou valor inválido");
    //     }
    //     System.out.println("Seu saldo atual é: R$"+ this.saldo);

    // }

    public boolean sacaVerifica(double valor){
        if(valor > this.saldo || valor<=0){
            return false;
        }
        else{
            double novoSaldo = this.saldo - valor;
            this.saldo = novoSaldo;
            return true;
        }

    }

    // metodo padrão para visualizar o objeto
    public String toString(){
        return "Nome: "+this.nome+"\nNúmero: "+this.numero+"\nSaldo: R$"+this.saldo+"\nLimite: R$"+this.limite;
    }
    public void deposito(double valor){
        if(valor>0){
        System.out.println("Valor antes do deposito: R$"+this.saldo);
        this.saldo += valor;
        System.out.println("Valor após o deposito: R$"+this.saldo);
    }
    else{
        System.out.println("Valor inválido, tente novamente mais tarde");
    }
}
}
