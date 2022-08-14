package arryStudy;

public class MultiDimensnoialArray {

	public static void main(String[] args) {
		//multidimensional array
		String name2 [][]=new String[2][2]; //declaration
		
		name2[0][0]="anuj";         //initialization
		name2[0][1]=" swapnil";
		name2[1][0]="khusi";
		name2[1][1]="rajashri";
		System.out.print(name2 [0][0]+" ");
		System.out.println(name2 [0][1]);
		System.out.print(name2 [1][0]+" ");
		System.out.println(name2 [1][1]);
		System.out.println("============");
				
       char grade[][]= {{'a','b','c','d'},{'e','f','g','h'},{'i','j','k','l'}};
       for(int i=0;i<=2;i++)
       { for (int j=0;j<=3;j++)
    	   {
    		   System.out.print(grade[i][j]+" ");
    	   }
    	   System.out.println();
       } System.out.println("========");
       
       String name[][]= {{"anuj","     swapnil","rajasshri","khusi","swapnil2"},
{"kushwaha"," nimkar"," choudhary","more"," waghmare"},{"jabalpur"," nasik","  dhule","    nasik","wardha"}};
       
       for(int k=0;k<=2;k++)
       {
    	   for(int l=0;l<=4;l++)
    			   {
    		   System.out.print(name[k][l]+" ");
    			   }
    	   System.out.println();
       }
	}

}
