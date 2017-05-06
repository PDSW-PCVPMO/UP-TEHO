package com.pcvpmo.pdsw.upteho.dao;

import com.pcvpmo.pdsw.upteho.entities.Programa;
import java.util.List;

/**
 * DAO de Programa utilizado para Injection
 * @author Daniel Ospina, Juan Camilo mantilla
 */
public interface ProgramaDAO {

    List<Programa> consultarProgramas() throws PersistenceException;
}