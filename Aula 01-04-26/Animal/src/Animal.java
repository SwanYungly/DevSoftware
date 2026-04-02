public class Animal {
    private String nome;
    private float peso;
    private int recinto;
    // Contrutores
    public Animal(String nome, int recinto){
        this.nome = nome;
        this.recinto = recinto;


    }
    public Animal(){}
    // Getters and Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    public float getPeso(){
        return this.peso;
    }

    public void setRecinto(int recinto){
        this.recinto = recinto;
    }
    public int getRecinto(){
        return this.recinto;
    }

    @Override
    public String toString(){
        return "Animal\nNome: "+ this.nome + "\nPeso: "+this.peso+"\nRecinto: " +this.recinto;
    }

    public void andar(){
        this.recinto++;
    }


}
