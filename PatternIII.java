/*
 1 0 1 0 1
  1 0 1 0
   1 0 1
    1 0
     1

Base Pattern:
 1 2 3 4 5
  1 2 3 4
   1 2 3
    1 2
     1
*/
class PatternIII
{
    public static void main(String args[])
    {
        int sp = 1;
        for(int r = 5;  r >= 1; r--)
        {
            for(int s = 1; s <= sp; s++)
            {
                System.out.print(" ");
            }
            sp++;
            for(int c = 1; c <= r; c++)
            {
                System.out.print((c%2)+" ");
            }
            System.out.println("");
        }
    }
}