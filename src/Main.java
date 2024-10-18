import java.io.File;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        doFile();

        }
        public static Object doFile(){
            File file = new File("notes.txt");
            try{
                boolean creates = file.createNewFile();
            } catch (Exception e){
                System.out.println(e.getMessage());
            };return file;

        }
    public static void examplePizza_doArray (){
        List <Pizzas> list = new ArrayList<>();
        list.add(new Pizzas(Name.MARGARITA,32 ), new Pizzas(Name.FOUR_CHEESES, 30), new Pizzas())

    }
    }
