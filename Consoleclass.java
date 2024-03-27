import java.io.Console;
class Consoleclass{
public static void main(String args[]){
Console console=System.console();
String Busname=console.readLine();
double Time=Double.parseDouble(console.readLine());
int Noofseats=Integer.parseInt(console.readLine());
int BookedSeats=Integer.parseInt(console.readLine());
int AvailableSeats=Integer.parseInt(console.readLine());
System.out.println("Busname: "+Busname);
System.out.println("Time: "+Time);
System.out.println("Noofseats: "+Noofseats);
System.out.println("BookedseatS: "+BookedSeats);
System.out.println("AvailableSeats: "+AvailableSeats);


}
}