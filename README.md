# ISS Service

ISS Service is used to get details about the International Space Station.

## Usage

Get the image from Docker hub

```bash
docker pull roballena/iss-service
```

Run using docker-compose

```bash
docker-compose up
```

Send request via curl or via Postman

```bash
curl --location --request GET 'localhost:8080/iss/landmarks'
```