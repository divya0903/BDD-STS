Feature: Test Online Shop Services

Scenario: User wants to test services of Online Shop

			When User give call to '/sayHello' Service
			Then User should receive service status 'Ok' And response message 'Hello World From RestFulWebService'
			
			When User submits valid product information
			Then Products details should be added succesfully
			
			When User wants to know the details of all the products
			Then All the product details should be displayed 
			
		  When User wants to know the details of a product
			Then Product details should be displayed 