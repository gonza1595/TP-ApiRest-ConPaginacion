package com.example.demo.Controllers;

import com.example.demo.Entidades.Domicilio;
import com.example.demo.Entidades.Libro;
import com.example.demo.Services.DomicilioService;
import com.example.demo.Services.LibroService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroService>{
}
