import pytest
from fizzbuzz import fizzbuzz

def test_fizzbuzz():
    assert fizzbuzz(1) == 1
    assert fizzbuzz(3) == "fizz"
    assert fizzbuzz(5) == "buzz"
    assert fizzbuzz(15) == "fizz buzz"
    assert fizzbuzz(30) == "fizz buzz"
    assert fizzbuzz(2) == 2
    assert fizzbuzz(6) == "fizz"
    assert fizzbuzz(10) == "buzz"
