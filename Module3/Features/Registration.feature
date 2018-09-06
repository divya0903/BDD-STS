Feature: Educational Registration

  Scenario: user is trying to register without entering credentials
    Given user is on personal details registration page
    Then personal details registration page should load with tile 'Personal Details Registration'
    
    When user will click on next without entering First Name
    Then 'Please fill the First Name' message be should displayed
    
    When user will click on next without entering Last Name
    Then 'Please fill the Last Name' message should be displayed
    
    When user will click on next without entering Email
    Then 'Please fill the Email' message should be displayed
    
    When user will click on next without entering Contact no.
    Then 'Please fill the Contact No.' message should be displayed
    
    When user will click on next withot entering valid Contact no. 
    Then 'Please enter valid Contact no.' message should be displayed
    
    When user will click on next without entering line 1 & line 2 in address
    Then 'Please fill the Line1 and Line2 in Address' message should be displayed
    
    When user will click on next without selcting City
    Then 'Please select city' message should be displayed
    
    When user will click on next without selecting State
    Then 'Please select state' message should be displayed
    
    When user will click on next by entering all valid details 
    Then 'Personal details are validated.' message should be displayed
    And  navigates to the educational details page
   
    When user is on educational details page
    Then educational details registration page should load with tile 'Educational Details'
    
    When user clicks on register without selecting graduation
    Then 'Please select graduation' message should be displayed
    
    When user clicks on register without entering percentage
    Then 'Please enter percentage' message should be displayed
    
    When user clicks on register without entering passing year
    Then 'Please enter passing year' message should be displayed
    
    When user clicks on register without entering project name
    Then 'Please enter project name' message should be displayed
    
    When user clicks on register without selecting technology used
    Then 'Please select technologies used' message should be displayed
    
     When user selects others in technologies used and does not enter other technology
    Then 'Please fill other technology' message should be displayed
    
    When user clicks on register with valid details
    Then 'Your registration is successfully done!!!' message should be displayed
 
    
    
    