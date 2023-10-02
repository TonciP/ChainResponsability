package com.example.chainresponsability.controller;

import com.example.chainresponsability.app.Materia;
import com.example.chainresponsability.interfaces.AsignarMateria;

public class Materias extends AsignarMateria {
    @Override
    public void asignar(Materia m) {
        if (m.getNombre().equals("Desarrollo"))
        {
            System.out.println("Se asigno la materia de Desarrollo a: " + this.getClass().getSimpleName());
        }
        else
        {
            profesor.asignar(m);
        }
    }

}
