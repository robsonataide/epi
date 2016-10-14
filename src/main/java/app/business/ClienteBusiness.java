package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.*;
import app.entity.*;



/**
 * Classe que representa a camada de negócios de ClienteBusiness
 * 
 * @generated
 **/
@Service("ClienteBusiness")
public class ClienteBusiness {


    /**
     * Instância da classe ClienteDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ClienteDAO")
    protected ClienteDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Cliente post(final Cliente entity) throws Exception {
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
    public Cliente get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Cliente result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Cliente put(final Cliente entity) throws Exception {
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
  public Page<Cliente> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Cliente> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    

  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<EmpresaCliente> findEmpresaCliente(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      Page<EmpresaCliente> result = repository.findEmpresaCliente(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;    
  }



  /**
   * @generated modifiable
   * ManyToMany Relation
   */  
  public Page<Empresa> listEmpresa(java.lang.String id,  Pageable pageable ) {
      // begin-user-code
      // end-user-code  
      Page<Empresa> result = repository.listEmpresa(id,  pageable );
      // begin-user-code
      // end-user-code
      return result;            
  }
  
  /**
   * @generated modifiable
   * ManyToMany Relation
   */    
  public int deleteEmpresa(java.lang.String instanceId, java.lang.String relationId) {
      // begin-user-code
      // end-user-code  
      int result = repository.deleteEmpresa(instanceId, relationId);
      // begin-user-code
      // end-user-code  
      return result;  
  }
}