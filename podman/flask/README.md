# Create Python Flask with RHEL9 and Podman
https://medium.com/@tua.saheli/containerization-of-python-flask-app-using-podman-bcb3b3a47829


## Execution
```sh
podman build -t quay.io/sd2590/testrepo1/flaskapp:latest .
podman build -t localhost:latest .
# optional, push to podman hub
podman push quay.io/sd2590/testrepo1/flaskapp:latest

# optioanl, pull from podman hub
podman pull quay.io/sd2590/testrepo1/flaskapp:latest

# run
podman images
podman run -p 5000:5000 -d quay.io/sd2590/testrepo1/flaskapp 

```

Verify http:127.0.0.1:5000

Hello, World
