import unittest

import sys
# caution: path[0] is reserved for script path (or '' in REPL)
sys.path.insert(1, '..')

from flask_demo import index

class TestFlaskDemo(unittest.TestCase):
    def test_index(self):
        self.assertEqual(1,2,"tteee")



if __name__ == "__main":
    unittest.main()