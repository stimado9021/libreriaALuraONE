package com.libreria.rest.repository;

import com.libreria.rest.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository <Libro, Long>{
    List<Libro> findByIdiomaIgnoreCase(String idioma);

}