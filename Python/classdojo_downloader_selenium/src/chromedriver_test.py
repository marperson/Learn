import time

from selenium import webdriver


# driver = webdriver.Chrome('/home/frank/Documents/GitHub/Learn/Python/classdojo_downloader_selenium/src/lib/chromedriver_linux64/chromedriver')
# driver = webdriver.Chrome('/path/to/chromedriver')  # Optional argument, if not specified will search path.
driver = webdriver.Chrome()
driver.get('http://www.google.com/');

time.sleep(5) # Let the user actually see something!

search_box = driver.find_element_by_name('q')

search_box.send_keys('ChromeDriver')

search_box.submit()

time.sleep(5) # Let the user actually see something!

driver.quit()