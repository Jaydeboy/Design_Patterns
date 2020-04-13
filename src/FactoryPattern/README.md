# Factory Pattern

The Factory Pattern benefit is in its **_"upkeep and in its ability to implement changes"_** of its concrete classes.

With a factory an Object is created only within the factory. In this process, the object creation is decoupling from the rest of the program. As a result, changes to a concrete class can be updated in one place.

## Problem to Solve
Where there's a needs for standardization in creating objects seperated from the overall project.


## Benefits
1. When a project is expected to have numerous concrete classes with possible future changes and modification and the possible additions of new classes, a factory can allow those changes to be implemented in one place. The added benefits and tenfold:
    * reduces errors and errors spreading throughout the project
    * changes can be implemented in one central place
    * addition of new classes are easily added. (instance are created in one central place - The factory class) 
    
```
