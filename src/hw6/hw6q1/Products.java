package hw6.hw6q1;

import hw6.hw6q1.product.publish.Books;
import hw6.hw6q1.product.publish.Magazines;
import hw6.hw6q1.product.electronic.Radios;
import hw6.hw6q1.product.electronic.Televisions;
import hw6.hw6q1.product.shoe.Formals;
import hw6.hw6q1.product.shoe.Sports;

public class Products {
    private Books[] books = new Books[3];
    private Magazines[] magazines = new Magazines[2];
    private Sports[] sports = new Sports[4];
    private Formals[] formals = new Formals[3];
    private Televisions[] televisions = new Televisions[2];
    private Radios[] radios = new Radios[3];

    public Books[] getBooks() {
        return books;
    }

    public Magazines[] getMagazines() {
        return magazines;
    }

    public Sports[] getSports() {
        return sports;
    }

    public Formals[] getFormals() {
        return formals;
    }

    public Televisions[] getTelevisions() {
        return televisions;
    }

    public Radios[] getRadios() {
        return radios;
    }

    public void setProducts() {
        books[0] = new Books("1984", "George Orwell", 328, 21530);
        books[1] = new Books("Toxic People", "Lillian Glass", 264, 120000);
        books[2] = new Books("Dummies", "Brenda Hoddinott", 333, 67730);

        magazines[0] = new Magazines("Disney Comics", "Comic World", 60, 18000);
        magazines[1] = new Magazines("Attack On Titan", "Kodansha Comics", 3, 220000);

        sports[0] = new Sports("BLGRE", 35, "Hand Ball", 199000);
        sports[1] = new Sports("Adidas Messi", 28, "Futsal", 365000);
        sports[2] = new Sports("MQ02", 24, "Walking", 219000);
        sports[3] = new Sports("BARSA-SO", 34, "Walking", 179000);

        formals[0] = new Formals("SHO136", 43, "Leather", 157000);
        formals[1] = new Formals("Milan", 40, "Linen", 201000);
        formals[2] = new Formals("K.BAZ.102", 40, "Leather", 91000);

        televisions[0] = new Televisions("LG GTV-50LU722S", "Smart LED", 50, "4k", 10290000);
        televisions[1] = new Televisions("Snowa SSD-50SA620U", "Smart LED", 50, "4k", 11250000);

        radios[0] = new Radios("Golon", "Desktop", 13, "RED", 222000);
        radios[1] = new Radios("Meier", "Desktop", 23, "DARK-BROWN", 608000);
        radios[2] = new Radios("Sony", "Pocket", 13, "BLACK", 1300000);
    }
}
