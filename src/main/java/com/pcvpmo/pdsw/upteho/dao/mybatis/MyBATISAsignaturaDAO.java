package com.pcvpmo.pdsw.upteho.dao.mybatis;

import com.google.inject.Inject;
import com.pcvpmo.pdsw.upteho.dao.AsignaturaDAO;
import com.pcvpmo.pdsw.upteho.dao.PersistenceException;
import com.pcvpmo.pdsw.upteho.dao.mybatis.mappers.AsignaturaMapper;
import com.pcvpmo.pdsw.upteho.entities.Asignatura;
import java.util.List;

/**
 *
 * @author Juan Camilo Mantilla
 */
public class MyBATISAsignaturaDAO implements AsignaturaDAO{
    
    @Inject
    private AsignaturaMapper asignaturaMapper;

    @Override
    public List<Asignatura> consultarAsignaturas() throws PersistenceException {
        return asignaturaMapper.consultarAsignaturas();
    }
    
}
