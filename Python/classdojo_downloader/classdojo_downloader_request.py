import shutil
import json
from enum import Enum
import requests

class FileType(Enum):
    photo = "sphotos.classdojo.com"
    video = "svideos.classdojo.com"



setting = {
    "PHOTO_URL" : "https://sphotos.classdojo.com/dojophotos/6360c63ca3a70ca520790946/2023-10-05/610c6979f80a117c2512bdb5a072a2a72cd97a7e_06c4bfe4cf13/da6e0345e0fd.jpg      \
                    ?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9zcGhvdG9zLmNsYXNzZG9qby5jb20vZG9qb3Bob3Rvcy82MzYwYzYzY2EzYTcwY2E1MjA3OTA5NDYvMjAyMy0xMC0wNS82    \
                        MTBjNjk3OWY4MGExMTdjMjUxMmJkYjVhMDcyYTJhNzJjZDk3YTdlXzA2YzRiZmU0Y2YxMy9kYTZlMDM0NWUwZmQuanBnKiIsIkNvbmRpdGlvbiI6eyJEYXRlTGVzc1RoYW4iOnsiQVdTOkVwb   \
                            2NoVGltZSI6MTY5Nzk0NzIwMH19fV19&Key-Pair-Id=K2LDY3TZNMZIR5&Signature=djvzxtwAVvs7c~-NTQy1jHaOjCAg~TgMVoyFv53Drn-p-U0~WcpRh-0eIhFLo~i6c9k8W--l   \
                            VexUz6aVDKfmXLv7ZdcR44yu23KR2KmcUsu3YfoGMyW9nbAuc3t7HOV1phMlfBll41p11b1LHr3~aYXfw3b1Y2XDFOuD1jBv-Hfrw3IgLRaDoPImOMjOaiZBsNmz7MfNPikKAe5C0rF~    \
                            Nb0JOYjIgx2BcjJFcXYubhK~yD7XKg3Z8tcoAfWazKaMNIJCJyXDtGrYFS9X--nWVYCDXpwuZPzLcHjoRJ9Z7JPp-Bf53HDd9561IeXNIwItpr3pyN8lrDCzDGBBV6hpkw__&w=500",
    
    "PHOTOT_URL2": "https://sphotos.classdojo.com/dojophotos/6360c63ca3a70ca520790946/2023-10-13/e6d24b2915215f5d975bc192d87db0d18fe090a4_c942b11d651a/39eccaf33bb2.jpg?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9zcGhvdG9zLmNsYXNzZG9qby5jb20vZG9qb3Bob3Rvcy82MzYwYzYzY2EzYTcwY2E1MjA3OTA5NDYvMjAyMy0xMC0xMy9lNmQyNGIyOTE1MjE1ZjVkOTc1YmMxOTJkODdkYjBkMThmZTA5MGE0X2M5NDJiMTFkNjUxYS8zOWVjY2FmMzNiYjIuanBnKiIsIkNvbmRpdGlvbiI6eyJEYXRlTGVzc1RoYW4iOnsiQVdTOkVwb2NoVGltZSI6MTY5Nzk1NDQwMH19fV19&Key-Pair-Id=K2LDY3TZNMZIR5&Signature=RkNxk676ja0vZOJs8pBMRsWBloIdq8kLfTP-9ZulznrTI0aUpLr8GLRO7a2ScFNyGjHqaO0~lCPXQKrqSfuQ7rfXfiCrXJrsVPMK~Ct~suEtiw0sgeBDETCX3n0220d9sA-mrjnADwItiTl-SsNriYO84Hkjbg1NX-0zxtrQMQuDFEgH~1VxoZIzO8RJzPhRxRLcSytEnEVI2g0eN3R1TsE2jlUeq4RTexAanrfaYtQ9aStdncARDBb26JU5-CWACCJSAQAP1dwdmMws2p~hwptpj5osybsPMXroxq4zYA~TvKrSBIaKmGFEEpNG0GbQ0Kr6UAniewiYX~xrVOao3g__&w=500",
    "PHOTO_URL3" : "https://sphotos.classdojo.com/dojophotos/6360c63ca3a70ca520790946/2023-10-13/9e0303c24dd0f86fb53107ca663fd11cdfd5d5e8_1510b0263403/94ea8ec371bf.jpg?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9zcGhvdG9zLmNsYXNzZG9qby5jb20vZG9qb3Bob3Rvcy82MzYwYzYzY2EzYTcwY2E1MjA3OTA5NDYvMjAyMy0xMC0xMy85ZTAzMDNjMjRkZDBmODZmYjUzMTA3Y2E2NjNmZDExY2RmZDVkNWU4XzE1MTBiMDI2MzQwMy85NGVhOGVjMzcxYmYuanBnKiIsIkNvbmRpdGlvbiI6eyJEYXRlTGVzc1RoYW4iOnsiQVdTOkVwb2NoVGltZSI6MTY5Nzk1NDQwMH19fV19&Key-Pair-Id=K2LDY3TZNMZIR5&Signature=B5xMVqERZz0vUB1BtVtpZ4DCNLwxaU697LChuzysnQW49qrRjeEju~~8FQ-1ZWW35-yWsp6ywj3wxTGm4iknpcupvTpOq0rQR8dEnCDCcexqvl7oQlLtUS2v8roI1rvu2J0KPw22eMR4TFjTTsGL4ptMeGoTG0j1LAdZlD1UUiTXJmlJxAfkRto~TQ4OuAWerLRwhKpRe~7bE8eI33KhtqoDueU-4fbMZWMuI3vVe6aKMZ30HULF3Slj6041fe98rQDHduX~MqOrhMnE8Mugi007pO0pk8SPkQzLr1g7HDwqzC1LbZ8ogh4uX8TV-q1W8cQHEokxyt1vtzv5IeqmKA__&w=500",
    
    "VIDEO_URL" : "https://svideos.classdojo.com/6360c63ca3a70ca520790946/2023-10-06/ababe010659d482b7352d14f2450acf154e48875_bd563f92e671/7e884aa14985.mp4                     \
                    ?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9zdmlkZW9zLmNsYXNzZG9qby5jb20vNjM2MGM2M2NhM2E3MGNhNTIwNzkwOTQ2LzIwMjMtMTAtMDYvYWJhYmUwMTA2NTlkNDgyY   \
                    jczNTJkMTRmMjQ1MGFjZjE1NGU0ODg3NV9iZDU2M2Y5MmU2NzEvN2U4ODRhYTE0OTg1Lm1wNCoiLCJDb25kaXRpb24iOnsiRGF0ZUxlc3NUaGFuIjp7IkFXUzpFcG9jaFRpbWUiOjE2OTc5NTA4MDB9fX   \
                    1dfQ__&Key-Pair-Id=KS4HI8FDBJ06Z&Signature=u5L749ihGvshjP1~MCgsjOJY02ALO6aU6b2xkRmZ6XRDLDOWpOtDxHOWo1UCiTRTV7a3tS~ypqTFkEJyjUNDIm4sN~njdfZ9E~jNzx1LfQm5Rt   \
                    0i5k~O4dPZBUFVgWZ~JDnA6IhbGme-LyBhRbXeIAvgPYoeLA9WV19oaIxHCheXwWiHbTwX0~8FL~8YpLJmaWvBhsdN4Iy610BZqzVGdcQ7pkSzTSt8KICSExFsCFpSl92s~~V2kOWzw9efI~qKPnucnxp   \
                    nPOhTLua~W6M7rUTvk2O3OQJPMaDVs3hZAK-ODk5~5ZOTCUwGqkitzWLb6onXimuUyZTTQGqgwPQzgA__",
     
}

# links = [
#      "https://sphotos.classdojo.com/dojophotos/6360c63ca3a70ca520790946/2023-10-05/610c6979f80a117c2512bdb5a072a2a72cd97a7e_06c4bfe4cf13/da6e0345e0fd.jpg?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9zcGhvdG9zLmNsYXNzZG9qby5jb20vZG9qb3Bob3Rvcy82MzYwYzYzY2EzYTcwY2E1MjA3OTA5NDYvMjAyMy0xMC0wNS82MTBjNjk3OWY4MGExMTdjMjUxMmJkYjVhMDcyYTJhNzJjZDk3YTdlXzA2YzRiZmU0Y2YxMy9kYTZlMDM0NWUwZmQuanBnKiIsIkNvbmRpdGlvbiI6eyJEYXRlTGVzc1RoYW4iOnsiQVdTOkVwb2NoVGltZSI6MTY5Nzk0NzIwMH19fV19&Key-Pair-Id=K2LDY3TZNMZIR5&Signature=djvzxtwAVvs7c~-NTQy1jHaOjCAg~TgMVoyFv53Drn-p-U0~WcpRh-0eIhFLo~i6c9k8W--lVexUz6aVDKfmXLv7ZdcR44yu23KR2KmcUsu3YfoGMyW9nbAuc3t7HOV1phMlfBll41p11b1LHr3~aYXfw3b1Y2XDFOuD1jBv-Hfrw3IgLRaDoPImOMjOaiZBsNmz7MfNPikKAe5C0rF~Nb0JOYjIgx2BcjJFcXYubhK~yD7XKg3Z8tcoAfWazKaMNIJCJyXDtGrYFS9X--nWVYCDXpwuZPzLcHjoRJ9Z7JPp-Bf53HDd9561IeXNIwItpr3pyN8lrDCzDGBBV6hpkw__&w=500",
#     "https://sphotos.classdojo.com/dojophotos/6360c63ca3a70ca520790946/2023-10-13/e6d24b2915215f5d975bc192d87db0d18fe090a4_c942b11d651a/39eccaf33bb2.jpg?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9zcGhvdG9zLmNsYXNzZG9qby5jb20vZG9qb3Bob3Rvcy82MzYwYzYzY2EzYTcwY2E1MjA3OTA5NDYvMjAyMy0xMC0xMy9lNmQyNGIyOTE1MjE1ZjVkOTc1YmMxOTJkODdkYjBkMThmZTA5MGE0X2M5NDJiMTFkNjUxYS8zOWVjY2FmMzNiYjIuanBnKiIsIkNvbmRpdGlvbiI6eyJEYXRlTGVzc1RoYW4iOnsiQVdTOkVwb2NoVGltZSI6MTY5Nzk1NDQwMH19fV19&Key-Pair-Id=K2LDY3TZNMZIR5&Signature=RkNxk676ja0vZOJs8pBMRsWBloIdq8kLfTP-9ZulznrTI0aUpLr8GLRO7a2ScFNyGjHqaO0~lCPXQKrqSfuQ7rfXfiCrXJrsVPMK~Ct~suEtiw0sgeBDETCX3n0220d9sA-mrjnADwItiTl-SsNriYO84Hkjbg1NX-0zxtrQMQuDFEgH~1VxoZIzO8RJzPhRxRLcSytEnEVI2g0eN3R1TsE2jlUeq4RTexAanrfaYtQ9aStdncARDBb26JU5-CWACCJSAQAP1dwdmMws2p~hwptpj5osybsPMXroxq4zYA~TvKrSBIaKmGFEEpNG0GbQ0Kr6UAniewiYX~xrVOao3g__&w=500",
#     "https://sphotos.classdojo.com/dojophotos/6360c63ca3a70ca520790946/2023-10-13/9e0303c24dd0f86fb53107ca663fd11cdfd5d5e8_1510b0263403/94ea8ec371bf.jpg?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9zcGhvdG9zLmNsYXNzZG9qby5jb20vZG9qb3Bob3Rvcy82MzYwYzYzY2EzYTcwY2E1MjA3OTA5NDYvMjAyMy0xMC0xMy85ZTAzMDNjMjRkZDBmODZmYjUzMTA3Y2E2NjNmZDExY2RmZDVkNWU4XzE1MTBiMDI2MzQwMy85NGVhOGVjMzcxYmYuanBnKiIsIkNvbmRpdGlvbiI6eyJEYXRlTGVzc1RoYW4iOnsiQVdTOkVwb2NoVGltZSI6MTY5Nzk1NDQwMH19fV19&Key-Pair-Id=K2LDY3TZNMZIR5&Signature=B5xMVqERZz0vUB1BtVtpZ4DCNLwxaU697LChuzysnQW49qrRjeEju~~8FQ-1ZWW35-yWsp6ywj3wxTGm4iknpcupvTpOq0rQR8dEnCDCcexqvl7oQlLtUS2v8roI1rvu2J0KPw22eMR4TFjTTsGL4ptMeGoTG0j1LAdZlD1UUiTXJmlJxAfkRto~TQ4OuAWerLRwhKpRe~7bE8eI33KhtqoDueU-4fbMZWMuI3vVe6aKMZ30HULF3Slj6041fe98rQDHduX~MqOrhMnE8Mugi007pO0pk8SPkQzLr1g7HDwqzC1LbZ8ogh4uX8TV-q1W8cQHEokxyt1vtzv5IeqmKA__&w=500",
#     "https://svideos.classdojo.com/6360c63ca3a70ca520790946/2023-10-06/ababe010659d482b7352d14f2450acf154e48875_bd563f92e671/7e884aa14985.mp4?Policy=eyJTdGF0ZW1lbnQiOlt7IlJlc291cmNlIjoiaHR0cHM6Ly9zdmlkZW9zLmNsYXNzZG9qby5jb20vNjM2MGM2M2NhM2E3MGNhNTIwNzkwOTQ2LzIwMjMtMTAtMDYvYWJhYmUwMTA2NTlkNDgyYjczNTJkMTRmMjQ1MGFjZjE1NGU0ODg3NV9iZDU2M2Y5MmU2NzEvN2U4ODRhYTE0OTg1Lm1wNCoiLCJDb25kaXRpb24iOnsiRGF0ZUxlc3NUaGFuIjp7IkFXUzpFcG9jaFRpbWUiOjE2OTc5NTA4MDB9fX1dfQ__&Key-Pair-Id=KS4HI8FDBJ06Z&Signature=u5L749ihGvshjP1~MCgsjOJY02ALO6aU6b2xkRmZ6XRDLDOWpOtDxHOWo1UCiTRTV7a3tS~ypqTFkEJyjUNDIm4sN~njdfZ9E~jNzx1LfQm5Rt0i5k~O4dPZBUFVgWZ~JDnA6IhbGme-LyBhRbXeIAvgPYoeLA9WV19oaIxHCheXwWiHbTwX0~8FL~8YpLJmaWvBhsdN4Iy610BZqzVGdcQ7pkSzTSt8KICSExFsCFpSl92s~~V2kOWzw9efI~qKPnucnxpnPOhTLua~W6M7rUTvk2O3OQJPMaDVs3hZAK-ODk5~5ZOTCUwGqkitzWLb6onXimuUyZTTQGqgwPQzgA__",
     
# ]


BASE_DIR = "/home/frank/Documents/GitHub/Learn/Python/classdojo_downloader/"
# BASE_DIR = "/home/frank/classdojo"
JSON_FILE_PATH = "/data/schema_20240121_9.json"
TARGET_DIR = BASE_DIR + "/download/download_2024_01_21/"


# get links in json
links = []
with open(BASE_DIR + JSON_FILE_PATH) as json_file:
  data = json.load(json_file)
  for entry in data['log']["entries"]:
    if entry["_resourceType"] == "image":
        link = entry["request"]["url"]
        links.append(link)

print(links)


# trim and filter links
date_bank = {}
for link in links:
    file_type = link.split("/")[2]
    file_date = ""
    extension = ""
    file_path = ""
    headers = ""

    if file_type == FileType.photo.value:
        extension = "jpg"
        file_date = link.split("/")[5]
        # rirght strip "&w=500" which limits the image size
        link = link.rstrip("&w=500")
    elif file_type == FileType.video.value:
        extension = "mp4"
        file_date = link.split("/")[4]
        headers = {'content-type': 'video/mp4'}  # to download mp4
    else:
        print (file_type)
        print ("file type error!")


    if file_date and extension:
        date_bank[file_date + "_" + extension] = date_bank[file_date+ "_" + extension] + 1 if file_date + "_" + extension in date_bank else 0
        file_name = file_date + "_" + str(date_bank[file_date + "_" + extension]) + "." + extension
        file_path = TARGET_DIR + file_name
        print (file_path)



        r = requests.get(link, stream=True)


        if r.status_code == 200:
            with open(file_path, 'wb') as f:
                r.raw.decode_content = True
                shutil.copyfileobj(r.raw, f)  
        else:
            print (f"Error! - {r.status_code}")