/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenn;

import javax.swing.JOptionPane;

public class Estudiantes {

    int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamanio: "));
    Estudiantes[] arrEstudiantes = new Estudiantes[tamanio];

    private String nombre;
    private int edad;
    private String curso;

    public Estudiantes(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //void se usa cuando se esta trabajando en el objeto
    //Agregar información
    public void agregarinfo(Estudiantes[] agregarinfo) {
        for (int i = 0; i < agregarinfo.length; i++) {
            JOptionPane.showMessageDialog(null, "Datos del estudiante: " + (i + 1));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
            String curso = JOptionPane.showInputDialog("Ingrese el curso");
            agregarinfo[i] = new Estudiantes(nombre, edad, curso);

        }
    }

    public void eliminarEstudiante() {

        arrEstudiantes = eliminarEstudiante(arrEstudiantes);
    }

    private Estudiantes[] eliminarEstudiante(Estudiantes[] arrEstudiantes) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del estudiante que desea eliminar"));
        if (num >= 1 && num <= arrEstudiantes.length) {
            Estudiantes[] nuevoArrib = new Estudiantes[arrEstudiantes.length - 1];
            int j = 0;
            for (int i = 0; i < arrEstudiantes.length; i++) {
                if (i != num - 1) {
                    nuevoArrib[j++] = arrEstudiantes[i];

                }

            }
            arrEstudiantes = nuevoArrib;
            JOptionPane.showMessageDialog(null, "El estudiante ha sido eliminado");
            return nuevoArrib;
        } else {
            return arrEstudiantes;
        }

    }

    public void mostrarinfo(Estudiantes[] arrEstudiantes) {
        for (int i = 0; i < arrEstudiantes.length; i++) {
            JOptionPane.showMessageDialog(null,
                    "Estudiante #" + (i + 1) + ":\n"
                    + "Nombre: " + arrEstudiantes[i].nombre + "\n"
                    + "Curso: " + arrEstudiantes[i].curso + "\n"
                    + "Edad: " + arrEstudiantes[i].edad + "\n");
        }
    }

    public void buscarinfo(Estudiantes[] arrEstudiantes) {
        String buscaInfo = JOptionPane.showInputDialog("Ingrese el nombre del estudiante que quiere buscar?");
        for (int i = 0; i < arrEstudiantes.length; i++) {
            if (arrEstudiantes[i].nombre == buscaInfo) {
                JOptionPane.showMessageDialog(null,
                        "Estudiante #" + (i + 1) + ":\n"
                        + "Nombre: " + arrEstudiantes[i].nombre + "\n"
                        + "Curso: " + arrEstudiantes[i].curso + "\n"
                        + "Edad: " + arrEstudiantes[i].edad + "\n");
            }

        }
    }
}
