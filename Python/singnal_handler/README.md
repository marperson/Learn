# Descriptions
##
Guide: https://blog.marco.ninja/notes/technology/python/python-handling-signals/


without handling the signals, Ctrl+C won't stop the long running python process


## Source
Discord SRE group
https://discord.com/channels/839106968425201664/839106968425201670/1266603377282781248


[11:49 PM]al7992: I was asked to write a signal handler for a particular signal once with python. Couldn’t do it back then (about 3 years ago) but it’s pretty simple and doable. Google phone screen.
[11:55 PM]joe: Oh don't forget yaml too lol
[11:57 PM]joe: Shoot I will fail this do you mean system signals like sigint ?
[7:35 AM]hottkarl: just writing app in asynchronous way and with Python signal support or lib?
[9:19 AM]marperson: Weekend challenge, write a signal Handler
[12:04 PM]al7992: Using the signal library. Write a signal handler for when you get a signal X, do nothing.

[8:26 PM]Gemini: So that's not the the intent of this phone screen question - we don't actually expect you to know the Python signal library off the top of your head. (But if you do, that's great!) It's more of to see if you understand how signals work under the context of an application/process. If you don't know the exactly library the interviewer will give you a generic signal function but it's up to you to determine how to actually implement it (such as using a try: except: statement) and accounting for edge edge cases as well as more specific signal questions (e.g. signal masks, non-handle-able signals). More senior applicants may know about the event loop and using asyncio. 

This is a bit of a hybrid question as it gets the interviewer information on both coding and Linux system internals knowledge. 
