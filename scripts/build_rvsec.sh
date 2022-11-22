echo "Cloning RVsec" 
cd ..
if [ ! -d rvsec ];then
	git clone https://github.com/PAMunb/rvsec.git
fi
cd rvsec
git checkout develop

echo "Linking javac to JRE"
if [[ ! -f "$JAVA_HOME/jre/bin/javac" ]]; then
	ln -s $JAVA_HOME/bin/javac $JAVA_HOME/jre/bin/javac
fi
echo "Building RVsec"
mvn clean install -DskipMopAgent -DskipTests -q
