# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://docs.scrapy.org/en/latest/topics/item-pipeline.html


# useful for handling different item types with a single interface
# from itemadapter import ItemAdapter


# class StackPipeline:
#     def process_item(self, item, spider):
#         return item

import pymongo

from scrapy.utils.project import get_project_settings
# from scrapy.conf import settings
from scrapy.exceptions import DropItem
import logging



class MongoDBPipeline(object):
    
    def __init__(self):
        """settings = get_project_settings()
        print(settings)
        connection = pymongo.MongoClient(
            settings.get("MONGODB_SERVER"),
            settings.get("MONGODB_PORT")
            # settings.MONGODB_SERVER,
            # settings.MONGODB_PORT
        )
        db = connection[settings.get("MONGODB_DB")]
        self.collection = db[settings.get("MONGO_COLLECTION")]
        # db = connection[settings.MONGODB_DB]
        # self.collection = db[settings.MONGO_COLLECTION]"""



        connection = pymongo.MongoClient("localhost", 27017)
        db = connection["stackoverflow"]
        self.collection = db["questions_1"]

    def process_item(self, item, spider):
        valid = True
        for data in item:
            print ("--------------------------------")
            if not data:
                valid = False
                raise DropItem("Missing {0}!".format(data))
            
            if valid:
                self.collection.insert_one(dict(item))
                # logging.DEBUG("Question added to MongoDB database!", spider=spider)
                
        return item