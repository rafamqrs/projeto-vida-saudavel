package uaiContacts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sabor")
public class Sabor {
	@Id
	@GeneratedValue
	private int idSabor;
	private String descricao;
	
	public Sabor() {
		// TODO Auto-generated constructor stub
	}

	public int getIdSabor() {
		return idSabor;
	}

	public void setIdSabor(int idSabor) {
		this.idSabor = idSabor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
