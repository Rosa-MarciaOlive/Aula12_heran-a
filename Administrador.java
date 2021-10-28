public class Administrador extends Empregado{

    private double ajudaCusto;

//get e set-->falta



//@Override

    public double calculaSalario() {

    
        return super.calculaSalario()+this.ajudaCusto;

    }

}