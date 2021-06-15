## Adapter

Used to transform the interface of one class to the interface of another class (which the clients expect).

_By functioning - can be compared to the power electricity adapter_

### Use Cases
* we want to use the existing class, 
  but its interface is not compatible with business logic
* we need to use existing class alongside with other classes, 
  and their interfaces are different

### Example Description

We can have OldSystem, which we still need to work with,
and NewSystem. These systems have different interfaces.
That's why we create an adapter (wrapper) OldSystemAdapter for OldSystem,
so that the SystemClient can operate with both systems via the same interface.