package br.com.fdp.pedidos.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {
	@Id
	@GeneratedValue
	private Long id;
	@Column(length = 80, nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Short quantity;
	
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal value;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String descricao, Short quantidade, BigDecimal valor) {
		super();
		this.description = descricao;
		this.quantity = quantidade;
		this.value = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result
				+ ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", description=" + description
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	
	

}
