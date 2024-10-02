
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class ClientePremium extends Cliente {
    
    private ArrayList <Cuenta> misCuentas;

    public ClientePremium() {
        this.misCuentas = new ArrayList();
    }

    public ClientePremium(String id, String nombre, String apellido, ArrayList<Cuenta> miCuentas) {
        super(nombre, apellido, id);
        this.misCuentas = new ArrayList<Cuenta>();
    }

    public ArrayList<Cuenta> getMisCuentas() {
        return misCuentas;
    }

    public void setMisCuentas(ArrayList<Cuenta> misCuentas) {
        this.misCuentas = misCuentas;
    }
   
    public void registrarCuenta(Cuenta c){
        this.misCuentas.add(c);
    }
    
    public void imprimirNoCuentasRegistradas(){
        System.out.println("No de cuentas registradas: " + this.misCuentas.size());
    }
    
    public Cuenta consultarCuenta(String id){
        Cuenta buscada = null;
        for(Cuenta c : this.misCuentas){
            if(c.getId().equalsIgnoreCase(id)){
                buscada = c;
                break;
            }
        }
        
        return buscada;
    }
    
    public void retirarDeMiCuenta(double monto, Cuenta c){
        c.retirar(monto);
    }
    
    public void consignarMiCuenta(double monto, Cuenta c){
        c.consignar(monto);
    }
    
    public void imprimirHistoricoCuenta(Cuenta c){
        c.mostrarMovimientos();
    }
}
