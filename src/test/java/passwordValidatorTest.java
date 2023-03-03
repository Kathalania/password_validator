import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class passwordValidatorTest {

    @Test
    void isPasswordLongEnough() {
        //GIVEN
        String password = "zuizuizui";
        boolean expected = true;

        //WHEN
        boolean longEnough = passwordValidator.passwordLength(password);

        //THEN
        assertTrue(longEnough);

    }

    @Test
    void isPasswordTooShort(){
        //GIVEN

        //WHEN

        //THEN

    }
}