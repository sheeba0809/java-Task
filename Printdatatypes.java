class Printdatatypes{
public static void main (String[] args){
boolean B=true;
char c='v';
byte b= 112;
short s=31700;
int i=222500;
long l=456789839489084221L;
float f=31.200f;
double d= 3333.809984;
System.out.println("....Primitive datatypes....");
System.out.println(B);
System.out.println(c);
System.out.println(b);
System.out.println(s);
System.out.println(i);
System.out.println(l);
System.out.println(f);
System.out.println(d);
arr();
}
static void arr(){
int arr[]=new int[]{1,2,3,4,5,6,7};
int i;
//System.out.println(".....Non primitive datatypes.....");
for(i=0;i<arr.length;i++){
System.out.print(arr[i]);
}
} 
}
