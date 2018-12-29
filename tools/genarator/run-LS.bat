@REM @author Anderson Mao, 2015-03-19
@REM java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite

rmdir /S /Q Output
mkdir Output\src\main\java\
mkdir Output\src\main\java\
mkdir Output\src\main\resources\

@REM Run with "patch" class as high priority
java -cp .\mybatis-generator-core-1.3.2-patch.jar;mybatis-generator-core-1.3.2.jar org.mybatis.generator.api.ShellRunner -configfile generatorConfig-LS.xml -overwrite

pause