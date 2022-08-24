
package com.portfoliowjgz.wjgz.Security.Service;

import com.portfoliowjgz.wjgz.Security.Entity.Usuario;
import com.portfoliowjgz.wjgz.Security.Repository.IUsuarioRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class UsuarioService {
    
     @Autowired
     IUsuarioRepository iusuarioRepository;
     
     public Optional<Usuario> getByUsuario(String nombreUsuario){
         return iusuarioRepository.findByNombreUsuario(nombreUsuario);
     }
     
     public boolean existsByNombreUsuario(String nombreUsuario){
         return iusuarioRepository.existByNombreUsuario(nombreUsuario);
         
     }
   
     public boolean existsByEmail(String email){
         return iusuarioRepository.existByEmail(email);
         
     }
     
     public void save(Usuario usuario){
         iusuarioRepository.save(usuario);
         
     }
}

