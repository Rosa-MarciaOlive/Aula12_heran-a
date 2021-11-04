public class Administrador extends Empregado{

    private double ajudaCusto;

//set
 public void setAjudaCusto(int  ajudaCusto){
    this.ajudaCusto= ajudaCusto;
    }
//get
    public String getajudaCusto(){
    return this. ajudaCusto;
    }

//@Override

    public double calculaSalario() {
   
        return super.calculaSalario()+this.ajudaCusto;

    }

}