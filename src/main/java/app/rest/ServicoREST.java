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
 * Controller para expor serviços REST de Servico
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Servico")
public class ServicoREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
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
      @Qualifier("ServicoFilialBusiness")
      private ServicoFilialBusiness servicoFilialBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Servico post(@Validated @RequestBody final Servico entity) throws Exception {
        return servicoBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Servico put(@Validated @RequestBody final Servico entity) throws Exception {
        return servicoBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Servico put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Servico entity) throws Exception {
        return servicoBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        servicoBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Servico>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(servicoBusiness.list(pageable   )), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/ServicoFilial")    
  public HttpEntity<PagedResources<ServicoFilial>> findServicoFilial(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(servicoBusiness.findServicoFilial(instanceId,  pageable )), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/ServicoFilial/{relationId}")    
  public void deleteServicoFilial(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.servicoFilialBusiness.delete(relationId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/ServicoFilial/{relationId}")
  public ServicoFilial putServicoFilial(@Validated @RequestBody final ServicoFilial entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
	return this.servicoFilialBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/ServicoFilial")
  public ServicoFilial postServicoFilial(@Validated @RequestBody final ServicoFilial entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
	Servico servico = this.servicoBusiness.get(instanceId);
	entity.setServico(servico);
	return this.servicoFilialBusiness.post(entity);
  }   


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Filial")
  public HttpEntity<PagedResources<Filial>> listFilial(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(servicoBusiness.listFilial(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Filial")
  public Servico postFilial(@Validated @RequestBody final Filial entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      ServicoFilial newServicoFilial = new ServicoFilial();

      Servico instance = this.servicoBusiness.get(instanceId);

      newServicoFilial.setFilial(entity);
      newServicoFilial.setServico(instance);
      
      this.servicoFilialBusiness.post(newServicoFilial);

      return newServicoFilial.getServico();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Filial/{relationId}")
  public void deleteFilial(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
	  this.servicoBusiness.deleteFilial(instanceId, relationId);
  }  



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Servico get(@PathVariable("id") java.lang.String id) throws Exception {
        return servicoBusiness.get(id);
    }
}
