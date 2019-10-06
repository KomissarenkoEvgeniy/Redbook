public class Calculator
{
    public int performOperation(Operation operation, int[] a)
    {
        int result = 0;

        switch (operation)
        {

            case SUM:
                result = a[0] + a[1];
                break;
            case SUBTRACTION:
                result = a[0] - a[1];
                break;
            case MULTIPLY:
                result = a[0] * a[1];
                break;
            case DIV:
                result = a[0] / a[1];
                break;
            case INVERSE:
                result = -a[0];
                break;
        }

        return result;
    }
}
