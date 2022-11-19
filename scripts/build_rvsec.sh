cd ..
if [ ! -d rvsec ];then
	git clone https://github.com/PAMunb/rvsec.git
fi
cd rvsec
git checkout develop
mvn clean install -DskipMopAgent -DskipTests -q
