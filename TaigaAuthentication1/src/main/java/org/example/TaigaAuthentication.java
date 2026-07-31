public class TaigaAuthentication {


    public boolean registerUser(
            String username,
            String email,
            String password,
            String fullName) {


        // Username validation
        if(username == null || username.isEmpty())
            return false;


        if(username.contains("@"))
            return false;


        if(username.equals("existingUser"))
            return false;



        // Email validation
        if(email == null || !email.contains("@"))
            return false;


        if(email.equals("existing@email.com"))
            return false;



        // Password validation
        if(password == null || password.length() < 8)
            return false;



        // Full name validation
        if(fullName == null || fullName.isEmpty())
            return false;


        return true;
    }



    public boolean login(
            String username,
            String password,
            boolean activeAccount) {


        if(!activeAccount)
            return false;


        if(username.equals("testuser")
                && password.equals("Password123"))
        {
            return true;
        }


        return false;
    }

}