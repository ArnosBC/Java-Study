
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Cuenta {
    
    private double saldo;
    private double limite;
    private LocalDate fechaApertura;
    private String id;
    
    private ArrayList <Movimiento> misMovimientos;

    public Cuenta() {
        this.misMovimientos = new ArrayList();
    }

    public Cuenta(String id, double saldo, double limite, LocalDate fechaApertura) {
        this.misMovimientos = new ArrayList();
        this.id = id;
        this.saldo = saldo;
        this.limite = limite;
        this.fechaApertura = fechaApertura;
    }
 
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public ArrayList<Movimiento> getMisMovimientos() {
        return misMovimientos;
    }

    public void setMisMovimientos(ArrayList<Movimiento> misMovimientos) {
        this.misMovimientos = misMovimientos;
    }
    
    public void consignar(double monto){
        double saldoInicial = this.saldo;
        this.saldo += monto;
        this.crearMovimiento(monto, this.saldo, "Ingreso");
    }
    
    public void retirar(double monto){
        if(monto <= saldo + limite){
            this.saldo -= monto;
            this.crearMovimiento(monto, this.saldo, "Egreso");
        } else {
            System.out.println("No se puede retirar, excede el limite.");
        }
        
    }  
    
    public void crearMovimiento(double monto, double saldoFinal, String tipo){
        double saldoInicial;
        if(tipo.equalsIgnoreCase("ingreso")){
            saldoInicial = saldoFinal - monto;
        } else {
            saldoInicial = saldoFinal + monto;
        }
        Movimiento m = new Movimiento(saldoInicial, monto, this.saldo, tipo);
        this.misMovimientos.add(m);
    }
    
    public void mostrarMovimientos(){
        System.out.println("Historico de movimiento de cuentas: ");
        System.out.println("---------------------------------");
        for(Movimiento mov : this.misMovimientos){
            System.out.println(mov.toString());
        }
        System.out.println("----------------------------");
        System.out.println("Total movimientos: " + this.misMovimientos.size());
    }
    
    public void imprimirHistoricoCuenta(){
        mostrarMovimientos();
    }

    
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", limite=" + limite + ", fechaApertura=" + fechaApertura + ", id=" + id + '}';
    }
    
    
}
