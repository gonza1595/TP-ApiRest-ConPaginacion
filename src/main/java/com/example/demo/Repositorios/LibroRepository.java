package com.example.demo.Repositorios;

import com.example.demo.Entidades.Libro;
import com.example.demo.Entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long>{
}
