import java.util.*;

public class Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();
        int op = -1;

        while (op != 0) {
                System.out.println("Switch an option::");
                System.out.println("1- Register-");
                System.out.println("2- Check all registers-");
                System.out.println("3- Check by the gender of the registered");
                System.out.println("4- Check by the name-");
                System.out.println("5- Check by the number of Mans and Womans-");
                System.out.println("0- Leave.");
                op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.println("~~Persons register:~~");
                    System.out.println("1- Man Register-");
                    System.out.println("2- Woman Register-");
                    int opsex = sc.nextInt();

                    switch (opsex) {


                        case 1:
                            Man man = new Man();
                            System.out.println("Male Register :");
                            sc.nextLine();
                            System.out.println("Type the name:");
                            man.setName(sc.nextLine());
                            System.out.println("Type the surname:");
                            man.setSurname(sc.nextLine());
                            System.out.println("Type the age:");
                            man.setAge(sc.nextInt());
                            System.out.println("Type the height in CM:");
                            man.setHeightcm(sc.nextFloat());
                            man.setType("Man");
                            data.inserepessoa(man);
                            break;
                        case 2:
                            Woman woman = new Woman();
                            System.out.println("Female register:");
                            sc.nextLine();
                            System.out.println("Type the name:");
                            woman.setName(sc.nextLine());
                            System.out.println("Type the surname:");
                            woman.setSurname(sc.nextLine());
                            System.out.println("Type the age:");
                            woman.setAge(sc.nextInt());
                            System.out.println("Type the height in CM:");
                            woman.setHeightcm(sc.nextFloat());
                            woman.setType("Woman");
                            data.inserepessoa(woman);
                            break;
                        default:
                            data.ast(0);
                            System.out.println("Invalid option!");
                            System.out.println("Try again!");
                            data.ast(0);

                    }
                    break;
                case 2:
                    data.mostrardados();
                    break;
                case 3:
                    System.out.println("Filter by the gender:");
                    System.out.println("1- Consult men-");
                    System.out.println("2- Consult women-");
                    int mascfem = sc.nextInt();
                    data.filtrosex(mascfem);
                    break;
                case 4:
                    System.out.println("Filter by the name:");
                    sc.nextLine();
                    System.out.println("Type the name to be filtered:");
                    String nomepess = sc.nextLine();
                    data.filtronome(nomepess);
                    break;

                case 5:
                    try {
                        data.conthomimuie();
                    } catch (ArithmeticException one) {
                        data.ast(0);
                        System.out.println("Empty Records!");
                        System.out.println("Try again!");

                        data.ast(0);
                    }
                    break;
                default:
                    if (op != 0) {
                        data.ast(0);
                        System.out.println("Invalid option!");
                        System.out.println("Try again!");
                        data.ast(0);

                    }else{
                        data.ast(0);
                        System.out.println("Finished Program");
                        data.ast(0);
                    }

            }

        }
    }
}






