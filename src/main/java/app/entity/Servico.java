package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;



/**
 * Classe que representa a tabela SERVICO
 * @generated
 */
@Entity
@Table(name = "\"SERVICO\""


)
@XmlRootElement
public class Servico implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -646158679l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  @Column(name = "nome", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String nome;
  
  /**
   * @generated
   */
  @Column(name = "preco", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Double preco;
  
  /**
   * @generated
   */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "tempoMedio", nullable = false, unique = false, insertable=true, updatable=true)
  private Date tempoMedio;
  
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_empresa", referencedColumnName = "id", insertable=true, updatable=true)
  private Empresa empresa;
  
  
  /**
   * Construtor
   * @generated
   */
  public Servico(){
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
  public Servico setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém nome
   * @param nome nome
   * return nome
   * @generated
   */
  public java.lang.String getNome(){
    return this.nome;
  }
  
  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Servico setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém preco
   * @param preco preco
   * return preco
   * @generated
   */
  public java.lang.Double getPreco(){
    return this.preco;
  }
  
  /**
   * Define preco
   * @param preco preco
   * @generated
   */
  public Servico setPreco(java.lang.Double preco){
    this.preco = preco;
    return this;
  }
  
  /**
   * Obtém tempoMedio
   * @param tempoMedio tempoMedio
   * return tempoMedio
   * @generated
   */
  public Date getTempoMedio(){
    return this.tempoMedio;
  }
  
  /**
   * Define tempoMedio
   * @param tempoMedio tempoMedio
   * @generated
   */
  public Servico setTempoMedio(Date tempoMedio){
    this.tempoMedio = tempoMedio;
    return this;
  }
  
  /**
   * Obtém empresa
   * @param empresa empresa
   * return empresa
   * @generated
   */
  public Empresa getEmpresa(){
    return this.empresa;
  }
  
  /**
   * Define empresa
   * @param empresa empresa
   * @generated
   */
  public Servico setEmpresa(Empresa empresa){
    this.empresa = empresa;
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
      
      if(!(obj instanceof Servico))
        return false;
      
      Servico other = (Servico)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
