<!-- PROJECT SHIELDS -->
<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

<!-- About The Project -->
## About The Project
Tutorial project to use Scarpy and Mongo
https://github.com/practical-tutorials/project-based-learning
https://realpython.com/web-scraping-with-scrapy-and-mongodb/

### Build With
- Ubuntu
- Google Chrome
- Python 3.11.orc1
- Scrapy==2.11.0
- pymongo==4.6.0


<!-- Getting Started -->
## Gettting Started

###  Prerequistes
- Ubuntu
- Install Python 3.10.12
- Install Google Chrome


### coding steps

cd Python/scraper_scrapy_and_mongo
python3.11 -m venv venv3.11
source ./venv3.11/bin/activate
pip install Scrapy
pip install pymongo
pip freeze > requirements.txt
scrapy startproject stack  #build stack folder
You can start your first spider with:
    cd stack
    scrapy genspider example example.com
cd stack/stack
vim settings.py, change ROBOTSTXT_OBEY = False
extract XPath from chrome developer tools
test xpath in JavaScript console like 
$x('//div[@class="s-post-summary--content"]/h3/a[@class="s-link"]/text()')
$x('//div[@class="s-post-summary--content"]/h3/a[@class="s-link"]/@href')


scrapy crawl stack
$ scrapy crawl stack -o items.json -t json  //to a json

update setting.py, insert mongo setup

install mongo on localhost
docker pull mongo
sudo docker run --rm --name stackoverflow -it -p 27017:27017 -d mongo:latest
sudo docker container ps
sudo docker exec -it stackoverflow bash

run in contrainer
mongosh
test> show dbs
admin   40.00 KiB
config  12.00 KiB
local   40.00 KiB
test> help

follow container log: sudo docker logs stackoverflow --follow

### Installation
```console
git clone $REPO
cd Python/classdojo_downloader/
python -m venv venv
source venv/bin/activate
python install -r requirements.txt
python3 classdojo_downloader.py



```

<!-- USAGE EXAMPLES -->
## Usage:
- Use Google Chrome login http://www.classdojo.com, open child page, load it till the end
- F12 open developer tools -> network -> (optiaonl)filter the data by img and media -> right click, copy -> copy all as HAR
- Save it to [./data/schema.json](./data/schema.json)
- Run script, image and video will be saved to [./download](./download) folder

```console
python classdojo_donwloader_request.py
```


### Note
**If post has several pics, need to load all pics**


<!-- Roadmap -->
## Roadmap
- [ ] Add Changelog
- [ ] Use lazy loading with Selenium


<!-- Contribution -->
## Contribution
Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Frank He - [@your_twitter](https://twitter.com/your_username) - frankhe@hotmail.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

Use this space to list resources you find helpful and would like to give credit to. I've included a few of my favorites to kick things off!

* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Malven's Flexbox Cheatsheet](https://flexbox.malven.co/)
* [Malven's Grid Cheatsheet](https://grid.malven.co/)
* [Img Shields](https://shields.io)
* [GitHub Pages](https://pages.github.com)
* [Font Awesome](https://fontawesome.com)
* [React Icons](https://react-icons.github.io/react-icons/search)

<p align="right">(<a href="#readme-top">back to top</a>)</p>