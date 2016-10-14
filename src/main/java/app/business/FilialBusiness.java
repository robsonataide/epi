package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.*;
import app.entity.*;



/**
 * Classe que representa a camada de negócios de FilialBusiness
 * 
 * @generated
 **/
@Service("FilialBusiness")
public class FilialBusiness {


    /**
     * Instância da classe FilialDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("FilialDAO")
    protected FilialDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Filial post(final Filial entity) throws Exception {
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
    public Filial get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Filial result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Filial put(final Filial entity) throws Exception {
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
  public Page<Filial> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Filial> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<ServicoFilial> findServicoFilial(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      Page<ServicoFilial> result = repository.findServicoFilial(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;    
  }



  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Servico> listServico(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      Page<Servico> result = repository.listServico(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteServico(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteServico(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}