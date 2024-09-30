/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Profesion {
    
    public static void main(String[] args) {
        Persona person = new Persona(123, "Jairo", "Seones", 30);
        System.out.println(person);
        
        Doctor doctor = new Doctor("Cirujano", "HEAD", 567, "Elkin", "Patarroyo", 60);
        System.out.println(doctor);
        
        Teacher teacher = new Teacher("Ing. Sistemas", "UPC", 345, "Jairo", "Seones", 30);
        System.out.println(teacher);
        
        Doctor doctor2 = new Doctor("Cirujano", "HEAD", person);
        System.out.println(doctor2);
        
        Teacher teacher2 = new Teacher("Ing. Sistemas", "UPC", person);
        System.out.println(teacher2);
    }
    
}
