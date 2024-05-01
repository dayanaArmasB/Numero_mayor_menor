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
        @RequestParam int numero1,
        @RequestParam int numero2,
        @RequestParam int numero3, Model model) {
            
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

            String respuesta1 = "";
            String respuesta2 = "";
                
            respuesta1 = "el numeero mayor es " +mayor;
        
            respuesta2 = "el numero menor es " +menor;

            model.addAttribute("respuesta1", respuesta1);
            model.addAttribute("respuesta2", respuesta2);

        return "resultado";
    }


}
