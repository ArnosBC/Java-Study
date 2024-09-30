/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ESTUDIANTE
 */
public class Teacher extends Persona {
    
    private String program;
    private String university;

    public Teacher() {
    }

    public Teacher(String program, String university, int id, String name, String lastName, int age) {
        super(id, name, lastName, age);
        this.program = program;
        this.university = university;
    }
    
    public Teacher(String program, String university, Persona persona){
        this(program, university, persona.getId(), persona.getName(), persona.getLastName(), persona.getAge());
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() + ", program=" + program + ", university=" + university + '}';
    }
    
    
}
