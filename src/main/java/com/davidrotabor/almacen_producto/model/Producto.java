package com.davidrotabor.almacen_producto.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idproducto")
    private Long idProducto;

    @Column(name = "idalmacen")
    private Long idAlmacen;

    @Column(name = "nombreproducto", nullable = false, length = 100)
    private @NonNull String nombreProducto;

    @Column(name = "precioproducto", nullable = false)
    private @NonNull Double precioProducto;

    @Column(name = "cantidadproducto", nullable = false)
    private @NonNull Integer cantidadProducto;

    @ManyToOne
    @JoinColumn(name = "idalmacen", insertable = false, updatable = false)
    @JsonIgnore
    private Almacen almacen;



}