# Pizza Factory kata java
Pizza Factory

[![JAVA][java-badge]][java]
[![MAVEN][maven-badge]][maven]

[![Travis Build Status][build-badge]][build]
[![Coverage Status][coverage-badge]][coverage]

## Statement

### Problem Description

Create a program which which acts as a pizzeria, so that given an order from a customer, pizzas are made for delivery.

### Factory

Here is the pricing of pizza per type and size :

| Type          | Small    | Medium   | Large    |
|---            | ---      | ---      | ---      |
| Indi Tandoori | 11 euros | 16 euros | 21 euros |
| 4 cheeses     | 11 euros | 16 euros | 21 euros |
| Peperoni      | 10 euros | 15 euros | 19 euros |
| Mexican       | 11 euros | 16 euros | 21 euros |
| Vegetarian    | 9 euros  | 13 euros | 16 euros |

The customer add toppings if he wishes.

Toppings are :

- Cheeses (Mozzarella, Ricotta, Feta, Parmesan, Cheddar, Monterey) : + 2 euro per topping
- Vegetables (carrot, tomatoes, mushrooms, onions, olives, beans, peppers, spinach) : + 1 euro per topping
- Nuts (almonds, peanuts, pistachios, pine nuts, walnuts) : + 1 euro per topping
- Herbs and Spices (basil, coriander, garlic, oregano, pepper, rosemary) : + 1 euro per topping
- Sea Food (anchovies, lobster, shrimps, salmon, squid, tuna, oysters) : + 3 euro per topping
- Meats (bacon, ham, salami, meatballs, duck, chicken, barbequed meat) : + 2 euro per topping

There are 5 steps in making pizzas :

- making the dough - 1h30
- prepare pizza - 3 minutes per pizza
- add sauce - 30 secondes per pizza
- add toppings - 30 secondes per pizza
- bake - 10 to 15 minutes
- packaging - 15 seconds per pizza

When an order is being validated by the ordering manager, the factory will start making pizzas for that order. One order may have maximum 5 pizzas.

## Requirements

It is required to :

- make pizzas when an order is validated
- validate orders
- show estimated time for readyness
- show progress of pizza making

Further requirements :

- define price for pizzas
- show total price
- show details of an order
- the business owner wants to provide delivery service
- the customer may customize a pizza

## Useful link

[pizzafacts](http://www.pizzafacts.net/pizza-making)

#### Prerequisites

- JAVA 1.8
- Maven 3.x.x
- Docker (optional)

#### Features
**Comming Soon**

## Run

### Test
    mvn clean test

### Launch
    clean package exec:java

### Docker

Build : `docker build -t pizzafactory .` \
Run :  `docker run --rm -it pizzafactory:latest`

[java-badge]: https://img.shields.io/badge/java-v1.8-red.svg
[java]: https://www.java.com/fr/download/
[maven-badge]: https://img.shields.io/badge/maven-v3.8.0-orange.svg
[maven]: https://maven.apache.org
[build-badge]: https://travis-ci.org/segtio/kata-pizza-factory.svg?branch=master
[build]: https://travis-ci.org/segtio/kata-pizza-factory
[coverage-badge]: https://coveralls.io/repos/github/segtio/kata-pizza-factory/badge.svg?branch=master
[coverage]: https://coveralls.io/github/segtio/kata-pizza-factory?branch=master