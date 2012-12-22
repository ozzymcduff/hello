require 'fileutils'
require 'rake'
@standard_classpaths = [#"%CLASSPATH%",
	"./lib/antlr-4.0b2-complete.jar",
	"./lib/junit-4.11.jar"]
def classpath
	return @standard_classpaths.join(File::PATH_SEPARATOR)
end
def classpath_and_bin
	return (@standard_classpaths+['./bin']).join(File::PATH_SEPARATOR)
end 
task :defualt=>[:build]
#puts "File::SEPARATOR: #{File::SEPARATOR}"
#puts "File::SEPARATOR: #{File::PATH_SEPARATOR}"
desc "compile"
task :build => [:clean, :bin, :antlr] do
	sh "javac -cp #{classpath} ./*.java -d ./bin"
end

task :bin do
	FileUtils.mkdir_p 'bin'
end

task :run=>[:build] do
	sh "java -classpath #{classpath_and_bin} Main ./main.txt"
end

task :clean do
	cd "bin" do
		FileUtils.rm Dir.glob("*.class")
	end
end

task :antlr do
	sh "java -jar ./lib/antlr-4.0b2-complete.jar Hello.g -o ./"
end
