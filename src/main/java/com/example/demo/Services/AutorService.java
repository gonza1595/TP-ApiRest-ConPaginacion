package com.example.demo.Services;

import com.example.demo.Entidades.Autor;
import com.example.demo.Entidades.Persona;
import com.example.demo.Repositorios.AutorRepository;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService extends BaseServiceImpl<Autor, Long>{
    @Autowired
    private AutorRepository autorRepository;

    public AutorService(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}
