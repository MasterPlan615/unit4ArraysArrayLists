

public class ArrayMethods
{
    private int[] values;
    public ArrayMethods(int[] initialValues)
    {
        values = initialValues;
    }
    public void swapFirstAndLast()
    {
        int temp = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = temp;
    }
    public void shiftRight()
    {
        int temp = values[values.length - 1];
        for( int i = values.length - 1; i > 0; i--)
        {
            values[ i ] = values[ i - 1 ];
        }
        values[0] = temp;
    }
    public void evenGone()
    {
        for( int i = values.length - 1; i >= 0; i--)
        {
            if(values[i]%2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    public void replaceLarger()
    {
        //...
    }
}
