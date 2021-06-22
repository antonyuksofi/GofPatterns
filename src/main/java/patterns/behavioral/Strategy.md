## Strategy

It encapsulates the family of algorithms by providing the common interface to interact with them,
and makes these algorithms implementations interchangeable.

_The Strategy is an interface, and the concrete example is instantiated by the Context. The user interacts with the Context,
and the Context forwards the call to the concrete implementation of the Strategy._

### Use Cases

* when there are several similar classes with different behavior - then one basic class is created,
and different behaviors are moved to different classes and then selected when needed

* when it's needed to provide a set of several solutions that can be easily interchanged depending on the incoming conditions

* when it is needed to change the behavior of classes and objects during runtime

* when the class that is applying some functionality should know nothing about its implementation

### Example Description

Context instantiates the concrete ClothesSelectionStrategy depending on the incoming conditions: temperature and fall-outs.
It also serves as client interface to change the algorithm via direct setting of concrete strategy
via Context.setStrategy(ClothesSelectionStrategy strategy).