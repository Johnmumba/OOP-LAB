import org.junit.jupiter.api.Test;

import com.zut.BankAccount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test 
    void testBankAccount(){
    
        //Arrange - what do i need to test?
    BankAccount account = new BankAccount();

    //Act - whats the one action i want to check?
    account.deposit(100);

    //Assert - what must be true?
    assertEquals(100, account.balance);

    }
    
}