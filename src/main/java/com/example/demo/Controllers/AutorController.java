package com.example.demo.Controllers;

import com.example.demo.Entidades.Autor;
import com.example.demo.Entidades.Persona;
import com.example.demo.Services.AutorService;
import com.example.demo.Services.PersonaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorService>{
}
