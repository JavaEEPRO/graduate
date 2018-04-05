package si.inspirited.graduation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

class AppTest {
    public static void main(String[] args) {
        incorrectFinalMessage(1);
    }

    @Test
    static void incorrectFinalMessage(int exitCode) {
       System.out.print("test ");
       assertEquals(1, App.showFinalMessage(exitCode));
    }

}