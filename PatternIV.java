class PatternIV
{
    public static void main(String args[])
    {
        int sp = 1;
        for(int r = 5; r >= 1; r--)
        {
            for(int s = 1; s <= sp; s++)
            {
                System.out.print(" ");
            }
            sp++;
            for(int c = r; c >= 1; c--)
            {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}