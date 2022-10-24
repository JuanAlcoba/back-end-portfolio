
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
public class Experiencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String header;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String titulo;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String ente;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String fechaIni;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String fechaFin;
    
}
