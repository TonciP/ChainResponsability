package com.example.chainresponsability.app;

import com.example.chainresponsability.interfaces.AsignarMateria;

public class ProfesorInformatica implements AsignarMateria {
    private AsignarMateria profesor;
    @Override
    public void AsignarMateria(AsignarMateria asignarMateria) {
        profesor = asignarMateria;
    }
    @Override
    public void asignar(Materia m) {
        if (m.getNombre().equals("Programacion")) {
            System.out.println("Se asingo la materia de Programacion a: " + this.getClass().getSimpleName());
        } else {
            profesor.asignar(m);
        }
    }
}
