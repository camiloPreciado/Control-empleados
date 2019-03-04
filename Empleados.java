/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import javax.swing.JOptionPane;
import paquete1.Caracteristicas;

/**
 *
 * @author Camilo Preciado
 */
public class Empleados {
    public static void main(String[] args) {
        Caracteristicas empleado1 = new Caracteristicas(JOptionPane.showInputDialog("Ingrese nombre del empleado 1: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: ")) , JOptionPane.showInputDialog("Ingrese la direccion: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono: ")));
        Caracteristicas empleado2 = new Caracteristicas(JOptionPane.showInputDialog("Ingrese nombre del empleado 2: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: ")) , JOptionPane.showInputDialog("Ingrese la direccion: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono: ")));
        Caracteristicas empleado3 = new Caracteristicas(JOptionPane.showInputDialog("Ingrese nombre del empleado 3: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: ")) , JOptionPane.showInputDialog("Ingrese la direccion: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono: ")));
        Caracteristicas empleado4 = new Caracteristicas(JOptionPane.showInputDialog("Ingrese nombre del empleado 4: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: ")) , JOptionPane.showInputDialog("Ingrese la direccion: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono: ")));
        Caracteristicas empleado5 = new Caracteristicas(JOptionPane.showInputDialog("Ingrese nombre del empleado 5: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado: ")) , JOptionPane.showInputDialog("Ingrese la direccion: "), Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono: ")));
        
        int op= Integer.parseInt(JOptionPane.showInputDialog("Menu: \n" + 
                "1. Empleado 1 \n" + 
                "2. Empleado 2 \n" + 
                "3. Empleado 3 \n" + 
                "4. Empleado 4 \n" + 
                "5. Empleado 5 \n" + 
                "Ingrese el numero del empleado que desea consultar: "));
        switch(op){
            case 1: System.out.println("Datos del Empleado 1: \n"+ "Nombre: "+ empleado1.getNombre()+"\n"+"Edad: " + empleado1.getEdad()+ "\n"+
            "Direccion: "+ empleado1.getDireccion()+ "\n" + "Telefono: "+ empleado1.getTelefono());
            break;
            case 2: System.out.println("Datos del Empleado 2: \n"+ "Nombre: "+ empleado2.getNombre()+"\n"+"Edad: " + empleado2.getEdad()+ "\n"+
            "Direccion: "+ empleado2.getDireccion()+ "\n" + "Telefono: "+ empleado2.getTelefono());
            break;
            case 3: System.out.println("Datos del Empleado 3: \n"+ "Nombre: "+ empleado3.getNombre()+"\n"+"Edad: " + empleado3.getEdad()+ "\n"+
            "Direccion: "+ empleado3.getDireccion()+ "\n" + "Telefono: "+ empleado3.getTelefono());
            break;
            case 4: System.out.println("Datos del Empleado 4: \n"+ "Nombre: "+ empleado4.getNombre()+"\n"+"Edad: " + empleado4.getEdad()+ "\n"+
            "Direccion: "+ empleado4.getDireccion()+ "\n" + "Telefono: "+ empleado4.getTelefono());
            break;
            case 5: System.out.println("Datos del Empleado 5: \n"+ "Nombre: "+ empleado5.getNombre()+"\n"+"Edad: " + empleado5.getEdad()+ "\n"+
            "Direccion: "+ empleado5.getDireccion()+ "\n" + "Telefono: "+ empleado5.getTelefono());
            default: JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
    
}
