# Decorator Design Pattern Example in Java

## Getting stated
Simply download the source code, compile, and run
 ```java test/PizzaParlorTest.java```

 Note this requires `JUnit-4` as a dependency.

## Original Pattern from Gang of Four
![Gang of Four UML of pattern](Images/GangOfFourUML.png?raw=true "GangOfFourUML")

## Pizza Parlor Problem Statement
You are desiging a system for which pizza's can be ordered at Brendan's Pizza Parlor. 

Rather than create numerous menu items, Brendan's Pizza Parlor offers build your own pizza's. Desipite having no technical menu items, Brendan's Pizza Parlor is required by law to report nutritional information for anything they serve. Brendan's Pizza parlor would also like know how profitable certain pizza combinations are so they could make specialty menu items in the future.

Brendan's Pizza Parlor starts all pizza's at $6.50. This includes cheese and sauce, however customers may vouch for a "Tomato Pie" where it's just sauce and crust, or a "White Pie" where it's just cheese. These items still cost $6.50 though.

Below is Brendan's Pizza Parlor ingredient information to help assist with this problem:

### Ingredient Information

| Ingredient    | Food Cost     | Menu Price  | Calories    |
| ------------- |---------------| ------------|-------------|
| Pizza Crust   |     $2.29     |   $6.50     |   550       |
| Red Sauce     |     $0.31     |   $0.00     |    80       |
| Alfredo Sauce |     $0.85     |   $1.50     |   220       |
| BBQ Sauce     |     $0.47     |   $0.75     |   140       |
| Shredded Mozz |     $0.30     |   $0.00     |   220       |
| Fresh Mozz    |     $0.91     |   $2.00     |   200       |
| Onions        |     $0.19     |   $0.50     |    50       |
| Peppers       |     $0.21     |   $0.50     |    40       |
| Pepperoni     |     $0.22     |   $0.75     |   160       |
| Sausage       |     $0.39     |   $0.75     |   210       |
| Chicken       |     $0.56     |   $1.00     |   140       |
| Beef          |     $0.44     |   $1.00     |   230       |

### Requirements

For each possible pizza, there should be information available on:
- Total Calories
- Total Cost for Brendan's Pizza Parlor
- Total Price for customer

## System Design Solution
![Subsystem UML](Images/SubsystemUML.png?raw=true "SubsystemUML")

### Initial Pattern Participants

| Class Name     | GoF Role          | Responsibilities | 
| -------------- |-------------------| -----------------|
| Pizza          | Component         | Defines the interface for all Pizza's that can be ordered in Brendan's Pizza Parlor
| BasePizza      | ConcreteComponent | Defines the base pizza, just pizza crust, for ingredients to be added to
| Ingredient     | Decorator         | Defines an ingredient which adds additional responsibilities (calories, food cost, and menu cost) to the BasePizza
| WithIngredient | ConcreteDecorator | Adds calories/food cost/menu cost to the BasePizza

#### Rationale
Following the Gang of Four Pattern, it makes senses to have a Base Pizza with just crust, and having Decorators for each possible addition to the pizza.

Having a Pizza Interface makes sense, since each pizza must have:
```
getCalories()
getTotalFoodCost()
getTotalPrice()
```

#### Deviations from pattern:
Since an Ingredient can't exist without a Pizza, it made sense to have a composition relationship with Pizza, rather than aggregation.

Since every pizza needs a food cost, calorie count, and menu price, it made sense for the Pizza interface to have more than just one operation() method. Not all ingredients will have a unique implementation of each method, as some items like sauce and cheese are complimentary to customers for ordering a base pizza. These will just call the super class's method.

### Final UML Diagram
![Final UML Diagram](Images/FinalUML.png?raw=true "FinalUML")
