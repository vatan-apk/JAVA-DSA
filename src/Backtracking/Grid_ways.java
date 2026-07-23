public static int grid_ways(int i,int j,int n,int m){
if(i==n-1 && j==m-1){
    return 1;
}
if(i==n || j==n){
    return 0;
}

int w1= grid_ways(i+1, j, n, m);
int w2= grid_ways(i, j+1, n, m);
return w1+w2;
}
public static void main(String[] args) {
    int n=3,m=3;
    System.out.println(grid_ways(0, 0, n, m));
}