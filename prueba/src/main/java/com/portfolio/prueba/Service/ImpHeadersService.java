
package com.portfolio.prueba.Service;

import com.portfolio.prueba.Entity.Headers;
import com.portfolio.prueba.Interface.IHeadersService;
import com.portfolio.prueba.repository.IHeadersRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHeadersService implements IHeadersService{

    @Autowired IHeadersRepository iheadersrepository;
    
    
    @Override
    public List<Headers> getHeaders() {
        List<Headers> headers = iheadersrepository.findAll();
        return headers;
    }

    @Override
    public void saveHeaders(Headers head) {
        iheadersrepository.save(head);
    }

    @Override
    public void deleteHeaders(Long id) {
        iheadersrepository.deleteById(id);
    }

    @Override
    public Headers findHeaders(Long id) {
        Headers headers = iheadersrepository.findById(id).orElse(null);
        return headers;
    }

    /* @Override
    public Headers borrarHeaders(Long id) {
        Headers e= iheadersrepository.findOne(id);
        if(e != null){
           iheadersrepository.delete(e);
        }
        return e;
    } */
    
    
}
