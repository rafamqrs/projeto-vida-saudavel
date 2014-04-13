package uaiContacts.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Pedido {
	@Id
	@GeneratedValue
	private int idPedido;
	private Date dataHoraPedido;
	private boolean atendido;
	private String observacoes;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getDataHoraPedido() {
		return dataHoraPedido;
	}

	public void setDataHoraPedido(Date dataHoraPedido) {
		this.dataHoraPedido = dataHoraPedido;
	}

	public boolean isAtendido() {
		return atendido;
	}

	public void setAtendido(boolean atendido) {
		this.atendido = atendido;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
