package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela SERVICOFILIAL
 * @generated
 */
@Entity
@Table(name = "\"SERVICOFILIAL\""


)
@XmlRootElement
public class ServicoFilial implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1364573958l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_servico", referencedColumnName = "id", insertable=true, updatable=true)
  private Servico servico;
  
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_filial", referencedColumnName = "id", insertable=true, updatable=true)
  private Filial filial;
  
  /**
   * @generated
   */
  @Column(name = "capacidade", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.Integer capacidade;
  
  
  /**
   * Construtor
   * @generated
   */
  public ServicoFilial(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public ServicoFilial setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém servico
   * @param servico servico
   * return servico
   * @generated
   */
  public Servico getServico(){
    return this.servico;
  }
  
  /**
   * Define servico
   * @param servico servico
   * @generated
   */
  public ServicoFilial setServico(Servico servico){
    this.servico = servico;
    return this;
  }
  
  /**
   * Obtém filial
   * @param filial filial
   * return filial
   * @generated
   */
  public Filial getFilial(){
    return this.filial;
  }
  
  /**
   * Define filial
   * @param filial filial
   * @generated
   */
  public ServicoFilial setFilial(Filial filial){
    this.filial = filial;
    return this;
  }
  
  /**
   * Obtém capacidade
   * @param capacidade capacidade
   * return capacidade
   * @generated
   */
  public java.lang.Integer getCapacidade(){
    return this.capacidade;
  }
  
  /**
   * Define capacidade
   * @param capacidade capacidade
   * @generated
   */
  public ServicoFilial setCapacidade(java.lang.Integer capacidade){
    this.capacidade = capacidade;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof ServicoFilial))
        return false;
      
      ServicoFilial other = (ServicoFilial)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
