public enum Operation
{
    SUM(1),
    SUBTRACTION(2),
    MULTIPLY(3),
    DIV(4),
    INVERSE(5);

    private final int id;

    Operation(int id)
    {
        this.id = id;
    }

    public int getValue()
    {
        return id;
    }

    public static Operation of(int id)
    {
        for (Operation op : values())
        {
            if (op.id == id)
                return op;
        }
        return null;
    }
}
