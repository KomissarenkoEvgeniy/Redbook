import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorSimpleTests
{
    @Test
    public void given_calc_perform_summarey_of_2_then_check_expect_right_answer()
    {
        //arrange
        Calculator calculator = new Calculator();

        //act
        int result = calculator.performOperation(Operation.SUM, new int[]{1, 2});

        //asset
        Assertions.assertEquals(3, result);
    }

    @Test
    public void given_calc_perform_minus_of_2_then_check_expect_right_answer()
    {
        //arrange
        Calculator calculator = new Calculator();

        //act
        int result = calculator.performOperation(Operation.SUBTRACTION, new int[]{1, 2});

        //asset
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void given_calc_perform_mult_of_2_then_check_expect_right_answer()
    {
        //arrange
        Calculator calculator = new Calculator();

        //act
        int result = calculator.performOperation(Operation.MULTIPLY, new int[]{3, 2});

        //asset
        Assertions.assertEquals(6, result);
    }

    @Test
    public void given_calc_perform_div_of_2_then_check_expect_right_answer()
    {
        //arrange
        Calculator calculator = new Calculator();

        //act
        int result = calculator.performOperation(Operation.DIV, new int[]{4, 2});

        //asset
        Assertions.assertEquals(2, result);
    }

    @Test
    public void given_calc_inverse_div_of_2_then_check_expect_right_answer()
    {
        //arrange
        Calculator calculator = new Calculator();

        //act
        int result = calculator.performOperation(Operation.INVERSE, new int[]{4});

        //asset
        Assertions.assertEquals(2, result);
    }
}
