package searching;

//leetcode problems;

public class EvenDigits {
   public static void main(String[] args) {
    int[] nums ={12,32,34,45,56,67,78};
    System.out.println(findNumb(nums)+" even digit numb are present in the list");
   }
   static int findNumb(int[] nums){
    int count =0;
    for(int num:nums){
        if(even(num)){
            count++;
        }
    }
    return count;
   } 

//function to check weather a number contains even digits or not;
static boolean even(int num){

    int numberofDigits = digits(num);
    return numberofDigits%2==0;
    

        }
        static int digits(int num){
            if(num==0) return 1;
        int count=0;
        while(num>0){
            count++;
            num=num/10; 
    }
    return count;
}

}

