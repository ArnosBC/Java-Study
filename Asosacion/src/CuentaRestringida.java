/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class CuentaRestringida extends Cuenta {
    
    private double limiteDeMovimiento;

    public CuentaRestringida() {
        
    }

    public CuentaRestringida(double limiteDeMovimiento) {
        this.limiteDeMovimiento = limiteDeMovimiento;
    }

    public double getLimiteDeMovimiento() {
        return limiteDeMovimiento;
    }

    public void setLimiteDeMovimiento(double limiteDeMovimiento) {
        this.limiteDeMovimiento = limiteDeMovimiento;
    }
    
    
    
}
