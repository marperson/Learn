from scrapy import Spider
from scrapy.selector import Selector
from stack.items import StackItem #inside the module, import parent folder with __init__.py

class StackSpider(Spider):
    name = "stack"
    allowed_domains = ["stackoverflow.com"]
    start_urls =[
        "http://stackoverflow.com/questions?pagesize=50&sort=newest",
    ]
    def parse(self, response):

        # questions = Selector(response).xpath('//div[@class="summary"]/h3')
        questions = Selector(response).xpath("//div[@class='s-post-summary--content']/h3")
        for question in questions:
            item = StackItem()
            print (item)
            # item['title'] = question.xpath(
                # 'a[@class="question-hyperlink"]/text()').extract()[0]
            # item['url'] = question.xpath(
                # 'a[@class="question-hyperlink"]/@href').extract()[0]

            item['title'] = question.xpath('a[@class="s-link"]/text()').extract()[0]
            item['url'] = question.xpath('a[@class="s-link"]/@href').extract()[0]
            print (item)

            # //*[@id="question-summary-77541148"]/div[2]/h3/a
            yield item