import java.util.ArrayList;

public class Data {

    int conttotal = 0;
    int conthomi = 0;
    int contmuie = 0;
    private ArrayList<People> vetpessoa = new ArrayList<>();


    public void asteriscos(int linhas) {
        for (int i = 0; i < linhas; i++) {
            System.out.println("");
        }
        System.out.println("************************");
    }


    public void inserepessoa(People people) {
        this.vetpessoa.add(people);
        conttotal++;
    }

    public void mostrardados() {
        System.out.println("All registers:");
        asteriscos(0);
        for (int i = 0; i < vetpessoa.size(); i++) {
            System.out.println("Gender: " + vetpessoa.get(i).getType());
            System.out.println("Name: " + vetpessoa.get(i).getName());
            System.out.println("Surname: " + vetpessoa.get(i).getSurname());
            System.out.println("Age: " + vetpessoa.get(i).getAge());
            System.out.println("height: " + vetpessoa.get(i).getHeightcm() / 100 + " Meters");
        }
        asteriscos(0);

    }

    public void filtrosex(int op) {
        switch (op) {
            case 1:
                System.out.println("Men Registers:");
                asteriscos(0);
                for (int i = 0; i < vetpessoa.size(); i++) {
                    if (vetpessoa.get(i).getType().equals("Man")) {
                        System.out.println("Name: " + vetpessoa.get(i).getName());
                        System.out.println("Surname: " + vetpessoa.get(i).getSurname());
                        System.out.println("Age: " + vetpessoa.get(i).getAge());
                        System.out.println("height: " + vetpessoa.get(i).getHeightcm() / 100 + " Meters");
                        asteriscos(0);
                    }

                }
                break;
            case 2:
                System.out.println("Women registers:");
                asteriscos(0);
                for (int i = 0; i < vetpessoa.size(); i++) {
                    if (vetpessoa.get(i).getType().equals("Woman")) {
                        System.out.println("Name: " + vetpessoa.get(i).getName());
                        System.out.println("Surname: " + vetpessoa.get(i).getSurname());
                        System.out.println("Age: " + vetpessoa.get(i).getAge());
                        System.out.println("Height: " + vetpessoa.get(i).getHeightcm() / 100 + " Meters");
                        asteriscos(0);
                    }

                }
                break;
            default:
                System.out.println("Empty registers!");

        }
    }

    public void filtronome(String nomepe) {
        asteriscos(0);
        for (int i = 0; i < vetpessoa.size(); i++) {
            if (vetpessoa.get(i).getName().equals(nomepe)) {
                System.out.println("Name: " + vetpessoa.get(i).getName());
                System.out.println("Surname: " + vetpessoa.get(i).getSurname());
                System.out.println("Age: " + vetpessoa.get(i).getAge());
                System.out.println("Height: " + vetpessoa.get(i).getHeightcm() / 100 + " Meters");
                asteriscos(0);
            }
        }
    }
    public void conthomimuie(){
        System.out.println("Men and Women cont:");
        for (int i = 0; i<vetpessoa.size();i++){
            if(vetpessoa.get(i).getType().equals("Man")) {
                conthomi++;
            }else{
                contmuie++;
            }
        }

        int valortotalh = (conthomi*100)/conttotal;
        int valortotalm = (contmuie*100)/conttotal;
        asteriscos(0);
        System.out.println("Man numbers: " + conthomi);
        System.out.println("Man percent: " + valortotalh + "%");
        System.out.println("------------------------------");
        System.out.println("Woman numbers: " + contmuie);
        System.out.println("Woman percent: " + valortotalm + "%");
        asteriscos(0);



    }
}
