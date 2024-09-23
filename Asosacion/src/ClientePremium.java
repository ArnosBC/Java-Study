
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class ClientePremium {
    
    private String id;
    private String nombre;
    private String apellido;
    
    //Relacion de 1 a varios con cuenta
    
    private ArrayList <Cuenta> misCuentas;

    public ClientePremium() {
        this.misCuentas = new ArrayList();
    }

    public ClientePremium(String id, String nombre, String apellido, ArrayList<Cuenta> miCuentas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.misCuentas = miCuentas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    
    @Override
    public String toString(){
        return "ClientePremium(" + "nombre=" + nombre + "apellido=" + apellido + "Id=" + id;
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
