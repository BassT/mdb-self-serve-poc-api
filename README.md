# mdb-ce-self-serve-poc

## Prerequisites

- [minikube](https://minikube.sigs.k8s.io/)
- [helm](https://helm.sh/)
- [docker](https://www.docker.com/)
- [httpie](https://httpie.io)

## Get started

### 1) Start a Kubernetes cluster

```sh
minikube start --cpus=4
```

### 2) Install the MongoDB community operator

```sh
helm repo add mongodb https://mongodb.github.io/helm-charts
helm install community-operator mongodb/community-operator
```

### 3) Launch a MongoDB designated as application database

```sh
docker run -d --name mdb-ce-self-serve-poc-mdb -p 27017:27017 mongo
```

### 4) Run the application in dev mode

```sh
./mvnw compile quarkus:dev
```

### 5) Create a cluster

```sh
echo -n '{"name":"foo"}' | http POST :8080/clusters
```

### 6) Get clusters

```sh
http :8080/clusters
```

### 7) View pods

```sh
kubectl get pods
```

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/mdb-ce-self-serve-poc-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Build image

```sh
docker build -t self-serve-api -f src/main/docker/Dockerfile.native .
```

## Push to Docker Hub

```sh
docker tag self-serve-api:latest sebastianrichter/mdb-self-serve-poc-api:latest
docker push sebastianrichter/mdb-self-serve-poc-api:latest
```