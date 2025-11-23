# PYTHON_TEST: Testing Examples in Python

This repository demonstrates three common ways to write and run tests in Python:

## 1. Doctest
- **Location:** `doctest/realpython_example/fizzbuzz.py`
- **Description:**
  - Doctest allows you to write test cases as part of your function's docstring.
  - To run doctests, execute the script directly:
    ```bash
    python doctest/realpython_example/fizzbuzz.py
    python3.12 fizzbuzz.py -v
    ```

## 2. Unittest
- **Location:** `unitest/realpython_example/test_fizzbuzz_unittest.py`
- **Description:**
  - Uses Python's built-in `unittest` framework.
  - To run the tests:
    ```bash
    python unitest/realpython_example/test_fizzbuzz_unittest.py
    python3.12 -m unittest -v test_fizzbuzz_unittest.py
    ```

## 3. Pytest
- **Location:** `pytest/realpython_example/test_fizzbuzz_pytest.py`
- **Description:**
  - Uses the third-party `pytest` framework for concise and powerful testing.
  - need virtual env and install pytest module 
  - To run the tests:
    ```bash
    <!-- pytest pytest/realpython_example/test_fizzbuzz_pytest.py -->
    python3.12 -m pytest test_fizzbuzz_test_fizzbuzz_pytest.py
    ```

---
Each directory contains a `fizzbuzz.py` implementation and a corresponding test file for the respective framework.
