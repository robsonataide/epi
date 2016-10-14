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
 * Controller para expor serviços REST de Empresa
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Empresa")
public class EmpresaREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("EmpresaBusiness")
    private EmpresaBusiness empresaBusiness;

    /**
     * @generated
     */
      @Autowired
      @Qualifier("ClienteBusiness")
      private ClienteBusiness clienteBusiness;
    /**
     * @generated
     */
      @Autowired
      @Qualifier("UserBusiness")
      private UserBusiness userBusiness;
    /**
     * @generated
     */
      @Autowired
      @Qualifier("ServicoBusiness")
      private ServicoBusiness servicoBusiness;
    /**
     * @generated
     */
      @Autowired
      @Qualifier("FilialBusiness")
      private FilialBusiness filialBusiness;
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
    public Empresa post(@Validated @RequestBody final Empresa entity) throws Exception {
        return empresaBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Empresa put(@Validated @RequestBody final Empresa entity) throws Exception {
        return empresaBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Empresa put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Empresa entity) throws Exception {
        return empresaBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        empresaBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Empresa>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(empresaBusiness.list(pageable   )), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/User")    
  public HttpEntity<PagedResources<User>> findUser(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.findUser(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/User/{relationId}")    
  public void deleteUser(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.userBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/User/{relationId}")
  public User putUser(@Validated @RequestBody final User entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
	return this.userBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/User")
  public User postUser(@Validated @RequestBody final User entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
	Empresa empresa = this.empresaBusiness.get(instanceId);
	entity.setEmpresa(empresa);
	return this.userBusiness.post(entity);
  }   

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Servico")    
  public HttpEntity<PagedResources<Servico>> findServico(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.findServico(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Servico/{relationId}")    
  public void deleteServico(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.servicoBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/Servico/{relationId}")
  public Servico putServico(@Validated @RequestBody final Servico entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
	return this.servicoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/Servico")
  public Servico postServico(@Validated @RequestBody final Servico entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
	Empresa empresa = this.empresaBusiness.get(instanceId);
	entity.setEmpresa(empresa);
	return this.servicoBusiness.post(entity);
  }   

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Filial")    
  public HttpEntity<PagedResources<Filial>> findFilial(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.findFilial(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Filial/{relationId}")    
  public void deleteFilial(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.filialBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/Filial/{relationId}")
  public Filial putFilial(@Validated @RequestBody final Filial entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
	return this.filialBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/Filial")
  public Filial postFilial(@Validated @RequestBody final Filial entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
	Empresa empresa = this.empresaBusiness.get(instanceId);
	entity.setEmpresa(empresa);
	return this.filialBusiness.post(entity);
  }   

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/EmpresaCliente")    
  public HttpEntity<PagedResources<EmpresaCliente>> findEmpresaCliente(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.findEmpresaCliente(instanceId,  pageable )), HttpStatus.OK);
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
	Empresa empresa = this.empresaBusiness.get(instanceId);
	entity.setEmpresa(empresa);
	return this.empresaClienteBusiness.post(entity);
  }   


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Cliente")
  public HttpEntity<PagedResources<Cliente>> listCliente(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(empresaBusiness.listCliente(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Cliente")
  public Empresa postCliente(@Validated @RequestBody final Cliente entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      EmpresaCliente newEmpresaCliente = new EmpresaCliente();

      Empresa instance = this.empresaBusiness.get(instanceId);

      newEmpresaCliente.setCliente(entity);
      newEmpresaCliente.setEmpresa(instance);
      
      this.empresaClienteBusiness.post(newEmpresaCliente);

      return newEmpresaCliente.getEmpresa();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Cliente/{relationId}")
  public void deleteCliente(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
	  this.empresaBusiness.deleteCliente(instanceId, relationId);
  }  



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Empresa get(@PathVariable("id") java.lang.String id) throws Exception {
        return empresaBusiness.get(id);
    }
}
