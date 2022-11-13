/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.zproyecto.fedeq.interfac;

import com.zproyecto.fedeq.entity.Persona;
import java.util.List;


public interface IPersonaservice {

//traer una persona
public List<Persona> getPersona()   ;
        
        // Guardar un objeto de tipo Persona
        
        public void savePersona (Persona persona);
        
        //eliminar un objeto buscando por ID
        
        public void deletePersona (Long id);
        
        // buscar una persona por ID
        public Persona findPersona (Long id);
}
