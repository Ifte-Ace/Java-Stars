
public class Stars {
 
public static void main(String[] args) { 
 
//for this example we will use 5, but you can add a scanner or another number
 
int x =5;
 
printStars(x);
 
 
}
 
public static void printStars(int x){
 
if (x==0) {
 
System.out.println();
 
}
 
else { 
 
System.out.print("*");
 
printStars(x-1);
 
}
 
