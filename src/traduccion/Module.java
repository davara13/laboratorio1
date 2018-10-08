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
public class Module {
    private String lecturer;
    private String name;
    public  ArrayList <Grade> grades;
    
    public Module(String lecturer, String name, ArrayList grades){
        this.lecturer=lecturer;
        this.name=name;
        this.grades=grades;
    }
}
