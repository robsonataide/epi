package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.*;
import app.entity.*;



/**
 * Classe que representa a camada de negócios de EmpresaClienteBusiness
 * 
 * @generated
 **/
@Service("EmpresaClienteBusiness")
public class EmpresaClienteBusiness {


    /**
     * Instância da classe EmpresaClienteDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("EmpresaClienteDAO")
    protected EmpresaClienteDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public EmpresaCliente post(final EmpresaCliente entity) throws Exception {
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
    public EmpresaCliente get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       EmpresaCliente result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public EmpresaCliente put(final EmpresaCliente entity) throws Exception {
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
  public Page<EmpresaCliente> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<EmpresaCliente> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
    



}