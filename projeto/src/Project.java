import java.util.*;

public class Project {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();
        int op = -1; int opsex = -1;
        boolean veri = true;

        while (op != 0) {

            if (veri) {
                System.out.println("Switch an option::");
            System.out.println("1- Register-");
            System.out.println("2- Check all registers-");
            System.out.println("3- Check by the gender of the registered-");
            System.out.println("4- Check by the name-");
            System.out.println("5- Check by the number and the percent of the genders-");
            System.out.println("6- Check ordened by the age-");
            System.out.println("ENTER '0' ANY TIME TO STOP THE PROGRAM");
            data.proend(op);

        }
                do {

                    try {
                        op = sc.nextInt();
                    } catch (InputMismatchException e) {

                    }
                    sc.nextLine();

                } while (op == -2);

                switch (op) {


                    case 1:
                        System.out.println("~~Persons register:~~");
                        System.out.println("1- Man Register-");
                        System.out.println("2- Woman Register-");
                        System.out.println("3- Other-");
                        do {

                        try {
                            opsex = sc.nextInt();
                            data.proend(opsex);
                        } catch (InputMismatchException e) {

                            veri = false;
                           break;
                        }
                        veri=true;

                    } while (opsex == -2);

                        switch (opsex) {

                            case 1:
                                Man man = new Man();
                                System.out.println("Male Register :");
                                sc.nextLine();
                                System.out.println("Enter the name:");
                                man.setName(sc.nextLine());
                                System.out.println("Enter the surname:");
                                man.setSurname(sc.nextLine());
                                System.out.println("Enter the age:");
                                man.setAge(sc.nextInt());
                                System.out.println("Enter the height in CM:");
                                man.setHeightcm(sc.nextFloat());
                                man.setType("Man");
                                data.peptype(man);
                                break;
                            case 2:
                                Woman woman = new Woman();
                                System.out.println("Female register:");
                                sc.nextLine();
                                System.out.println("Enter the name:");
                                woman.setName(sc.nextLine());
                                System.out.println("Enter the surname:");
                                woman.setSurname(sc.nextLine());
                                System.out.println("Enter the age:");
                                woman.setAge(sc.nextInt());
                                System.out.println("Enter the height in CM:");
                                woman.setHeightcm(sc.nextFloat());
                                woman.setType("Woman");
                                data.peptype(woman);
                                break;
                            case 3:
                                Other other = new Other();
                                System.out.println("Another gender register");
                                sc.nextLine();
                                System.out.println("Enter the name:");
                                other.setName(sc.nextLine());
                                System.out.println("Enter the surname:");
                                other.setSurname(sc.nextLine());
                                System.out.println("Enter the age:");
                                other.setAge(sc.nextInt());
                                System.out.println("Enter the height in CM:");
                                other.setHeightcm(sc.nextFloat());
                                other.setType("Other");
                                data.peptype(other);
                                break;
                            default:
                                data.invalid();
                        }
                        break;
                    case 2:
                        data.showdata();
                        break;
                    case 3:
                        System.out.println("Filter by the gender:");
                        System.out.println("1- Consult men-");
                        System.out.println("2- Consult women-");
                        System.out.println("3- Another gender-");
                        do {

                            try {
                                int mw = sc.nextInt();
                                data.proend(mw);
                                data.sexfilter(mw);
                            } catch (InputMismatchException e) {
                                data.invalid();
                                veri = false;
                                break;
                            }
                            veri=true;

                        } while (opsex == -2);

                        break;
                    case 4:
                        System.out.println("Filter by the name:");
                        System.out.println("Enter the name to be filtered:");
                        String namepeps = sc.nextLine();
                        data.namefilter(namepeps);
                        break;

                    case 5:
                        try {
                            data.contmanwom();
                        } catch (ArithmeticException one) {
                            data.ast(0);
                            System.out.println("Empty Records!");
                            System.out.println("Try again!");
                            data.ast(0);
                        }
                        break;
                    case 6:
                        data.ordage();
                    default:
                        if (op != 0) {
                            data.invalid();

                        } else {
                            data.proend(op);
                        }

                }

            }
        }
    }







