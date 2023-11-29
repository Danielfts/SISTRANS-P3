package uniandes.edu.co.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/habitaciones")
public class HabitacionController {
    
    @GetMapping
    public String habitaciones(Model model) {
        
        return "habitaciones";
    }
}
