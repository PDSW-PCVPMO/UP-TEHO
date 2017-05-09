package com.pcvpmo.pdsw.upteho.dao;

import com.pcvpmo.pdsw.upteho.entities.Materia;
import java.util.List;

/**
 * DAO de Materia utilizado para Injection
 * @author Daniel Ospina
 */
public interface MateriaDAO {
    
    List<Materia> consultarMateriasxAsignatura(Integer idAsignatura) throws PersistenceException;

    public Materia consultarMateria(String siglaMateria) throws PersistenceException;

    public void registrarMateria(String sigla, String nombre, int creditos, String descripcion, int idAsignatura) throws PersistenceException;
    
    List<Materia> consultarMateriasxPrograma(Integer programa) throws PersistenceException;
}