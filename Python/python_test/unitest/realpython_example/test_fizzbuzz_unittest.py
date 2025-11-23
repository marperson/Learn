import unittest
from fizzbuzz import fizzbuzz

class TestFizzBuzz(unittest.TestCase):
    def test_fizzbuzz(self):
        self.assertEqual(fizzbuzz(1), 1)
        self.assertEqual(fizzbuzz(3), "fizz")
        self.assertEqual(fizzbuzz(5), "buzz")
        self.assertEqual(fizzbuzz(15), "fizz buzz")
        self.assertEqual(fizzbuzz(30), "fizz buzz")
        self.assertEqual(fizzbuzz(2), 2)
        self.assertEqual(fizzbuzz(6), "fizz")
        self.assertEqual(fizzbuzz(10), "buzz")

if __name__ == "__main__":
    unittest.main()