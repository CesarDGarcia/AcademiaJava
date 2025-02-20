package com.proyecto.Final;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.proyecto.Final.bo.Libreria;



public class LibreriaItemProcessor implements ItemProcessor<Libreria, Libreria> {

    private Logger LOGGER = LoggerFactory.getLogger(LibreriaItemProcessor.class);

    public Libreria process(final Libreria product) throws Exception {
        String price = "$" + product.getPrecio();
        
        Libreria transformedProduct = new Libreria(
        		product.getProductoId(), 
        		product.getNombre(), 
        		price);
        
        LOGGER.info("Converting ( {} ) into ( {} )", product, transformedProduct);
        return transformedProduct;
    }
}