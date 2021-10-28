public class Pessoa{
//Atributos
    private String nome;
    private String telefone;
    private String endereço;


//Construtor padrão, tem o nome ad classe e sem parâmetros
public Pessoa(){
    }


//Construtor padrão com 1 parâmetro
public Pessoa(String nome){
    this.nome=nome;
    }
//Construtor padrão com 2 parâmetro
public Pessoa(String nome,String telefone){
    this.nome;
    this.telefone=telefone;
    }


  
//set--> metodo de alteração
public void setNome(String nome){
    this.nome=nome;
    }
//get--> metodo de consulta
public String getNome(){
    return this.nome;
    }


//
public void setTelefone(String telefone){
    this.telefone=telefone;
    }
public String getTelefone(){
    return this.telefone;
    }


//
public void setEndereço(String endereço){
    this.endereço=endereço;
    }
public String getEndereço(){
    return this.endereço;
    }
}