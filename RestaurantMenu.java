import java.util.Scanner;
class RestaurantMenu
 {
   public static void main(String args[])
   { 
     Scanner sc=new  Scanner (System.in);
     System.out.println(" welcome to Trinity Hotel");
     int status=0;
	 // below short Variables are to Store the Prices for the Food Items
     short a=120, b=180, c=150, d=110, e=160, f=140, g=80, h=220, i=60, j=99, k=90, l=80, m=40;
     short n=40, o=125, p=110, q=140,  r=190, s=130, t=180, u=280, v=320, w=360, x=340, y=60;
     
     int sum=0;
     do
     {
       System.out.println(" 2. Veg Menu    3. Non-Veg Menu\n Choose Your Menu");
       int menu=sc.nextInt();
       
       while(menu==2)
       {
         System.out.println(" 4. Starters    5. Main Course\n 6. Deserts     7. Beverages\nChoose your Option");
         int veg=sc.nextInt();
         
         switch(veg)
         {
           case 4:System.out.println(" 8.  Gobi Manchurian  9. Paneer Tikka\n 10. Chilli Paneer   11. Veg Momos");
           System.out.println("Place Order to Select Dish you want");
           int num=sc.nextInt();
           
           switch(num)
             {
             case 8:sum=sum+a;
             System.out.println(" Gobi manchurian Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 9:sum+=b;
             System.out.println(" Paneer Tikka Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 10:sum+=c;
             System.out.println("  Chilli Paneer Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 11:sum+=d;
             System.out.println(" Veg Momos Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             }
           break;
           
           case 5:System.out.println(" 12. Palak Paneer     13. Aloo Gobi Masala\n 14. Masala dosa      15. Veg biryani");
           System.out.println(" Place Order to Select Dish you want");
           num=sc.nextInt();
           switch(num)
           {
             case 12:sum=sum+e;
             System.out.println(" Palak Paneer Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 13:sum+=f;
             System.out.println(" Aalu Gobi Masala Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 14:sum+=g;
             System.out.println("  Masal dosa Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 15:sum+=h;
             System.out.println(" Veg Biryani Added Successfully\n Total Bill = "+sum+" Rs");
             break;
           }
           break;
           
           case 6:System.out.println(" 16. Ice Cream      17. Cheese Cake\n 18. fruit salad    19. Cup Cake");
           System.out.println(" Place Order to Select Dish you want");
           num=sc.nextInt();
           switch(num)
           {
             case 16:sum=sum+i;
             System.out.println(" Ice Cream Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 17:sum+=j;
             System.out.println(" Cheese Cake Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 18:sum+=k;
             System.out.println("  Fruit Salad Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 19:sum+=l;
             System.out.println(" Cup Cake Added Successfully\n Total Bill = "+sum+" Rs");
             break;
           }
           break;
           
           case 7:System.out.println(" 20. ThumsUp        21. Sprite\n 22. RedBull        23. Monster");
           System.out.println(" Place Order to Select Dish you want");
           num=sc.nextInt();
           switch(num)
           {
             case 20:sum=sum+m;
             System.out.println(" ThumsUp Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 21:sum+=n;
             System.out.println(" Sprite Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 22:sum+=o;
             System.out.println("  Red Bull Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 23:sum+=p;
             System.out.println(" Monster Added Successfully\n Total Bill = "+sum+" Rs");
             break;
           }
           break;
         }
         System.out.println("Do you wish Continue to Veg Section Press 2 Or Press 3 for Non-Veg Section");
         menu=sc.nextInt();
      }
      while(menu==3)
      {
         System.out.println(" 4. Starters    5. Main Course\n 6. Deserts     7. Beverages\nChoose your Option");
        int veg=sc.nextInt();
         
         switch(veg)
         {
           case 4:System.out.println(" 8.  Fried Chicken        9. Chicken 65\n 10. Chicken Manchurian  11. Chicken Wings");
           System.out.println("Place Order to Select Dish you want");
           int num=sc.nextInt();
           
           switch(num)
			{
             case 8:sum=sum+q;
             System.out.println(" Fried Chicken Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 9:sum+=r;
             System.out.println(" Chicken 65 Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 10:sum+=s;
             System.out.println("  Chicken Manchurian  Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 11:sum+=t;
             System.out.println(" Chicken Wings  Added Successfully\n Total Bill = "+sum+" Rs");
             break;
            }
           break;
           
           case 5:System.out.println(" 12. Spl Chicken Biryani 13. Mutton Dum Biryani\n 14. France Biryani      15. Fish Biryani");
           System.out.println(" Place Order to Select Dish you want");
           num=sc.nextInt();
           switch(num)
           {
             case 12:sum=sum+u;
             System.out.println(" Spl Chicken Biryani Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 13:sum+=v;
             System.out.println(" Mutton Dum Biryani Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 14:sum+=w;
             System.out.println("  France Biryani Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 15:sum+=x;
             System.out.println(" Fish Biryani Added Successfully\n Total Bill = "+sum+" Rs");
             break;
           }
           break;
           
           case 6:System.out.println(" 16. Ice Cream      17. Kaddu ka kheer\n 18. fruit salad    19. Faaluda");
           System.out.println(" Place Order to Select Dish you want");
           num=sc.nextInt();
           switch(num)
           {
             case 16:sum=sum+y;
             System.out.println(" Ice Cream Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 17:sum+=y;
             System.out.println(" Kaddu ka kheer  Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 18:sum+=y;
             System.out.println("  Fruit Salad Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 19:sum+=y;
             System.out.println(" Faaluda Added Successfully\n Total Bill = "+sum+" Rs");
             break;
           }
           break;
           
           case 7:System.out.println(" 20. ThumsUp        21. Sprite\n 22. RedBull        23. Monster");
           System.out.println(" Place Order to Select Dish you want");
           num=sc.nextInt();
           switch(num)
           {
             case 20:sum=sum+m;
             System.out.println(" ThumsUp Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 21:sum+=n;
             System.out.println(" Sprite Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 22:sum+=o;
             System.out.println("  Red Bull Added Successfully\n Total Bill = "+sum+" Rs");
             break;
             case 23:sum+=p;
             System.out.println(" Monster Added Successfully\n Total Bill = "+sum+" Rs");
             break;
           }
           break;
         }
         System.out.println("Do you wish Continue to Non-Veg Section Press 3 Or\n Press 0 twice for Main Menu Or\n Press 1 Twice for Exit");
         menu=sc.nextInt();
      }
       System.out.println("  agian");
       status=sc.nextInt();
       
     } while(status==0);
     System.out.println("Thank you! Visit Again"); 
   }
 }