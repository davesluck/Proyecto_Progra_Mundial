package com.mundial.servicio;

import com.mundial.dao.estadiodao;
import com.mundial.modelo.estadios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadioService {

    @Autowired
    private estadiodao estadiosDao;

    public List<estadios> listarEstadios() {
        return estadiosDao.listarEstadios();
    }

}


