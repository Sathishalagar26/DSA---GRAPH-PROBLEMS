//MONKEY GAMES
import java.util.*;
class MonkeyGame
{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int b=scan.nextInt();
        int p=scan.nextInt();
        int nb=scan.nextInt();
        int np=scan.nextInt();

        int nm=0;

        if(nb%b==0)nm=nm+nb/b;
        if(nb%b!=0)nm=nm+(nb/b)+1;
        if(np%p==0)nm=nm+np/p;
        if(np%p!=0)nm=nm+(np/p)+1;

        System.out.print(n-nm);
    }
}