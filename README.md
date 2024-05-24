# Circulary-LinkedLists
In this section, we design a structure known as a circularly linked list, which is
essentially a singularly linked list in which the next reference of the tail node is set
to refer back to the head of the list
In implementing a new class, we make one additional optimization, we no longer
explicitly maintain the head reference. So long as we maintain a reference to the
tail, we can locate the head as tail.getNext( ). Maintaining only the tail reference
not only saves a bit on memory usage, it makes the code simpler and more efficient,
as it removes the need to perform additional operations to keep a head reference
current.
