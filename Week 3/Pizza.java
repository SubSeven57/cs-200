//CS200
//(Spring, 2019)
//Instructor: F.Porps
//Assignment #2
//Due: 01/21/2019
//File name: Pizza.java

class Pizza {
  public static void main (String args[]) {

  //declare all needed variables first
  double RADIUS_PIZZA_A = 3.5;
  double RADIUS_PIZZA_B = 7;
  double pizzaPowerA = RADIUS_PIZZA_A * RADIUS_PIZZA_A;
                                                              double pizzaPowerB = RADIUS_PIZZA_B * RADIUS_PIZZA_B;
  double pizzaAreaA = Math.PI * pizzaPowerA;
  double pizzaAreaB = Math.PI * pizzaPowerB;

  //complete necessary computation processes
  double pizzaAreaSum = pizzaAreaA * 2;
  double pizzaAreaDiff = pizzaAreaB - pizzaAreaA;
  double pizzaAreaDiv =  pizzaAreaB / 6;
  //display user friendly outcomes to solve the problem
  System.out.println("In two 7\" pizzas, there are " + pizzaAreaSum + " square inches of pizza and in a 14\" pizza, there are " + pizzaAreaB + " square inches of pizza.");
  System.out.println("You will get " + pizzaAreaDiff + " more square inches of pizza by ordering one 14\" pizza rather than one 7\" pizza.");
  System.out.println("If you order a 14\" pizza and split it 6 ways - including you - you will get to eat exactly " + pizzaAreaDiv + " square inches of pizza.");
  }
}
