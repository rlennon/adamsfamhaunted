

/*
    Title: Client Side Validation
    Des: Prevent the user from entering the wrong information. 
    Date: 03/11/21
    Username: l00139962
*/
module.exports = {
    
    //Check the user Email is valid
    checkUserInputEmail : userInput => {
        
    
        //check for emepty
        if(checkValueEmpty(userInput))
            return "User Input Empty"; //return error message 

    
        
        //valid and contains a value   
        return true;


    },

    //Check for vaild password
    checkPasswordVal: userInput =>{
        
        //check for emepty
            if(checkValueEmpty(userInput))
            return "Password Field Empty"; //return error message 
            
            //create a regular expression object (Aplha Numeric)
            let vaildPasswordPattern = new RegExp('[a-zA-Z0-9]');

            //check if the lenght is greater than 10 char
            if(userInput.length < 10)
                return "Password Must be greater than 10 chars";
            
            
            //check if value matches regex
            if(!vaildPasswordPattern.test(userInput))
                return "Not a valid Password";

        
        //valid and contains a value   
        return true;
    
    
    }
    ,
    //Checks if the value entered is empty or null
     checkValueEmpty : userInput => {

        //if the input is null or empty string
        if(userInput == "" || userInput == null)
            return true;

        //the input has value
        return false;
    }
}


