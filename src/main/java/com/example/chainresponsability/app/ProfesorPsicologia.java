package com.example.chainresponsability.app;

import com.example.chainresponsability.interfaces.AsignarMateria;

public class ProfesorPsicologia implements AsignarMateria {
    private AsignarMateria profesor;
    @Override
    public void AsignarMateria(AsignarMateria asignarMateria) {
        profesor = asignarMateria;
    }
    @Override
    public void asignar(Materia m) {
        if (m.getNombre().equals("Conciencia Mental")) {
            System.out.println("Se Asigno la materia de Conciencia Mental a: " + this.getClass().getSimpleName());
        } else {
            profesor.asignar(m);
        }
    }
}
