FROM Java:8
MAINTAINER suyp
# 把当前所有的jar包都拷贝到最后生成的App项目目录下
COPY *.jar /dockerTest.jar
CMD ["--server.port=9090"]
EXPOSE 9090

LABEL authors="Administrator"

ENTRYPOINT ["java", "-jar", "dockerTest.jar"]