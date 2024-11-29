package com.davidrotabor.almacen_producto.controller;

import com.davidrotabor.almacen_producto.model.Producto;
import com.davidrotabor.almacen_producto.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/save")
    public Producto save(@RequestBody Producto producto) {
        productoService.save(producto);
        return producto;
    }

    @GetMapping("/list/{idAlmacen}")
    public Iterable<Producto> listProductsByIdAlmacen(@PathVariable("idAlmacen") Long idAlmacen) {
        return productoService.getProductsByIdAlmacen(idAlmacen);
    }

}
