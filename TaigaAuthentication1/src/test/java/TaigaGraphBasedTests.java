import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TaigaGraphBasedTests {


    TaigaAuthentication taiga =
            new TaigaAuthentication();



    // GB-01
    // Valid Registration
    @Test
     void GB01_validRegistration(){


        assertTrue(
                taiga.registerUser(
                        "newUser",
                        "new@email.com",
                        "Password123",
                        "New User"
                )
        );
    }




    // GB-02
    // Invalid Username
    @Test
    void GB02_invalidUsername(){


        assertFalse(
                taiga.registerUser(
                        "user@123",
                        "user@email.com",
                        "Password123",
                        "Test User"
                )
        );
    }





    // GB-03
    // Duplicate Email
    @Test
    void GB03_duplicateEmail(){


        assertFalse(
                taiga.registerUser(
                        "newUser",
                        "existing@email.com",
                        "Password123",
                        "Test User"
                )
        );
    }





    // GB-04
    // Password Policy Failure
    @Test
    void GB04_passwordFailure(){


        assertFalse(
                taiga.registerUser(
                        "newUser",
                        "user@email.com",
                        "123",
                        "Test User"
                )
        );
    }





    // GB-05
    // Valid Login
    @Test
    void GB05_validLogin(){


        assertTrue(
                taiga.login(
                        "testuser",
                        "Password123",
                        true
                )
        );
    }





    // GB-06
    // Inactive Account
    @Test
    void GB06_inactiveAccount(){


        assertFalse(
                taiga.login(
                        "testuser",
                        "Password123",
                        false
                )
        );
    }





    // GB-07
    // Wrong Password
    @Test
    void GB07_wrongPassword(){


        assertFalse(
                taiga.login(
                        "testuser",
                        "WrongPassword",
                        true
                )
        );
    }

}