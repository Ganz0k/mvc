/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Empleado;
import vista.VistaEmpleado;

/**
 *
 * @author luisg
 */
public class ControladorEmpleado {

    private Empleado modelo;
    private VistaEmpleado vista;

    public ControladorEmpleado(Empleado modelo, VistaEmpleado vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setNombreEmpleado(String nombre) {
        modelo.setNombre(nombre);
    }

    public String getNombreEmpleado() {
        return modelo.getNombre();
    }

    public void setIdEmpleado(String id) {
        modelo.setId(id);
    }

    public String getIdEmpleado() {
        return modelo.getId();
    }

    public void setDepartamentoEmpleado(String departamento) {
        modelo.setDepartamento(departamento);
    }

    public String getDepartamentoEmpleado() {
        return modelo.getDepartamento();
    }

    public void actualizarVista() {
        vista.printDetallesEmpleado(modelo.getNombre(), modelo.getId(), modelo.getDepartamento());
    }
}
