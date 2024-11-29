package com.davidrotabor.almacen_producto.exception;

public class InvalidIdAlmacen extends  RuntimeException{
    public InvalidIdAlmacen() {
        super();
    }

    public InvalidIdAlmacen(String message) {
        super(message);
    }
}
