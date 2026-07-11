
public class basic {
public static void main(String args[]){

String str = "abcabd";
int[] hash = new int[256];
for(int i=0;i<str.length();i++){
    hash[str.charAt(i)]++;
}

for(int i=0;i<256;i++){
if(hash[i]>0){
    System.out.print(hash[i]+" ");
}
}

}
}
// Number hashing
// int arr[]= {1,3,2,1,3};
// int querry[] = {1,4,2,3,12};
// int max=0;
// for(int num : arr){
//     max = Math.max(max,num);
// }
// int[] hash = new int[max+1];

// for(int num:arr){
//     hash[num]++;
// }

// for(int q : querry){
//     if(q<=max){
//         System.out.print(hash[q]+" ");
//     }else{
//         System.out.print(0 + " ");
//     }
// }


