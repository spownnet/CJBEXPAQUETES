package org.curso.java.paquete.app.jardin;

import org.curso.java.paquete.app.hogar.*;

import static org.curso.java.paquete.app.hogar.ColorPelo.NEGRO;
import static org.curso.java.paquete.app.hogar.Persona.*;

public class EjemploPaquete {
        public static void main(String[] args) {


               Persona persona = new Persona();
//               Gato gato = new Gato();
               Perro perro = new Perro();

               persona.setNombre("Edgardo");
               persona.setColorPelo(NEGRO);
               perro.nombre = "Oso";
               perro.raza = "RotWiller";

                System.out.println("persona = " + persona.getNombre());

                String jugar = perro.jugar(persona);
                System.out.println("jugar = " + jugar);

                String saludo = saludar();
                System.out.println("saludo = " + saludo);

                String generoMasculino = GENERO_MASCULINO;
                String generoFemenino = GENERO_FEMENINO;


        }
}
