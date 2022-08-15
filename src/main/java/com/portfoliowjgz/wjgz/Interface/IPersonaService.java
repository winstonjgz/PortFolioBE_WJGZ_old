
package com.portfoliowjgz.wjgz.Interface;

import com.portfoliowjgz.wjgz.Entity.Persona;
import java.util.List;

/**
 *
 * @author wgsig
 */
public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
    
    
    
}
