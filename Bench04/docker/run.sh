# Testa a imagem criada. Apenas imprime a versao do maven

docker run -i --rm -v phtcosta/maven:latest mvn clean install --also-make