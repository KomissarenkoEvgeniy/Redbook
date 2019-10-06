import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationSummaryTests
{

    @Test
    void given_many_numbers_expect_right_answer()
    {
        //arrange
        Calculator calculator = new Calculator();
        int[] values = new int[]{123,123,123,123,123,4,5,6};

        //act
        int result = calculator.performOperation(Operation.SUM, values);


        int sum = 0;
        for (int a:values)
        {
            sum+=a;
        }

        //assert
        Assertions.assertEquals(sum, result);
    }

    @Test
    void given_many_numbers_some_negative_and_positive_expect_right_answer()
    {
        //arrange
        Calculator calculator = new Calculator();
        int[] values = new int[]{123,-123,123,-123,123,4,5,6};

        //act
        int result = calculator.performOperation(Operation.SUM, values);


        int sum = 0;
        for (int a:values)
        {
            sum+=a;
        }

        //assert
        Assertions.assertEquals(sum, result);
    }

    @Test
    void given_zero_numbers_expect_right_answer()
    {
        //arrange
        Calculator calculator = new Calculator();
        int[] values = new int[0];

        //act
        int result = calculator.performOperation(Operation.SUM, values);

        //assert
        Assertions.assertEquals(0, result);
    }
}
