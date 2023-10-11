package com.example.demo.Services;

import com.example.demo.Entidades.Persona;
import com.example.demo.Repositorios.BaseRepository;
import com.example.demo.Repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService extends BaseServiceImpl<Persona, Long>{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

    public List<Persona> searchByKeywords(String filtro) throws Exception {
        try {
            List<Persona> personas = personaRepository.findByNombreContaining(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public List<Persona> searchByJPQL(String filtro) throws Exception {
        try {
            List<Persona> personas = personaRepository.searchByJPQL(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public List<Persona> searchByNativeQuery(String filtro) throws Exception {
        try {
            List<Persona> personas = personaRepository.searchByNativeQuery(filtro);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    //Query con paged
    public Page<Persona> searchByKeywords(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepository.findByNombreContaining(filtro,pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public Page<Persona> searchByJPQL(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepository.searchByJPQL(filtro,pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public Page<Persona> searchByNativeQuery(String filtro, Pageable pageable) throws Exception {
        try {
            Page<Persona> personas = personaRepository.searchByNativeQuery(filtro,pageable);
            return personas;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
