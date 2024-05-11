package exercicios;

public class ex01 {

    public static void main(String[] args) {
        String gameRPG = "Hogwarts Legacy";
        String gameIndie = "Hollow Knight";

        int age = 35;
        int code = 2367;
        char gender = 'M';
        double price, princeIndie;

        price = 107.80;
        princeIndie = 46.99;

        int valorArredondado = ((int)price + (int)princeIndie)/2;
        float valorArredondadoAmericano = ((float)price + (float)princeIndie)/2;


        System.out.println("Produto");
        System.out.println(gameRPG + ", está custando " + "R$" + price);
        System.out.println(gameIndie + ", está custando " + "R$" + princeIndie);
        System.out.println();

//        System.out.println("O comprador tinha " + age + " anos, " + "code " + code + " e genero: "  + gender);
        System.out.printf("O comprador tinha %d anos código %d e genero: %s%n", age, code, gender);
//        System.out.println("Média do valor de: " + ((price + princeIndie)/2));
        System.out.printf("Média do valor de: %f%n", ((price + princeIndie)/2) );
//        System.out.println("Média do valor de arredondamento: " +  valorArredondado);
        System.out.printf("Média do valor de arredondamento: %d%n", valorArredondado);
//        System.out.println("Média do valor de arredondamento no padrão americano: " + valorArredondadoAmericano);
        System.out.printf("Média do valor de arredondamento no padrão americano: %.2f", valorArredondadoAmericano);

    }
}
