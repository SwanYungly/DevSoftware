import java.util.Calendar;

public class Pessoa {
    private String nome;
    private Calendar nascimento;
    private String cpf;
    private String telefone;
    private String email;
    public char[] toString;

    public Pessoa(String nome2, String cpf2) {
    }
    // metodos de acesso GET e Set
    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public Calendar getNascimento(){return this.nascimento;}
    public void setNascimento(Calendar nascimento){this.nascimento = nascimento;}

    public String getCpf(){return  this.cpf ;}
    public void setCpf(String cpf){this.cpf = cpf;}

    public String getTelefone(){return this.telefone;}
    public void setTelefone(String telefone){this.telefone = telefone;}

    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email = email;}

    public String toString(){
        return "Pessoa - "+"\tNome: "+ this.nome +"\tNascimento: "+this.nascimento+"\tCPF: "+this.cpf+"\tTelefone: "+this.telefone+"\tE-mail: "+this.email;
    }

}
