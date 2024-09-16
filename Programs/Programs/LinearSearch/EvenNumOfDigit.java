package Programs.LinearSearch;

public class EvenNumOfDigit {
//    public static void main(String[] args) {
//        int[] arr = {123,55,8,4132,23,123,100010};
//        int count=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(CountDigit(arr[i]))
//            {
//                count++;
//            }
//        }
//
//        System.out.println(count);
//    }
//
//    static boolean CountDigit(int num)
//    {
//        int c=0;
//        while(num!=0)
//        {
//            c++;
//            num=num/10;
//        }
//        if(c%2==0)
//        {
//            return true;
//        }
//        return false;
//
//    }





















//    Best solution :
public static void main(String[] args) {
    int[] arr = {12,34,6,3,4243,24234,3424,3,42,434,111111};
    int count=0;
    for(int a : arr)
    {
        if((((int)Math.log10(a))+1) % 2==0)
        {
            count++;
        }
    }

    System.out.println(count);

}


}
