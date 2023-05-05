public class Food {
  // Создать класс Food (еда). В классе должны быть: поле "название", конструктор, геттер, сеттер
  // метод "употребить еду" с каким-нибудь выводом
  private String name ;
  public Food( String name){
    this.name=name;
  }
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name = name;
  }
  public void eat(){
    System.out.println("You have eaten...... " + name);
  }
}



