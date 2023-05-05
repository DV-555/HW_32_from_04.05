public class Main {

  public static void main(String[] args) {

    /*Задача 1
     Создать класс Food (еда). В классе должны быть:

     поле "название"
     конструктор, геттер, сеттер
     метод "употребить еду" с каким-нибудь выводом
     Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:

     поле "газированный" (да/нет)
     метод "открыть", который:
     для газированного напитка печатает "пшш",
     для негазированного - "скр"  */

      Food pizza = new Food("Pizza Salami");
      System.out.printf("%n" + pizza.getName() + "%n");
      pizza.eat();

      pizza.setName("Pizza Hawaii");
      System.out.printf("%n" + pizza.getName() + "%n");
      pizza.eat();

      Drink drink = new Drink("Pepsi-Cola");
      System.out.printf("%n" + drink.getName() + "%n");
      drink.open(true);
    }
  }

