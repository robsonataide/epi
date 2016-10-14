package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.*;
import app.entity.*;



/**
 * Classe que representa a camada de negócios de ServicoFilialBusiness
 * 
 * @generated
 **/
@Service("ServicoFilialBusiness")
public class ServicoFilialBusiness {


    /**
     * Instância da classe ServicoFilialDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ServicoFilialDAO")
    protected ServicoFilialDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public ServicoFilial post(final ServicoFilial entity) throws Exception {
      // begin-user-code  
      // end-user-code  
        repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public ServicoFilial get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       ServicoFilial result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public ServicoFilial put(final ServicoFilial entity) throws Exception {
      // begin-user-code  
      // end-user-code
        repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<ServicoFilial> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<ServicoFilial> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    



}