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
 * Controller para expor serviços REST de Filial
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Filial")
public class FilialREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("FilialBusiness")
    private FilialBusiness filialBusiness;

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
      @Qualifier("ServicoFilialBusiness")
      private ServicoFilialBusiness servicoFilialBusiness;

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.POST)
    public Filial post(@Validated @RequestBody final Filial entity) throws Exception {
        return filialBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Filial put(@Validated @RequestBody final Filial entity) throws Exception {
        return filialBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Filial put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final Filial entity) throws Exception {
        return filialBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        filialBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<Filial>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(filialBusiness.list(pageable   )), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/ServicoFilial")    
  public HttpEntity<PagedResources<ServicoFilial>> findServicoFilial(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(filialBusiness.findServicoFilial(instanceId,  pageable )), HttpStatus.OK);
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
	Filial filial = this.filialBusiness.get(instanceId);
	entity.setFilial(filial);
	return this.servicoFilialBusiness.post(entity);
  }   


  /**
   * ManyToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  ,value="/{instanceId}/Servico")
  public HttpEntity<PagedResources<Servico>> listServico(@PathVariable("instanceId") java.lang.String instanceId,  Pageable pageable, PagedResourcesAssembler assembler ) {
    return new ResponseEntity<>(assembler.toResource(filialBusiness.listServico(instanceId,  pageable )), HttpStatus.OK); 
  }

  /**
   * ManyToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST
  ,value="/{instanceId}/Servico")
  public Filial postServico(@Validated @RequestBody final Servico entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
      ServicoFilial newServicoFilial = new ServicoFilial();

      Filial instance = this.filialBusiness.get(instanceId);

      newServicoFilial.setServico(entity);
      newServicoFilial.setFilial(instance);
      
      this.servicoFilialBusiness.post(newServicoFilial);

      return newServicoFilial.getFilial();
  }   

  /**
   * ManyToMany Relationship DELETE
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE
  ,value="/{instanceId}/Servico/{relationId}")
  public void deleteServico(@PathVariable("instanceId") java.lang.String instanceId, @PathVariable("relationId") java.lang.String relationId) {
	  this.filialBusiness.deleteServico(instanceId, relationId);
  }  



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Filial get(@PathVariable("id") java.lang.String id) throws Exception {
        return filialBusiness.get(id);
    }
}
