
from time import sleep
from tqdm import tqdm


text = ""
# for char in tqdm(["a", "b", "c", "d"]):
for char in tqdm(["a", "b", "c", "d"], position=0, leave=True):
    sleep(0.25)
    print ("dddddddddddddd")
    text = text + char


'''
pbar = tqdm(["a", "b", "c", "d"])
for char in pbar:
    sleep(0.25)
    pbar.set_description("Processing %s" % char)


pbar = tqdm(total=100)
for i in range(10):
    sleep(0.1)
    pbar.update(10)
pbar.close()
'''

"""
from tqdm import tqdm 
import time

def foo_():
    time.sleep(5)
range_ = range(0, 10)
total = len(range_)

with tqdm(total=total, position=0, leave=True) as pbar:
    for i in tqdm((foo_, range_ ), position=0, leave=True):
        print("3333333333333")
        time.sleep(3)
        pbar.update()
"""
