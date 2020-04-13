# Builder Pattern
As a creation type patterns, it used to create and configure objects in a controlled manner. 



## Problem to Solve
When additional requirements are added, having multiple constructors can introduce errors, which a compiler will not be able to detect. 

For example:
``Warrior(String type, int agility, int strength, double durability)``

``Warrior(String type, int Strenght, int agility, double durability)``
.A Compiler will not be able to detect if a parameter is switch. 

``Warrior(String type, null, int strength, double durability)``


## Benefits
