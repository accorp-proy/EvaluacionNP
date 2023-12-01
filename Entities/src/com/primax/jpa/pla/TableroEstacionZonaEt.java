package com.primax.jpa.pla;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.primax.enm.gen.ActionAuditedEnum;
import com.primax.jpa.base.EntityBase;
import com.primax.jpa.sec.UsuarioEt;

@Entity
@Table(name = "TABLERO_ESTACION_ZONA_ET")
public class TableroEstacionZonaEt extends EntityBase implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "sec_tablero_estacion_zona_et", sequenceName = "seq_tablero_estacion_zona_et", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "sec_tablero_estacion_zona_et", strategy = GenerationType.SEQUENCE)
	@Column(name = "id_tablero_estacion_zona")
	private Long idTableroEstacionZona;

	@Column(name = "id_zona")
	private Long idZona;

	@Column(name = "zona", length = 50)
	private String zona;

	@Column(name = "nivel_01")
	private Long nivel01;

	@Column(name = "nivel_02")
	private Long nivel02;

	@Column(name = "nivel_03")
	private Long nivel03;

	@Column(name = "nivel_04")
	private Long nivel04;

	@Column(name = "nivel_05")
	private Long nivel05;

	@Column(name = "nivel_06")
	private Long nivel06;

	@Column(name = "nivel_07")
	private Long nivel07;

	@Column(name = "nivel_08")
	private Long nivel08;

	@Column(name = "nivel_09")
	private Long nivel09;

	@Column(name = "nivel_10")
	private Long nivel10;

	@Transient
	private Long total;

	public TableroEstacionZonaEt() {
		this.total = 0L;
		this.nivel01 = 0L;
		this.nivel02 = 0L;
		this.nivel03 = 0L;
		this.nivel04 = 0L;
		this.nivel05 = 0L;
		this.nivel06 = 0L;
		this.nivel07 = 0L;
		this.nivel08 = 0L;
		this.nivel09 = 0L;
		this.nivel10 = 0L;
	}

	public Long getIdTableroEstacionZona() {
		return idTableroEstacionZona;
	}

	public void setIdTableroEstacionZona(Long idTableroEstacionZona) {
		this.idTableroEstacionZona = idTableroEstacionZona;
	}

	public Long getIdZona() {
		return idZona;
	}

	public void setIdZona(Long idZona) {
		this.idZona = idZona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public Long getNivel01() {
		return nivel01;
	}

	public void setNivel01(Long nivel01) {
		this.nivel01 = nivel01;
	}

	public Long getNivel02() {
		return nivel02;
	}

	public void setNivel02(Long nivel02) {
		this.nivel02 = nivel02;
	}

	public Long getNivel03() {
		return nivel03;
	}

	public void setNivel03(Long nivel03) {
		this.nivel03 = nivel03;
	}

	public Long getNivel04() {
		return nivel04;
	}

	public void setNivel04(Long nivel04) {
		this.nivel04 = nivel04;
	}

	public Long getNivel05() {
		return nivel05;
	}

	public void setNivel05(Long nivel05) {
		this.nivel05 = nivel05;
	}

	public Long getNivel06() {
		return nivel06;
	}

	public void setNivel06(Long nivel06) {
		this.nivel06 = nivel06;
	}

	public Long getNivel07() {
		return nivel07;
	}

	public void setNivel07(Long nivel07) {
		this.nivel07 = nivel07;
	}

	public Long getNivel08() {
		return nivel08;
	}

	public void setNivel08(Long nivel08) {
		this.nivel08 = nivel08;
	}

	public Long getNivel09() {
		return nivel09;
	}

	public void setNivel09(Long nivel09) {
		this.nivel09 = nivel09;
	}

	public Long getNivel10() {
		return nivel10;
	}

	public void setNivel10(Long nivel10) {
		this.nivel10 = nivel10;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getTotal() {
		total = nivel01 + nivel02 + nivel03 + nivel04 + nivel05 + nivel06;
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@Override
	public <T> void audit(UsuarioEt user, ActionAuditedEnum act) {
		super.audit(user, act);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof TableroEstacionZonaEt) {

			TableroEstacionZonaEt other = (TableroEstacionZonaEt) obj;
			if (this.idTableroEstacionZona == null)
				return this == other;

			return this.idTableroEstacionZona.equals(other.idTableroEstacionZona);
		}
		return false;
	}

}
