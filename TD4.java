public class TD4 
{
    public static void main(String[] args) 
    {
        int[][]a={{1,1},{2,2},{3,3},{4,4}};
        int[][]b={{1,1},{2,2},{3,3},{4,4}};
        int[][]c=new int[4][2];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];

            }
        }
        for(int[]row:c)
        {
            for(int value: row)
            {
                System.out.print(value+" ");
            }
               System.out.println();
        }
        
    }

    
}
