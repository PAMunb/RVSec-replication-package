FROM phtcosta/mop-base:0.0.1

ARG RV_MONITOR_VERSION="1.4-SNAPSHOT"

WORKDIR /projects		
		
RUN git clone https://github.com/helpmehelpus/MoniTests.git && \
    ln -s /projects/MoniTests/src/main/mop && \
    rm -Rf /projects/MoniTests/src/main/mop/* && \
    mkdir output
		
ENV CLASSPATH "${MAVEN_REPO}/com/runtimeverification/rvmonitor/rv-monitor/${RV_MONITOR_VERSION}/rv-monitor-${RV_MONITOR_VERSION}.jar:${MAVEN_REPO}/com/runtimeverification/rvmonitor/rv-monitor-rt/${RV_MONITOR_VERSION}/rv-monitor-rt-${RV_MONITOR_VERSION}.jar:${ASPECTJ_HOME}/lib/aspectjrt.jar:${ASPECTJ_HOME}/lib/aspectjweaver.jar:${ASPECTJ_HOME}/lib/aspectjtools.jar"    
	
#TODO ver como fica o volume de saida ... o javamopagent nao deixa definir o dir de saida ... ele gera no dir local/atual/corrente	
	
VOLUME "/projects/mop"
VOLUME "/projects/output"
