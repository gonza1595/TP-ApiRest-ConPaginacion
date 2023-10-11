package com.example.demo.Controllers;

import com.example.demo.Entidades.Autor;
import com.example.demo.Entidades.Localidad;
import com.example.demo.Services.AutorService;
import com.example.demo.Services.LocalidadService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadService>{
}
