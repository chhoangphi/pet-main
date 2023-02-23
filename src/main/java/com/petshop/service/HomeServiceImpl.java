package com.petshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petshop.entity.Products;
import com.petshop.dao.ProductsDao;
@Service
public class HomeServiceImpl implements IHomeService{
    @Autowired
    private ProductsDao productsDao;
	public List<Products> GetDataProduct() {
		// TODO Auto-generated method stub
		return productsDao.GetDataProduct();
	}

}
