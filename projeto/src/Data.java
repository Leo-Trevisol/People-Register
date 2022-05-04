import java.util.ArrayList;

public class Data {

    int conttotal = 0;
    int contman = 0;
    int contwom = 0;
    private ArrayList<People> vetpep = new ArrayList<>();


    public void ast(int rows) {
        for (int i = 0; i < rows; i++) {
            System.out.println("");
        }
        System.out.println("************************");
    }


    public void inserepessoa(People people) {
        this.vetpep.add(people);
        conttotal++;
    }

    public void mostrardados() {
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

    public void filtrosex(int op) {
        switch (op) {
            case 1:
                System.out.println("Men Registers:");
                ast(0);
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
                ast(0);
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
            default:
                System.out.println("Empty registers!");

        }
    }

    public void filtronome(String nomepe) {
        ast(0);
        for (int i = 0; i < vetpep.size(); i++) {
            if (vetpep.get(i).getName().equals(nomepe)) {
                System.out.println("Name: " + vetpep.get(i).getName());
                System.out.println("Surname: " + vetpep.get(i).getSurname());
                System.out.println("Age: " + vetpep.get(i).getAge());
                System.out.println("Height: " + vetpep.get(i).getHeightcm() / 100 + " Meters");
                ast(0);
            }
        }
    }
    public void conthomimuie(){
        System.out.println("Men and Women cont:");
        for (int i = 0; i<vetpep.size();i++){
            if(vetpep.get(i).getType().equals("Man")) {
                contman++;
            }else{
                contwom++;
            }
        }

        int valortotalh = (contman*100)/conttotal;
        int valortotalm = (contwom*100)/conttotal;
        ast(0);
        System.out.println("Man numbers: " + contman);
        System.out.println("Man percent: " + valortotalh + "%");
        System.out.println("------------------------------");
        System.out.println("Woman numbers: " + contwom);
        System.out.println("Woman percent: " + valortotalm + "%");
        ast(0);



    }
}
