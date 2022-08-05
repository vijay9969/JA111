public class Number{

void check(int data){
if(data%2==1){
   int x = Math.floor(data/10);
   int y = x*10+10;
//   System.out.println(y);
   System.out.println(y);
//    return;
}else if(data<=0){
   System.out.println("Error");
//    return;
}else{
System.out.println(data);
}

public static void main(String[] args){
   Number num = new Number();
   int val = 44;
   num.check(val); 
}

}