"""
Exmaple to use copilot to generate doctest tests for a simple calculator app.
"""

import doctest

"""
A simple calculator app with doctest examples.
"""

def add(a, b):
    """
    Returns the sum of a and b.

    >>> add(2, 3)
    5
    >>> add(-1, 1)
    0
    """
    return a + b

def subtract(a, b):
    """
    Returns the difference of a and b.

    >>> subtract(5, 2)
    3
    >>> subtract(0, 4)
    -4
    """
    return a - b

if __name__ == "__main__":
    print ("starting doctest...")
    doctest.testmod()
    print ("doctest complete.")