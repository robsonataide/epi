package app.dao;

import app.entity.*;



import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*;



/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ServicoFilialDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ServicoFilialDAO extends JpaRepository<ServicoFilial, java.lang.String> {

  /**
   * Obtém a instância de ServicoFilial utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM ServicoFilial entity WHERE entity.id = :id")
  public ServicoFilial findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de ServicoFilial utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM ServicoFilial entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select sf from ServicoFilial sf")
  public Page<ServicoFilial> list ( Pageable pageable );
  







}