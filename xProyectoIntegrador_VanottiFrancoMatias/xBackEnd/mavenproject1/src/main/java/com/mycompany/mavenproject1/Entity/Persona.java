
package com.mycompany.mavenproject1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50)
    private String apellido;
    private String img;
}
