package com.davidrotabor.almacen_producto.dao;

import com.davidrotabor.almacen_producto.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoDao extends CrudRepository<Producto, Long> {

    List<Producto> findProductoByAlmacenIdAlmacen(Long idAlmacen);

}
