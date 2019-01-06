rm  -rf Output

mkdir -p Output/src/main/java/
mkdir -p Output/src/main/java/
mkdir -p Output/src/main/resources/
java -cp ./mybatis-generator-core-1.3.2-patch.jar:mybatis-generator-core-1.3.2.jar org.mybatis.generator.api.ShellRunner -configfile generatorConfig-NT.xml -overwrite

