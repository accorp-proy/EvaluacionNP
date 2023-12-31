package com.primax.srv.idao;

import java.util.List;

import com.primax.exc.gen.EntidadNoEncontradaException;
import com.primax.jpa.pla.TableroInventarioDetalleEt;
import com.primax.jpa.sec.UsuarioEt;
import com.primax.srv.dao.base.IGenericDao;

public interface ITableroInventarioDetalleDao extends IGenericDao<TableroInventarioDetalleEt, Long> {

	public void remove();

	public String limpiarTablero(Long idUsuario);

	public List<TableroInventarioDetalleEt> getTablaList(UsuarioEt usuario) throws EntidadNoEncontradaException;

}
