/*function creation for validation in invloves of DOM */
function validate()
{
    var pass=document.getElementById("password");/*passing enter value in password elemt to var declared in javascript*/
    re1= /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d).{8,}$/;/*writing regular expression for that tells should have more than 8 characters,can have alphabets,digits*/ 
    re2=/[!@#$%^&*(),.?":{}|<>]/.test(pass);/* Here testing condition which return whether it has special characters or not*/
    if(re1.test(pass) && re2)/* if condition is used to check whether it satisfies the specified conditions or not   */
    {
       
        alert("enter valid password  should contain \n 1)Minimum 8 characters \n 2)Alphabets must be between [a-z] \n 3)At least one alphabet should be of Upper Case [A-Z].\n 4)At least 1 number or digit between [0-9].\n 5) At least 1 symbol like [ _ or @ or $ ]. ");
        return false;
    }
    else
    {
        alert("valid password");
        return true;
    }
}

