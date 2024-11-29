package com.davidrotabor.almacen_producto.service;

import com.davidrotabor.almacen_producto.dao.IAlmacenDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlmacenService {

    @Autowired
    private IAlmacenDao dao;

}
