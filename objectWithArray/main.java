package objectWithArray;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

// this is much complicated and time consuming way

    //     Product products[] = new Product[3];
    //     Product p1 = new Product();
    //     p1.setId(1);
    //     p1.setName("neel");
    //     p1.setCompany("broadway");

    //     Product p2 = new Product();
    //     p2.setId(1);
    //     p2.setName("neel");
    //     p2.setCompany("broadway");

    //     products[0] = p1;
    //     products[1] = p2;

    //     for(Product p : products){
    //         System.out.println(p);
    //     }
    // }

// but declaring object one on one will be time and memory consuming if we have the size 100-200 or more.
// so we use loop here.

        Product products[] = new Product[3];
        for(int i = 0; i<3; i++){
            Scanner sc = new Scanner(System.in);

            Product p = new Product();
            System.out.println("enter id");
            p.setId(sc.nextInt());
            System.out.println("enter name");
            p.setName(sc.next());
            System.out.println("enter company");
            p.setCompany(sc.next());

            products[i] = p;
        }

        for(Product x : products){
            System.out.println(x);
        }
    }

}
