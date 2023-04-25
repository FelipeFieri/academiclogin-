package com.fieb.tcc.academiclogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fieb.tcc.academiclogin.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{

}
