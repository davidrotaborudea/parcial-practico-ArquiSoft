package com.davidrotabor.almacen_producto.service;

import com.davidrotabor.almacen_producto.dao.IProductoDao;
import com.davidrotabor.almacen_producto.exception.ProductoNotFoundException;
import com.davidrotabor.almacen_producto.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private IProductoDao dao;

    private Producto saveProducto(Producto producto) {
        return dao.save(producto);
    }

    public Producto save(Producto producto) {
        return dao.save(producto);
    }

    public List<Producto> getProductsByIdAlmacen(Long idAlmacen) throws ProductoNotFoundException {

        List<Producto> productos = dao.findProductoByAlmacenIdAlmacen(idAlmacen);
        if (productos.size() > 0) {
            return productos;
        }
        else throw new ProductoNotFoundException("No hay productos en ese almacen");
    }

}
