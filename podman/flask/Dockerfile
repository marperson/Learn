FROM python:3.11-slim-buster

WORKDIR /app

COPY requirements.txt requirements.txt

RUN pip3 install -r requirements.txt

COPY . .

EXPOSE 5000

ENTRYPOINT [ "python" ]

CMD [ "flaskapp.py" ]
