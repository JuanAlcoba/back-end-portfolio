
package com.portfolio.prueba.Entity;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Headers {
   
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String tipo;
    @NotNull
    @Size(min = 1, max = 1000, message = "no cumple con la longitud")
    private String contenido;
    
    
    
}
