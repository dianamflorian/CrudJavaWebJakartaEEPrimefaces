/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppWEb.service.impl;

import AppWEb.model.entity.Usuario;
import AppWEb.repository.UsuarioRepository;
import AppWEb.service.IUsuarioService;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.util.List;

/**
 *
 * @author diana-florian
 */
@Stateless
public class UsuarioServiceImpl implements IUsuarioService {

    @EJB
    private UsuarioRepository usuarioRepository;
    
    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario editar(Usuario usuario) {
        return usuarioRepository.update(usuario);
    }

    @Override
    public void eliminar (Usuario usuario){
        usuarioRepository.delete(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    /**@Override
    public List<Usuario> findAllNickName() {
        return usuarioRepository.findAllNickName();
    }*/
        
}
