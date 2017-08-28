package clinic;

//import clinic.Animal;
//import clinic.Owner;

import java.util.Scanner;
public class RunClinic{
    public static  void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        Animal animal = new Animal();
        Owner owner = new Owner();

        try {
            String exit = "no";

            while(!exit.equals("yes")){
                String s1 = "Hello. You are welcomed Clinic Animal. You can\n";
                String s2 = "Get list client 1\n Get list animal 2 \n Add client 3\n Add animal 4\n Edit client 5\n Edit animal 6\n Delete client 7\n Delete animal 8\"";
                System.out.println(s1+s2);
                String answer = reader.next();
                switch (answer){
                    case "1": {
                        owner.PrintFullList();
                        break;
                    }
                    case "2": {
                        animal.PrintFullList();
                        break;
                    }
                    case "3": {
                        System.out.println("Enter name client");
                        String newName = reader.next();
                        owner.Add(newName);
                        break;
                    }
                    case "4": {
                        String newOwner[][] = owner.GetFullList();
                        String spis4select="";
                        for (int i=0; i<=(owner.countMan-1);i++){
                            spis4select = spis4select+newOwner[i][0]+" "+ i;
                        }
                        System.out.println("Enter kind of animal");
                        String kindAn = reader.next();
                        System.out.println("Enter name of animal");
                        String nameAn = reader.next();
                        System.out.println("Select owner " + spis4select);
                        String numberOwn1 = reader.next();
                        int numberOwn = Integer.parseInt(numberOwn1);

                        animal.Add(newOwner[numberOwn][1], kindAn, nameAn);
                        break;
                    }
                    case "5": {/*edit klient*/
                        String newOwner[][] = owner.GetFullList();
                        String spis4select="";
                        for (int i=0; i<=(owner.countMan-1);i++){
                            spis4select = spis4select+newOwner[i][0]+" "+ i;
                        }
                        System.out.println("Select owner " + spis4select);
                        String numberOwn1 = reader.next();
                        System.out.println("Enter new owner name");
                        String nameAn = reader.next();

                        int numberOwn = Integer.parseInt(numberOwn1);

                        owner.Edit(newOwner[numberOwn][1],nameAn);
                        break;
                    }


                    default: {
                        System.out.println("Error operation");
                    }
                }
                System.err.println("Exit : yes/no");
                exit = reader.next();
            }
        }
        finally{
            reader.close();
        }
    }
}

