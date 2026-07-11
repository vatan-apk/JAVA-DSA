public class BS{

    public static int fun(int key,int[] arr){
        int front =0;
        int last = arr.length-1;
        while(front<=last){
            int mid = (front + last) / 2;
            if(key==arr[mid]){
                return arr[mid];
            }else if(key>arr[mid]){
            front = mid +1;
            }else{
            last = mid-1;
            }
        }
        return -1;
    }

    public static int funRec(int key,int high,int low,int[] arr){
    
    if(low>high){
        return -1;
    }
    int mid = (low+high)/2;
    if(key>arr[mid]){
      return  funRec(key, high, mid+1, arr);
    }else if(key==arr[mid]){
        return key;
    }else{
     return    funRec(key, mid-1, low, arr);
    }
    
    }

public static int LowerBound(int key,int[] arr){
    int ans = arr.length;
    int lower = 0;
    int higher = arr.length-1;
    while(lower<=higher){ 
        int mid = (lower+higher)/2;
        if(arr[mid]>=key){
            ans = mid;
            higher = mid -1;
        }else{
            lower = mid +1;
        }
    }
    return ans;
}


public static int UpperBound(int key,int[] arr){
    int ans = arr.length-1;
    int lower = 0;
    int higher = arr.length-1;
    while(lower<=higher){ 
        int mid = (lower+higher)/2;
        if(arr[mid]>key){
            ans = mid;
            higher = mid -1;
        }else{
            lower = mid +1;
        }
    }
    return ans;
}

public static int FirstOccurance(int[] arr,int key){
    int first =0;
    int last = arr.length-1;
    int ans = -1;
    while(first<=last){
       int mid= (first+last)/2;
       if(arr[mid]==key){
       ans = mid;
       last = mid-1;
       }else if(arr[mid]<key){
        first = mid+1; 
       }else{
        last = mid-1;
       }
    }
    return ans;
}

public static int LastOccurance(int[] arr,int key){
    int first =0;
    int last = arr.length-1;
    int ans = -1;
    while(first<=last){
       int mid= (first+last)/2;
       if(arr[mid]==key){
       ans = mid;
       first = mid+1;
       }else if(arr[mid]<key){
        first = mid+1; 
       }else{
        last = mid-1;
       }
    }
    return ans;
}

public static void printOccurrences(int[] arr, int key) {
    int first = FirstOccurance(arr, key);
    int last = LastOccurance(arr, key);

    if (first == -1) {
        System.out.println(key + " not found.");
    } else {
        System.out.println("First Occurrence Index : " + first);
        System.out.println("Last Occurrence Index  : " + last);
    }
}

//Search in Rotated sorted array

public static int srsa(int[] arr,int k ){
int low =0;
int high = arr.length-1;
while(low<=high){
    int mid= (low+high)/2;
    if(arr[mid]==k){
        return mid;
    }
    if(arr[low]<=arr[mid]){
    if(arr[low]<=k && arr[mid]>k){
        high = mid-1;
    }else{
        low = mid+1;
    }
    }else {
        if(arr[high]>=k && arr[mid]<k){
        low = mid+1;
        }else{
            high=mid-1;
        }
    }
}
return -1;
}

//search rotaed dublicates

public static boolean  srd(int[] arr,int k ){
int low =0;
int high = arr.length-1;
while(low<=high){
    int mid= (low+high)/2;
    if(arr[mid]==k){
        return true;
    }

    if(arr[low]==arr[mid] && arr[mid] == arr[high]){
        low++;
        high--;
    } else if(arr[low]<=arr[mid]){
    if(arr[low]<=k && arr[mid]>k){
        high = mid-1;
    }else{
        low = mid+1;
    }
    }else {
        if(arr[high]>=k && arr[mid]<k){
        low = mid+1;
        }else{
            high=mid-1;
        }
    }
}
return false;
}

// Minimum in rotated sorted array

public static int mrsa(int[] arr){
    int low=0;
    int ans = Integer.MAX_VALUE;
    int high = arr.length-1;
    while(low<=high){
        if(arr[low]<=arr[high]){
            ans = Math.min(ans,arr[low]);
            break;
        }
        int mid = (low + high) / 2;
        if(arr[mid]>=arr[low]){
        ans = Math.min(ans,arr[low]);
        low=mid+1;
        }else{
        ans = Math.min(ans,arr[mid]);
        high=mid-1;
        }
    }
    return ans;
}

public static void main(String[] args) {
    int[] arr  = {7,8,9,9,1,2,3,4,5,6};

System.out.println(mrsa(arr));
}
}

// How many times array rotated
public static int index(int[] arr){
    int low=0;
    int ans = Integer.MAX_VALUE;
    int high = arr.length-1;
    int index =0;
    while(low<=high){
        if(arr[low]<=arr[high]){
            if(arr[low]<ans){
            index=low;
            ans = arr[low];
            }
           break;
        }
        int mid = (low + high) / 2;
        if(arr[mid]>=arr[low]){
            if(arr[low]<ans){
                index=low;
                ans = arr[low];
            }
        low = mid +1;
        }else{
            high = mid-1;
        if(arr[mid]<ans){
            index = mid;
            ans = arr[mid];
        }
        }
    }
    return index;
}


// Single element in sorted array

public static int sesa(int[] arr){
    int n = arr.length;
    if(n==1) return arr[0];
    if(arr[0]!=arr[1])return arr[0];
    if(arr[n-1]!=arr[n-2]) return arr[n-1];
    int low =1;
    int high= n-2;
    while(low<=high){ 
        int mid = (low+high)/2;
        if(arr[mid]!=arr[mid-1] && arr[mid] != arr[mid+1]){
            return arr[mid];
        }
        //At left
        if(mid%2==1 && arr[mid]==arr[mid-1] || mid%2 == 0 && arr[mid]==arr[mid+1]){
            low=mid+1;
        }else{
high = mid-1;
        }
    }
    return -1;
}

//Find peek Element

public static int fpe(int[] arr){
    int n = arr.length;
    if(n==1) return 0;
    if(arr[0]>arr[1]) return 0;
    if(arr[n-1]>arr[n-2]) return n-1;
    int low =1,high = n-2;
    while(low<=high){
        int mid = (low + high) /2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
            return mid;
        }else if(arr[mid]>arr[mid-1]) low = mid +1;
        else high=mid-1;
    }
    return -1;
}


//Finding Sqrt of a number
public static int sqrt(int n){
    int low =0;
    int high=n;
    int ans =0;
    while(low<=high){
    int mid = (high+low) /2;
    long num = (long)mid*mid;
    if(num==n){
        ans = mid;
        return mid;
    }else if(num>n){
    high = mid-1;  
    }else{
        ans = mid;
    low = mid+1;
    }
    }
    return ans;
}

//Find an nth root of an integer
public static int multi(int mid,int n,int m){
    long multi =1;
    for(int i=1;i<=n;i++){
multi = multi *mid;
if(multi>m) return 2;
    }
    if(multi==m) return 1;
    return 0;
}

public static int nr(int n,int m){
    int low=0;
    int high=m;
    while(low<=high){ 
        int mid = (low+high)/2;
        int fun = multi(mid,n,m);
        if(fun==1){
            return mid;
        }
        else if(fun==0){
            low= mid+1;
        }else{
            high=mid-1;
        }
    }
    return -1;
}

// Median of two sorted arrays brute force approach
public static int msa(int[] arr1,int[] arr2){
ArrayList<Integer> list = new ArrayList<>();
int i=0;
while(i<arr1.length){
list.add(arr1[i]);
i++;
}
int j=0;
while(j<arr2.length){
    list.add(arr2[j]);
    j++;
}
Collections.sort(list);
int n = list.size();
if(n%2!=0){
return list.get(n/2);
}
int idx1 = n/2;
int idx2 = (n/2)-1;
int sum = (list.get(idx1)+list.get(idx2))/2;
return sum;
}


public static void main(String[] args) {
    int[] arr  = {1,2,3,4,5,6};
System.out.println(nr(3,27));
// test
}



