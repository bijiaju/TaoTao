package com.taotao.rest.service;

import com.taotao.common.pojo.TaotaoResult;
/**
 * 里面有三个基本的业务
 * 1.取商品基本信息
 * 2.取商品的描述信息
 * 3.取商品的规格参数
 * @author bee
 *
 */
public interface ItemService {

	TaotaoResult getItemBaseInfo(long itemId);
	TaotaoResult getItemDesc(long itemId);
	TaotaoResult getItemParam(long itemId);
}
