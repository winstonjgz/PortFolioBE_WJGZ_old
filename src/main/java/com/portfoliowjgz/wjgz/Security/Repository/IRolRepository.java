
package com.portfoliowjgz.wjgz.Security.Repository;

import com.portfoliowjgz.wjgz.Security.Entity.Rol;
import com.portfoliowjgz.wjgz.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
   Optional<Rol> findByRolNombre(RolNombre rolnombre); 
    
}
