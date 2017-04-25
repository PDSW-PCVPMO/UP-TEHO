/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pcvpmo.pdsw.upteho.dao.mybatis.mappers;

import com.pcvpmo.pdsw.upteho.entities.Salon;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 *
 * @author andres
 */
public interface SalonMapper {
    List<Salon> consultarSalones();
    List<Salon> consultarSalonPeriodo(@Param("idPeriodo")String periodo);
    List<Salon> consultarSalonCurso(@Param("cohorte")int idCohorte);
}
