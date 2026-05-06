package com.mundial.servicio;

import com.mundial.dao.equipodao;
import com.mundial.modelo.equipos;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipoService {

    
    private final equipodao equipodao;

   public EquipoService(equipodao equipodao){
    this.equipodao = equipodao;
   }

   public List<equipos> listarEquipos(){
    return equipodao.listarEquipos();
   }
}
