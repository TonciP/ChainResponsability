package com.example.chainresponsability;

import com.example.chainresponsability.app.Materia;
import com.example.chainresponsability.app.ProfesorComercial;
import com.example.chainresponsability.app.ProfesorInformatica;
import com.example.chainresponsability.app.ProfesorPsicologia;
import com.example.chainresponsability.controller.Materias;
import com.example.chainresponsability.interfaces.AsignarMateria;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication  {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Materias materias = new Materias();
        AsignarMateria profesorComercial = new ProfesorComercial();
        AsignarMateria profesorPsicologia = new ProfesorPsicologia();
        AsignarMateria profesorInformatica = new ProfesorInformatica();

        ProfesorPsicologia.AsignarMateria(profesorComercial);
        ProfesorInformatica.AsignarMateria(profesorPsicologia);
        materias.AsignarMateria(profesorInformatica);

        Materia materia = new Materia();
        String peticion = "";
        Scanner scanner = new Scanner(System.in);
        while (peticion.equals(""))
        {
            System.out.println("Ingrese la materia a asignar: ");
            peticion = scanner.nextLine();
            materia.setNombre(peticion);
            materias.asignar(materia);
        }



    }
}