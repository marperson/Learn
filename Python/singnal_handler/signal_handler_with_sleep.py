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


import time
TOTAL_SLEEP = 60
print("starting program")

single_handler = SignalHandler()
while not single_handler.stop:
    print("oh la la")
    # n this case the simplest solution is to break up the large sleep into shorter sleep intervals and check SignalHandler in between sleeping.
    for _ in range(0, TOTAL_SLEEP):
        time.sleep(1)
        if single_handler.stop:
            break

print("Saving state and stopping gracefully")
