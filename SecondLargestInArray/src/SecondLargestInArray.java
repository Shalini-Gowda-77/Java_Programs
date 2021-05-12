public class SecondLargestInArray {
    public static int getSecondLargest(int[]a, int total){
        int temp;
        for(int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {
               if(a[i]>a[j])
               {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
            }
        }
        return a[total-2];
    }
    public static void main(String args[])
    {
        int a[]={4,9,2,5,8,10};
        int b[]={22,99,55,66,33,44,88,110,100};
        System.out.println("Second Largest:"+getSecondLargest(a,6));
        System.out.println("Second Largest:"+getSecondLargest(b,9));
    }
}
