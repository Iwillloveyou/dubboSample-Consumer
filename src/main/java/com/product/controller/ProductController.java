package com.product.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.api.ProductApi;

@RestController
@RequestMapping("/product")
public class ProductController {

	private static Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	//@Autowired 
	//@Qualifier("productApi")
	@Resource
	private ProductApi productApi;
	
	@RequestMapping(path = "/getProduct/{proId}", method = RequestMethod.POST)
    public void getProduct(@PathVariable("proId") Integer proId, Model model){
        logger.info("get students...");
        //ProductApi productApi = 
        logger.info("the data are " + productApi.getProducts());
    }

}
