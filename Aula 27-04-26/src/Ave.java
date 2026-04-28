public class Ave extends Animal{

public Ave(final String nome, final int patas, final double velocidade, final int localizacao){
   super(nome, patas, velocidade, localizacao);


}

 public void mover(){
    setLocalizacao(getLocalizacao() +3);
    System.out.println("Ave "+ getNome() + " movendo - se ^^v^^ -->");
 }

    public String toString() {
        return "Ave \nNome:"+getNome()+"\nPatas: "+getPatas()+"\nVelocidade: "+getVelocidade()+"\nLocalização: "+getLocalizacao();
    }


 
}
