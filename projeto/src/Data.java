import java.util.ArrayList;
import java.util.*;
import java.util.InputMismatchException;


public class Data {

    int conttotal = 0;

    private ArrayList<People> vetpep = new ArrayList<>();


    public void ast(int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println("");
        }
        System.out.println("************************");
    }

    public void invalid(){
        ast(0);
        System.out.println("Invalid option");
        System.out.println("Try again");
        ast(0);
    }


    public void peptype(People people) {
        this.vetpep.add(people);
        conttotal++;
    }

    public void showdata() {
        System.out.println("All registers:");
        ast(0);
        for (int i = 0; i < vetpep.size(); i++) {
            System.out.println("Gender: " + vetpep.get(i).getType());
            System.out.println("Name: " + vetpep.get(i).getName());
            System.out.println("Surname: " + vetpep.get(i).getSurname());
            System.out.println("Age: " + vetpep.get(i).getAge());
            System.out.println("height: " + vetpep.get(i).getHeightcm() / 100 + " Meters");
        }
        ast(0);

    }
    public void sexfilter(int op) {
        switch (op) {
            case 1:
                System.out.println("Men Registers:");
                System.out.println("---------------------------");
                for (int i = 0; i < vetpep.size(); i++) {
                    if (vetpep.get(i).getType().equals("Man")) {
                        System.out.println("Name: " + vetpep.get(i).getName());
                        System.out.println("Surname: " + vetpep.get(i).getSurname());
                        System.out.println("Age: " + vetpep.get(i).getAge());
                        System.out.println("height: " + vetpep.get(i).getHeightcm() / 100 + " Meters");
                        ast(0);
                    }
                }
                break;
            case 2:
                System.out.println("Women registers:");
                System.out.println("---------------------------");
                for (int i = 0; i < vetpep.size(); i++) {
                    if (vetpep.get(i).getType().equals("Woman")) {
                        System.out.println("Name: " + vetpep.get(i).getName());
                        System.out.println("Surname: " + vetpep.get(i).getSurname());
                        System.out.println("Age: " + vetpep.get(i).getAge());
                        System.out.println("Height: " + vetpep.get(i).getHeightcm() / 100 + " Meters");
                        ast(0);
                    }
                }
                break;
            case 3:
                System.out.println("Another gender registers:");
                System.out.println("---------------------------");
                for (int i = 0; i < vetpep.size(); i++) {
                    if (vetpep.get(i).getType().equals("Other")) {
                        System.out.println("Name: " + vetpep.get(i).getName());
                        System.out.println("Surname: " + vetpep.get(i).getSurname());
                        System.out.println("Age: " + vetpep.get(i).getAge());
                        System.out.println("Height: " + vetpep.get(i).getHeightcm() / 100 + " Meters");
                        ast(0);
                    }
                }
                break;
            default:
                ast(0);
                System.out.println("Empty registers!");
                System.out.println("Try again");
                ast(0);

        }
    }

    public void namefilter(String nomepe) {
        boolean nm=false;
        for (int i = 0; i < vetpep.size(); i++) {
            if (vetpep.get(i).getName().equals(nomepe)) {
                nm = true;
                ast(0);
                System.out.println("Name: " + vetpep.get(i).getName());
                System.out.println("Surname: " + vetpep.get(i).getSurname());
                System.out.println("Age: " + vetpep.get(i).getAge());
                System.out.println("Height: " + vetpep.get(i).getHeightcm() / 100 + " Meters");
                ast(0);
            }else{
                nm = false;
            }
        }
        if(nm==false){
            ast(0);
            System.out.println("Nobody called " + nomepe + " registred");
            ast(0);
        }
    }
    public void contmanwom(){
        int contman = 0;
        int contwom = 0;
        int contoth = 0;
        System.out.println("Men and Women cont:");
        for (int i = 0; i<vetpep.size();i++){
            if(vetpep.get(i).getType().equals("Man")) {
                contman++;
            }
            if(vetpep.get(i).getType().equals("Woman")) {
                contwom++;
            }
            if(vetpep.get(i).getType().equals("Other")){
                contoth++;
            }
        }

        int totalmanval = (contman*100)/conttotal;
        int totalwomval = (contwom*100)/conttotal;
        int totaltother = (contoth*100)/conttotal;
        ast(0);
        System.out.println("Man numbers: " + contman);
        System.out.println("Man percent: " + totalmanval + "%");
        System.out.println("------------------------------");
        System.out.println("Woman numbers: " + contwom);
        System.out.println("Woman percent: " + totalwomval + "%");
        System.out.println("------------------------------");
        System.out.println("Another gender numbers: " + contoth);
        System.out.println("Another gender percent: " + totaltother + "%");
        ast(0);
    }

    public void proend(int exit){
        if (exit==0){
            ast(0);
            System.out.println("Finished program");
            ast(0);
            System.exit(0);
        }
    }

    public void ordage(){
        System.out.println("Sorted list by the age-");
        Collections.sort(vetpep);
        for (int i =0; i<vetpep.size();i++){
            ast(0);
            System.out.println("Age: " + vetpep.get(i).getAge());
            System.out.println("Gender: " + vetpep.get(i).getType());
            System.out.println("Name: " + vetpep.get(i).getName());
            System.out.println("Surname " + vetpep.get(i).getSurname());
            System.out.println("Height: " + vetpep.get(i).getHeightcm() / 100 + " Meters");
            ast(0);
        }

    }

}
