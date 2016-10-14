package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;




/**
 * Classe que representa a tabela EMPRESACLIENTE
 * @generated
 */
@Entity
@Table(name = "\"EMPRESACLIENTE\""


)
@XmlRootElement
public class EmpresaCliente implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 145667354l;
  
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
  @JoinColumn(name="fk_empresa", referencedColumnName = "id", insertable=true, updatable=true)
  private Empresa empresa;
  
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_cliente", referencedColumnName = "id", insertable=true, updatable=true)
  private Cliente cliente;
  
  
  /**
   * Construtor
   * @generated
   */
  public EmpresaCliente(){
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
  public EmpresaCliente setId(java.lang.String id){
    this.id = id;
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
  public EmpresaCliente setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }
  
  /**
   * Obtém cliente
   * @param cliente cliente
   * return cliente
   * @generated
   */
  public Cliente getCliente(){
    return this.cliente;
  }
  
  /**
   * Define cliente
   * @param cliente cliente
   * @generated
   */
  public EmpresaCliente setCliente(Cliente cliente){
    this.cliente = cliente;
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
      
      if(!(obj instanceof EmpresaCliente))
        return false;
      
      EmpresaCliente other = (EmpresaCliente)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}
