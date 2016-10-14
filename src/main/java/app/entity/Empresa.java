package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela EMPRESA
 * @generated
 */
@Entity
@Table(name = "\"EMPRESA\""


)
@XmlRootElement
public class Empresa implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 40755289l;
  
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
  @Column(name = "theme", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String theme;
  
  
  /**
   * Construtor
   * @generated
   */
  public Empresa(){
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
  public Empresa setId(java.lang.String id){
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
  public Empresa setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém theme
   * @param theme theme
   * return theme
   * @generated
   */
  public java.lang.String getTheme(){
    return this.theme;
  }
  
  /**
   * Define theme
   * @param theme theme
   * @generated
   */
  public Empresa setTheme(java.lang.String theme){
    this.theme = theme;
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
      
      if(!(obj instanceof Empresa))
        return false;
      
      Empresa other = (Empresa)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
