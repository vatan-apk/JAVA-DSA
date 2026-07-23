public static int fun(ArrayList<Integer> list){
    int max=0;
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            int height = Math.min(list.get(i),list.get(j));
            int width = j-i;
            int area = width * height;
max = Math.max(max,area);
        }
    }
    return max;
}

public static int fun2(ArrayList<Integer> height){
    int maxWater =0;
    int lp=0;
    int rp=height.size()-1;
    while(lp<rp){ 
        int  ht = Math.min(height.get(lp),height.get(rp));
        int wt = rp-lp;
        int area = ht * wt;
        maxWater = Math.max(maxWater,area);

        if(height.get(lp)<height.get(rp)){
            lp++;
        }else{
            rp--;
        }
    }
    return maxWater;
}

public static void main(String[] args) {
    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3);
    height.add(7);
    System.out.println(fun2(height));

}