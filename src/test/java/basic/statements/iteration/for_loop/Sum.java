package basic.statements.iteration.for_loop;

public class Sum {
    public static void main (String [] args)
    {
        int sum=0;
        for(int i=1; i<=5; i++)
        {

          sum=sum+i;

          //sum+=i;
        }
        System.out.println(sum);
    }

}
