package clinic;

public class Animal{
    public String vid;
    public String name;
    public String[][]  Animal = new String[10][3];//10 strok 3 stolbca
    public int countAnimal;
    //public Owner o = new Owner();

    Animal(){
        Animal[0][0]="dog";Animal[0][1]="Sharik";Animal[0][2]="Petrov0";
        Animal[1][0]="cat";Animal[1][1]="Murzik";Animal[1][2]="Ivanov1";
        Animal[2][0]="homiak";Animal[2][1]="Pushistik";Animal[2][2]="Smirnova2";
        Animal[3][0]="homiak";Animal[3][1]="Seryj";Animal[3][2]="Ivanov1";
        countAnimal = 4;
    }
    public void Add(String idOwner,String kind, String name){
                countAnimal = countAnimal+1;
                Animal[countAnimal-1][0]=kind;
                Animal[countAnimal-1][1]=name;
                Animal[countAnimal-1][2]=idOwner;
    }


    public void Delete(String name){
        String newAnimal[][] = new String[10][3];
        for (int i=0; i<=(countAnimal-1);i++){
            if (!Animal[i][1].equals(name)){
                newAnimal[i][0] = Animal[i][0];
                newAnimal[i][1] = Animal[i][1];
                newAnimal[i][2] = Animal[i][2];
            }
        }
        countAnimal = countAnimal-1;
        Animal = newAnimal;
    }

    public void Edit(String oldName, String newName){
        for (int i=0; i<=(countAnimal-1);i++){
            if (Animal[i][1].equals(oldName)){
                Animal[i][1]=newName;
            }
        }
    }
    public void PrintFullList(){
        System.out.println("Full list of animal:");
        for (int i=0; i<=(countAnimal-1);i++){
            System.out.println(Animal[i][0] +" " + Animal[i][1]);
        }
    }

    public String[][] GetFullList(){
        return Animal;
    }
/**/

}