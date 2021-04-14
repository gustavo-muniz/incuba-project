Nova nota 2

Cart.groovy.grails


package com.market

class Cart {

	Float value;

	static hasMany = [products: Product]

	
	static constraints = {

		value min: 0
		
	}

	static mapping = {

        table 'boleto'
        version false
        id generator: 'sequence', params: [sequence: 'advertencia_id_seq']
        
    }
}
	