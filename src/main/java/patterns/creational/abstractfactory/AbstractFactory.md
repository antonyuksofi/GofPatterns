## Abstract Factory

Used to provide an interface for creating families of related or dependent 
objects without specifying their concrete classes.

### Use Cases
* when the system should not be dependent on the way of new objects creation
* when the created objects should be used together and are connected between each other

### Example Description

Santa Claus needs to have different bags (abstract factory) for different 
material types of toys for different children:
* a bag with soft fluffy toys (1st factory impl)
* a bag with wooden toys (2nd factory impl)
* a bag with Lego toys (3rd factory impl)
etc