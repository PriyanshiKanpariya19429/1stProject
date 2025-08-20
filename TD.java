public class TD 
{
    public static void main(String[] args) 
    {
        int i,j;
        int[][]a=new int[2][2];
        a[0][0]=2;
        a[0][1]=3;
        a[1][0]=4;
        a[1][1]=5;
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            System.out.println(a[i][j]);
        }
        
    }
    }
