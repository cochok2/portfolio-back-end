/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.zproyecto.fedeq.controller;

import com.zproyecto.fedeq.entity.Persona;
import com.zproyecto.fedeq.interfac.IPersonaservice;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*" )


public class PersonaController {
    @Autowired IPersonaservice ipersonaService;
    
            @GetMapping ("personas/traer")
            public List <Persona> getPersona(){
                return ipersonaService.getPersona();
            }
            
            @PostMapping ("/personas/crear")
public String createPersona(@RequestBody Persona persona){
    ipersonaService.savePersona(persona);
    return "lapersona fue creada correctamente";
}

@DeleteMapping("/persona/borrar/{id}")
public String deletePersona (@PathVariable Long id){
    ipersonaService.deletePersona(id);
    return "La persona fue borrada correctamente";
}
            @PutMapping ("/persona/editar/{id}")
            public Persona editPersona (@PathVariable long id,
                                        @RequestParam("nombre") String nuevoNombre,
                                        @RequestParam("apellido") String nuevoApellido,
                                        @RequestParam("img") String nuevoimg){
                Persona persona = ipersonaService.findPersona(id);
                persona.setNombre(nuevoNombre);
                persona.setApellido(nuevoApellido);
                persona.setImg(nuevoimg);
                
                ipersonaService.savePersona(persona);
                return persona;
            }
            @GetMapping ("/personas/traer/perfil")
            public Persona findPersona (){return ipersonaService.findPersona((long)1);}
            
            }
