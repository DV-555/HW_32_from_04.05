public class Drink extends Food{

// Создать класс Drink (напиток) - наследника класса Food. В классе должны быть дополнительно:
// поле "газированный" (да/нет)
// метод "открыть", который:
// для газированного напитка печатает "пшш",
// для негазированного - "скр"  */
  boolean sparkling;
  public Drink(String name) {  // создали конструктор
  super(name);
  }
  public void open(boolean sparkling) {
    if (sparkling) {
      System.out.printf("Пшш......" + "You choose Sparkling " + getName() + "%n");
    } else {
      System.out.printf("Скр......" + "You choose still " + getName() + "%n");
    }
  }
}



