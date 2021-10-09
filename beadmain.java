    public static void main(String[] args)
    {
        BeadSort now=new BeadSort();
        int[] arr=new int[(int)(Math.random()*11)+5];
        for(int i=0;i<arr.length;i++)
            arr[i]=(int)(Math.random()*10);
        System.out.print("Unsorted: ");
        now.display1D(arr);
 
        int[] sort=now.beadSort(arr);
        System.out.print("Sorted: ");
        now.display1D(sort);
    }
