package com.example.tarea4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InicioController {
    
    @RequestMapping("/")

    public String inicio(){
        return "inicio";
    }

    @RequestMapping("/procesar")
    public String logica(
        @RequestParam(required = false) Integer numero1,
        @RequestParam(required = false) Integer numero2,
        @RequestParam(required = false) Integer numero3, Model model) {
            
            if (numero1 == null || numero2 == null || numero3 == null) {
                model.addAttribute("error", "Por favor ingrese todos los números.");
                return "inicio";
            }

            

            int mayor = numero1; // Asumimos que a es el mayor por defecto
            if (numero2 > mayor) {
                mayor = numero2;
            }
            if (numero3 > mayor) {
                mayor = numero3;
            }
    
            // Identificar el menor
            int menor = numero1; // Asumimos que a es el menor por defecto
            if (numero2 < menor) {
                menor = numero2;
            }
            if (numero3 < menor) {
                menor = numero3;
            }

            //String respuesta1 = "";
            //String respuesta2 = "";
                
            //respuesta1 = mayor;
        
            //respuesta2 = "el numero menor es " +menor;

            model.addAttribute("mayor", mayor);
            model.addAttribute("menor", menor);

        return "resultado";
    }


}
