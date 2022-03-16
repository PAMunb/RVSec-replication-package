# Entra na imagem criada.

#docker run --name maven -v maven-repo:/root/.m2 --rm -i -t phtcosta/maven:latest bash
docker run --name maven --rm -i -t phtcosta/maven:latest bash