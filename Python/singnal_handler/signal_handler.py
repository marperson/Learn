#!/user/bin/env python3.13.0b3
import signal

import signals

class SignalHandler:
    stop = False

    def __init__(self):
        # Ctrl+C
        signal.signal(signal.SIGINT, self.exit_gracefully)

        # Supervisor/process manager signals
        signal.signal(signal.SIGTERM, self.exit_gracefully)
        signal.signal(signal.SIGQUIT,self.exit_gracefully)


    def exit_gracefully(self, *args):
        self.stop = True

print("Starting program")

# exmaple 1: simple loop
signal_handler = SignalHandler()
# handle signals
while not signal_handler.stop:
    # do_something()
    print ("oh la la!")
print("Saving state and stopping gracefully")

# without handling signals, can't exit the process
"""while True:
    print ("no no no")"""


# example 2: Loop with sleep
import time

