FROM pamunb/mop-base:0.0.1

ARG RV_MONITOR_VERSION="1.4-SNAPSHOT"

WORKDIR /projects		
		
RUN git clone https://github.com/PAMunb/mop-maven-plugin.git && \
    cd mop-maven-plugin && \
	mvn clean install && \
	cd ..				
		
RUN mkdir /projects/output && \
	mkdir /projects/mop && \
	git clone https://github.com/helpmehelpus/MoniTests.git && \
	cd MoniTests && \
	mvn clean install -DskipTests -DskipMopAgent && \
	cd src/main && \
	rm -Rf mop && \
    ln -s /projects/mop mop 
    
	
ENV CLASSPATH "${MAVEN_REPO}/com/runtimeverification/rvmonitor/rv-monitor/${RV_MONITOR_VERSION}/rv-monitor-${RV_MONITOR_VERSION}.jar:${MAVEN_REPO}/com/runtimeverification/rvmonitor/rv-monitor-rt/${RV_MONITOR_VERSION}/rv-monitor-rt-${RV_MONITOR_VERSION}.jar:${ASPECTJ_HOME}/lib/aspectjrt.jar:${ASPECTJ_HOME}/lib/aspectjweaver.jar:${ASPECTJ_HOME}/lib/aspectjtools.jar"    

COPY entrypoint.sh /projects/entrypoint.sh	
	
WORKDIR /projects	
	
VOLUME ["/projects/mop", "/projects/output"]

CMD ["sh","entrypoint.sh"]


