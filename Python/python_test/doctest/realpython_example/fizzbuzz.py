def fizzbuzz(number):
    """
    Returns 'fizz' if number is divisible by 3,
    'buzz' if divisible by 5,
    'fizz buzz' if divisible by 15,
    else returns the number.

    >>> fizzbuzz(1)
    1
    >>> fizzbuzz(3)
    'fizz'
    >>> fizzbuzz(5)
    'buzz'
    >>> fizzbuzz(15)
    'fizz buzz'
    >>> fizzbuzz(30)
    'fizz buzz'
    >>> fizzbuzz(2)
    2
    >>> fizzbuzz(6)
    'fizz'
    >>> fizzbuzz(10)
    'buzz'
    """
    if number % 15 == 0:
        return "fizz buzz"
    elif number % 3 == 0:
        return "fizz"
    elif number % 5 == 0:
        return "buzz"
    
    else:
        return number
    

if __name__ == "__main__":
    import doctest
    doctest.testmod()