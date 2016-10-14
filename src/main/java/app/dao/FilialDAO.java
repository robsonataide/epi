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
@Repository("FilialDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface FilialDAO extends JpaRepository<Filial, java.lang.String> {

  /**
   * Obtém a instância de Filial utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Filial entity WHERE entity.id = :id")
  public Filial findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Filial utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Filial entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select f from Filial f")
  public Page<Filial> list ( Pageable pageable );
  

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ServicoFilial entity WHERE entity.filial.id = :id")
  public Page<ServicoFilial> findServicoFilial(@Param(value="id") java.lang.String id,  Pageable pageable );



  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.servico FROM ServicoFilial entity WHERE entity.filial.id = :id")
  public Page<Servico> listServico(@Param(value="id") java.lang.String id,  Pageable pageable);

    /**
     * ManyToOne Relation Delete
     * @generated
     */
    @Modifying
    @Query("DELETE FROM ServicoFilial entity WHERE entity.filial.id = :instanceId AND entity.servico.id = :relationId")
    public int deleteServico(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);




}