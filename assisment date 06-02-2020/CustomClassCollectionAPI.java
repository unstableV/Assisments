// 1. Add a new Computer
// 2. Display all computers
// 3. Search for a computer : By Name, Color, HDDSize, RamSize, ID
// 4. Delete a computer : By ID
// 5. UPdate Computer Details: Name, Color, HDDSize, RamSize


import java.util.*;
class CustomClassCollectionAPI{
    public static void main(String[] args) {
 
        Computer first = new Computer("hp", "black", 500, 8,100);

        ArrayList<Computer> list = new ArrayList<Computer>();
        list.add(first);
        list.add(new Computer("HP", "black", 256, 4,101));
        list.add(new Computer("Sony", "blue", 1024, 16,102));
            while(true)
            {
                int flag=0;
        System.out.println("press 1 to enter new computer");
        System.out.println("press 2 to display computer");
        System.out.println("press 3 to search for a computer");
        System.out.println("press 4 to remove");
        System.out.println("press 5 to update");
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        switch( n){
            case 1:
            Scanner s = new Scanner(System.in);
            System.out.println("enter brand name");
            String newComp = s.nextLine();
            newComp = newComp.toLowerCase();
             System.out.println("enter color");
            String color =  s.nextLine();
             System.out.println("enter hddr");
            int n1 = s.nextInt();
             System.out.println("enter ramsize");
            int n2 = s.nextInt();
             System.out.println("ente id");
            int id = s.nextInt();
            list.add(new Computer(newComp, color, n1, n2,id));
            System.out.println("Computer added successfully!!");
            break;

            case 2:
            System.out.println("List : " + list);
            break;
            case 3:
            System.out.println("For Search by name press 1 ");
            System.out.println("For Search by color press 2 ");
            System.out.println("For Search by HDDSize press 3 ");
            System.out.println("For Search by RamSize press 4 ");
            System.out.println("For Search by Id press 5 ");
            Scanner s3 = new Scanner(System.in);
            int search = s3.nextInt();
         //  int  flag =0;
            if(search == 1)
            {
                System.out.println("Ente the brand name");
                Scanner s4 = new Scanner(System.in);
                String brand = s4.nextLine();
                brand = brand.toLowerCase();
                Computer first2 = new Computer(brand, "hii", 1, 2,1);
                for(int i=0;i<list.size();i++)
                {

                if(first2.equals1(list.get(i)))
                {

                    System.out.println(list.get(i));
                    flag=1;
                }
               }
                if(flag==0)
                {
                    System.out.println("Sorry not found");
                }
                
            }
            if(search == 2)
            {
                System.out.println("Ente the brand color");
                Scanner s5 = new Scanner(System.in);
                String color1 = s5.nextLine();
                Computer first3 = new Computer("ss", color1, 1, 2,1);
                for(int i=0;i<list.size();i++)
                {

                if(first3.equals2(list.get(i)))
                {
                    flag=1;
                    System.out.println(list.get(i));
                }

                
               }
               if(flag==0)
                {
                    System.out.println("Sorry not found");
                }

            }
             if(search == 3)
            {
                System.out.println("Ente the hddSize");
                Scanner s6 = new Scanner(System.in);
                int size = s6.nextInt();
                Computer first4 = new Computer("ss", "aaa", size, 2,1);
                for(int i=0;i<list.size();i++)
                {

                if(first4.equals3(list.get(i)))
                {
                    flag=1;
                    System.out.println(list.get(i));
                }
               }
               if(flag==0)
                {
                    System.out.println("Sorry not found");
                }
            }
            if(search == 4)
            {
                System.out.println("Ente the ramSize");
                Scanner s7 = new Scanner(System.in);
                int ram = s7.nextInt();
                Computer first5 = new Computer("ss", "aaa", 2, ram,1);
                for(int i=0;i<list.size();i++)
                {

                if(first5.equals4(list.get(i)))
                {
                    flag=1;
                    System.out.println(list.get(i));
                }
                if(flag==0)
                {
                    System.out.println("Sorry not found");
                }
               }
            }

            if(search == 5)
            {
                System.out.println("Ente the id");
                Scanner s8 = new Scanner(System.in);
                int id1 = s8.nextInt();
                Computer first6 = new Computer("ss", "aaa", 2, 1,id1);
                for(int i=0;i<list.size();i++)
                {

                if(first6.equals5(list.get(i)))
                {
                    flag=1;
                    System.out.println(list.get(i));
                }

                
               }
               if(flag==0)
                {
                    System.out.println("Sorry not found");
                }
            }
            break;
            case 4:
            System.out.println("Enter the ID to be deleted");
            Scanner s9 = new Scanner(System.in);
            int id2 = s9.nextInt();
            Computer first6 = new Computer("ss", "aaa", 2, 1,id2);
            for(int i=0; i<list.size();i++)
            {
                if(first6.equals5(list.get(i)))
                {

                    list.remove(i);
                    System.out.println("id removes sucessfully");
                }
            }
            break;
            case 5:

            System.out.println("For UPdate by name press 1 ");
            System.out.println("For UPdate by color press 2 ");
            System.out.println("For UPdate by HDDSize press 3 ");
            System.out.println("For UPdate by RamSize press 4 ");
            System.out.println("For UPdate by Id press 5 ");
            Scanner s31 = new Scanner(System.in);
            int search1 = s31.nextInt();
            if(search1 == 1)
            {
                System.out.println("Ente the brand name");
                Scanner s4 = new Scanner(System.in);
                String brand1 = s4.nextLine();
                Computer first21 = new Computer(brand1, "hii", 1, 2,1);
                //Computer comp = null; 
                for(int i=0;i<list.size();i++)
                {

                if(first21.equals1(list.get(i)))
                {
                    System.out.println("enter the brad name to replace");
                    Scanner s41 = new Scanner(System.in);
                    String brand11 = s41.nextLine();
                    list.get(i).brand = brand11;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                {
                    System.out.println("Sorry not found");
                }     
            }
            if(search1 == 2)
            {
                System.out.println("Ente the color name");
                Scanner s42 = new Scanner(System.in);
                String color12 = s42.nextLine();
                Computer first21 = new Computer("sss", color12, 1, 2,1);
                for(int i=0;i<list.size();i++)
                {

                if(first21.equals2(list.get(i)))
                {
                    System.out.println("enter the color to replace");
                    Scanner s411 = new Scanner(System.in);
                    String brand111 = s411.nextLine();
                    list.get(i).color = brand111;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                {
                    System.out.println("Sorry not found");
                }     
            }
            if(search1 == 3)
            {
                System.out.println("Ente the hddr");
                Scanner s424 = new Scanner(System.in);
                int  hrdd12 = s424.nextInt();
                Computer first211 = new Computer("sss", "sss", hrdd12, 2,1); 
                for(int i=0;i<list.size();i++)
                {

                if(first211.equals3(list.get(i)))
                {
                    System.out.println("enter the hdrdd to replace");
                    Scanner s411 = new Scanner(System.in);
                    int brand111 = s411.nextInt();
                    list.get(i).hddSize = brand111;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                {
                    System.out.println("Sorry not found");
                }     
            }

            if(search1 == 4)
            {
                System.out.println("Ente the ramSize");
                Scanner s4245 = new Scanner(System.in);
                int  ram12 = s4245.nextInt();
                Computer first211 = new Computer("sss", "sss", 1, ram12,1); 
                for(int i=0;i<list.size();i++)
                {

                if(first211.equals4(list.get(i)))
                {
                    System.out.println("enter the ransize to replace");
                    Scanner s411 = new Scanner(System.in);
                    int brand111 = s411.nextInt();
                    list.get(i).ramSize = brand111;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                {
                    System.out.println("Sorry not found");
                }     
            }
            if(search1 == 5)
            {
                System.out.println("Ente the id");
                Scanner s4245 = new Scanner(System.in);
                int  id12 = s4245.nextInt();
                Computer first2111 = new Computer("sss", "sss", 1, 2,id12);
                for(int i=0;i<list.size();i++)
                {

                if(first2111.equals5(list.get(i)))
                {
                    System.out.println("enter the id to replace");
                    Scanner s411 = new Scanner(System.in);
                    int brand111 = s411.nextInt();
                    flag=1;
                    list.get(i).id = brand111;
                    break;
                }
            }
            if(flag==0)
                {
                    System.out.println("Sorry not found");
                }     
            }
        
    }
}
 }
} 
class Computer{
    String brand, color;
    int hddSize, ramSize,id;
 
    Computer(String brand, String color, int hddSize, int ramSize,int id){
        this.brand = brand;
        this.color = color;
        this.hddSize = hddSize;
        this.ramSize = ramSize;
        this.id = id;
    }
 
    public String getColor(){
        return this.color;
    }
     
    public Integer getId()
    {
        return this.id;
    }
    public String getBrand(){
        return this.brand;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
     
    public Integer getRamSize(){
        return this.ramSize;
    }

 
    @Override
    public String toString(){
        return "Computer : (" + this.getBrand()
            + ", " + this.getColor()
            + ", " + this.getHddSize()
            + ", " + this.getRamSize()
            + ", " + this.getId()+
            ")";
    }
   // @Override
    public boolean equals1(Object ref){
 
        if(ref instanceof Computer)
            return this.getBrand().equals(((Computer)ref).getBrand());
        return false;
    }
   // @Override
    public boolean equals2(Object ref){
 
        if(ref instanceof Computer)
            return this.getColor().equals(((Computer)ref).getColor());
        return false;
    }
    
    public boolean equals3(Object ref){
 
        if(ref instanceof Computer)
            return this.getHddSize().equals(((Computer)ref).getHddSize());
        return false;
    }

    public boolean equals4(Object ref){
 
        if(ref instanceof Computer)
            return this.getRamSize().equals(((Computer)ref).getRamSize());
        return false;
    }

    public boolean equals5(Object ref){
 
        if(ref instanceof Computer)
            return this.getId().equals(((Computer)ref).getId());
        return false;
    }
}