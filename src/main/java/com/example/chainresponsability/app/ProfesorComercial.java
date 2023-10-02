package com.example.chainresponsability.app;

import com.example.chainresponsability.interfaces.AsignarMateria;

public class ProfesorComercial implements AsignarMateria {
    private AsignarMateria profesor;
    @Override
    public void AsignarMateria(AsignarMateria asignarMateria) {
        profesor = asignarMateria;
    }

    @Override
    public void asignar(Materia m) {
        if (m.getNombre().equals("Matematicas")) {
            System.out.println("Se asigno la materia de Matematicas a: " + this.getClass().getSimpleName());
        } else {
            profesor.asignar(m);
        }
    }
}
