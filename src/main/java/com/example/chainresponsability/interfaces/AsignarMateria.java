package com.example.chainresponsability.interfaces;

import com.example.chainresponsability.app.Materia;

public interface  AsignarMateria {
    //protected AsignarMateria profesor;

    public void AsignarMateria(AsignarMateria asignarMateria);

    public abstract void asignar(Materia m);

}
