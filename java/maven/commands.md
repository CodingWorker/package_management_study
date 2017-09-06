#简单构建项目
mvn -B archetype:generate \
-DarchetypeGroupId=org.apache.maven.archetypes \
-DgroupId=com.mycompany.app \
-DartifactId=my-app       


#编译项目
mvn compile    

