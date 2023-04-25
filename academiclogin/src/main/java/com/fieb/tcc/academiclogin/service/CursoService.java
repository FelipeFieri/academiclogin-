package com.fieb.tcc.academiclogin.service;

import java.util.Collection;
import java.util.Optional;

import com.fieb.tcc.academiclogin.model.Curso;

public interface CursoService {

	Curso save(Curso curso);
	Collection<Curso> findAll();
	Optional <Curso> findById(Long id);
}