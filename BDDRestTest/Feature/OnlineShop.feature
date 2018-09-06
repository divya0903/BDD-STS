Feature: Test Online Shop Services

Scenario: User wants to test services of Online Shop

			When User give call to '/sayHello' Service
			Then User should receive service status 'Ok'
			And response message 'Hello World From RestFulWebService'