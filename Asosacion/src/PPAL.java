
import java.time.LocalDate;
import java.util.ArrayList;




public class PPAL {

    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Jairo", "Seones", "12345");
        System.out.println(cliente1);
        
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        Cuenta cuenta1 = new Cuenta("CC01",100, 5000, LocalDate.now());
        Cuenta cuenta2 = new Cuenta("CC01",200, 3000, LocalDate.now());

        ClientePremium clientePremium = new ClientePremium("67890", "Ana", "García", cuentas);
        System.out.println(clientePremium);

        
        /*System.out.println("Cliente Premium: ");
        ClientePremium premium = new ClientePremium("abc", "Lule", "Ardila", new ArrayList<>());
        System.out.println("No de cuentas registradas: " + premium.getMisCuentas());
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
        }*/
        
    }
    
}
