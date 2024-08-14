/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamenn;

import javax.swing.JOptionPane;


public class PracticaExamenn {

    
    public static void main(String[] args) {
        
        Estudiantes estu = new Estudiantes("Gabriel", 0, "q");
        estu.agregarinfo(estu.arrEstudiantes);
        estu.eliminarEstudiante();
        estu.mostrarinfo(estu.arrEstudiantes);
        estu.buscarinfo(estu.arrEstudiantes);
    }
    
}
