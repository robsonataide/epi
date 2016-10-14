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
 * Controller para expor serviços REST de EmpresaCliente
 * 
 * @author Usuário de Teste
 * @version 1.0
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/EmpresaCliente")
public class EmpresaClienteREST {

    /**
     * Classe de negócio para manipulação de dados
     * 
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
    public EmpresaCliente post(@Validated @RequestBody final EmpresaCliente entity) throws Exception {
        return empresaClienteBusiness.post(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT)
    public EmpresaCliente put(@Validated @RequestBody final EmpresaCliente entity) throws Exception {
        return empresaClienteBusiness.put(entity);
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public EmpresaCliente put(@PathVariable("id") final java.lang.String id, @Validated @RequestBody final EmpresaCliente entity) throws Exception {
        return empresaClienteBusiness.put(entity);
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable("id") java.lang.String id) throws Exception {
        empresaClienteBusiness.delete(id);
    }


  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )    
  public  HttpEntity<PagedResources<EmpresaCliente>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
      return new ResponseEntity<>(assembler.toResource(empresaClienteBusiness.list(pageable   )), HttpStatus.OK);    
  }



    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public EmpresaCliente get(@PathVariable("id") java.lang.String id) throws Exception {
        return empresaClienteBusiness.get(id);
    }
}
