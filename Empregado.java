public class Empregado extends Pessoa{

//codigoSetor (inteiro), salarioBase (vencimento base) e imposto
//(porcentagem retida dos impostos)

//nome endereço não precisa
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

//set-->Método de alteração
    public void setCodigoSetor(int codigoSetor){
    this.codigoSetor=godigoSetor;
    }
//get-->Métode de consulta
    public String getgodigoSetor(){
    return this.godigoSetor;
    }

    public void setSalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    public getsalarioBase(){
        return this.salarioBase;
    }

    public void setImposto(double imposto){
        this.imposto=imposto;
    }
    public getimposto(){
        return this.imposto;
    }

    //---até aqui ok!
//Calcular salário
//Com o vídeo 1, 15 minutos....continuar 
public double calculoSalario(){
    double salarioLiquido=0;

    salarioLiquido=this.salarioBase.this.imposto;
    return salarioLiquido ;
}
}