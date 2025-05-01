/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppWEb.service;

import AppWEb.model.entity.Usuario;
import jakarta.ejb.Local;
import java.util.List;

/**
 *
 * @author diana-florian
 */

@Local
public interface IUsuarioService {
    
    Usuario guardar(Usuario usuario);
    
    Usuario editar (Usuario usuario);
    
    void eliminar (Usuario usuario);
    
    List<Usuario> listar();
    
   // List<Usuario>findAllNickName();
    
}
