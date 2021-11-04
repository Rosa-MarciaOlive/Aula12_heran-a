public class Teste{

    public void main (String args[]){
    //Criando o objeto empregado
        Empregado empregado=new Empregado();

        empregado.setCodigoSetor(1);
        empregado.setSalarioBase(1000);
        empregado.setImposto(100);
        
    //Apresentar o salario Líquido
        System.out.println(empregado.calculoSalario());


    }
}
