package com.pcvpmo.pdsw.upteho.dao;

import com.pcvpmo.pdsw.upteho.entities.Programa;
import java.util.List;

/**
 * DAO de Programa utilizado para Injection
 * @author Daniel Ospina, Juan Camilo mantilla
 */
public interface ProgramaDAO {

<<<<<<< HEAD
    public List<Programa> consultarProgramas() throws PersistenceException;
    
    public Programa consultarPrograma(Integer id) throws PersistenceException;
    
=======
    List<Programa> consultarProgramas() throws PersistenceException;

    void registrarPrograma(int id, String nombre) throws PersistenceException;
>>>>>>> b6a8a44ec1056e283918b7ff529628ec170c60b0
}