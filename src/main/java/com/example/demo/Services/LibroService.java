package com.example.demo.Services;

import com.example.demo.Entidades.Domicilio;
import com.example.demo.Entidades.Libro;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.LibroRepository;
import com.example.demo.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService extends BaseServiceImpl<Libro, Long>{
    @Autowired
    private LibroRepository libroRepository;

    public LibroService(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}
