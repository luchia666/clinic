package clinic;

public class Owner{
    String Man[][] = new String[10][2];
    public int countMan;

    Owner(){
        Man[0][0]="Petrov";Man[0][1]="Petrov0";
        Man[1][0]="Ivanov";Man[1][1]="Ivanov1";
        Man[2][0]="Smirnova";Man[2][1]="Smirnova2";
        countMan =3;
    }
    public void Add(String name){
        if (countMan<10){
            countMan = countMan+1;
            Man[countMan-1][0]=name;
            Man[countMan-1][1]=name+countMan;
        }
        else System.out.println("Can not add Man. Max count is 10");
    }
    public void Delete(String name){
        String newMan[][] = new String[10][2];
        for (int i=0; i<=(countMan-1);i++){
            if (!Man[i][1].equals(name)){
                newMan[i][0]=Man[i][0];
                newMan[i][1]=Man[i][1];
            }
        }
        countMan = countMan-1;
        Man = newMan;
    }

    public void Edit(String oldName, String newName){
        for (int i=0; i<=(countMan-1);i++){
            if (Man[i][1].equals(oldName)){
                Man[i][1]=newName;
            }
        }
    }
    public void PrintFullList(){
        System.out.println("Full list of owner animal:");
        for (int i=0; i<=(countMan-1);i++){
            System.out.println(Man[i][0]);
        }
    }
    public String[][] GetFullList(){
        return Man;
    }

    public int GetCount(){
        return countMan;
    }


}