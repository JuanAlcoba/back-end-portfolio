
package com.portfolio.prueba.Interface;

import com.portfolio.prueba.Entity.Headers;
import java.util.List;


public interface IHeadersService {
    
    public List<Headers> getHeaders();
    
    
    public void saveHeaders (Headers head);
    
    
    public void deleteHeaders (Long id);
    
   // public Headers borrarHeaders (Long id);
    
    public Headers findHeaders (Long id);
    
}
