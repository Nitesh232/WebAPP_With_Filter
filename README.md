
# WebAPP_With_Filter

This project involves the implementation of the filter concept in a servlet.

# A Little about project:
Here I have created a form with html as registrationform.html which asks the user to enter student's ID, Name, Age, Email, Mobile and click the submit button.  We are creating a Filter ValFilter.java by implementing the Filter interface and by implementing its methods. The given information in form will be validated against the conditions provided in filter ValFilter.java. Filter is mapped in the deployment descriptor file web.xml. RegistrationServlet.java  is a servlet class, which is executed after its associated filter is executed.




## Screenshots

Here is the basic registration form without use of CSS.


![Registration Form](https://raw.githubusercontent.com/Nitesh232/WebAPP_With_Filter/main/images/registrationform.png)




We can see that for input which are not as per coditions it showing error and also explaining the input cases/format to be used while filling the registration form.


![Error validating](https://raw.githubusercontent.com/Nitesh232/WebAPP_With_Filter/main/images/validition_error.png)




Here is an correct input format of registration form.


![Correct Input Format](https://raw.githubusercontent.com/Nitesh232/WebAPP_With_Filter/main/images/correct_Input.png)




Here is an details of student provided via registration form after validating the details using valditation filter.


![Final output](https://raw.githubusercontent.com/Nitesh232/WebAPP_With_Filter/main/images/output.png)





#### Thankyou!!!!
