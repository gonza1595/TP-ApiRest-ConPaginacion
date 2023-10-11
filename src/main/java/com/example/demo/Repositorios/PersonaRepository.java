package com.example.demo.Repositorios;

import com.example.demo.Entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long>{

    //Anotacion Metodo de Query
    List<Persona> findByNombreContaining(String nombre);

    //Anottacion JPQL por parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1%")
    List<Persona> searchByJPQL(String filtro);

    //Anottacion JPQL por parametros nombrados
    //@Query("SELECT p FROM Personas p WHERE p.nombre LIKE '%:nombre%'")
    //List<Persona> searchByJPQL(@Param("nombre") String nombre);

    //Anotacion por Native Query
    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE '%' || ?1 || '%'", nativeQuery = true)
    List<Persona> searchByNativeQuery(String nombre);

    //Query con paged

    //Anotacion Metodo de Query
    Page<Persona> findByNombreContaining(String nombre, Pageable pageable);

    //Anottacion JPQL por parametros indexados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %?1%")
    Page<Persona> searchByJPQL(String filtro, Pageable pageable);

    //Anotacion por Native Query
    @Query(value = "SELECT * FROM persona WHERE persona.nombre LIKE '%' || ?1 || '%'",
            countQuery = "SELECT count(*) FROM Persona",
            nativeQuery = true)
    Page<Persona> searchByNativeQuery(String nombre, Pageable pageable);

}
