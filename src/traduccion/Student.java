/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traduccion;
import java.util.*;
/**
 *
 * @author david
 */
public class Student {
    private String name;
    private ArrayList<Grade> grades;
    private ArrayList<Module> takes;
    
    public Student(String name, ArrayList takes){
        this.name=name;
        this.takes=takes;
        this.grades= new ArrayList<>();
    }
}
