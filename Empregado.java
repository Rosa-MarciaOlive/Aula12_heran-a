public class Empregado extends Pessoa{

//codigoSetor (inteiro), salarioBase (vencimento base) e imposto
//(porcentagem retida dos impostos)

//nome endereço não precisa
//todos atributos(private) precisam de 2 métodos pr acessa-los -->set get
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

//set-->Método de alteração
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor=codigoSetor;
    }
//get-->Métode de consulta
    public int getCodigoSetor(){
        return this.codigoSetor;
    }


    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    public double getSalarioBase(){
        return this.salarioBase;
    }


    public void setImposto(double imposto){
        this.imposto=imposto;
    }
    public double getImposto(){
        return this.imposto;
    }

    //---até aqui ok!
//Calcular salário liquido
//Com o vídeo 1, 15 minutos....continuar 
    public double calculoSalario(){
        double salarioLiquido=0;

        salarioLiquido=this.salarioBase-this.imposto;
    
        return salarioLiquido;

}

}