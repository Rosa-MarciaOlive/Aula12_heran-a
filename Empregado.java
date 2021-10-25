public class Empregado extends Pessoa{
//nome endereço não precisa
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    public void setCodigoSetor(int codigoSetor){
    this.codigoSetor=godigoSetor;
    }
    //get
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
}