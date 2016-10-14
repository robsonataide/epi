package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;

import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;

import java.util.*;

import app.entity.*;
import app.business.*;



/**
 * Controller para expor serviços REST de Cliente
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Cliente")
public class ClienteREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("ClienteBusiness")
    private ClienteBusiness clienteBusiness;

    /**
     * @generated
     */
      @Autowired
      @Qualifier("EmpresaBusiness")
      private EmpresaBusiness empresaBusiness;
    /**
     * @generated
     */
      @Autowired
      @Qualifier("EmpresaClienteBusiness")
      private EmpresaClienteBusiness empresaClienteBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Cliente post(@Validated @RequestBody final Cliente entity) throws Exception {
        return clienteBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Cliente put(@Validated @RequestBody final Cliente entity) throws Exception {
        return clienteBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Cliente put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Cliente entity) throws Exception {
        return clienteBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        clienteBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Cliente>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(clienteBusiness.list(pageable   )), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/EmpresaCliente")    
  public HttpEntity<PagedResources<EmpresaCliente>> findEmpresaCliente(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.findEmpresaCliente(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/EmpresaCliente/{relationId}")    
  public void deleteEmpresaCliente(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.empresaClienteBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/EmpresaCliente/{relationId}")
  public EmpresaCliente putEmpresaCliente(@Validated @RequestBody final EmpresaCliente entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
	return this.empresaClienteBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/EmpresaCliente")
  public EmpresaCliente postEmpresaCliente(@Validated @RequestBody final EmpresaCliente entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
	Cliente cliente = this.clienteBusiness.get(instanceId);
	entity.setCliente(cliente);
	return this.empresaClienteBusiness.post(entity);
  }   


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Empresa")
  public HttpEntity<PagedResources<Empresa>> listEmpresa(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(clienteBusiness.listEmpresa(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Empresa")
  public Cliente postEmpresa(@Validated @RequestBody final Empresa entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      EmpresaCliente newEmpresaCliente = new EmpresaCliente();

      Cliente instance = this.clienteBusiness.get(instanceId);

      newEmpresaCliente.setEmpresa(entity);
      newEmpresaCliente.setCliente(instance);
      
      this.empresaClienteBusiness.post(newEmpresaCliente);

      return newEmpresaCliente.getCliente();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Empresa/{relationId}")
  public void deleteEmpresa(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
	  this.clienteBusiness.deleteEmpresa(instanceId, relationId);
  }  



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Cliente get(@PathVariable("id") java.lang.String id) throws Exception {
        return clienteBusiness.get(id);
    }
}
