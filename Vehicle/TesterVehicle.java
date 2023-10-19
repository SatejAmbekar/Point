package Vehicle;
import java.util.Scanner;
public class TesterVehicle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int ch=0;
		int index=0;
		Vehicle obj1 =new Vehicle();
		Vehicle obj2 =new Vehicle();
		Vehicle obj3 =new Vehicle();
		Vehicle obj4 =new Vehicle();
		Vehicle obj5 =new Vehicle();
		Vehicle obj6 =new Vehicle();
		Vehicle obj7 =new Vehicle();
		Vehicle obj8 =new Vehicle();
		Vehicle obj9 =new Vehicle();
		Vehicle obj10 =new Vehicle();
		
		Vehicle[] Varr=new Vehicle[10];
		Varr[0]=obj1; 
		Varr[1]=obj2; 
		Varr[2]=obj3; 
		Varr[3]=obj4; 
		Varr[4]=obj5; 
		Varr[5]=obj6; 
		Varr[6]=obj7; 
		Varr[7]=obj8; 
		Varr[8]=obj9; 
		Varr[9]=obj10;
				
		do{
			System.out.println("Select from below Option:");
			System.out.println("1.Show all Vehicles \n2.Add Vehicle \n3.Change Color\n4.Change Price\n5.Remove Vehicle\n6.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				for(Vehicle vobj:Varr)
				{
					System.out.println(vobj);
				}
				
				break;
				
			case 2:
				for(int i=0;i<Varr.length;i++)
				{
					if(index<Varr.length)
					{
										
					System.out.println("Enter Vehicle Name:");
					String nm=sc.next();
//					System.out.println("Enter Vehicle ID:");
//					int ID=sc.nextInt();
					System.out.println("Enter Vehicle Color:");
					String col=sc.next();
					System.out.println("Enter Vehicle Price:");
					double pri=sc.nextDouble();
					
					Vehicle obj=new Vehicle((index+1),nm,col,pri);
					Varr[index]=obj;
					index++;
					break;
					}
					else
					{
						System.out.println("Array is full");
					}
				}
				break;
				
//			case 3:
//				
//				
//				break;
//				
//			case 4:
//				break;
//				
//			case 5:
//				break;
//				
//			case 6:
//				break;
//				
//			default:
			}
		}while(ch!=6);
		sc.close();
	}

}
