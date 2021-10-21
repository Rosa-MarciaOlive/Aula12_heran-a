public calss Pessoa{
    private String nome;
    private String telefone;
    private String endereço;
    //fazer os métodos de acesso público
    //set pr nome
public void setNome(String nome){
    this.nome=nome;
    }
    //get
public String getNome(){
    return this.nome;
}
//set pr telefone
public void setTelefone(String telefone){
    this.telefone=telefone;
    }
    //get
public String getEndereço(String telefone){
    return this.telefone;
}

//construtor padrão, tem o nome ad classe e sem parâmetros
public Pessoa(){

}
//construtor padrão com 1 parâmetro
public Pessoa(String nome){
    this.nome=nome;
}
//construtor padrão com 2 parâmetro
public Pessoa(String nome,String telefone){
    this.nome;
    this.telefone=telefone;
}
}