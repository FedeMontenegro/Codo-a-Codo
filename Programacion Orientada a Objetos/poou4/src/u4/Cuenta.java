package u4;

public class Cuenta {
    
    private Persona persona;
    private double saldo;

    public Cuenta(Persona persona) {
        this.persona = persona;
    }

    public Cuenta(Persona persona, double saldo) {
        this.persona = persona;
        this.saldo = saldo;
    }

    public Persona getPersona() {
        return persona;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean Depositar(double importe){
        
        if (importe<= 0) {
            return false;
        }else{
            this.saldo += importe;
            return true;
        }
    }
    
    public boolean Extraer(double importe){
        double resta = this.saldo-importe;
        if (resta<0) {
            return false;
        }else{
            this.saldo = resta;
            return true;
        }
    }

    @Override
    public String toString() {
        return "************Cuenta*************" + "\n" + persona.toString() + "\n Saldo Actual:" + this.getSaldo();
    }



}