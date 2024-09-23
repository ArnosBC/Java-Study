
import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Movimiento {
    
    private LocalDate fecha;
    private double saldoInicial;
    private double monto;
    private double saldoFinal;
    private String descripcion;

    public Movimiento() {
    }

    public Movimiento(double saldoInicial, double monto, double saldoFinal, String descripcion) {
        this.fecha = LocalDate.now();
        this.saldoInicial = saldoInicial;
        this.monto = monto;
        this.saldoFinal = saldoFinal;
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "fecha=" + fecha + ", monto=" + monto + ", Saldo Final=" + saldoFinal + ", Descripcion=" + descripcion + "}";
    }
    
    
}
