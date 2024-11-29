package com.davidrotabor.almacen_producto.dao;

import com.davidrotabor.almacen_producto.model.Almacen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IAlmacenDao extends CrudRepository<Almacen, Long> {


}
