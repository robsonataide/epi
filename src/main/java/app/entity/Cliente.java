package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela CLIENTE
 * @generated
 */
@Entity
@Table(name = "\"CLIENTE\""


)
@XmlRootElement
public class Cliente implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = -1769724432l;
  
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
  @Column(name = "email", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String email;
  
  /**
   * @generated
   */
  @Column(name = "celular", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String celular;
  
  /**
   * @generated
   */
  @Column(name = "facebookid", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String facebookid;
  
  /**
   * @generated
   */
  @Column(name = "login", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String login;
  
  /**
   * @generated
   */
  @Column(name = "senha", nullable = true, unique = false, insertable=true, updatable=true)
  private java.lang.String senha;
  
  
  /**
   * Construtor
   * @generated
   */
  public Cliente(){
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
  public Cliente setId(java.lang.String id){
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
  public Cliente setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }
  
  /**
   * Obtém email
   * @param email email
   * return email
   * @generated
   */
  public java.lang.String getEmail(){
    return this.email;
  }
  
  /**
   * Define email
   * @param email email
   * @generated
   */
  public Cliente setEmail(java.lang.String email){
    this.email = email;
    return this;
  }
  
  /**
   * Obtém celular
   * @param celular celular
   * return celular
   * @generated
   */
  public java.lang.String getCelular(){
    return this.celular;
  }
  
  /**
   * Define celular
   * @param celular celular
   * @generated
   */
  public Cliente setCelular(java.lang.String celular){
    this.celular = celular;
    return this;
  }
  
  /**
   * Obtém facebookid
   * @param facebookid facebookid
   * return facebookid
   * @generated
   */
  public java.lang.String getFacebookid(){
    return this.facebookid;
  }
  
  /**
   * Define facebookid
   * @param facebookid facebookid
   * @generated
   */
  public Cliente setFacebookid(java.lang.String facebookid){
    this.facebookid = facebookid;
    return this;
  }
  
  /**
   * Obtém login
   * @param login login
   * return login
   * @generated
   */
  public java.lang.String getLogin(){
    return this.login;
  }
  
  /**
   * Define login
   * @param login login
   * @generated
   */
  public Cliente setLogin(java.lang.String login){
    this.login = login;
    return this;
  }
  
  /**
   * Obtém senha
   * @param senha senha
   * return senha
   * @generated
   */
  public java.lang.String getSenha(){
    return this.senha;
  }
  
  /**
   * Define senha
   * @param senha senha
   * @generated
   */
  public Cliente setSenha(java.lang.String senha){
    this.senha = senha;
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
      
      if(!(obj instanceof Cliente))
        return false;
      
      Cliente other = (Cliente)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
