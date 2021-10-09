int main()
{
    int i, x[] = {5, 3, 1, 7, 4, 1, 1, 20};
    int len = sizeof(x)/sizeof(x[0]);
 
    bead_sort(x, len);
    printf("The sorted array is:\n");
    for (i = 0; i < len; i++)
        printf("%d\n", x[i]); 
    return 0;
}
