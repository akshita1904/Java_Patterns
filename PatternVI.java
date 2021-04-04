class PatternVI{
    public static void main(String args[]){
        int sp = 5;
        for(int r = 1;  r <= 5; r++)
        {
            for(int s = 1; s <= sp; s++)
            {
                System.out.print(" ");
            }
            sp--;
            for(int c = 1; c <= r; c++)
            {
                System.out.print(c+" ");
            }
            System.out.println("");
        }
        System.out.print(" ");
        sp = 1;
        for(int i = 4;  i >= 1; i--)
        {
            for(int s = 1; s <= sp; s++)
            {
                System.out.print(" ");
            }
            sp++;
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}