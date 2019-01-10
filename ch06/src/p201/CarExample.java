package p201;

public class CarExample {
  public static void main(String[] args) {
    Car myCar = new Car();
    Car myCha = new Car();
    
    System.out.println("회사 : " + myCar.company);
    System.out.println("모델 : " + myCar.model);
    System.out.println("색깔 : " + myCar.color);
    System.out.println("최대속도 : " + myCar.maxSpeed);
    System.out.println("현재속도 : " + myCar.speed);
    
    myCar.speed = 60;
    System.out.println("현재속도 : " + myCar.speed);
}
}