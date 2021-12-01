package br.edu.unoesc.java.eleicao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.java.eleicao.model.Eleitor;

public interface EleitorRepository extends JpaRepository<Eleitor, Integer> {
	public List<Eleitor> findByNomeLike(String nome);
}
