import java.util.*;
class Day4 {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    String str = obj.nextLine();
    System.out.println("Input String is :"+str);
//Count the words in the given String Input 
int count = 1;
    for(int i=0 ; i < str.length() ; i++)
    {
        if(str.charAt(i) == ' ')
            count++;
    }
    System.out.println("Number of words in the String : "+count);
    

}
}
// import java.util.*;
// import java.lang.Math;
// class Day4 {
//     public static void main(String[] args) {
//     Scanner obj = new Scanner(System.in);
//     String str = obj.nextLine();
//     System.out.println("Input String is :"+str);
// // //Finding only uppercase and lowercase characters 
//     for(int i=0 ; i < str.length(); i++)
//     {
//         if( (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' ) || 
//             (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' )|| 
//             (str.charAt(i)==' '))
//             System.out.print(str.charAt(i));
//     }
// }
// }


// import java.util.*;
// import java.lang.Math;
// class Day4 {
//     public static void main(String[] args) {
//     Scanner obj = new Scanner(System.in);
//     String str = obj.nextLine();
//     System.out.println("Input String is :"+str);

//     for(int i=0 ; i < str.length(); i++)
//     {
//         if( str.charAt(i) >= '0' && str.charAt(i) <= '9' )
//             System.out.print(str.charAt(i)+" ");
//     }




// //     double n = obj.nextDouble();
// //     int factors = 0;
// //     int ss = (int)Math.sqrt(n);
// //     for( int i = 2 ; i <= ss ; i++)  
// // //this will run only for squareroot number of times 
// //     {
// // 	    if( n % i == 0 )
// // 	    	factors++;
// //     }
// //     if( factors == 0 )
// // 	    System.out.println(" Prime ");
// //     else 
// //     	System.out.println("Not Prime");




//     }
// }