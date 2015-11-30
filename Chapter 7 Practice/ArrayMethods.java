

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
        for( int i = 1; i < values.length - 1; i++)
        {
            if(values[(i+1)] > (values[(i-1)]))
            {
                values[i] = values[(i+1)];
            }
            else if(values[(i+1)] < values[(i-1)])
            {
                values[i] = values[(i-1)];
            }
            else
            {
                values[i] = values[(i+1)];
            }
        }
    }
    public void removeMiddle()
    {
        if(values.length%2 == 0)
        {
            for( int i = values.length - 1; i >= ((values.length/2) - 1); i--)
            {
                values[i] = values[i - 1];
            }
        }
        else if(values.length%3 == 0)
        {
            int[] newValues = new int[(values.length - 1)];
            for( int i = 0; i < values.length - 1; i++)
            {
                newValues[i] = values[i];
            }
        }
    }
}
