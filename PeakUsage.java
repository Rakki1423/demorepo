class PeakUsage {
    public static void main(String[] args) {
        int[] arr={10, 25, 50, 40, 60, 30};
        int peak=arr[0];
        int index=0;
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>peak)
            {
                peak=arr[i];
                index=i;
            }
        }
         System.out.println("Peak Usage : "+peak+"\nhour index : "+index);
         
    }
}
