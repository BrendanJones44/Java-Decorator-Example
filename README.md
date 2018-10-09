# Decorator Design Pattern Example in Java

## Original Pattern from Gang of Four:
![Gang of Four UML of pattern](Images/GangOfFourUML.png?raw=true "GangOfFourUML")

## Pizza Parlor Problem Statement
You are desiging a system for which pizza's can be ordered at Brendan's Pizza Parlor. 

Rather than create numerous menu items, Brendan's Pizza Parlor offers build your own pizza's. Desipite having no technical menu items, Brendan's Pizza Parlor is required by law to report nutritional information for anything they serve. Brendan's Pizza parlor would also like know how profitable certain pizza combinations are so they could make specialty menu items in the future.

Below is Brendan's Pizza Parlor ingredient information to help assist with this problem:

### Ingredient Information

| Ingredient    | Food Cost     | Menu Price  | Calories    |
| ------------- |---------------| ------------|-------------|
| Pizza Crust   |     $2.29     |   $6.50     |   550       |
| Red Sauce     |     $0.31     |   $0.50     |    80       |
| Alfredo Sauce |     $0.85     |   $1.50     |   220       |
| BBQ Sauce     |     $0.47     |   $0.75     |   140       |
| Shredded Mozz |     $0.30     |   $1.00     |   220       |
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

