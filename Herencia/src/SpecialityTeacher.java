/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class SpecialityTeacher extends Teacher {
    
    private String asignatura;
    private String especialidad;

    public SpecialityTeacher() {
        super();
    }

    public SpecialityTeacher(String asignatura, String especialidad, String program, String university, int id, String name, String lastName, int age ) {
        super(program, university, id, name, lastName, age);
        this.asignatura = asignatura;
        this.especialidad = especialidad;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "SpecialityTeacher{" + "asignatura=" + asignatura + ", especialidad=" + especialidad + '}';
    }
    
    
}
