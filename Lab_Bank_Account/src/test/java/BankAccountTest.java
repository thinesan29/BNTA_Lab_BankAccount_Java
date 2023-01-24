import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {
    @Test
            public void depoistTest() {
    BankAccount bankAccount = new BankAccount(
            "Thinesan",
            "Manoseelan",
            LocalDate.of(2000,01,29),
            11111111);

    };
    @Test
    public void withdrawTest() {
        BankAccount bankAccount = new BankAccount(
                "Thinesan",
                "Manoseelan",
                LocalDate.of(2000,01,29),
                11111111);

    };





}
