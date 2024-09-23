
import java.time.LocalDate;
import java.util.ArrayList;




public class PPAL {

    
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta("CC01",100, 5000, LocalDate.now());
        Cliente yo = new Cliente("Jairo", "Seoanes", "XXX", miCuenta);
        
        System.out.println(yo);
        
        System.out.println("----------------------------------------");
        
        Cuenta nuevaCuenta = new Cuenta("CC01",0, 1000, LocalDate.now());
        yo.setCuenta(nuevaCuenta);
        yo.imprimirSaldo();
        yo.getCuenta().consignar(2000);
        yo.imprimirSaldo();
        
        
        
        
        System.out.println(yo);
        
        
        System.out.println("Cliente Premium: ");
        ClientePremium premium = new ClientePremium("abc", "Lule", "Ardila", new ArrayList<>());
        System.out.println("No de cuentas registradas: " + premium.getMisCuentas());
        premium.registrarCuenta(miCuenta);
        premium.registrarCuenta(nuevaCuenta);
        System.out.println(premium);
        premium.imprimirNoCuentasRegistradas();
        
        Cuenta buscada = premium.consultarCuenta("CC01");
        if(buscada != null){
            premium.consignarMiCuenta(500, buscada);
            premium.consignarMiCuenta(200, buscada);
            premium.retirarDeMiCuenta(300, buscada);
            premium.retirarDeMiCuenta(400, buscada);
            System.out.println("Datows cuenta consultada: ");
            System.out.println(buscada);
            premium.imprimirHistoricoCuenta(buscada); 
        } else {
            System.out.println("La cuenta no esta registrada");
        }
        
    }
    
}
