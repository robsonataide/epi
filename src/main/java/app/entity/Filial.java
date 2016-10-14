package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela FILIAL
 * @generated
 */
@Entity
@Table(name = "\"FILIAL\""


)
@XmlRootElement
public class Filial implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 2104333773l;
  
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
  @Column(name = "endereco", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String endereco;
  
  /**
   * @generated
   */
  @Column(name = "bairro", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String bairro;
  
  /**
   * @generated
   */
  @Column(name = "cidade", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String cidade;
  
  /**
   * @generated
   */
  @Column(name = "cep", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String cep;
  
  /**
   * @generated
   */
  @Column(name = "sede", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Boolean sede = true;
  
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
  public Filial(){
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
  public Filial setId(java.lang.String id){
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
  public Filial setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém endereco
   * @param endereco endereco
   * return endereco
   * @generated
   */
  public java.lang.String getEndereco(){
    return this.endereco;
  }
  
  /**
   * Define endereco
   * @param endereco endereco
   * @generated
   */
  public Filial setEndereco(java.lang.String endereco){
    this.endereco = endereco;
    return this;
  }
  
  /**
   * Obtém bairro
   * @param bairro bairro
   * return bairro
   * @generated
   */
  public java.lang.String getBairro(){
    return this.bairro;
  }
  
  /**
   * Define bairro
   * @param bairro bairro
   * @generated
   */
  public Filial setBairro(java.lang.String bairro){
    this.bairro = bairro;
    return this;
  }
  
  /**
   * Obtém cidade
   * @param cidade cidade
   * return cidade
   * @generated
   */
  public java.lang.String getCidade(){
    return this.cidade;
  }
  
  /**
   * Define cidade
   * @param cidade cidade
   * @generated
   */
  public Filial setCidade(java.lang.String cidade){
    this.cidade = cidade;
    return this;
  }
  
  /**
   * Obtém cep
   * @param cep cep
   * return cep
   * @generated
   */
  public java.lang.String getCep(){
    return this.cep;
  }
  
  /**
   * Define cep
   * @param cep cep
   * @generated
   */
  public Filial setCep(java.lang.String cep){
    this.cep = cep;
    return this;
  }
  
  /**
   * Obtém sede
   * @param sede sede
   * return sede
   * @generated
   */
  public java.lang.Boolean getSede(){
    return this.sede;
  }
  
  /**
   * Define sede
   * @param sede sede
   * @generated
   */
  public Filial setSede(java.lang.Boolean sede){
    this.sede = sede;
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
  public Filial setEmpresa(Empresa empresa){
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
      
      if(!(obj instanceof Filial))
        return false;
      
      Filial other = (Filial)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
