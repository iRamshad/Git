package Address_Book;

import java.util.Scanner;
import java.util.TreeMap;

public class Address {
    String name;
    String address;
    String Blood_grp;

    long ph;

    Address(String name, String address, String Blood_grp, long ph) {
        this.name = name;
        this.address = address;
        this.Blood_grp = Blood_grp;
        this.ph = ph;

    }


    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        Address db = new Address("Name:Azar", "Address:Baker street,Nilambur Po, Malappuram Dist", "Blood:A+", 994646775);
        Address bc = new Address("Name:Shahanaz", "Address:Downtown,Orkatteri Po,Calicut Dist", "Blood:O+", 994548486);
        Address cd = new Address("Name:Nazeer", "Address:UpTown,Kannapuram Po,Kannur Dist", "Blood:A-", 994766613);
        Address de = new Address("Name:Faheem", "Address:DD Square,Areekkod Po,Malappuram Dist", "Blood:AB+", 807816834);
        Address ef = new Address("Name:Rashood", "Address:Skyline,payyoli Po,Calicut Dist", "Blood:o-", 703472706);


        System.out.println("Address Book");
        System.out.println(" ");
        System.out.println("Option 1: Display the Address");
        System.out.println("Option 2: Remove the Address");
        System.out.println("Option 3: Edit the Address");
        System.out.println("Option 4: Add new Address");
        System.out.println(" ");


        TreeMap<Long, Address> hp = new TreeMap<>();

        hp.put(9946467757l, db);
        hp.put(9945484869l, bc);
        hp.put(9947666138l, cd);
        hp.put(8078168348l, de);
        hp.put(7034727067l, ef);


        boolean fd=true;
        while(fd)
        {
            System.out.println("Enter the Options");

            int x = kl.nextInt();
            switch (x) {
                case 1: {
                    System.out.println("Enter the mob number");
                    long b = kl.nextLong();


                    if (hp.containsKey(b)) {
                        System.out.println(" ");
                        System.out.println("The Details of Given number");
                        System.out.println(" ");
                        System.out.println(hp.get(b).name);
                        System.out.println(hp.get(b).address);
                        System.out.println(hp.get(b).Blood_grp);
                        System.out.println(hp.get(b).ph);

                        break;
                    } else {
                        System.out.println("Not Found");
                        break;
                    }

                }
                case 2: {
                    System.out.println("Enter the mob number to remove");
                    long g = kl.nextLong();

                    if (hp.containsKey(g)) {
                        System.out.println("The Given number address is removed");
                        System.out.println(hp.get(g).name);
                        System.out.println(hp.get(g).address);
                        System.out.println(hp.get(g).Blood_grp);
                        System.out.println(hp.get(g).ph);
                        hp.remove(g);
                        break;
                    }else
                        {
                            System.out.println("Not found");
                            break;
                        }

                }
                case 3: {
                    System.out.println("Enter the address to Edit");
                    long w = kl.nextLong();
                    if (hp.containsKey(w)) {
                        System.out.println(hp.get(w).name);
                        System.out.println(hp.get(w).address);
                        System.out.println(hp.get(w).Blood_grp);
                        System.out.println(hp.get(w).ph);

                        System.out.println("Enter the Field to edit");
                        System.out.println("Option 1: name");
                        System.out.println("Option 2: Address");
                        System.out.println("Option 3: Blood");
                        System.out.println("Option 4: Phone");


                        int bd = kl.nextInt();

                        switch (bd)
                        {
                            case 1: {
                                System.out.println("Enter the name:");
                                String sw = kl.next();
                                hp.containsKey(w);
                                hp.get(w).name = sw;


                                System.out.println(hp.get(w).name);
                                System.out.println(hp.get(w).address);
                                System.out.println(hp.get(w).Blood_grp);
                                System.out.println(hp.get(w).ph);
                                break;

                            }
                            case 2:
                                {
                                    System.out.println("Enter the address");
                                    String add_1= kl.next();
                                    hp.containsKey(w);
                                    hp.get(w).address=add_1;
                                    System.out.println(hp.get(w).name);
                                    System.out.println(hp.get(w).address);
                                    System.out.println(hp.get(w).Blood_grp);
                                    System.out.println(hp.get(w).ph);

                                    break;


                                }

                        }


                    }
                    else
                        {
                            System.out.println("Not Found");
                            break;
                        }

                        break;
                }

                case 4:
                    {
                        System.out.println("Add a New Address");
                        System.out.println("name");
                        String mn=kl.next();
                        System.out.println("Address");
                        String nm=kl.next();
                        System.out.println("Blood");
                        String gm=kl.next();
                        System.out.println("Phone");
                        long sw=kl.nextLong();

                        Address we=new Address(mn,nm,gm,sw);
                        hp.put(sw,we);

                        System.out.println(hp.get(sw).name);
                        System.out.println(hp.get(sw).address);
                        System.out.println(hp.get(sw).Blood_grp);
                        System.out.println(hp.get(sw).ph);

                        break;
                    }

                    default:
                    {
                        fd=false;
                        System.out.println();
                        System.exit(0);
                        }

            }


        }

    }


}









