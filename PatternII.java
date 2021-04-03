class PatternII{
    public static void main(String args[]){
        int c=5, r=5, x=4;
        int sp=5;
        for(int i=1; i<=r; i++){
            for(int s=1; s<=sp; s++){
                System.out.print(" ");
            }
            sp--;
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}