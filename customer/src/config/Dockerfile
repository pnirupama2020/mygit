FROM openjdk:11-slim

ADD /C:/Users/Nirupama.Patra/H2/h2-1.4.199.jar /opt/h2/h2.jar

CMD ["java", "-cp", "/opt/h2/h2.jar", "org.h2.tools.Server", "-webAllowOthers", "-tcpAllowOthers", "-ifNotExists"]