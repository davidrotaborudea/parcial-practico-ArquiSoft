package com.davidrotabor.almacen_producto.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Almacen implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idalmacen")
    private Long idAlmacen;

    @Column(name = "nombrealmacen", nullable = false, length = 100)
    private @NonNull String nombreAlmacen;

    @Column(name = "lugaralmacen", nullable = false, length = 100)
    private @NonNull String lugarAlmacen;

    @OneToMany(mappedBy = "almacen")
    private List<Producto> productos;

}
