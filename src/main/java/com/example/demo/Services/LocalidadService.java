package com.example.demo.Services;

import com.example.demo.Entidades.Localidad;
import com.example.demo.Entidades.Persona;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.LocalidadRepository;
import com.example.demo.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService extends BaseServiceImpl<Localidad, Long>{
    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadService(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
